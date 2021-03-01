
public class ArrayTest {

	public static void main(String[] args) {
		Array array=new Array(2);
		array.insert(1);
		array.insert(2);
		array.insert(3);
		array.insert(4);
		array.insert(5);
		array.removeAt(4);
		System.out.println(array.indexOf(5));
		array.print();
	}
}
