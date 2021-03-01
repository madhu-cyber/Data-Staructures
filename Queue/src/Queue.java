//FIFO
public class Queue {

	private Object obj[];
	private int first;
	private int last;
	private int capacity;
	
	public Queue(int capacity) {
		this.capacity=capacity;
		obj=new Object[capacity];
		first=last=-1;
	}
	
	public boolean push(Object item) {
		if(last==capacity-1) {
			System.out.println("Queue is full");
			return false;
		}
		if(last==-1)
			first++;
		obj[++last]=item;
		return true;
		
	}
	
	public Object pull() {
		if(first==-1) {
			System.out.println("Queue is empty");
			return null;
		}
		Object item=obj[first++];
		if(first>last)
			first=last=-1;
		return item;
	}
	
	public Object peek() {
		if(first==-1) {
			System.out.println("Queue is empty");
			return null;
		}
		return obj[first];
	}
	
	public int size() {
		if(first==-1)
			return 0;
		return last-first+1;
	}
	
	public String toString() {
		String st="[";
		for(int i=first;i<=last&&first!=-1;i++) {
			st=st+" "+obj[i];
		}
		return st+" ]";
	}
}
