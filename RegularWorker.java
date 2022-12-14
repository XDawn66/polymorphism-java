/****************************************************************************************** 
Name: Zhenyu Jiang 
Course: CS170-01 
Lab #: Lab Assignment Three
Submission Date: 10pm, Thu(11/17)
Description: RegularWorker class derived from Employee with a polymorphic method earnings()
*********************************************************************************************/ 


public class RegularWorker extends Employee {
   protected double salary, overtimePay;

   public RegularWorker( String name, double salary, double overtimePay) {
      super( name );  // call superclass constructor
      this.salary = salary;
      this.overtimePay = overtimePay;
   }

   public double earnings() { return salary + overtimePay; }	//implements the method for polymorphism


   public String toString() {	//override the method to print the name
      return "Regular worker: " + getName();
   }
}


