import java.util.Random;

public class BankAccount {

	//create a class with attributes: double checking balance & double savings balance.
	private double checkingBalance;
	private double savingsBalance;
	
	//create a ststic class with the number of accounts created so far.
	public static int numAccounts = 2;
	public static double totalAccounts = 2;
	
	// instance things (belonging to a particular bank account)
	private int accountNumber; // Ninja Bonus (could also have been a string)
	
	//Create a static class member that tracks the total amount of money stored in every account created.
	//incriment the account count, or number of accounts.
	public BankAccount() {
		BankAccount.numAccounts += 1;
		this.checkingBalance = 0;
		this.savingsBalance = 0;
	}
	
	//getter for checking balance
	public double getCheckingBalance() {
		return this.checkingBalance;
	}
	
	//getter for savings balance
	public double getSavingsBalance() {
		return this.savingsBalance;
	}
	
	// create method that allows users to deposit money into checking or saving, 
	// add to total amount stored.
	public void depositMoney(double amount, String account) {
		if (account.equals("savings"))
		this.savingsBalance += amount;
		else if (account.equals("checking"))
		this.checkingBalance += amount;
		BankAccount.totalAccounts += amount;
	}
	
	//method to withdraw from balance, but not if there are ISF.
	public void withdrawMoney(double amount, String account) {
		boolean successful = false;
		if (account.equals("savings")) {
			if (this.savingsBalance - amount >= 0) {
				successful = true;
				this.savingsBalance -= amount;
			}
		} else if (account.equals("checking")) {
			if (this.checkingBalance - amount >= 0) {
				successful = true;
				this.checkingBalance -= amount;
			}
		}
		if (successful) {
			BankAccount.totalAccounts -= amount;
		} else {
			System.out.println("Insufficient funds.");
		}
	}
	
	//check account balances.
	public void displayAccountBalance() {
		System.out.println(String.format("Savings: %.2f, Checking: %.2f", this.savingsBalance, this.checkingBalance));
	}
}