package Pratice_Programs;

public class P135_LinkedList {

	Node head;
	private int size;

	public P135_LinkedList() {
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P135_LinkedList list = new P135_LinkedList();
		list.addFirstLoc("swap");
		list.addLast("lim");
		list.printList();
		list.deleteFirst();
		list.printList();
		list.deleteLast();
		list.printList();
	}

}
