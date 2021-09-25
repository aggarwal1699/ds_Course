package left_Rotate_Array;

public class Left_Rotate_d_Places {

	public static int[] left_Rotate_By_d(int[] arr,int d,int n) {
		int tem[]=new int[n];
		int it=0;
		for(int i=d;i<n;i++) {
			tem[it]=arr[i];
			it++;
		}
		for(int i=0;i<d;i++) {
			tem[it]=arr[i];
			it++;
		}
		return tem;
	}
	
	public static void left_Rotate_By_D_Places(int[] arr,int n,int d) {
		/*
		 * in this method Theta(d) auxiliary space is used.
		 * and Theta(n) is time complexity
		 * 
		 * firstly we are saving d elements in a temporary array then 
		 * iterating with original array and at last putting temporary array 
		 * elements to the original array
		 */
		
		
		int temp[]=new int[d];
		for(int i=0;i<d;i++) {
			temp[i]=arr[i];
		}
		for(int i=d;i<n;i++) {
			arr[i-d]=arr[i];
		}
		for(int i=0;i<d;i++) {
			arr[n-d+i]=temp[i];
		}
		
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8,9};
		arr=left_Rotate_By_d(arr,2,arr.length);
		left_Rotate_By_D_Places(arr,arr.length,3);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
