package maximum_Difference;

public class Maximum_Difference_In_Array {

	public static int max_Diff(int[] arr, int n) {
		
		int max=0;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if((arr[j]-arr[i])>max) {
					max=(arr[j]-arr[i]);
				}
			}
		}
		return max;
	}
	public static void main(String[] args) {
//		int[] ar= {104,10,32,12,35,37,23,57};
//		int[] ar= {57,57,57,57,57,53,57,56};

//		int[] ar= {2,3,10,6,4,8,1};

		int[] ar= {7,9,5,6,3,2};
		int res=max_Diff(ar,ar.length);
		System.out.println(res);
	}

}
