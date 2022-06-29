/*
X. Create a new program named Date.java. Copy or type in something like the hello world program and make sure you can compile and run it.
X. Following the example in Section 2.4, write a program that creates variables named day, date, month, and year. The variable day will contain the day of the week (like Friday), and date will contain the day of the month (like the 13th). What type is each variable? Assign values to those variables that represent today’s date.
X. Display (print out) the value of each variable on a line by itself. This is an intermediate step that is useful for checking that everything is working so far. Compile and run your program before moving on.
X. Modify the program so that it displays the date in standard American format, for example: Thursday, July 16, 2015.
X. Modify the program so it also displays the date in European format. The final output should be both
*/


import java.io.*;
import java.util.*;

public class Date {
  
  public static void main(String[] args){
    
    String day = "Friday";
    // looks like from step 4 on it would be better to use an int for date
    int date = 25;
    String month = "February";
    int year = 2022;

    // yay for concats
    System.out.println("American format:");
    System.out.println(day + ", " + month +" " + date + ", " + year);
    System.out.println("European format:");
    System.out.println(day + " " + date + " " + month + " " + year);
  }
}

