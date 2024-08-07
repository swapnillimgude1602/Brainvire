package Pratice_Programs;

public class P138_MiddleElement_LL {
	Node head;
	private int size;

	public P138_MiddleElement_LL() {
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

	public void addFirstLoc(String data) {
		Node newnode = new Node(data);
		if (head == null) {
			head = newnode;
			return;
		}
		newnode.next = head;
		head = newnode;
	}

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

	public void deleteFirst() {
		if (head == null) {
			System.out.println("The List is Empty");
			return;
		}
		size--;
		head = head.next;
	}

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
		while (lastNode.next != null) {
			lastNode = lastNode.next;
			secondLast = secondLast.next;
		}
		secondLast.next = null;
	}

	public String findMiddle() {
		if (head == null) {
			return "List is empty";
		}

		Node slowPointer = head;
		Node fastPointer = head;

		while (fastPointer != null && fastPointer.next != null) {
			slowPointer = slowPointer.next;
			fastPointer = fastPointer.next.next;
		}

		return "Middle Element: " + slowPointer.data;
	}

	public static void main(String[] args) {
		P138_MiddleElement_LL list = new P138_MiddleElement_LL();
		list.addFirstLoc("swapnil");
		list.addFirstLoc("Maruti");
		list.addLast("lim");
		list.printList();

		System.out.println("Middle Element:" + list.findMiddle());

	}

}
