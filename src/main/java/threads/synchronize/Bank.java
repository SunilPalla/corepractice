package threads.synchronize;

import java.util.HashMap;

/**
 * Created by sunilp on 3/2/18.
 */
public class Bank {

	private static Bank instance = new Bank();
	private HashMap<Integer, BankAccount> accountNumberVsAccount;

	private Bank() {
		accountNumberVsAccount = new HashMap<Integer, BankAccount>();
		accountNumberVsAccount.put(123456, new BankAccount(123456));
	}

	public static Bank getInstance(){
		return instance;
	}
	public BankAccount getAccount(Integer accountNumber) {
		return accountNumberVsAccount.get(accountNumber);
	}

}
