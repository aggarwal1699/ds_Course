package frequencies_In_Sorted_Array;

import java.util.HashMap;
import java.util.Iterator;

public class Frequency_Of_Elements_In_Sorted_Array {

	public static void freq(int[] arr,int n) {
		HashMap<Integer,Integer> hs=new HashMap<>();
		int res=1;
		for(int i=0;i<n-1;i++) {
			
			if(arr[i]==arr[i+1]) {
				res=res+1;
			}
			else if(arr[i]!=arr[i+1]) {
				
//				hs.put(arr[i],res);
				System.out.println(arr[i]+" "+res);
				res=1;
			}
		}
		System.out.println(arr[n-1]+" "+res);
//		hs.put(arr[n-1],res);
		System.out.println(hs);
		
		
	}
	public static void main(String[] args) {
		int[] arr= {1,1,2,2,2,2,2,3,3,3,4,4,5,5,7,7,8,10,11,11,11,12};
		freq(arr,arr.length);
		
	}

}
