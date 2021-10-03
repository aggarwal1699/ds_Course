package trappingRainWater;

public class TrappingRainWater {

	static void trappingWater(int[] arr,int n) {
		
		int res=0;
		for(int i=1;i<n-1;i++) {
			int lMax=arr[i];
			for(int j=0;j<i;j++) {
				lMax=Math.max(lMax, arr[j]);
			}
			int rMax=arr[i];
			for(int j=i+1;j<n;j++) {
				rMax=Math.max(rMax, arr[j]);
			}
			
			res+=Math.min(lMax, rMax)-arr[i];
		}
		System.out.println(res);
	}
	public static void main(String[] args) {
		int arr[]= {3,5,1,5,3,2,5};
		trappingWater(arr,arr.length);
		
	}

}
