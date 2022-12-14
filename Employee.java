/****************************************************************************************** 
Name: Zhenyu Jiang 
Course: CS170-01 
Lab #: Lab Assignment Three
Submission Date: 10pm, Thu(11/17)
Description: super abstract class Employee with abstract method for polymorphism 
*********************************************************************************************/ 

public abstract class Employee {
   private String name;

   // Constructor
   public Employee(String name ) {
      this.name = name;
   }

   public String getName()
      { return name; }
   
   public abstract double earnings();  //define an abstract method for polymorphism
}
