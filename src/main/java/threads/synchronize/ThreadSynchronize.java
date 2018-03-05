package threads.synchronize;

/**
 * Created by sunilp on 3/2/18.
 */
public class ThreadSynchronize {
	public static void main(String[] args) {
		CustomerOne customer1 = new CustomerOne();
		CustomerTwo customer2 = new CustomerTwo();

		Thread t1 = new Thread(customer1,"customer1");
		Thread t2 = new Thread(customer2,"customer2");
		t1.start();
		t2.start();
	}
}
