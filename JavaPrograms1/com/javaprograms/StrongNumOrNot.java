package com.javaprograms;

import java.util.Scanner;

public class StrongNumOrNot {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		int sum = 0;
		int temp = num;
		while (num > 0) {
			int last = num % 10;
			int fact = 1;
			while (last > 0) {
				fact = fact * last;
				last--;
		
			}
			
		
			sum = sum + fact;
			num=num/10;
		}
		if(temp==sum) {
			System.out.println(temp+"is a strong num");
		}
		else {
			System.out.println(temp+"is not a strong num");
		}
	}
}
