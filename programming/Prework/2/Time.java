/*
 X. Create a new program called Time.java. From now on, we won’t remind you to start with a small, working program, but you should.
 X. Following the example program in Section 2.4, create variables named hour, minute, and second. Assign values that are roughly the current time. Use a 24-hour clock so that at 2pm the value of hour is 14.
 3. Make the program calculate and display the number of seconds since midnight.
 4. Calculate and display the number of seconds remaining in the day.
 5. Calculate and display the percentage of the day that has passed. You might run into problems when computing percentages with integers, so consider using floating-point.
 6. Change the values of hour, minute, and second to reflect the current time. Then write code to compute the elapsed time since you started working on this exercise.
*/



import java.io.*;
import java.util.*;

public class Time {
  public static void main(String[] args){
    // inital time values 19h 45m 49s
    int hour = 20;
    int minute = 11;
    int second = 02;

    // 3.
    int totalSeconds = (hour * 60 * 60) + (minute * 60) + second;
    
    System.out.println("3. Total seconds since midnight: " + totalSeconds);

    // 4.
    int remaingSeconds = (24 * 60 * 60) - totalSeconds;
    
    System.out.println("4. Total seconds remaing in the day: " + remaingSeconds);

    // 5. I'm just going to recast here and use int above
    // formated the output because yuck
    double dubTotSeconds = totalSeconds;
    double daySeconds = (24.0 * 60.0 * 60.0);
    double calculated = (dubTotSeconds / daySeconds) * 100;
    System.out.print("5. Percent of day that has passed: ");
    System.out.println(String.format("%, .2f", calculated) + "%");

    // 6. Inital times was 19h 45m 49s
    int startTime = (19 * 60 * 60) + (45 * 60) + 49;
    System.out.println("6. Time elapsed: " + (totalSeconds - startTime) + " seconds");
  }
}
    