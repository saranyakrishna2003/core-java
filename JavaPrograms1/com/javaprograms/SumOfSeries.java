package com.javaprograms;

import java.util.Scanner;

public class SumOfSeries {
		

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter the value of p (must be 2.5 or greater: ");
	        double p = sc.nextDouble();

	        if (p < 2.5) {
	            System.out.println("Invalid input. p must be 2.5 or greater.");
	        } else {
	        	//seriessum
	            double sSum = calculateSeriesSum(p);
	            System.out.println("Sum of the series up to term " + p + " is: " + sSum);
	        }
	    }

	    public static double calculateSeriesSum(double p) {
	        // Assuming the series starts from 2.5
	        double sum = 0.0;
	        for (double i = 2.5; i <= p; i += 2.0) {
	            sum += i;
	        }
	        return sum;
	    }
	}

