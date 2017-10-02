package DSA.BST;

public class BST {
	class Node {
		int data;
		Node left, right;
		public Node(int data) {
			this.data = data;
			left = right = null;
		}
	}
	
	Node root;
	
	public BST(){
		root = null;
	}
	
	public void insert(int data){
		root = insert(data, root);
	}
	
	public Node insert(int data, Node root){
		if (root == null) {
			return new Node(data);
		} else {
			if (root.data == data) {
				return root;
			} else if (root.data > data){
				root.left = insert(data, root.left);
			} else {
				root.right = insert(data, root.right);
			}
		}
		return root;
	}
	
	public boolean find(int data) {
		return find(data, root);
	}
	
	public boolean find(int data, Node root){
		if (root == null)
			return false;
		else if(root.data == data){
			return true;
		} else if(root.data > data){
			return find(data, root.left);
		} else {
			return find(data, root.right);
		}
	}
	
	public void displayInorder(){
		displayInorder(root);
	}

	private void displayInorder(Node root) {
		if (root != null) {
			displayInorder(root.left);
			System.out.print(root.data + " ");
			displayInorder(root.right);
		}
	}
	
	public void displayPreorder(){
		displayPreorder(root);
	}

	private void displayPreorder(Node root) {
		if (root != null) {
			System.out.print(root.data + " ");
			displayInorder(root.left);
			displayInorder(root.right);
		}
	}
	
	public void displayPostorder(){
		displayPostorder(root);
	}

	private void displayPostorder(Node root) {
		if (root != null) {
			displayInorder(root.left);
			displayInorder(root.right);
			System.out.print(root.data + " ");
		}
	}
	
	private void delete(int data){
		root = delete(data, root);
	}

	private Node delete(int data, Node root) {
		if (root != null) {
			if (root.data == data) {
				if (root.right == null) {
					return root.left;
				} else if (root.left == null){
					return root.right;
				} else {
					Node successor = root.right;
					Node successorParent = root.right;
					while(successor.left != null) {
						successor = successor.left;
					}
					successor.left = root.left;
					if (successor != successorParent){
						successorParent.left = successor.right;
						successor.right = root.right;
					}
					return successor;
				}
			} else if (root.data > data){
				root.left = delete(data, root.left);
			} else {
				root.right = delete(data, root.right);
			}
		}
		return root;
	}
}
