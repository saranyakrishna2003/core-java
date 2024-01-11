package com.javaprograms;
import java.util.Scanner;
public class CountVc {
	public static void main(String[] args) {
		int vowels=0;
		int consonant=0;
		Scanner sc = new Scanner(System.in);
		//hello computer 
		System.out.println("Enter the sentence");
		String s1=sc.nextLine();
		String s2="";
		s2=s2+s1.toLowerCase();
		
		System.out.println(s2);
		for(int i=0; i<s2.length();i++) {
			char ch = s2.charAt(i);
			if(ch=='a' || ch=='e' || ch =='i' || ch=='o'|| ch=='u') {
				vowels++;
			}
			
		  else if ((ch >= 'a' && ch <= 'z') && ch != ' ') {
	         consonant++;
	     }
		}
		System.out.println("Vowels: "+vowels);
		System.out.println("consonats: "+consonant);
	}
	}

