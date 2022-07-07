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
	  Time t, o;

	  //assign var the address of a newly-apportioned Time object
	  //t = new Time(); // object instation test. DONE!
    
    t = new Time(0, 6, 30); // constructor test. DONE!
    o = new Time(1, 30, 30); // for add test.
    System.out.println(t.toString()); // To string test DONE!
    t.set(10, 30, 30); // Time.set() test. DONE!
    System.out.println(t.toString()); // Time.set() test. DONE!
    t.add(o); // time add - DONE!
    System.out.println(t.toString()); // time.add test DONE!
    t.set(1, 30, 30); // set t to == o for equals testing true case DONE!
    System.out.println(t.equals(o)); // true equals testing DONE!
    t.add(o); // setting t to 2x o to test false case DONE!
    System.out.println(t.equals(o)); // false equals testing DONE!
    t.set(1, 1, 1); // known output for toSeconds in fxn test
    //System.out.println(t.toSeconds(1, 1, 1)); // testing helper fxn // moved prvt
    System.out.println(t.compareTo(o)); // testing helper in fxn
  }//end main()

}//end class