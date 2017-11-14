package com.projectx.trees;

public class InOrderTraversal {

	public static void main(String[] args) {
		Tree root = getATree();
		inorder(root);
	}

	private static void inorder(Tree root) {
		
		if(root != null)
		{
		System.out.println(root.data);
		inorder(root.left);
		inorder(root.right);
		}
		
	}

	private static Tree getATree() {

		
		Tree root = new Tree(0);
		Tree c1 = new Tree(1);
		Tree c2 = new Tree(2);
		Tree c3 = new Tree(3);
		Tree c4 = new Tree(4);
		Tree c5 = new Tree(5);
		Tree c6 = new Tree(6);
		
		root.left = c1;
		root.right = c2;
		
		c1.left = c3;
		c1.right = c4;
		
		c2.left = c5;
		c2.right = c6;
		
		return root;
		
		
		
	}
	
}
