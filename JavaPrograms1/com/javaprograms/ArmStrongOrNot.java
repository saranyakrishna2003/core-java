package com.javaprograms;

import java.util.Scanner;

public class ArmStrongOrNot {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number to check");
		int num = sc.nextInt();
		int temp = num, temp2 = num, sum = 0, count = 0;
		while (num > 0) {
			num = num / 10;
			count++;
		}
		while (temp > 0) {
			// remove last digit
			int last = temp% 10;
		
			int prod = 1,n=count,x=last;
			while (n > 0) {
				// prod
				prod = prod *x;
				n--;
			}
				// sum}
				sum = sum + prod;
				temp = temp / 10;
			}
		
		if (temp2 == sum) {
			System.out.println(temp2 + "is a armstrong number");
		} else {
			System.out.println(temp2 + "is a  not armstrong number");

		}
	}
}