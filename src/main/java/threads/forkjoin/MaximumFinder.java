package threads.forkjoin;

import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

/**
 * Created by sunilp on 3/5/18.
 */
public class MaximumFinder extends RecursiveTask<Integer> {

	private static final int SEQUENTIAL_THRESHOLD = 5;
	private final int[] data;
	private final int start;
	private final int end;

	public MaximumFinder(int[] data, int start, int end) {
		this.data = data;
		this.start = start;
		this.end = end;
	}

	public MaximumFinder(int[] data) {
		this(data, 0, data.length);
	}

	private Integer computeDirectly() {
		System.out.println(Thread.currentThread() + " computing: " + start
								   + " to " + end);
		int max = Integer.MIN_VALUE;
		for (int i = start; i < end; i++) {
			if (data[i] > max) {
				max = data[i];
			}
		}
		return max;
	}

	@Override
	protected Integer compute() {
		final int length = end - start;
		if (length < SEQUENTIAL_THRESHOLD) {
			return computeDirectly();
		}
		final int split = length / 2;
		final MaximumFinder left = new MaximumFinder(data, start, start + split);
		left.fork();
		final MaximumFinder right = new MaximumFinder(data, start + split, end);
		return Math.max(right.compute(), left.join());
	}

	public static void main(String[] args) {
		// create a random data set
		final int[] data = new int[10];
		final Random random = new Random();
		for (int i = 0; i < data.length; i++) {
			data[i] = random.nextInt(100);
		}

		// submit the task to the pool
		final ForkJoinPool pool = new ForkJoinPool(2);
		final MaximumFinder finder = new MaximumFinder(data);
		System.out.println(pool.invoke(finder));
	}

}
