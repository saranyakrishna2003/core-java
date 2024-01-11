package com.javaprograms;

public class Constructor {
	public Constructor() {
		
	}
	int id ;
	String name;
	
	@Override
	public String toString() {
		return id + name + phone ;
	}
	int phone;
	public Constructor(int id, String name, int phone) {
	
		this.id = id;
		this.name = name;
		this.phone = phone;
	}
	
	

}
