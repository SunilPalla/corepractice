package loadbalancing;

/**
 * Created by sunilp on 3/28/18.
 */
public class LoadBalancer {
	private static int requests = 3400;
	private static int ratio1 = 5;
	private static int ratio2 = 3;
	private static int ratio3 = 2;

	public static void main(String[] args) {
		LoadBalancer lb = new LoadBalancer();
		lb.loadBalance(requests);
	}

	private void loadBalance(int requests) {
		int totalRatio = ratio1+ratio2+ratio3;
		int requestRatio = requests/totalRatio;

		int ratioSplit1 = ratio1*requestRatio;
		int ratioSplit2 = ratio2*requestRatio;
		int ratioSplit3 = ratio3*requestRatio;

		System.out.println("Ratio Split::"+"Server1 --> "+ratioSplit1+" Server2 --> "+ratioSplit2+" Server3 --> "+ratioSplit3);
	}
}
