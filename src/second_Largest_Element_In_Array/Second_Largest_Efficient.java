package second_Largest_Element_In_Array;

public class Second_Largest_Efficient {

	static int secondLargest(int[] arr, int n) {
		int res=-1; 
		int largest=0;
		
		for(int i=0;i<n;i++) {
			if(arr[i]>arr[largest]) {
				res=largest;
				largest=i;
			}
			else if(arr[i]!=arr[largest]) {
				if(res==-1 || arr[i]>arr[res]) {
					res=i;
				}
			}
		}
		return res;
	}
	public static void main(String[] args) {

		int[] arr= {3,9,1,89,11,89,98,87,99};

		System.out.println(secondLargest(arr,arr.length));
	}

}
