package com.meritamerica.assignment1;

public class CheckingAccount {
	
	private double balance;
	private double interestRate;
	
	/*
	 * Will display an error message if the withdraw amount exceeds the account
	 * balance and return a boolean value of false.
	 */
	public boolean withdraw(double amount) {
		if(amount > getBalance()) {
			System.out.println("There is not enough money in the checking account "
					+ "to make this widrawal");
			return false;
		}
		else return true;
	}
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	
	
}