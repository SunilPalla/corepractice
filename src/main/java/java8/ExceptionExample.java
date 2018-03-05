package java8;

/**
 * Created by sunilp on 12/28/17.
 */
public class ExceptionExample {
	public static void main(String[] args) {
		Exception e = new Exception();
		printException(5, 0);

	}

	private static void printException(int i, int i1) {
		try {
			int res = i / i1;
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("exception :: "+ e);
		}
	}
}
