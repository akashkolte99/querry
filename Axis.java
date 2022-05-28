package com.prob4;

public class Axis extends Bank {

	double rateOfintrest;
	@Override
	public void displayDetails() {
		Axis a = new Axis();
		a.branchName="Axis";
//		System.out.println(a.branchName);
		a.IfscCode="axis001";
//		System.out.println(a.IfscCode);
//		System.out.println(this.rateOfintrest);
		a.rateOfintrest=9.0;
	}
	
	 public void getCreditCard() {
	 System.out.println("Get the Credit Card from the Axis bank");
	 }
}
