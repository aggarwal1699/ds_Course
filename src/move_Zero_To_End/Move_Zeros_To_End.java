package move_Zero_To_End;

public class Move_Zeros_To_End {

	public static int moveZeros(int[] arr,int n) {
		for(int i=0;i<n;i++) {
			if(arr[i]==0) {
				for(int j=i+1;j<n;j++) {
					if(arr[j]!=0) {
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
			}
		}
		return n;
	}
	public static void main(String[] args) {
		int[] arr= {1,0,48,78,0,0,0,5,0,9,0,0};
		moveZeros(arr,arr.length);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
