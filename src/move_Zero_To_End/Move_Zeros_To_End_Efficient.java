package move_Zero_To_End;

public class Move_Zeros_To_End_Efficient {

	public static void moveZeros(int[] arr,int n) {
		int count=0;
		for(int i=0;i<n;i++) {
			if(arr[i]!=0) {
				int temp=arr[i];
				arr[i]=arr[count];
				arr[count]=temp;
				count++;
			}
		}
	}
	public static void main(String[] args) {
		int[] arr= {1,2,0,0,1,1,2,0,1,0,1,3,30,0,0,0};
		moveZeros(arr, arr.length);
		for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");}
	}

}
