package rahul.assignment.linkedlist;

public class SListIterator {
	Node current;
	SListIterator(Node node){
		this.current=node;
	}
	public Node next() {
		current=current.next;
		return current;
	}
	public boolean hasNext() {
		return current.next!=null;
	}
	public void insertNode(String data) {
		current.next=new Node(data, current.next);
		current=current.next;
	}
	public void removeNode() {
		if(current.next!=null) {
			current.next=current.next.next;
		}
	}
}
