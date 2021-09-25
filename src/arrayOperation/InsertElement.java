package arrayOperation;

public class InsertElement {

	public static int insertE(int[] ar, int n, int x, int pos, int cap) {
		if(n==cap) {
			return n;
		}
		int idx=pos-1;
		for(int i=n-1;i>=idx;i--) {
			ar[i+1]=ar[i];
		}
		ar[idx]=x;
		return n+1;
	}
	public static void main(String[] a) {
		int[] arr=new int[5];
		int cap=5;
		int n=3;
		arr[0]=1;
		arr[1]=2;
		arr[2]=4;
		
		System.out.println("Before insertion");
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
		int x=9; int pos=2;
		System.out.println("after insertion");
		 n=insertE(arr, n, x, pos, cap);
		 for(int i=0;i<n;i++) {
			 System.out.println(arr[i]);
		 }
	}
}
