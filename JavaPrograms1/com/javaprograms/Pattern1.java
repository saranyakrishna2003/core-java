package com.javaprograms;
//i>j,j=0,i=n-1
public class Pattern1 {
	public static void main(String[] args) {
		ispattern1(8);
	}
	public static void ispattern(int n) {
		
		int l=1;
		for (int i = 0; i < n; i++) {
			for(int j=0;j<n;j++) {
				if(i>=j) {
				System.out.print(l +"  ");
				l++;
				}
				
		}
			System.out.println( );
		
		}
	}
public static void ispattern1(int n) {
		
		int l=1;
		for (int i = 0; i < n; i++) {
			for(int j=0;j<n;j++) {
				if(i<=j) {
				System.out.print(l +" ");
				l++;
				if(l>=9) {
					l=1;
				}
				}
				
				
		}
			System.out.println( );
		
		}
	}
	

}
