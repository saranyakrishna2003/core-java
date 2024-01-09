package com.javaprograms;
import java.utg4r

public class PallindromeOrNot {
	public static void main(String[] args) {
		
	
	int num=1232144;
	int temp=num;
	int rev=0;
	while(num>0) {
		int last=num%10;
		rev=rev*10+last;
		num=num/10;
		
				
	}
	if(temp==rev)
	{
		System.out.println(temp+"is palindrome");
		
	}
	else {
		System.out.println(temp+"is not a palidrome");
	}
}
}