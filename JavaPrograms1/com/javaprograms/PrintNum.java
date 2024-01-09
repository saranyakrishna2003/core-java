package com.javaprograms;

public class PrintNum {
	public static void main(String[] args) {
		
		System.out.println(isPrime(10));
		

	}
	public static int isLar(int a,int b) {
		if(a>b) {
			return a;
		}
		else {
			return b;
		}
	}

	public static boolean isEven(int a) {
		if (a % 2 == 0) {
			return true;
		}

		else {
			return false;
		}
	}
	public static int isPrime(int n) {
		for(int i=1;i<n;i++) {
			int count=0;
			int j=1;
			while(j<=i) {
				if(i%j==0) {
					count++;
					} 
				j++;
							}
			if(count==2) {
				
				System.out.println(i);
			}
			
		
		}
		return n;	
		
	
		
	}
	public static int isNum(int r) {
		for(int i=0;i<r;i++) {if(i%2!=0) {
			System.out.println(i);
		}
		
			
			
			
		}
		return r;
		
			}
}
