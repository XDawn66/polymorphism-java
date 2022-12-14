/****************************************************************************************** 
Name: Zhenyu Jiang 
Course: CS170-01 
Lab #: Lab Assignment Three
Submission Date: 10pm, Thu(11/17)
Description:  This class implements two interface classes, Accountable and AccountReceivable.
 It acts like a regular business account, and the user can deposit, withdraw, and check their
 balance.
*********************************************************************************************/ 
public class BusinessAccount implements Accountable, AccountReceivable
{
	private double balance; // to hold the balance of the account
	public BusinessAccount(double init_balance)
	{
		balance = init_balance; //setting the initial balance for the account
	}
	
	
	@Override
	public void deposit(double amount) {
		System.out.println("Deposting...");
		if(amount > 0) {
		balance += amount; //adding money to the account
		System.out.println("Depositing " + amount+" to your account.");
		}	
		else
		{
			System.out.println("Unable to deposit due to invalid amount.");
		}
		System.out.println("Your current balance is: "+balance);
	}
	

	@Override
	public void withdraw(double amount) {
		System.out.println("Withdrawing...");
		if(balance >= amount && amount >= 0) { //if there is enough balance
			balance = balance - amount; //taking money out from the account
			System.out.println("Taking " + amount+" out from your account.");
			System.out.println("Your current balance is: "+balance);
		}
		else
		{
			System.out.println("Unable to withdraw due to invalid amount.");
		}
	}

	@Override
	public double getBalance() { //return the current balance of the account as a double
		return balance;
	}
	
	public String toString() //return the current balance of the account as a string
	{
		return "Total balance: "+ getBalance()+"\n";
	}
}