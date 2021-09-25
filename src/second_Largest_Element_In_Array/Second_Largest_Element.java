package second_Largest_Element_In_Array;

public class Second_Largest_Element {

	public static int getLargest(int[] arr, int n) {
		int largest=0;
		for(int i=0;i<n;i++) {
			if(arr[i]>arr[largest]) {
				largest=i;
			}
		}
		return largest;
	}
	
	public static int secondLargest(int[] arr, int n) {
		int largest=getLargest(arr,n);
		int res=-1;
		for(int i=0;i<n;i++) {
			if(arr[i]!=arr[largest]) {
				if(res==-1) {
					res=i;
				}
				else if(arr[i]>arr[res]) {
					res=i;
				}
			}
			
		}
		return res;
	}
	
	
	
	public static void main(String[] args) {
		
		int[] arr= {3,9,1,89,11,89,98,87,90};
		System.out.println(getLargest(arr,arr.length));

		System.out.println(secondLargest(arr,arr.length));
	}

}
