
public class QueueTest {

	public static void main(String[] args) {
		Queue queue=new Queue(5);
		queue.push(1);
		queue.push(2);
		queue.push(3);
		queue.push(4);
		queue.push(5);
		System.out.println(queue.size());
		System.out.println(queue.peek());
		System.out.println(queue);
		//System.out.println(queue.pull());
		//System.out.println(queue.size());
//		System.out.println(queue);
		//System.out.println(queue.push(6));
	}
}
