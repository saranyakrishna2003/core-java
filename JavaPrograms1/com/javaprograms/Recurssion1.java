package com.javaprograms;

public class Recurssion1 {
	static int time = 3;

	public static void main(String[] args) {
		{
			System.out.println("from main");
			Print(3);

		}
	}

	private static void Print(int time) {
		// TODO Auto-generated method stub
		if (time <= 0) {
			return;
		}

		System.out.println("hi");
		Print(time - 1);
	}

}
