package rahul.assignment.linkedlist;

public class SList {
	Node head=new Node(null);
	public SListIterator iterateList() {
		return new SListIterator(head);
	}
	public String toString() {
		if(head==null) {
			return "empty list";
		}
		SListIterator iterator = this.iterateList();
		StringBuilder s=new StringBuilder();
		while (iterator.hasNext()) {
			s.append(iterator.next() + (iterator.hasNext() ? ", " : ""));
		}
		return ""+s;
	}
}
