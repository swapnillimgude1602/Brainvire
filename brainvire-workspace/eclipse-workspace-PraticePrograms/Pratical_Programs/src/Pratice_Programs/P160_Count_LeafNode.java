package Pratice_Programs;

class TreeNode {
	int data;
	TreeNode left, right;

	public TreeNode(int item) {
		data = item;
		left = right = null;
	}
}

public class P160_Count_LeafNode {

	TreeNode root;

	public P160_Count_LeafNode() {
		root = null;
	}

	// count

	public int countLeaf(TreeNode node) {
		if (node == null) {
			return 0;
		}
		if (node.left == null && node.right == null) {
			return 1; // node is leaf
		} else {
			return countLeaf(node.left) + countLeaf(node.right);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P160_Count_LeafNode bt = new P160_Count_LeafNode();
		bt.root = new TreeNode(1);
		bt.root.left = new TreeNode(3);
		bt.root.right = new TreeNode(5);
		bt.root.left.left = new TreeNode(7);
		bt.root.left.right = new TreeNode(9);
		bt.root.right.left = new TreeNode(11);
		bt.root.right.right = new TreeNode(13);

		int leafCnt = bt.countLeaf(bt.root);
		System.out.println("Count: " + leafCnt);

	}
//leafnode = no children //end of node
}
