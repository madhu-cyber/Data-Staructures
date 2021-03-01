
public class QuickSort {

	public static void main(String[] args) {
		int arr[]= {4,5,2,7,3};
		System.out.println("Before sorting");
		print(arr);
		int pivot=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<pivot) {
				for(int j=i;j>0;j--) {
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
			}
		}
		System.out.println("After sorting");
		print(arr);
	}
	static int[] quickSort(int[] arr) {

        int equal=arr[0];
        int left[]=new int[arr.length/2];
        int right[]=new int[arr.length/2];
        int r=0;
        int l=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>equal){
                right[r++]=arr[i];
            }else if(arr[i]<equal){
                left[l++]=arr[i];
            }    
        }
        int j=0;
        while(j<l){
            arr[j]=left[j];
            j++;
        }
        arr[j]=equal;
        int k=j+1;
        int m=0;
        while(m<r&&k<arr.length){
            arr[k]=right[m];
            k++;
            m++;
        }
    return arr;
    }

	private static void print(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
