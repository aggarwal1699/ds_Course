package reverse_An_Array;

public class Reverse_An_Array {
	
	public static void reverse(int[] arr, int n) {
		int low=0;
		int high=n-1;
		for(int i=0;i<n/2;i++) {
			int temp=arr[low];
			arr[low]=arr[high];
			arr[high]=temp;
			low++;
			high--;
		}
	}
	
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,9,67,54};
		reverse(arr,arr.length);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
