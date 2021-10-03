package trappingRainWater;

public class TrappingRainWaterEfficient {

	public static void trappingWater(int[] arr,int n) {
		int res=0;
		int lMax[]=new int[n];
		int rMax[]=new int[n];
		
		lMax[0]=arr[0];
		for(int i=1;i<n;i++) {
			lMax[i]=Math.max(arr[i],lMax[i-1]);
		}
		rMax[n-1]=arr[n-1];
		for(int i=n-2;i>=0;i--) {
			rMax[i]=Math.max(arr[i], rMax[i+1]);
		}
		
		for(int i=0;i<n;i++) {
			System.out.println(rMax[i]+" "+lMax[i]);
		}
		
		for(int i=1;i<n;i++) {
			res=res+(Math.min(lMax[i],rMax[i])-arr[i]);
		}
		System.out.println(res);
	}
	public static void main(String[] args) {

		int arr[]= {3,0,1,2,5};
		trappingWater(arr,arr.length);
	}

}
