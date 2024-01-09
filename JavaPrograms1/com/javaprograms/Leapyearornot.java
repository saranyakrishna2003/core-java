package com.javaprograms;

public class Leapyearornot {
	public static void main(String[] args) {
		int num=2023;
		if((num%4==0)||(num%100==0)||(num%400==0)) {
			System.out.println(num +"is leap year");
		}
		else {
			System.out.println(num +"is not leap year");
			
		}
	}

}
