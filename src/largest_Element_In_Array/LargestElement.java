package largest_Element_In_Array;

public class LargestElement {

	public static int largest(int[] arr, int n) {
		
		int max=0;
		for(int i=0;i<n;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}
	
	public static int IndexOfLargest(int arr[],int n) {
		int max=0;
		int idx=0;
		for(int i=0;i<n;i++) {
			if(arr[i]>max) {
				max=arr[i];
				idx=i;
				
			}
		}
		return idx;
	}
	
	public static void main(String[] args) {
	
		int arr[]= {1,5,2,7,32,78,54,67,89};
		System.out.println(largest(arr, arr.length));

		System.out.println(IndexOfLargest(arr, arr.length));
	}

}
