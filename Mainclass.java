package rahul.assignment.linkedlist;

public class Mainclass {

	public static void main(String[] args) {
		SList list1 = new SList();
		SListIterator siterator = list1.iterateList();
		System.out.print(list1);
		siterator.insertNode("2");
		siterator.insertNode("3");
		System.out.println(list1);
		SListIterator iterator1 = list1.iterateList();
		iterator1.removeNode();
		System.out.println(list1);

	}

}
