package core;

/**
 * Created by sunilp on 2/14/18.
 */
public class TryCatchFinally {

	public static void main(String[] args) {
		returnMethod();
	}

	private static void returnMethod() {
		try {
			System.out.println("in try");
			return;
		} catch(Exception e) {
			System.out.println("in catch");
			return;
		}finally {
			System.out.println("in finally");
			return;
		}

	}
}
