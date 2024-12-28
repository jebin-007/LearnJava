package dataStructures;

class Node{
	int data;
	Node next;
	
	 Node(int data) {
		 
		 this.data = data;
		 this.next = null;
		
	}
}

public class SingleLinkedList {
	
	private Node head;
	private Node tail;
	
	public void add(int data) {
		Node newNode = new Node(data);
		
		if(head == null) {
			head = newNode;	
		}
		else {
			tail
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
