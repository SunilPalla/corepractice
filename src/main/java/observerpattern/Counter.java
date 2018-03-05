package observerpattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by sunilp on 2/16/18.
 */
public class Counter implements Observer {

	private static List<Token> tokenQueue = new ArrayList<>();
	private String counterId;

	public List<Token> getTokenQueue() {
		return tokenQueue;
	}

	public void setTokenQueue(List<Token> tokenQueue) {
		this.tokenQueue = tokenQueue;
	}

	public String getCounterId() {
		return counterId;
	}

	public void setCounterId(String counterId) {
		this.counterId = counterId;
	}

	public static void addToken(Token token) {
		tokenQueue.add(token);
	}

	@Override
	public void update(Observable o, Object arg) {
		if(o.hasChanged()) {
			System.out.println("in counter update");
		}
	}
}
