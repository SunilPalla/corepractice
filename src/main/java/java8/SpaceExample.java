package java8;

/**
 * Created by sunilp on 11/2/17.
 */
public class SpaceExample {
	public static void main(String[] args) {
		spaceSyntax();
	}

	private static void spaceSyntax() {
		final byte [] a = new byte[]{'a','b'};
		final byte[] b = new byte[]{'c','d'};

		for(int x = 0 ; x < a.length; x++) {
			// printing the characters
			System.out.print("reading byte with space:: "+  (char)a[x]  + "   ");
		}

		for(int x = 0 ; x < b.length; x++) {
			// printing the characters
			System.out.print("reading byte with out space:: "+  (char)b[x]  + "   ");
		}
	}
}
