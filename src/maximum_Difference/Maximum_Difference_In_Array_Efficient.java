package maximum_Difference;

public class Maximum_Difference_In_Array_Efficient {

	/*
	 * 	 here initially we are defining result as second element - first element 
	 * 	 and minValue will be first element 
	 * 
	 *   then we will find ith element - minValue is bigger then initial result or not
	 *   
	 *   and we are updating minValue with ith element if it is smaller then current minValue
	 */
	
	public static int maxx_Diff(int arr[],int n) {
		int res=arr[1]-arr[0];int min=arr[0];
		for(int i=0;i<n;i++) {
			res=Math.max(res,arr[i]-min );
			min=Math.min(min, arr[i]);
		}
		return res;
	}
	public static void main(String[] args) {
		int arr[]= {123,13,5,6,34,11,9,112};
		System.out.println(maxx_Diff(arr,arr.length));
		
		}
		
	}

