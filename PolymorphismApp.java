
/****************************************************************************************** 
Name: Zhenyu Jiang 
Course: CS170-01 
Lab #: Lab Assignment Three
Submission Date: 10pm, Thu(11/17)
Description: This is a driver class creating objects to create objects from different classes.
It use polymorphism to call the toString methods from different subclasses.
*********************************************************************************************/ 

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class PolymorphismApp {
   public static void main( String[] args )
   {
      Employee[] ref = new Employee[4];  // superclass reference
      String output = "";

      Manager manager = new Manager( "Wang", 5800.00, 345.00, 200.00 );
      SeniorManager senior = new SeniorManager( "Smith", 6250.0, 1500.0, 300.00, 890.00);
      RegularWorker regular = new RegularWorker( "Lee", 2980.00, 270.0);
      SeniorWorker senior_worker = new SeniorWorker("John", 5000.00, 280.0);

      DecimalFormat precision2 = new DecimalFormat( "0.00" );

      ref[0] = manager;  // Employee reference to a manager

      ref[1] = senior;  // Employee reference to a senior manager

      ref[2] = regular;  // Employee reference to a regular Worker
      
      ref[3] = senior_worker;   // Employee reference to a senior Worker

      for(int i = 0; i < 4; i++)     			//polymorphic form output for different objects
        output += ref[i].toString() + " earned $" +
                precision2.format( ref[i].earnings() ) + "\n";

      JOptionPane.showMessageDialog( null, output,
         "Demonstrating Polymorphism",
         JOptionPane.INFORMATION_MESSAGE );
   }
}

