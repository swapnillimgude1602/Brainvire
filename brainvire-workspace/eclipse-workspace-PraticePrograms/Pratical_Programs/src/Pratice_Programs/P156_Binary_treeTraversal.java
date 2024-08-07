package Pratice_Programs;

class TreeNode {
	int data;
	TreeNode left;
	TreeNode right;

	public TreeNode(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
}

public class P156_Binary_treeTraversal {

	private TreeNode root;

	public P156_Binary_treeTraversal() {
		this.root = null;
	}

	// Method to insert a value into the binary tree
	public void insert(int value) {
		root = insertRecursive(root, value);
	}

	private TreeNode insertRecursive(TreeNode root, int value) {
		if (root == null) {
			return new TreeNode(value);
		}

		if (value < root.data) {
			root.left = insertRecursive(root.left, value);
		} else if (value > root.data) {
			root.right = insertRecursive(root.right, value);
		}

		return root;
	}

	public void preorderTraversal() {
		preorderTraversalRecursive(root);
		System.out.println();
	}

	private void preorderTraversalRecursive(TreeNode root) {
		if (root != null) {
			System.out.print(root.data + " ");
			preorderTraversalRecursive(root.left);
			preorderTraversalRecursive(root.right);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P156_Binary_treeTraversal binaryTree = new P156_Binary_treeTraversal();
		binaryTree.insert(10);
		binaryTree.insert(5);
		binaryTree.insert(15);
		binaryTree.insert(3);
		binaryTree.insert(7);
		binaryTree.insert(12);
		binaryTree.insert(18);
		binaryTree.preorderTraversal();

	}

}
