
public class InsertionSort {

	public static void main(String[] args) {
		int ar[]={10,9,7,101,23,44,12,78,34,23};
		System.out.println("before sorting");
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.print(ar[i]+" ");
		} 
		System.out.println();
		for(int i=1;i<ar.length;i++) {
			int temp=ar[i];
			int j=i-1;
			while(j>=0 && ar[j]>temp) {
				ar[j+1]=ar[j];
				j--;
			}
			ar[j+1]=temp;
		}
		System.out.println("after sorting");
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.print(ar[i]+" ");
		}
	}
}
