/****************************************************************************************** 
Name: Zhenyu Jiang 
Course: CS170-01 
Lab #: Lab Assignment Three
Submission Date: 10pm, Thu(11/17)
Description: This is a driver class that create two BusinessAccount objects and testify their functionality.
*********************************************************************************************/ 

public class BusinessAccountRunner
{
	public static void main(String[] args)
	{
		BusinessAccount MainAccount = new BusinessAccount(10000); //creating an account with initial balance 10000
		BusinessAccount Secondary_Account = new BusinessAccount(2000); //creating an account with initial balance 2000
		BusinessAccount Personal_Account = new BusinessAccount(1000); //creating an account with initial balance 1000
		
		MainAccount.deposit(5000); //attempt to deposit 5000 from the account
		MainAccount.withdraw(6000); //attempt to withdraw 6000 from the account
		System.out.println(MainAccount.toString()); //print info
		
		Secondary_Account.deposit(-600); //attempt to deposit -600 from the account
		Secondary_Account.withdraw(5000); //attempt to withdraw 5000 from the account
		Secondary_Account.withdraw(-800); // attempt to withdraw -800 from the account
		System.out.println(Secondary_Account.toString());
		
		Personal_Account.deposit(-5); //attempt to deposit -5 from the account
		Personal_Account.withdraw(1000); //attempt to withdraw 1000 from the account
		System.out.println(Personal_Account.toString());
		
	}
}