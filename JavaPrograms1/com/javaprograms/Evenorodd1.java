package com.javaprograms;

public class Evenorodd1 { 
	public static void main(String[] args) {
		int num=25;
		int rem=num%2;
		String res=(rem==0?"even":"odd");
		System.out.println(num + "is"+res+"number");
	}

}
