package arrayOperation;

public class InsertElement_fixedSizeArray {

	public static int insertElement(int[] ar, int currentCapacity, int capacity, int element, int position) {
		
		if(currentCapacity==capacity) {
			return currentCapacity;
		}
		
		for(int i=currentCapacity-1;i>=position;i--) {
			ar[i+1]=ar[i];
		}
		ar[position]=element;
			for(int i=0;i<capacity;i++) {
				System.out.print(ar[i]+", ");
			}
		return currentCapacity+1;
	}
	
	public static void main(String[] args) {
		int ar[]= {12,3,2,0,0,0};
		int currentCapacity=3;
		int capacity=6;
		int element=9;
		int position=2;
		System.out.println(insertElement(ar, currentCapacity, capacity, element, position));
	}

}

/*
 * ar[]= {1,5,2,-,-}
 * capacity=5
 * current size=3
 * insert element at 2 position and shift other to next
 * updated ar[]={1,5,3,2,-}
 * 
*/
