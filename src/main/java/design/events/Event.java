package design.events;

/**
 * Created by sunilp on 2/8/18.
 */
public class Event extends EventProcessor {
	private int eventId;
	private String eventName;
	private boolean isProcessed;

	public Event(){}
	public Event(int eventId, String eventName){
		this.eventId = eventId;
		this.eventName = eventName;
	}

	public int getEventId() {
		return eventId;
	}

	public void setEventId(int eventId) {
		this.eventId = eventId;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public boolean isProcessed() {
		return isProcessed;
	}

	public void setIsProcessed(boolean isProcessed) {
		this.isProcessed = isProcessed;
	}
}
