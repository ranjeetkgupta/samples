package com.projectx.trees;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class LevelOrderTraversal {

	public static void main(String[] args) {
		Tree root = getATree();
		levelorder(root);
	}

	private static void levelorder(Tree root) {
		
		ArrayBlockingQueue<Tree> toBeVisited = new ArrayBlockingQueue<Tree>(10);
		if(root == null)
			return;
		
		toBeVisited.add(root.left);
		toBeVisited.add(root.right);
		
		
		while(!toBeVisited.isEmpty())
		{
			Tree temp = toBeVisited.remove();
			System.out.println(temp.data);
			toBeVisited.add(temp.left);
			toBeVisited.add(temp.right);
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
