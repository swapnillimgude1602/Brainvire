package section8_LinkedList;

public class DoublyLinkedList {
	private Node head;
	
	class Node{
		int val;
		Node next;
		Node prev;
		
		public Node(int val) {
			this.val=val;
		}
		
		public Node(int val, Node next, Node prev) {
			super();
			this.val = val;
			this.next = next;
			this.prev = prev;
		}
	}
	
	public void insertFirst(int val) {
		Node node = new Node(val);
		node.next=head;
		node.prev=null;
		if(head!=null) {
			head.prev=node;
		}
		head=node;
	}

	public void display() {
		Node node = head;
		while(node!=null) {
			System.out.print(node.val+"-> ");
			node=node.next;
		}
		System.out.println("end");
	}
	
	public void insertLast(int val) {
		Node node = new Node(val);
		Node last = head;
		node.next=null;
		if(head==null) {
			node.prev=null;
			head=node;
			return;
		}
		while(last.next!=null) {
			last=last.next;
		}
		last.next=node;
		node.prev=last;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyLinkedList dll = new DoublyLinkedList();
		dll.insertFirst(23);
		dll.insertFirst(43);
		dll.insertFirst(53);
		dll.display();

	}

}
