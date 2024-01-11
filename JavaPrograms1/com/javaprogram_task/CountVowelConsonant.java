package com.javaprograms;

import java.util.Scanner;

public class CountVowelConsonant {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String To Calculate");
		//String st=hai iam Java;
		String st=sc.nextLine();
		String s2=st.toLowerCase();
		System.out.println(s2);
		int aCount=0;
		int cCount=0;
		for(int i=0;i<s2.length();i++)
		{
			char ch=s2.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				aCount++;
				
			}
			else {
				cCount++;
			}
		}
		System.out.println("vowel "+ aCount);
		System.out.println("consonat "+cCount);
	}
	

}
