/****************************************************************************************** 
Name: Zhenyu Jiang 
Course: CS170-01 
Lab #: Lab Assignment Three
Submission Date: 10pm, Thu(11/17)
Description: The SeniorWroeker is a super class that has variables to hold the base and height and the final calculation result.
It uses the triangle area formula to perform calculation. The overrided toString methods will print out all info of the triangle
*********************************************************************************************/ 
public class Triangular
{
	private double base, height, result;
	
	public Triangular(double base, double height)
	{
		this.base = base;
		this.height = height;
	}
	
	public void calArea()
	{
		result = base*height/2; //computing area of the triangle
	}
	
	public double getbase() {
		return base;
	}
	
	public double getheight()
	{
		return height;
	}
	
	public String toString()
	{
		String output = "The base of the triangle will be: " + base +"\n";
		String output2 = "The height of the triangle will be: " + height +"\n";
		String output3 = "The area of the triangle will be: " + result +"\n";
		return(output+output2+output3); //return all three outputs as a string
	}
}