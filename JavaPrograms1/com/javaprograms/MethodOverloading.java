package com.javaprograms;

public class MethodOverloading {
	public static void main(String[] args) {
		int a=10;	
		print((a));
		print(a);
		
	}
	public static void print(double a) {
		System.out.println("Print (double)");
		
	}
	
	public static void print(int a) {
		System.out.println("Print (int)");
		
	}
	
	public static void print(long a) {
		System.out.println("Print (long)");
		
	}
	
	public static void print(char a) {
		System.out.println("Print (Char)");
		
	}
	

}
