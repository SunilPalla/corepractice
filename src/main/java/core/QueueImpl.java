package core;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * Created by sunilp on 3/27/18.
 */
public class QueueImpl {
	static int arr[] = new int[]{3,4,2,1};
	public static void main(String[] args) {
		queueImpl();
	}

	private static void queueImpl() {

		Queue queue = new ArrayBlockingQueue(4);
		for(int a = 0; a < arr.length; a++ ){
			queue.add(arr[a]);
		}

		queue.peek();

	}
}
