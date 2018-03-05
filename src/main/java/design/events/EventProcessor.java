package design.events;

import java.util.ArrayList;
import java.util.EventListener;
import java.util.List;

/**
 * Created by sunilp on 2/8/18.
 */
public class EventProcessor implements Listener,Runnable {

	private static List<Event> events = new ArrayList<Event>();

	@Override
	public void addEvent(Event event) {
		events.add(event);
	}

	@Override
	public boolean processEvent(Event event) {
		event.setIsProcessed(true);
		System.out.println("event " +event.getEventName()+ " processed");
		return true;
	}

	public List<Event> getEvents() {
		return events;
	}


	@Override
	public void run() {
		events.stream().forEach(event -> processEvent(event));
	}
}
