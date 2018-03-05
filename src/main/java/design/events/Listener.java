package design.events;

import java.util.EventListener;

/**
 * Created by sunilp on 2/8/18.
 */
public interface Listener extends EventListener {
	void addEvent(Event event);
	boolean processEvent(Event event);
}
