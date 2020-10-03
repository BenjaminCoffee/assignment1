package com.meritamerica.assignment1;

public class AccountHolder {
	
	private String firstName;
	private String middleName;
	private String lastName;
	private String ssn;
	
	private CheckingAccount checkingAccount;
	private SavingsAccount savingsAccount;
	
	public AccountHolder() {
		
	}

	public AccountHolder(String firstName, String middleName, String lastName, String ssn,
			double checkingAccountOpeningBalance, double savingsAccountOpeningBalance) {
		super();
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.ssn = ssn;
		// modified to point to the balance of checkingAccount field
		this.checkingAccount.setBalance(checkingAccountOpeningBalance);
		// modified to point to the balance of savingsAccount field
		this.savingsAccount.setBalance(savingsAccountOpeningBalance);
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

	// refactored checkingAccount and savingsAccount getters and setters
	public CheckingAccount getCheckingAccount() {
		return checkingAccount;
	}

	public void setCheckingAccount(CheckingAccount checkingAccount) {
		this.checkingAccount = checkingAccount;
	}

	public SavingsAccount getSavingsAccount() {
		return savingsAccount;
	}

	public void setSavingsAccount(SavingsAccount savingsAccount) {
		this.savingsAccount = savingsAccount;
	}

	@Override
	public String toString() {
		return "AccountHolder [firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName
				+ ", ssn=" + ssn + ", checkingAccount=" + checkingAccount + ", savingsAccount=" + savingsAccount + "]";
	}
	
	

	
	
	
	
	
}