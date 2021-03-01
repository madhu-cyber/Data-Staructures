
public class BubbleSort {

	public static void main(String[] args) {
		int ar[]={10,9,7,101,23,44,12,78,34,23};
		System.out.println("before sorting");
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}
		System.out.println();
		for(int i=0;i<ar.length-1;i++) {
			int flag=0;
			for(int j=0;j<ar.length-1-i;j++) {
				if(ar[j+1]<ar[j]) {
					int temp=ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;
					flag=1;
				}
			}
			if(flag==0)
				break; 
		}
		
		System.out.println("After sorting");
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.print(ar[i]+" ");
		}
	}
}
