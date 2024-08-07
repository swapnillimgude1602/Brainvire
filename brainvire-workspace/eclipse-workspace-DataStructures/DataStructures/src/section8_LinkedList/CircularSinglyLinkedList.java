package section8_LinkedList;

public class CircularSinglyLinkedList {
	
	private Node head;
	private Node tail;
	
	public CircularSinglyLinkedList() {
		super();
		this.head = null;
		this.tail = null;
	}
	
	public class Node{
		int val;
		Node next;
		public Node(int val) {
			this.val=val;
		}
	}
	
	//inserting 
	public void addInsert(int val) {
		Node node = new Node(val);
		if(head==null) {
			head=node;
			tail=node;
			return;
		}
		
		tail.next=node;
		node.next=head;
		tail=node;
	}
	
	public void display() {
		Node node =head;
		if(head!=null) {
			do {
				System.out.print(node.val+"-> ");
				node=node.next;
			}while(node!=head);
		}
		System.out.println("Head");
	}
	
	public void delete(int val) {
		Node node = head;
		if(node==null) {
			return;
		}
		if(node.val==val) {
			head=head.next;
			tail.next=head;
			return;
		}
		do {
			Node n = node.next;
			if(n.val==val) {
				node.next=n.next;
				break;
			}
			node=node.next;
		}while(node!=head);
	}
	
	public static void main(String[] args) {
		CircularSinglyLinkedList cll = new CircularSinglyLinkedList();
		cll.addInsert(23);
		cll.addInsert(25);
		cll.addInsert(30);
		cll.addInsert(40);
		cll.display();
		cll.delete(25);
		cll.display();

		
	}

}
