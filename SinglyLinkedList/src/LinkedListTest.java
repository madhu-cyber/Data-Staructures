
public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		list.addFirst(1);
		list.addFirst(2);
		list.addFirst(3);
		list.addLast(4);
		list.addLast(5);
		//list.deleteFirst();
		//list.deleteLast();
		System.out.println(list);
		//System.out.println(list.hasCycle(list.first));
		//list.add(6, 4);
		//list.delete(5);
		System.out.println(list.indexOf(5));
		System.out.println(list.contains(7));
//		System.out.println(list);
//		list.reverse();
//		System.out.println(list);
		//System.out.println(list.getNode(2));
	}
}
  