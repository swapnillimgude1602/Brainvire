package Pratice_Programs;

class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
		this.next = null;
	}
}

public class P148_Detect_Loop_LL {
	private static boolean detectLoopInLinkedList(Node head) {
		Node slow = head;
		Node fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;

			// If there is a loop, the slow and fast pointers will meet
			if (slow == fast) {
				return true;
			}
		}

		// If fast reaches the end of the list, there is no loop
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);

		// Creating a loop in the linked list
		head.next.next.next.next.next = head.next;

		boolean hasLoop = detectLoopInLinkedList(head);

		if (hasLoop) {
			System.out.println("Linked list has a loop.");
		} else {
			System.out.println("Linked list does not have a loop.");
		}
	}

}
