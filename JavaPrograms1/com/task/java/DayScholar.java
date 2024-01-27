package com.task.java;

public class DayScholar extends Student {
	private int busNumber;
	private float distance;
	public int getBusNumber() {
		return busNumber;
	}
	public void setBusNumber(int busNumber) {
		this.busNumber = busNumber;
	}
	public float getDistance() {
		return distance;
	}
	public void setDistance(float distance) {
		this.distance = distance;
	}
	public DayScholar(int studentId, String studentName, String department, String gender, String category,
			double collegeFee, int busNumber, float distance) {
		super(studentId, studentName, department, gender, category, collegeFee);
		this.busNumber = busNumber;
		this.distance = distance;
	}
	 public static double calculateTotalFees(int distance) {
		 if (distance > 30 && distance <= 40) {
	            return (getCollegeFee() + 28000);
	        } else if (distance > 20 && distance <= 30) {
	            return getCollegeFee() + 20000;
	        } else if (distance > 10 && distance <= 20) {
	            try {
					try {
						return getCollegeFee() + 12000;
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	        } else {
	            return getCollegeFee() + 6000;
	        }
	        
	 }
	
}
