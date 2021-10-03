package consecutiveOnes;

public class ConsecutiveOnesInArray {

	public static void consecutiveOnes(int[] arr,int n) {
		int res=0;
		for(int i=0;i<n;i++) {
			int curr=0;
			for(int j=i;j<n;j++) {
				if(arr[j]==1) {
					curr++;
				}
				else {
					break;
				}
			}
			res=Math.max(res, curr);
		}
		System.out.println(res);
	}
	public static void main(String[] args) {
		int[] arr= {1,1,0,1,1,1,1,0,1,0,1,0};
		consecutiveOnes(arr,arr.length);
	}

}
