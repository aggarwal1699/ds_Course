package leader_In_An_Array;

import java.util.HashSet;
import java.util.Set;

public class Leaders_In_Array_Naive {

	static HashSet<Integer> leaders(int[] arr,int n) {
		Set<Integer> s=new HashSet<>();
		for(int i=0;i<n;i++) {
			boolean f=false;
			for(int j=i+1;j<n;j++) {
				if(arr[i]<=arr[j]) {
					f=true;
					break;
				}
			}
			if(f==false) {
			s.add(arr[i]);}
		}
		return (HashSet<Integer>) s;
	}
	public static void main(String[] args) {
		int arr[]= {1,2,5,6,12,7,9,3,2,5,3,2,1};
		System.out.println(leaders(arr,arr.length));
	}

}
