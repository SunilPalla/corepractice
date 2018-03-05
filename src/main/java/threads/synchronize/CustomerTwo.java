package threads.synchronize;

/**
 * Created by sunilp on 3/2/18.
 */
public class CustomerTwo implements Runnable {

	@Override
	public void run() {
		Bank bank = Bank.getInstance();
		BankAccount account = bank.getAccount(123456);
		//account.deposit(100);
		//account.withdraw(200);

		synchronized (account) {
			//try {
			    System.out.println("Workgin thread "+ Thread.currentThread().getName());
				//account.deposit(100);
				account.withdraw(100);
			    System.out.println("Workgin thread end"+ Thread.currentThread().getName());
				//account.wait();
			//} catch (InterruptedException e) {
			//	e.printStackTrace();
			//}
		}
		/*
		synchronized (account) {
			account.withdraw(200);
			account.notify();
		}*/
	}
}
