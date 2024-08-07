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

public class P157_Preorder_treeTraversal {

	private static void preorderTraversal(TreeNode root) {
		if (root != null) {
			System.out.print(root.data + " ");
			preorderTraversal(root.left);
			preorderTraversal(root.right);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode node = new TreeNode(1);
		node.left = new TreeNode(2);
		node.right = new TreeNode(3);
		node.left.left = new TreeNode(4);
		node.left.right = new TreeNode(5);
		System.out.println("Inorder Traversal:");
		preorderTraversal(node);
	}

}
