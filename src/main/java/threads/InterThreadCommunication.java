package threads;

import java.util.*;

public class InterThreadCommunication {

	HashSet<Integer> hashSet = new HashSet<>();

	public static void main(String[] args) {
		Object LOCK_OBJECT = new Object();
		InterThreadCommunication communication = new InterThreadCommunication();
        Random random = new Random();
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				synchronized (LOCK_OBJECT) {
					while (true) {
						try {
							Thread.sleep(1000);
							if(communication.hashSet.size() > 0) {
								LOCK_OBJECT.wait();
							}
							for (int i = 1; i < 2; i++) {
								Integer number = i * random.nextInt(100);
								communication.hashSet.add(number);
								System.out.println(Thread.currentThread().getName() + " Produced " + number);
							}
							LOCK_OBJECT.notifyAll();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			}
		};

		Thread producer = new Thread(runnable);
		producer.setPriority(2);
		Thread producer1 = new Thread(runnable);
		producer1.setPriority(4);
		Thread producer3 = new Thread(runnable);
		producer3.setPriority(2);
		Thread producer4 = new Thread(runnable);
		producer4.setPriority(4);
		Thread consumer = new Thread(new Runnable() {
			@Override
			public void run() {
				synchronized (LOCK_OBJECT) {
					while (true) {
						try {
							Thread.sleep(1000);
							if(communication.hashSet.isEmpty()){
								LOCK_OBJECT.wait();
							}
							Iterator<Integer> set = communication.hashSet.iterator();
							List<Integer> numberList = new ArrayList<>();

							while (set.hasNext()) {
								Integer number = set.next();
								System.out.println(Thread.currentThread().getName() + "Consumed " + number);
								numberList.add(number);
							}
							communication.hashSet.removeAll(numberList);
							LOCK_OBJECT.notifyAll();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			}
		});

		producer.start();
		producer1.start();
		producer3.start();
		producer4.start();
		consumer.start();
	}
}
