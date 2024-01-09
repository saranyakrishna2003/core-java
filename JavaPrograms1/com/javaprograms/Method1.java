package com.javaprograms;

public class Method1 {
	public static void main(String[] args) {
		int a=152;
		
		if(isPalindrome(a)) {
			System.out.println(a + " is pallindrome number" );
		}
	}

	public static boolean  isPalindrome(int a) {
		int temp = a;
		int rev = 0;
		while (a > 0) {
			int last = a % 10;
			rev = rev * 10 + last;
			a = a / 10;

		}
		if (rev == temp) {
			return ;
		}
		
	}

	public static int isPrime(int num) {
		int i = 1, count = 0;
		while (i <= num) {
			if (num % i == 0) {
				count++;

			}

		}
		if (count == 2) {
			System.out.println(num);
		}

		return i;
	}

}
