/****************************************************************************************** 
Name: Zhenyu Jiang 
Course: CS170-01 
Lab #: Lab Assignment Three
Submission Date: 10pm, Thu(11/17)
Description: This is a subclass that inherits from the triangular class. It has all variables 
and methods from the triangular class. However, it has a new variable to store width of the pyramid,
and it overrides calArea and the toString methods to calculate pyrmid's surface area and print data
*********************************************************************************************/ 
import java.lang.Math;
import java.math.BigDecimal;
import java.text.Format;
import java.text.NumberFormat;
public class Pyramid extends Triangular
{
	private double width;
	private String FinalArea;
	public Pyramid(double base, double height, double width)
	{
		super(base, height);
		this.width = width;
	}
	
	public void calArea()
	{
		BigDecimal res1 = new BigDecimal(width*getbase()); //testing the BigDecimal class to get a better calculation result.
		BigDecimal res2 = new BigDecimal(width* Math.sqrt(Math.pow(getbase()/2,2)+getheight()*getheight()));
		BigDecimal res3 = new BigDecimal(getbase()*Math.sqrt(Math.pow(width/2,2)+getheight()*getheight()));
		BigDecimal res4 = res1.add(res2).add(res3); 
		
		NumberFormat surfaceArea = NumberFormat.getNumberInstance();
		surfaceArea.setMaximumFractionDigits(3); //setting the decimal place to three
		FinalArea = surfaceArea.format(res4);
		
	}
	
	public String toString()
	{
		String output = "The length(base) of the pyramid will be: " + getbase() +"\n";
		String output2 = "The width of the pyramid will be: " + width +"\n";
		String output3 = "The height of the pyramid will be: " + getheight() +"\n";
		String output4 = "The area of the pyramid will be: " + FinalArea +"\n";
		return(output+output2+output3+output4); //return all three outputs as a string
	}

}