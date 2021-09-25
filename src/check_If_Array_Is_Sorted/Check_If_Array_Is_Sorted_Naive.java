package check_If_Array_Is_Sorted;

public class Check_If_Array_Is_Sorted_Naive {
	public static boolean check_If_Array_Is_Sorted1(int [] arr, int n) {
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[i]) {
					return false;
				}
			}
		}
		return true;
	}
	public static void main(String[] args) {

		int[] arr= {1,25,34,54,67,87,98};
		System.out.println(check_If_Array_Is_Sorted1(arr,arr.length));
		
		
	}

}
