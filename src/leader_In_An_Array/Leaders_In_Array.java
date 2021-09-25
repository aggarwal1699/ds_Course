package leader_In_An_Array;

import java.util.ArrayList;

public class Leaders_In_Array {

	/*
	 * leaders in an array are those elements which are greater from all the
	 * elements of its right side 
	 */
	
	static ArrayList<Integer> leaders(int[] arr,int n){
		int curr_Lead= arr[n-1];
		ArrayList<Integer> al=new ArrayList<>();
		al.add(curr_Lead);
		for(int i=n-2;i>=0;i--) {
			if(arr[i]>curr_Lead) {
				curr_Lead=arr[i];
				al.add(curr_Lead);
			}
		}
		return al;
	}
	public static void main(String[] args) {
		int[] arr= {1,2,5,6,12,7,9,3,2,5,3,2,1};
		ArrayList<Integer> al=leaders(arr,arr.length);
		System.out.println(al);
	}

}
