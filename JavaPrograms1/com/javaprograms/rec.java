package com.javaprograms;

public class rec {
	

	    public static void main(String[] args) {
	        int n =5; // Change this value to the desired number of Fibonacci elements
	        System.out.println("Fibonacci Series:");
	        for (int i = 0; i < n; i++) {
	            System.out.println(rec.fibonacci(i) + " ");
	        }
	    }

	    public static int fibonacci(int n) {
	        if (n <= 1) {
	            return n;
	        } else {
	            return fibonacci(n - 1) + fibonacci(n - 2);
	        }
	    }
	    
	

}
