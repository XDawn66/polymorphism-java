/****************************************************************************************** 
Name: Zhenyu Jiang 
Course: CS170-01 
Lab #: Lab Assignment Three
Submission Date: 10pm, Thu(11/17)
Description: Manager class derived from RegularWorker. override earning() method as a polmorphism operation
*********************************************************************************************/ 

public class Manager extends RegularWorker {
   protected double bonus;

   public Manager( String name, double salary, double overtimePay, double bonus) {
      super( name, salary, overtimePay);  // call superclass constructor
      this.bonus = bonus;
   }

   public double earnings() { return super.earnings() + bonus ; }	//override the method for polymorphism for Manager


   public String toString() {	//override the method to print the name
      return "Manager: " + super.getName();
   }
}

