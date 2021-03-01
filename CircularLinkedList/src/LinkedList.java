 //This is circular linked list
public class LinkedList {
	 Node head;
	class Node{
		 int data;
		 Node next;
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	public void push(int data) {
		Node node=new Node(data);
		//node.next=head;
		Node temp=head;
		if(head!=null) {
			while(temp.next!=head)
				temp=temp.next;
			temp.next=node;
			node.next=head;
		}else {
			node.next=node;
			head=node;
		}
	}
	
	public boolean isCircular() {
		if(head==null)
			return false;
		else {
			Node temp=head.next;
			while(temp!=head && temp!=null) {
				temp=temp.next;
			}
			return  temp==head;
		}
			
	}
	
	public void split() {
		int count=1;
		Node temp=head.next;
		while(temp!=head) {
			count++;
			temp=temp.next;
		}
		System.out.println(count);
		int half=count/2;
		Node current=head;
		for(int i=1;i<half;i++) {
			current=current.next;
		}
		Node h2=current.next;
		Node h1=head;
		current.next=head;
		System.out.println("first half");
		do {
			System.out.print(h1.data+" ");
			h1=h1.next;
		}while(h1!=head);
		System.out.println();
		System.out.println("Second half");
		do {
			System.out.print(h2.data+" ");
			h2=h2.next;
		}while(h2!=head);
	}
	
	public void print() {
		Node temp=head;
		if(head!=null) {
			do {
				System.out.print(temp.data+" ");
				temp=temp.next;
			}while(temp!=head);
		}
			
	}

	public void sortedInsert(int data) {
		Node node=new Node(data);
		if(head==null) {
			node.next=node;
			head=node;
		}else if(head.data>=node.data) {
			Node temp=head;
			while(temp.next!=head)
				temp=temp.next;
			temp.next=node;
			node.next=head;
			head=node;
		}else {
				Node temp=head;
				Node prev=null;
				while(temp.data<node.data && temp.next!=head) {
					prev=temp;
					temp=temp.next;
				}
				if(temp.next!=head) {
					node.next=temp;
					prev.next=node;
				}else {
					temp.next=node;
					node.next=head;
				}
				
		}
	}
}
