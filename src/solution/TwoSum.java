package solution;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	 public static int[] twoSum(int[] nums, int target) {
		 Map<Integer, Integer> num_map=new HashMap<Integer, Integer>();
	       for(int i=0;i<nums.length;i++){
	           int temp=target-nums[i];
	           if(num_map.containsKey(temp)) {
	        	   return new int[] {num_map.get(temp),i};
	           }
	           num_map.put(nums[i], i);
	       } 
	      throw new IllegalArgumentException("no match");
	    }
	
	public static void main(String[] args) {

		int a[]= {1,3,2,4,2,};
		for(int i=0;i<twoSum(a,6).length;i++) {
			System.out.print(twoSum(a,6)[i]+" ");
		}

	}

}
