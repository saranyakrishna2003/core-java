package com.javaprograms;

public class MethodOverloading1 {
public static void main(String[] args) {
	add(10);
	add(10,20);
	add(10,20,30);
}
public static void add(int a) {
	System.out.println(a);
}

public static void add(int a,int b) {
	System.out.println(a+b);
}
public static void add(int a,int b ,int c) {
	System.out.println(a+b+c);
}

}
