package com.javaprograms;

public class Validdateornot {
	public static void main(String[] args) {
		int dd=1;
		int mm=2;
		int yy=2023;
		if((dd>=1||dd<=31||mm==1||mm==12||mm==3||mm==5||mm==7||mm==8||mm==10||mm==12||yy<1)) {
			System.out.println("valid date");
			
		}
		else if((mm==4||mm==6||mm==9||mm==11)&&(dd<30)||(mm<2)&&(dd>28))
		{
			System.out.println("invalid");
		}
		else {
			System.out.println("valid ");
		}
	}

}
