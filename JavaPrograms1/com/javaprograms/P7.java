package com.javaprograms;

public class P7 {
 public static void main(String[] args) {
	int n=4;
	for(int i=0;i<n;i++) {
		int k=1;
		for(int j=0;j<n;j++) {
			if(i+j>=n-1)
			{
				System.out.print(k++ +" ");
			}
			else {
				System.out.print( "  " );
			}
		}
		k=k-2;
		for (int j=0;j<n;j++) {
			if(i>j) {
				System.out.print(k-- +" ");
			}
			else {
				System.out.print("  ");
			}
		}
		System.out.println();
	}
}
}
