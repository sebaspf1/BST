package assignment4;

public class BST{
	class Node{
		int key;
		Node p;
		Node left;
		Node right;
		public Node() {
			key = 0;
			p = null;
			left = null;
			right = null;
		}
	}
	Node root;
	
	public BST() {
		root = null;
	}
	
	public void BSTInsert(int newData) {
		Node z = new Node();
		z.key = newData;
		Node y = null;
		Node x = root;
		while(x != null) {
			y = x;
			if(z.key < x.key)
				x = x.left;
			else
				x = x.right;
		}
		z.p = y;
		if(y == null)
			root = z;
		else if(z.key < y.key)
			y.left = z;
		else
			y.right = z;
	}
	
	public int TreeMinimum(Node x) {
		while(x.left != null) {
			System.out.println(x.key);
			x = x.left;
		}
		return x.key;
	}
	
	public int TreeMaximum(Node x) {
		while(x.right != null) {
			x = x.right;
		}
		return x.key;
	}
	
	public Node TreeSearch(Node x, int k) {
		if(x == null || k == x.key)
			return x;
		if(k < x.key)
			return TreeSearch(x.left, k);
		return TreeSearch(x.right, k);
	}
}
