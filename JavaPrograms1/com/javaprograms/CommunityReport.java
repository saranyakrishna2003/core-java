package com.javaprograms;
import java.util.Scanner;
public class CommunityReport {
	
		

		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        System.out.println("Enter score =>0-10:");
		        int score = sc.nextInt();

		        switch (score) {
		            case 0:
		            case 1:
		            case 2:
		            case 3:
		                System.out.println("When can we meet you to explain the roles and responsibilities of a resident?");
		                break;
		            case 4:
		            case 5:
		            case 6:
		            case 7:
		                System.out.println("You have taken a step in the right direction!");
		                break;
		            case 8:
		            case 9:
		            case 10:
		                System.out.println("Thank you for going the extra mile! Would you be interested in training others?");
		                break;
		            default:
		                System.out.println("Invalid score. Please enter a score between 0 and 10.");
		        }
		    }
		

	}



