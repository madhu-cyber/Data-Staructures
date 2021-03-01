//O(n^2)
public class SelectSort {

	public static void main(String[] args) {
		int ar[]={10,9,7,101,23,44,12,78,34,23};
		System.out.println("Before sorting");
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+" ");
		}
		System.out.println();
		
		for(int i=0;i<ar.length;i++) {
			int min=i;
			for(int j=i;j<ar.length;j++) {
				if(ar[j]<ar[min])
					min=j;
			}
			int temp=ar[i];
			ar[i]=ar[min];
			ar[min]=temp;
		}
		System.out.println("After sorting");
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+" ");
		}
	}
}
