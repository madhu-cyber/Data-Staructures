import java.util.NoSuchElementException;

public class LinkedList {

	public Node first;
	public Node last;

	private class Node {
		private int value;
		private Node next;

		Node(int item) {
			this.value = item;
		}
	}

	public void addFirst(int item) {
		Node node = new Node(item);
		if (first == null)
			first = last = node;
		else {
			node.next = first;
			first = node;
		}
	}

	public void addLast(int item) {
		Node node = new Node(item);
		if (first == null)
			first = last = node;
		else {
			Node current = first;
			while (current.next != null) {
				current = current.next;
			}
			current.next = node;
			last = node;
		}
	}

	public void deleteFirst() {
		if (first == null)
			throw new NoSuchElementException();
		else {
			first = first.next;
		}
	}

	public void deleteLast() {
		if (first == null)
			throw new NoSuchElementException();
		else {
			Node current = first;
			Node previous = null;
			while (current.next != null) {
				previous = current;
				current = current.next;
			}
			previous.next = null;
			last = previous;
		}
	}

	public int indexOf(int item) {
		int count = 0;
		if (first == null)
			throw new NoSuchElementException();
		else {
			Node current = first;
			while (current != null) {
				if (current.value == item)
					return count;
				current = current.next;
				count++;
			}
			return -1;
		}

	}

	public boolean contains(int item) {
		if (indexOf(item) != -1)
			return true;

		return false;
	}

	public void add(int item, int index) {
		Node node = new Node(item);
		if (index == 0) {
			node.next = first;
			first = node;
		} else {
			Node current = first;
			while (index > 1 && current != null) {
				current = current.next;
				index--;
			}
			// node.next=current.next;
			// current.next=node; this two lines is enough for adding item at specified
			// position
			if (current.next != null) {
				node.next = current.next;
				current.next = node;
			} else {
				throw new IndexOutOfBoundsException();
			}
		}
	}

	public void delete(int index) {
		if (index == 0) {
			first = first.next;
		} else {
			Node current = first;
			while (index > 1 && current != null) {
				current = current.next;
				index--;
			}
			if (current.next != null)
				current.next = current.next.next;
			else
				throw new IndexOutOfBoundsException();
		}
	}

	public void reverse() {
		Node prev = null;
		Node next = null;
		Node current = first;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		first = prev;
	}

	public int getNode(int index) {
//		Node prev=null;
//		Node next=null;
//		Node current=first;
//		while(current!=null) {
//			next=current.next;
//			current.next=prev;
//			prev=current;
//			current=next;
//		}
//		first=prev;
//		Node iterate =first;
//		while(index>=1 && iterate!=null) {
//			iterate=iterate.next;
//			index--;
//		}
//		return iterate.value;

		/*
		 * Node curr = first; Node runner = first;
		 * 
		 * Move runner into the list by k elements for (int i = 0; i < index; i++) {
		 * runner = runner.next; }
		 * 
		 * Move both pointers while (runner.next != null) { curr = curr.next; runner =
		 * runner.next; }
		 * 
		 * return curr.value;
		 */
		
		int c=0;
        Node temp=first;
        Node dum=first;
        while(temp!=null){
            temp=temp.next;
            c++;
        }
        
        int x=c-index;
        for(int i=1;i<x;i++){
            dum=dum.next;
        }
        return dum.value;
	}

	static boolean hasCycle(Node head) {
        if(head==null && head.next==null)
            return false;

    Node slow = head;
    Node fast = head;

    while (fast != null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;

        if (slow == fast){
            return true;
        }
    }

    return false;
    }
	public String toString() {
		String st = "[";
		Node iterate = first;
		while (iterate != null) {
			st = st + " " + iterate.value;
			iterate = iterate.next;
		}
		return st + " ]";

	}

}
