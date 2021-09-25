package left_Rotate_Array;

public class Left_Rotate_Array_By_One {

	public static void rotate(int[] arr, int n) {
		int temp=arr[0];
		for(int i=1;i<n;i++) {
			arr[i-1]=arr[i];
		}
		arr[n-1]=temp;
	}
	public static void main(String[] args) {
		int arr[]= {1,2,1,2,4,1,6,7,4,0};
		rotate(arr,arr.length);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
