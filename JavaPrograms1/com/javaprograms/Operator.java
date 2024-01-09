package com.javaprograms;

public class Operator {
	public static void main(String[] args) {
		int a=10;
		int b=a++ +20;
		int c= --a +b-- -10;
		int d=a-- - --b + ++c;
		System.out.println(a++);
		System.out.println(++b);
		System.out.println(c--);
		System.out.println(--d);
	}

}
