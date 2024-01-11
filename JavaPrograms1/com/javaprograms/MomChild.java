package com.javaprograms;
import java.util.Scanner;
public class MomChild {
	
	
	
		public static void main(String[] args) {
			        Scanner sc= new Scanner(System.in);

			        System.out.print("Enter a number (0 to 9):");
			        int num= sc.nextInt();
			        

			        if (num >= 0 && num <= 9) {
			            String numName = convertToWord(num);
			            System.out.println("Number name for " + num + " is: " + numName);

			        } 
			        else {
			            System.out.println("Invalid input. Please enter a number between 0 to 9.");
			        }
			    }

			    public static String convertToWord(int number) {
			        switch (number) {
			            case 0:
			                return "Zero";
			            case 1:
			                return "One";
			            case 2:
			                return "Two";
			            case 3:
			                return "Three";
			            case 4:
			                return "Four";
			            case 5:
			                return "Five";
			            case 6:
			                return "Six";
			            case 7:
			                return "Seven";
			            case 8:
			                return "Eight";
			            case 9:
			                return "Nine";
			            default:
			                return "Invalid Number";
			        }
			    }
		}





