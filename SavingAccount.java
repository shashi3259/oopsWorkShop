package com.bridgelab.oopsworkshop;


public class SavingAccount {
	double annualInterestRest = .04;

	public double getAnnualInterestRest() {
		return annualInterestRest;
	}
	public void setAnnualInterestRest(double annualInterestRest) {
		this.annualInterestRest = annualInterestRest;
	}
	public void calculateMonthlyInterest(double balance) {

		double monthlyInerest = (annualInterestRest*balance)/12;
		System.out.println("Your Monthly Interest for Rs." + balance + " is :"+ monthlyInerest);
		System.out.println("New Balance is " + (monthlyInerest+balance));

	}

	public void calculateAnnualInterest(double balance) {

		double annualInerest = (annualInterestRest*balance);
		System.out.println("Your Annual Interest for Rs." + balance + " is :"+ annualInerest);
		System.out.println("New Balance is " + (annualInerest+balance));
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Banking - Saving Account Annual And Monthly Interest rate Calculation");
		SavingAccount saver = new SavingAccount();

		saver.setAnnualInterestRest(.05);
		saver.getAnnualInterestRest();

		saver.calculateMonthlyInterest(2000);
		saver.calculateAnnualInterest(2000);
		
		SavingAccount saver1 = new SavingAccount();
		saver1.setAnnualInterestRest(.05);
		saver1.getAnnualInterestRest();

		saver1.calculateMonthlyInterest(3000);
		saver1.calculateAnnualInterest(3000);
		
		



	}

}
