package remove_Duplicate_From_Sorted_Array;

import java.util.ArrayList;

public class RemoveDuplicate {
	static ArrayList<Integer> removeDuplicate(int arr[], int n) {
		int temp[]= new int[n];
		ArrayList<Integer> al=new ArrayList<>();
		for(int i=0;i<n-1;i++) {
			if(arr[i]==arr[i+1]) {
				continue;
			}
			else if(arr[i]!=arr[i+1]) {
				al.add(arr[i]);
			}
		}
		al.add(arr[n-1]);
		return al;
	}
	
	static int remDups(int arr[], int n)
    {
    	int res = 1;

    	for(int i = 1; i < n; i++)
    	{
    		if(arr[res - 1] != arr[i])
    		{
    			arr[res] = arr[i];
    			res++;
    		}
    	}

    	return res;
    }
	public static void main(String[] args) {
		int arr[]= {1,1,1,2,3,3,4,4,4,5,5,6,6,6,6,7};
		System.out.println(removeDuplicate(arr,arr.length));
		int n=remDups(arr,arr.length);
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
