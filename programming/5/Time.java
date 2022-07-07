import java.io.*;
import java.util.*;


/**
 * Time class by Team LucidThinkeren
 * William LaMorie  (group 6)
 * collaborators: Nicole C, Latoya B
 */

/**
   INSTRUCTIONS:

   This file contains the starter code for our Time class.

   The class here uses ints for hours, minutes, and seconds but you
   could decide to change the internal representation to just store
   an int representing a number of seconds.

   Place this file in a folder named programming/5/Time.java

   Basic level (complete all):
   - public Time(int hrs, int mins, int secs) - x
   - public void toString() - x
   - public void set(int hrs, int mins, int secs)

   Intermediate level (complete Basic methods plus this method):
   - public void add(Time other)
   - public boolean isEquals(Time other)

   
   Advanced level (complete Basic + Intermediate + these two methods):
   - public int compareTo(Time other)
   
*/

public class Time {
    // Instance Variable(s)
    // You can change this if you want to use the alternate
    // implementation of just storing the overall seconds.
    
    int hours;
    int minutes;
    int seconds;

    // Constructors
    public Time(){
	    hours = 0;
	    minutes = 0;
	    seconds = 0;	
    }

    /**
       Parameters:
       - hrs, mins, secs - the time you want to create the class as

       Initialize this instance to represent hrs:mins:secs as the time.
       
     */
    public Time(int hrs, int mins, int secs){

	    hours = hrs;
      minutes = mins;
      seconds = secs;
	
    }
    
    
    //--------------- Methods

    /**
       returns a string representation of the time
    */
    public String toString(){
      String hour = String.format("%02d", hours);
      String mins = String.format("%02d", minutes);  // to make single double
      String sec = String.format("%02d", seconds);   // eg 5 -> 05
      
      String retSt = "" + hour + ":" + mins + ":" + sec;
      
	    return retSt;
    }

    /* toString2
    a version of toString that assumes a single day format is expected
    */
    public String toString2(){
      String an; // should have a better name
      int hour = hours; // Will play with if 0 or PM
      String mins = String.format("%02d", minutes);  // to make single double
      String sec = String.format("%02d", seconds);   // eg 5 -> 05
      
      if(hours >= 12){ // making a nice looking output
        hour = hour - 12;
        an = "PM";
      } else {
        an = "AM";
      }
      if(hour == 0) { hour = 12; }
      
      // build it here for extra clearness
      String retSt = "The time is " + hour + ":" + mins + ":" + sec + " " + an + ".";
      
	    return retSt;
    }

    /**
       Parameters:
       - hrs,mins,secs - ints representing a time

       modifies this instance to represent the time hrs:mins:secs
    */
    public void set(int hrs, int mins, int secs){
	    hours = hrs;
      minutes = mins;
      seconds = secs;
    }

    

    /**
       Parameters:
       - other - a variable of type Time

       modifies this instance to represent the result of adding it and
       the time other.
    */
    public void add(Time other){
	    hours += other.hours;
      seconds += other.seconds;
      if(seconds >= 60){
        minutes += 1;
        seconds -= 60;
      }
      minutes += other.minutes;
      if(minutes >= 60){
        hours += 1;
        minutes -= 60;
      }


    }

    /**
       Parameters:
       other - a variable of type Time

       Returns:
       True if this instance and other represents the same time
       false otherwise.
    */
    public boolean equals(Time other){
	    // your code here)
      if((hours == other.hours) && // if the hours are the same
         (minutes == other.minutes) && // if the minutes are the same
         (seconds == other.seconds)) { // if the seconds are the same
        
        return true;
        
      } else {
        
	      return false; 
      }
    }

    /*
      toSeconds(h,m,s) - helper file to push format to seconds
      @param h {int} an int representing a hour value
      @param m {int} represents a minute value
      @param s {int} represents a seconds value
      
      @return {int} an hour, minute, second time converted to seconds
    */
    private int toSeconds(int h, int m, int s){
      return (h * 3600) + (m * 60) + s;
    }
    /**
       Parameters:
       other - a variable of type Time

       Returns:
       A positive number if this instance represents a time greater
       than the time of other (this > other)

       A negative number if this instance represents a time less
       than the time of other (this < other)

       0 if the two instances represent the same time.

    */
    public int compareTo(Time other){
	    
      int s = toSeconds(hours, minutes, seconds); // self value
      int o = toSeconds(other.hours, other.minutes, other.seconds);
	    return s - o; // change this
    }
        
}//end class