public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		list.addFirst(10);
		list.addFirst(20);
		list.addFirst(30);
		list.addLast(40);
		list.addLast(50);
		System.out.println(list);
		System.out.println(list.indexOf(60));
		System.out.println(list.contains(60));
		//list.add(60,1);
		list.delete(0);
		//list.reverse();
		System.out.println(list);
		//list.deleteFirst();
		//list.deleteLast();
		//System.out.println(list);
	}
}
