package assignment4;

public class main {

	public static void main(String[] args) {
		BST tree = new BST();
		int a[] = {5, 3, 4, 6, 9, 6, 7, 10};
		for(int i = 0; i < a.length; i++) {
			tree.BSTInsert(a[i]);
		}
		System.out.println(tree.TreeMinimum(tree.root));
		System.out.println(tree.TreeMaximum(tree.root));
		System.out.println(tree.TreeSearch(tree.root, 16));
	}

}
