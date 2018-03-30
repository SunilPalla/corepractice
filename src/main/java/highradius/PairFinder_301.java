package highradius;

import java.util.*;

public class PairFinder_301 {
	public PairFinder_301(){}

	public List<Pair_301> findPairs(int[] array,int inputSumVal) {
		List<Pair_301> pairs = new ArrayList<>();
		Arrays.sort(array);
		//1,2,3,5,7,8
		int low = 0;
		int high = array.length-1;

		while(low < high) {
			if(array[low] + array[high] == inputSumVal) {
				Pair_301 pair = new Pair_301(array[low],array[high]);
				pairs.add(pair);
			}
			if(array[low] + array[high] < inputSumVal) {
				low++;
			} else{
				high--;
			}
		}
		return pairs;
	}

	public Pair_301 findBestPair(List<Pair_301> pairs) {
		Map<Integer,Pair_301> diffVsPair = new TreeMap<>();
		Integer difference=0;

		for(Pair_301 eachPair : pairs) {
			difference = eachPair.getJ() - eachPair.getI();
			diffVsPair.put(difference,eachPair);
		}
		return diffVsPair.get(diffVsPair.keySet().stream().findFirst().get());
	}

	class Pair_301 {
		public Pair_301(){}
		public int i;
		public int j;

		public Pair_301(int i,int j) {
			this.i=i;
			this.j=j;
		}

		public int getI() {
			return i;
		}

		public void setI(int i) {
			this.i = i;
		}

		public int getJ() {
			return j;
		}

		public void setJ(int j) {
			this.j = j;
		}

		@Override
		public String toString() {
			return "Pair_301{" +
						   "i=" + i +
						   ", j=" + j +
						   '}';
		}
	}

	public static void main(String[] args) {
		PairFinder_301 pairFinder = new PairFinder_301();
		int[] array = new int[]{8,7,2,5,3,1};
		//int[] array = new int[]{5,4,6,3};
		List<Pair_301> pairs = pairFinder.findPairs(array,10);
		if(pairs.size()==0){
			System.out.println("No pairs found!!");
			return;
		}
		Pair_301 bestPair = pairFinder.findBestPair(pairs);
		System.out.println("Best Pair::"+bestPair.toString());
	}
}
