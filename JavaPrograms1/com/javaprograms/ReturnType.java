package com.javaprograms;

public class ReturnType {
	public static void main(String[] args) {
		System.out.println(isEven(4));

		System.out.println(isEven(11));
		System.out.println(isLar (40,50));
		System.out.println(isLar(20,10));

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
	

}
