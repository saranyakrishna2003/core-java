package com.javaprograms;
import java.util.Scanner;
public class WaterBill {
	

	public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter the NO.of units of water consumed: ");
	        int uConsumed = sc.nextInt();

	        double tCharge = calculateWaterCharge(uConsumed);

	        System.out.println("Total charge for " + uConsumed + " units: Rs. " + tCharge);
	    }

	    public static double calculateWaterCharge(int unitsConsumed) {
	        double ratePerUnit;

	        if (unitsConsumed <= 100) {
	            ratePerUnit = 2.00;
	        } else if (unitsConsumed <= 300) {
	            ratePerUnit = 3.00;
	        } else {
	            ratePerUnit = 5.00;
	        }

	        double totalCharge = unitsConsumed * ratePerUnit;

	        // Apply surcharge if units consumed are above 300
	        if (unitsConsumed > 300) {
	            double surcharge = 0.025 * totalCharge;
	            totalCharge += surcharge;
	        }

	        return totalCharge;
	    }
	}


