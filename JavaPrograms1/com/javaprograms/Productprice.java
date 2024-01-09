package com.javaprograms;
//find final product price where product price is 500, 
//the customer whose number ending with 7 will get 20% discount


public class Productprice {
	public static void main(String[] args) {
		int price=500;
		int phone =1234567;
		int tem=phone%10;
		if(tem==7) {
			price-=price*0.2;
			
		}
		System.out.println("after discount  the final product price is "+price);
	}

}

//after discount  the final product price is 400

