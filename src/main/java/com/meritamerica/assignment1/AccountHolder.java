package com.meritamerica.assignment1;

public class AccountHolder {
	
	private String firstName;
	private String middleName;
	private String lastName;
	private String ssn;
	
	private double checkingAccountOpeningBalance;
	private double savingsAccountOpeningBalance;
	
	public AccountHolder() {
		
	}

	public AccountHolder(String firstName, String middleName, String lastName, String ssn,
			double checkingAccountOpeningBalance, double savingsAccountOpeningBalance) {
		super();
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.ssn = ssn;
		this.checkingAccountOpeningBalance = checkingAccountOpeningBalance;
		this.savingsAccountOpeningBalance = savingsAccountOpeningBalance;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public double getCheckingAccountOpeningBalance() {
		return checkingAccountOpeningBalance;
	}

	public void setCheckingAccountOpeningBalance(double checkingAccountOpeningBalance) {
		this.checkingAccountOpeningBalance = checkingAccountOpeningBalance;
	}

	public double getSavingsAccountOpeningBalance() {
		return savingsAccountOpeningBalance;
	}

	public void setSavingsAccountOpeningBalance(double savingsAccountOpeningBalance) {
		this.savingsAccountOpeningBalance = savingsAccountOpeningBalance;
	}

	@Override
	public String toString() {
		return "AccountHolder [firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName
				+ ", ssn=" + ssn + ", checkingAccountOpeningBalance=" + checkingAccountOpeningBalance
				+ ", savingsAccountOpeningBalance=" + savingsAccountOpeningBalance + "]";
	}
	
	
	
	
}