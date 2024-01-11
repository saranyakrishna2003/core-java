package com.task.java;

public class TestBank {
	public static void main(String[] args) {
		Bankaccount b=new Bankaccount();
		Bankaccount b1=new Bankaccount(12233);
		Bankaccount b2=new Bankaccount(678,"sara");
		Bankaccount b3=new Bankaccount(123445,"loki",344);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b);
	

}
}
