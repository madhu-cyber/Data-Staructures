import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		int arr[]= {15,23,78,45,36};
		Arrays.sort(arr);
		int data=71;
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		int f=0;int l=arr.length-1;
		int found=0;
		while(f<=l) {
			int mid=(f+l)/2;
			if(arr[mid]==data) {
				System.out.println("Index of the number is "+mid);
				found=1;
				break;
			}else if(data<arr[mid]) {
				l=mid-1;
			}else if(data>arr[mid]){
				f=mid+1;
			}
		}
		if(found==0)
			System.out.println("Data not found");
	}
}
