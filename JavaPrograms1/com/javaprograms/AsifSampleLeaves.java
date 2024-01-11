package com.javaprograms;
import java.util.Scanner;
public class AsifSampleLeaves {
	
	
	
		
		    public static void main(String[] args) {
		    	
		        Scanner sc = new Scanner(System.in);
	//total samples collected by user
		        int tsCollected = 0;
		        int rounds = 0;

		        System.out.println("Enter the NO.of samples collected in each round:");

		        while (true) {
		            System.out.println("Samples collected in round " + (rounds + 1) + ": ");
		            int samplesRound = sc.nextInt();

		            if (samplesRound <= 0) {
		                System.out.println("Invalid input. Please enter a positive number of samples.");
		                continue;
		            }

		            tsCollected += samplesRound;
		            rounds++;

		            if (tsCollected >= 30) {
		                break;
		            }
		        }

		        System.out.println("\nAsif completed " + rounds + " rounds in  park.");
		        System.out.println("Total leaf samples collected: " + tsCollected);

		        sc.close();
		    }
		}





