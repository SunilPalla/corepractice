package observerpattern;

import java.util.Observable;

/**
 * Created by sunilp on 2/16/18.
 */
public class Token extends Observable {

	private String tokenId;

	@Override
	protected synchronized void setChanged() {
		super.setChanged();
	}
}
