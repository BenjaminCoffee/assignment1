package com.meritamerica.assignment1;

import java.text.NumberFormat;
import java.util.Locale;

public class SavingsAccount {
	private final double INTEREST_RATE = 0.01;
	
	private double balance;
	private double interestRate = INTEREST_RATE;
	
	public SavingsAccount() {
		
	}
	
	/*
	 * constructor that accepts the opening balance as it's argument.
	 */
	public SavingsAccount(double openingBalance) {
		this.balance = openingBalance;
	}
	
	/*
	 * returns the future account balance based on the current balance,
	 * the interest rate, and the specified number of years.
	 */
	public double futureValue(int years) {
		double balance = getBalance();
		double interestRate = getInterestRate();
		
		return balance * (Math.pow(1 + interestRate, years));
	}
	
	/*
	 * Will display an error message and return false if 
	 * amount is either negative or greater than the account balance.
	 * A valid amount will result in amount subtracting from balance and
	 * true being returned from the method.
	 */
	public boolean withdraw(double amount) {
		if(amount < 0) {
			System.out.println("You may not withdraw a negative amount.");
			return false;
		}
		
		if(amount > getBalance()) {
			System.out.println("There is not enough money in the checking account "
					+ "to make this widrawal");
			return false;
		}
		
		this.balance = getBalance() - amount;
		return true;
	}
	
	/*
	 * Will display an error message and return false if amount is negative.
	 * A valid amount will be added to balance.
	 */
	public boolean deposit(double amount) {
		if(amount < 0) {
			System.out.println("You may not deposit a negative amount.");
			return false;
		}
		
		this.balance = getBalance() + amount;
		return true;
	}
	
	//
	// Accessors and Mutators
	//
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

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 * 
	 * returns the state of the object as a string.
	 */
	@Override
	public String toString() {
		return generateStringForToString();
	}
	
	/*
	 * returns a string to be used in the toString method
	 */
	public String generateStringForToString() {
		StringBuilder str = new StringBuilder();
		
		str.append("Savings Account Balance: " + displayInUSD(getBalance()) + "\n");
		str.append("Savings Account Interest Rate : " + 
					String.format("%.5f", getInterestRate()) + " \n");
		str.append("Savings Account Balance in 3 years: " + 
					displayInUSD(futureValue(3)) + "\n");
		
		return str.toString();
	}
	
	/*
	 * returns the specified decimal formatted in United States Dollar
	 */
	public String displayInUSD(double decimal) {
		NumberFormat formatter = NumberFormat.getCurrencyInstance(Locale.US);
		
		return formatter.format(decimal);
	}
}