import java.io.*;
import java.util.*;


/**
 * Time class by Team LucidThinkeren
 * William LaMorie  (group 6)
 * collaborators: Nicole C, Latoya B
 */

/**
   INSTRUCTIONS:

   This file contains the Driver starter code for our Time class.
   
   Add code in main to test all your methods
   
   Place this file in a folder named programming/5/Driver.java

*/


public class Driver {

  public static void main(String[] args) {

	//declare a var of appropriate type to assign an instance of Time to
	  Time t;

	  //assign var the address of a newly-apportioned Time object
	  //t = new Time(); // object instation test. DONE!
    
    t = new Time(0, 6, 30); // constructor test. DONE!
    System.out.println(t.toString()); // To string test DONE!
    t.set(12, 45, 11); // Time.set() test. DONE!
    System.out.println(t.toString()); // Time.set() test. DONE!
    
  }//end main()

}//end class