package design.events;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by sunilp on 2/8/18.
 */
public class EventExecutor {



	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(3);
		EventExecutor eventExecutor = new EventExecutor();
		List<Event> events = eventExecutor.buildEvent();

		CompletableFuture<?>[] futures = events.stream().map(event -> CompletableFuture.runAsync(event, service))
												 .toArray(CompletableFuture[]::new);
		CompletableFuture.allOf(futures).join();
		if (!service.isShutdown()) {
			service.shutdown();
		}
	}

	private static List<Event> buildEvent(){
		EventProcessor eventProcessor = new EventProcessor();
		String eventName = "event";
		for(int i=0;i<50;i++){
			eventProcessor.addEvent(new Event(i,eventName+i));
		}
		return eventProcessor.getEvents();
	}

}
