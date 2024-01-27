package com.task.java;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Student id");
		int studentId=sc.nextInt();
		System.out.println("enter Student name ");
		String studentName=sc.next();
		System.out.println("enter department");
		String department=sc.next();
		System.out.println("enter gender");
		String gender=sc.next();
		System.out.println("enter category");
		String category=sc.next();
		System.out.println("enter collegeFee");
		double collegeFee=sc.nextDouble();
		System.out.println("enter busnumber");
		int busNumber=sc.nextInt();
		System.out.println("enter distance");
		float distance=sc.nextFloat();
		System.out.println("Enter roomNumber");
	    int roomNumber = sc.nextInt();
	    System.out.println("Enter blockName");
	    char blockName = sc.next().charAt(0);
	    System.out.println("Enter roomType");
	    String roomType = sc.next();
	    System.out.println("Enter hostelFee");
	    int hostelFee = sc.nextInt();
		Hosteller h1 = new Hosteller( studentId,studentName, department, gender,  category,collegeFee, roomNumber,  blockName, roomType,hostelFee);
		 double totalHostellerFee = h1.calculateTotalFee();
	        System.out.println("Total Fee for Hosteller: $" + totalHostellerFee);
	        DayScholar d1 = new DayScholar(studentId, studentName, department, gender, category, collegeFee, busNumber, distance);
	        double totalDayScholarFee = d1.calculateTotalFee();
	        System.out.println("Total Fee for DayScholar: $" + totalDayScholarFee);

	        sc.close();
	        
		
		
	
		
	}

}
