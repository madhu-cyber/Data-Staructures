//LIFO
public class Stack {

	private Object obj[];
	private int top;
	private int capacity;
	
	public Stack(int capacity) {
		this.capacity=capacity;
		obj=new Object[capacity];
		top=-1;
	}
	
	public boolean push(Object item) {
		if(top==capacity-1) {
			System.out.println("Stack overflow....!");
			return false;
		}
		obj[++top]=item;
		return true;
	}
	
	public Object pop() {
		if(top==-1) {
			System.out.println("Stack underflow.....!");
			return null;
		}
		return obj[top--];
	}
	
	public Object peek() {
		if(top==-1) {
			System.out.println("Stack underflow...!");
			return null;
		}
		return obj[top];
	}
	
	public int size() {
		return top+1;
	}
	
	public String toString() {
		String st="[";
		for(int i=0;i<=top;i++){
			st=st+" "+obj[i];
		}
		return st+" ]";
	}
}
