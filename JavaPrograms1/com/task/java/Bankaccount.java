package com.task.java;

public class Bankaccount {
	private int account_number;
	private String account_name;
	private double balance;
	
@Override
	public String toString() {
		return "Bankaccount [account_number=" + account_number + ", account_name=" + account_name + ", balance="
				+ balance + "]";
	}
public Bankaccount() {
		
	}
	public Bankaccount(int account_number) {
		this.account_number=account_number;
	
	}
	public Bankaccount(int account_number,String account_name) {
		this.account_number=account_number;
		this.account_name=account_name;
		
	}
	public Bankaccount(int account_number,String account_name,double balance){
		this.account_number=account_number;
		this.account_name=account_name;
		this.balance=balance;
	}
}
