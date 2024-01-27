package com.javaprograms;

public class Summa {
public String getMePen(int cost) {
	if(cost>=10) 
		return"pen";
	
		return "no pen";
	
	
	
	
}
public static void main(String[] args) {
	Summa scc=new Summa();
	String st=scc.getMePen(7);
	System.out.println(st);
}
}
