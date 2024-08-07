package section8_LinkedList;

public class SingularLinkedList {
	Node head;
	private int size;

	public SingularLinkedList() {
		this.size = 0;
	}

	class Node {
		String data;
		Node next;

		Node(String data) {
			this.data = data;
			this.next = null;
			size++;
		}
	}

	// add at loc first
	public void addFirst(String data) {
		Node newnode = new Node(data);
		if (head == null) {
			head = newnode;
			return;
		}
		newnode.next = head;
		head = newnode;
	}

	// add at loc last
	public void addLast(String data) {
		Node newnode = new Node(data);
		if (head == null) {
			head = newnode;
			return;
		}

		Node currNode = head;
		while (currNode.next != null) {
			currNode = currNode.next;
		}
		currNode.next = newnode;
	}

	// print
	public void printList() {
		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		Node currNode = head;
		while (currNode != null) {
			System.out.print(currNode.data + "-> ");
			currNode = currNode.next;
		}
		System.out.println("Null");
	}

	// delete first
	public void deleteFirst() {
		if (head == null) {
			System.out.println("The List is Empty");
			return;
		}
		size--;
		head = head.next;
	}

	// deleteLast
	public void deleteLast() {
		if (head == null) {
			System.out.println("The list is Empty");
			return;
		}
		size--;
		if (head.next == null) {
			head = null;
			return;
		}
		
		Node secondLast = head;
		Node lastNode = head.next;
		while(lastNode.next!=null) {
			lastNode=lastNode.next;
			secondLast=secondLast.next;
		}
		secondLast.next=null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingularLinkedList list = new SingularLinkedList();
		list.addFirst("Swapnil");
		list.addFirst("is");
		list.printList();

		
		list.addLast("limgude");
		list.addFirst("my name");
		list.printList();
		
		list.deleteFirst();
		list.printList();
		
		list.deleteLast();
		list.printList();

	}

}
