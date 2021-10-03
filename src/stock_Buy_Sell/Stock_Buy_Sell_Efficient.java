package stock_Buy_Sell;

public class Stock_Buy_Sell_Efficient {

	public static void maxProf(int[] arr,int n) {
		int profit=0;
		for(int i=1;i<n;i++) {
			if(arr[i]>arr[i-1]) {
				profit+=arr[i]-arr[i-1];
			}
		}
		System.out.println(profit);
	}
	public static void main(String[] args) {
		int arr[]= {1,5,3,8,12};
		maxProf(arr,arr.length);
	}

}
