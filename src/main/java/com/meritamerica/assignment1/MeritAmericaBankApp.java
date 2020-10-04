package com.meritamerica.assignment1;

/*
 * This program demonstrates two instances of the AccountHolder Class.
 * Certain methods are called to test both the validity of output and
 * invalid inputs.
 */
public class MeritAmericaBankApp {
	
	/*
	 * Entry point to application
	 */
	public static void main(String[] args) {

		demonstration();

	}

	/*
	 * A demonstration of the AccountHolder Class.
	 */
	public static void demonstration() {
		// instantiate a new AccountHolder object
		AccountHolder accountHolder = new AccountHolder();

		// set the balance of the checking account and savings accounts.
		accountHolder.getCheckingAccount().setBalance(100);
		accountHolder.getSavingsAccount().setBalance(1000);

		// display toString of AccountHolder object
		System.out.println(accountHolder.toString());

		// deposit $500 in to the checkingAccount
		accountHolder.getCheckingAccount().deposit(500.00);

		// withdraw $800 from the SavingsAccount
		accountHolder.getSavingsAccount().withdraw(800.00);

		// display checkingAccount toString output
		System.out.println(accountHolder.getCheckingAccount().toString());

		// display the savings account toString output
		System.out.println(accountHolder.getSavingsAccount().toString());

		// instantiate another AccountHolder object
		AccountHolder accountHolder2 = new AccountHolder();

		// set checking account of accountHolder2 balance to $200
		accountHolder2.getCheckingAccount().setBalance(200.00);

		// set the savings account of accountHolder2 to $500
		accountHolder2.getSavingsAccount().setBalance(500.00);

		// deposit -$500 in to the checking account of accountHolder2
		accountHolder2.getCheckingAccount().deposit(-500.00);

		// withdraw $600 from the savings account of accountHolder2
		accountHolder2.getSavingsAccount().withdraw(600.00);

		// display toString output of accountHolder2
		System.out.println(accountHolder2.toString());
	}
}