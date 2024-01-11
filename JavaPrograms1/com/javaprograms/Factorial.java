package com.javaprograms;

public class Factorial {
	int fact(int n) {
		int r=1;
		for(int i=n;i>=1;i--) {
			r*=i;
		}
		return r;
	}
	
	
}
