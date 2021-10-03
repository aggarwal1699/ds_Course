package maximumSumSubArray;

public class Max_Sum_SubArray {

	public static void maxSumSubArray(int[] arr,int n) {
		int res=arr[0];
		for(int i=0;i<n;i++) {
			int curr=0;
			for(int j=i;j<n;j++) {
				curr=curr+arr[j];
				res=Math.max(res, curr);
			}
			
		}
		System.out.println(res);
	}
	public static void main(String[] args) {

		int[] arr= {2,3,1,-1,23,-24,5};
		maxSumSubArray(arr,arr.length);
	}

}
