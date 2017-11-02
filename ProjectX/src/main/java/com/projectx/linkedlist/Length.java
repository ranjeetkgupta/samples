package com.projectx.linkedlist;

public class Length {

	public static void main(String[] args) {
		
		Node list = createAList();
		print(list);
		
		System.out.println("count is  >>" + count(list));
		
		
		
	}

	private static int count(Node list) {
            if(list.getNext() ==null)
            	return 1;
		   
			return 1 + count (list.next);
	}

	
	
	private static void print(Node list) {
		
		Node n = list;
		while(n != null)
		{
			
			System.out.println(n.getData());
			n = n.getNext();
		}
		
		
	}

	private static Node createAList() {

		Node n1 = new Node(11);
		Node n2 = new Node(15);
		Node n3 = new Node(17);
		Node n4 = new Node(23);
		Node n5 = new Node(5);
		
		n1.setNext(n2);
		n2.setNext(n3);
		n3.setNext(n4);
		n4.setNext(n5);
		n5.setNext(null);
		
		return n1;
		
	}
	
	
}

class Node {

	public Node(int data, Node next) {
		super();
		this.data = data;
		this.next = next;
	}

	public Node(int data) {
		super();
		this.data = data;
	}

	int data;
	Node next;

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	

}