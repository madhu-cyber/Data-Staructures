

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		list.push(2);
		list.push(7);
		list.push(9);
		list.push(11);
		list.print();
		System.out.println();
		System.out.println(list.isCircular());
		//list.split();
		System.out.println();
		list.sortedInsert(1);
		list.sortedInsert(12);
		list.sortedInsert(8);
		list.print();
	}
}
