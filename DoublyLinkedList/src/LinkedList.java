import java.util.NoSuchElementException;

import org.omg.PortableInterceptor.Current;

public class LinkedList {

	Node first;
	Node last;
	
	private class Node{
		private int value;
		private Node next;
		private Node prev;
		
		public Node(int item) {
			this.value=item;
		}
	}
	
	public void addFirst(int item) {
		Node node=new Node(item);
		if(first==null)
			first=last=node;
		else {
			node.next=first;
			first.prev=node;
			first=node;
		}
	}
	
	public void addLast(int item) {
		Node node=new Node(item);
		if(first==null)
			first=last=node;
		else {
			Node current=first;
			while(current.next!=null) {
				current=current.next;
			}
			current.next=node;
			node.prev=current;
			last=node;
		}
	}
	
	public void deleteFirst() {
		if(first==null)
			throw new NoSuchElementException();
		else {
			first=first.next;
		}
	}
	
	public void deleteLast() {
		if(first==null)
			throw new NoSuchElementException();
		else {
			Node current=first;
			while(current.next!=null) {
				current=current.next;
			}
				if(current.prev!=null) {
					last=current.prev;
					current.prev.next=null;
				}else {
					first=null;
				}
		}
	}
	
	public int indexOf(int item) {
		if(first==null) 
			throw new NoSuchElementException();
		else {
			int count=0;
			Node current=first;
			while(current!=null) {
				if(current.value==item)
					return count;
				current=current.next;
				count++;
			}
		}
		return -1;
		
	}
	
	public boolean contains(int item) {
		if(indexOf(item)!=-1)
			return true;
		return false;
	}
	
	public void add(int item,int index) {
		Node node=new Node(item);
		if(index==0) {
			node.next=first;
			first.prev=node;
			first=node;
		}else {
			Node current=first;
			while(index>1 && current!=null) {
				current=current.next;
				index--;
			}
			if(current.next!=null) {
				node.next=current.next;
				node.prev=current;
				current.next.prev=node;
				current.next=node;
			} else {
				current.next=node;
				node.prev=current;
				//throw new IndexOutOfBoundsException();
			}
		}
	}
	
	public void delete(int index) {
		if(first==null)
			throw new NoSuchElementException();
		else if(index==0) {
			first.next.prev=null;
			first=first.next;
		}else {
			Node current=first;
			while(index>0 && current!=null) {
				current=current.next;
				index--;
			}
			if(current.next!=null && current.prev!=null) {
				current.prev.next=current.next;
				current.next.prev=current.prev;
				
			}else {
				current.prev.next=null;
				//throw new IndexOutOfBoundsException();
			}
		}
	}
	
	public void reverse() {
		Node current=first;
		Node temp=null;
		while(current!=null) {
			temp=current.prev;
			current.prev=current.next;
			current.next=temp;
			current=current.prev;
		}
		if(temp!=null) 
			first=temp.prev;
	}
	
	public String toString() {
		String st="[";
		Node current=first;
		while(current!=null) {
			st=st+" "+current.value;
			current=current.next;
		}
		
		return st+" ]";
	}
}
