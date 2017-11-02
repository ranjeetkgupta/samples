package com.projectx.linkedlist;

public class Reverse {

	public static void main(String[] args) {
		
		LLNode list = createAList();
		print(list);		
		System.out.println("count is  >>" + count(list));	
		
		LLNode reverseList = reverse(list);
		print(reverseList);	
		
	}

	private static LLNode reverse(LLNode list) {
	
		if(list.next == null)
			return list ;
		
		LLNode newHead = reverse(list.next);
		list.next.next = list;
		list.next = null;
		
	    return newHead;
		
		
	}

	private static int count(LLNode list) {
            if(list.getNext() ==null)
            	return 1;
		   
			return 1 + count (list.next);
	}

	
	
	private static void print(LLNode list) {
		
		LLNode n = list;
		while(n != null)
		{
			
			System.out.println(n.getData());
			n = n.getNext();
		}
		
		
	}

	private static LLNode createAList() {

		LLNode n1 = new LLNode(11);
		LLNode n2 = new LLNode(15);
		LLNode n3 = new LLNode(17);
		LLNode n4 = new LLNode(23);
		LLNode n5 = new LLNode(5);
		
		n1.setNext(n2);
		n2.setNext(n3);
		n3.setNext(n4);
		n4.setNext(n5);
		n5.setNext(null);
		
		return n1;
		
	}
	
	
}

class LLNode {

	public LLNode(int data, LLNode next) {
		super();
		this.data = data;
		this.next = next;
	}

	public LLNode(int data) {
		super();
		this.data = data;
	}

	int data;
	LLNode next;

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public LLNode getNext() {
		return next;
	}

	public void setNext(LLNode next) {
		this.next = next;
	}

	@Override
	public String toString() {
		LLNode n = this;
		String listString = "";
		while(n != null)
		{
			
			listString = listString + n.getData() + ", ";
			n = n.getNext();
		}
		
		return listString;
	}

}