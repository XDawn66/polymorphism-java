/****************************************************************************************** 
Name: Zhenyu Jiang 
Course: CS170-01 
Lab #: Lab Assignment Three
Submission Date: 10pm, Thu(11/17)
Description: This is a driver class to create objects from the triangular class, and both objects
call methods from the class to see functions are working properly
*********************************************************************************************/ 
public class TriangularDriver
{
	public static void main(String[] args)
	{
		double length = 10; //some hard coded data
		double height = 4;
		double width = 6;
		
		Triangular A = new Triangular(length, height); //creates a triangular object to calculate triangle area 
		A.calArea(); //calculating area
		System.out.print(A.toString()+"\n"); //output info of the triangle
		
		Pyramid B = new Pyramid(length, height, width); //creates a pyramid object to calculate triangle area 
		B.calArea();  //calculating area
		System.out.print(B.toString()); //output info of the triangle
	}
}