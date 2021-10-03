package stock_Buy_Sell;

public class Stock_Buy_Sell_Naive {

	public static int maxProf(int[] arr,int start,int end) {
		if(end<=start) {
			return 0;
		}
		int profit=0;
		for(int i=start;i<end;i++) {
			for(int j=i+1;j<=end;j++) {
				if(arr[j]>arr[i]) {
					int curr_profit=arr[j]-arr[i]+maxProf(arr,start,i-1)+maxProf(arr,j+1,end);
					profit=Math.max(profit, curr_profit);
				}
			}
		}
		return profit;
	}
	
	public static void main(String[] args) {

		int arr[]= {1,5,3,8,12};
		System.out.println(maxProf(arr,0,arr.length-1));
	}

}
