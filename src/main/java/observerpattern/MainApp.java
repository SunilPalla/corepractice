package observerpattern;

/**
 * Created by sunilp on 2/16/18.
 */
public class MainApp {
	public static void main(String[] args) {
		Counter counter = new Counter();
		Token token = new Token();
		token.addObserver(counter);
		counter.addToken(token);
		token.setChanged();
		token.notifyObservers(counter);
		//counter.update(token,"");
	}
}
