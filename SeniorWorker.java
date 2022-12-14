/****************************************************************************************** 
Name: Zhenyu Jiang 
Course: CS170-01 
Lab #: Lab Assignment Three
Submission Date: 10pm, Thu(11/17)
Description: The SeniorWroeker is a subclass of the regularWorker class. It adds a new variable meritPay
and it overrides the earning and toString methods. 
*********************************************************************************************/ 
public class SeniorWorker extends RegularWorker
{
	private double meritPay;
	public SeniorWorker(String name, double salary, double overtimePay)
	{
		super(name,salary,overtimePay);
	}
	
	public double earnings()
	{
		meritPay = 0.1*salary; //calculating the meritPay
		return super.earnings() + meritPay;  //adding the meritPay to the total pay
	}
	
	 public String toString() {	//override the method to print the name
	      return "Senior worker: " + getName();   
	   }
}