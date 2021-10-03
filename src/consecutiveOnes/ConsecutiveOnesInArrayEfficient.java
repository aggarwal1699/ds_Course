package consecutiveOnes;

public class ConsecutiveOnesInArrayEfficient {

	public static void consecutiveOnes(int[] arr,int n) {
		int res=0;
		int curr=0;
		for(int i=0;i<n-1;i++) {
			
			if(arr[i]!=1) {
				curr=0;
				continue;
			}
			else if(arr[i]==1) {
				curr=curr+1;
			}
			res=Math.max(res,curr);
		}
		System.out.println(res);
	}
	public static void main(String[] args) {

		int[] arr= {1,1,0,1,1,1,0,1,1,1,1,1,0,1,0};
		consecutiveOnes(arr,arr.length);
		
	}

}
