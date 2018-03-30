package highradius;

import java.util.*;

public class TreeSwap_301 {

	public TreeSwap_301() {
	}

	public int[] swap() {
		int[] tree = new int[]{1, 2, 3, 4, 5, 6, 0, 0, 0, 12, 13};
		//int[] tree = new int[]{1,2,3,0,6,4,5};
		TreeNode treeNode = createTree(tree,0);
		swapTree(treeNode);
		return traverseSwappedTree(treeNode, tree.length);
	}

	public TreeNode createTree(int[] array, int index) {

		if((index>array.length-1)||(array[index]==-1))
			return null;

		TreeNode node = new TreeNode();
		node.data = array[index];
		node.left = createTree(array, 2 * index + 1);
		node.right = createTree(array, 2 * index + 2);

		return node;
	}

	public void swapTree(TreeNode treeNode) {
		if (treeNode == null)
			return;
		TreeNode tempNode = new TreeNode();
		tempNode.data = treeNode.data;

		if (treeNode.right != null && treeNode.right.data != 0) {
			treeNode.data = treeNode.right.data;
			treeNode.right.data = tempNode.data;
			swapTree(treeNode.right);
		}

		if (treeNode.left != null && treeNode.left.data != 0) {
			swapTree(treeNode.left);
		}
	}

	public int[] traverseSwappedTree(TreeNode treeNode, int length) {
		int count = 0;
		int[] tree = new int[length];
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(treeNode);

		while (true) {
			int nodeCount = queue.size();
			if (nodeCount == 0)
				break;

			while (nodeCount > 0) {
				TreeNode node = queue.peek();
				tree[count] = node.data;
				queue.remove();
				if (node.left != null)
					queue.add(node.left);
				if (node.right != null)
					queue.add(node.right);
				nodeCount--;
				count++;
			}
		}
		return tree;
	}

	public Map<Integer, Integer> sum(int[] tree) {
		Map<Integer, Integer> levelVsSum = new HashMap<>();
		int noOfElementsFromTree = 1;
		int sum;
		levelVsSum.put(0, tree[0]);
		int nextIndex = 1;

		for (int level = 1; level <= tree.length; level++) {
			if (nextIndex == tree.length) {
				break;
			}
			sum = 0;
			noOfElementsFromTree *= 2;
			for (int i = 1; i <= noOfElementsFromTree; i++) {
				if (nextIndex != tree.length) {
					sum += tree[nextIndex];
					nextIndex++;
				}
			}
			levelVsSum.put(level, sum);
		}
		return levelVsSum;
	}

	class TreeNode {
		int data;
		TreeNode left, right;

		public TreeNode() {
		}

		public TreeNode(int item) {
			data = item;
			left = right = null;
		}
	}

	public static void main(String[] args) {
		TreeSwap_301 treeSwap = new TreeSwap_301();
		int swappedTree[] = treeSwap.swap();
		Map<Integer, Integer> sumAtEachLevel = treeSwap.sum(swappedTree);
		System.out.println("swapped tree::" + Arrays.toString(swappedTree));
		System.out.println("sum at each level::" + sumAtEachLevel.toString());
	}
}
