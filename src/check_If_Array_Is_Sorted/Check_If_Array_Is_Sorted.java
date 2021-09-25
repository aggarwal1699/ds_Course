package check_If_Array_Is_Sorted;

public class Check_If_Array_Is_Sorted {

	public static boolean check_If_Array_Is_Sorted(int [] arr, int n) {
		boolean res = false;
		for(int i=1;i<n-1;i++) {
			res=false;
			if(arr[i-1]<arr[i] & arr[i+1]>arr[i]) {
				res=true;
			}
			else {
				System.out.println(i);
				return false;
			}
		}
		return res;
	}
	public static boolean check_If_Array_Is_Sorted1(int [] arr, int n) {
		for(int i=1;i<n;i++) {
			if(arr[i-1] >arr[i]) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		int[] arr= {1,25,34,54,67};
		System.out.println(check_If_Array_Is_Sorted1(arr,arr.length));
		
		
	}

}
