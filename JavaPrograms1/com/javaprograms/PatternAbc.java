package com.javaprograms;

public class PatternAbc {
	public static void main(String[] args) {
		int n=4;
		int k=1;
		for (int i=0;i<n;i++) {
			
			
			for(int j=0;j<n;j++) {
				
				System.out.print( k++ + " ");
				if(k==10) { 
					k=1;
				}
			}
			System.out.println( );
			
		}
	}
}
