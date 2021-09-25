package arrayOperation;

import java.util.Scanner;

public class Search_An_Element {

	public static void searchElement(int[] ar, int x) {
		for(int i=0;i<ar.length;i++) {
			
			if(ar[i]==x) {
				System.out.println(i);
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int a[]=new int[n];
		int x=1;
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		
		searchElement(a, x);
	}

}
