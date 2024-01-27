package com.task.java;

class Hosteller extends Student {
	private int roomNumber;
	private char blockName;
	private String roomType;
	
	
	
	public int getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	public char getBlockName() {
		return blockName;
	}
	public void setBlockName(char blockName) {
		this.blockName = blockName;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	
	
	//constructor
	public Hosteller(int studentId, String studentName, String department, String gender, String category,
			double collegeFee, int roomNumber, char blockName, String roomType, int hostelFee) {
		super(studentId, studentName, department, gender, category, collegeFee);
		this.roomNumber = roomNumber;
		this.blockName = blockName;
		this.roomType = roomType;
		
	}
	

	public double calculateTotalFee(int hostelFee) {
		
		double hostelFee1;
        if ("A".equals(blockName)) {
            hostelFee1 = 60000;
        } else if ("B".equals(blockName)) {
            hostelFee1 = 50000;
        } else if ("C".equals(blockName)) {
            hostelFee1 = 40000;
        } else {
            // Default case
            hostelFee1 = 0;
        }

        if ("AC".equals(roomType)) {
            return getCollegeFee() + hostelFee1 + 8000;
        } else {
            return getCollegeFee() + hostelFee1 + 2500;
        }
	        
	}
	
	
	
	

}
