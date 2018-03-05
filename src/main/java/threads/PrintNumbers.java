package threads;

/**
 * Created by sunilp on 2/6/18.
 */
public class PrintNumbers extends Thread {
	private volatile int i=0;

	private void increment() {
		i++;
	}

	private void print(Thread p) {
		System.out.println(""+p.getName() + " prints "+i);
	}

	public static void main(String[] args) {

		PrintNumbers t1 = new PrintNumbers();
		PrintNumbers t2 = new PrintNumbers();
		try {
			t1.start();
			System.out.println(""+t1.getName()+" started");
			t1.increment();
			t1.print(t1);
			t1.sleep(2000);

			t2.start();
			System.out.println(""+t2.getName()+" started");
			t2.increment();
			t2.print(t2);
			t2.sleep(2000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		//System.out.println("in run..");
	}
}
