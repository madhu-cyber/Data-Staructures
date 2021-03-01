
public class LinearSearch {

	public static void main(String[] args) {
		int arr[]= {10,40,56,78,46,65};
		int data=67;
		int found=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==data) {
				System.out.println("Index of the number is "+i);
				found=1;
				break;
			}
		}
		if(found==0)
			System.out.println("Data not found");
	}
}
