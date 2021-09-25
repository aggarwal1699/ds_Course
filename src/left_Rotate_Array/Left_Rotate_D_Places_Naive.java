package left_Rotate_Array;

public class Left_Rotate_D_Places_Naive {

	static void left_Rotate_By_One(int[] arr,int n) {
		int temp=arr[0];
		for(int i=1;i<n;i++) {
			arr[i-1]=arr[i];
		}
		arr[n-1]=temp;
		
	}
	
	static void left_Rotate_By_D_Places(int[] arr,int n,int d) {
		for(int i=0;i<d;i++) {
			left_Rotate_By_One(arr,n);
		}
	}
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9};
		
//		left_Rotate_By_One(arr,arr.length);
		left_Rotate_By_D_Places(arr,arr.length,3);
		for(int i=0;i<arr.length;i++) {
			System.out.print(" "+arr[i]);
		}
	}

}
