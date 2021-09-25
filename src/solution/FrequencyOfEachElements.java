package solution;

public class FrequencyOfEachElements {

	public static int max(int[] ar) {
		int temp=0;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]>temp) {
				temp=ar[i];
			}
		}
		
		return temp;
	}
	
	public static void freq(int[] ar) {
		int max=max(ar);
		int temp[]=new int[max];
		for(;;) {
			
		}
	}
	
	
	public static void main(String[] args) {
		System.out.println(max(new int[]{1,4,9,2,7}));
		
	}

}
