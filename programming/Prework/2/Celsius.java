/*
 Write a program that converts a temperature from Celsius to Fahrenheit. It should (1) prompt the user for input, (2) read a double value from the keyboard, (3) calculate the result, and (4) format the output to one decimal place. For example, it should display "24.0 C = 75.2 F".
*/
import java.io.*;
import java.util.*;

public class Celsius {
  public static void main(String[] args){
    double fTemp, cTemp; // yay mulidec
    Scanner in = new Scanner(System.in);
    
    System.out.print("Please enter a Celsius temperature: ");
    cTemp = in.nextDouble();
    fTemp = (cTemp * (9.0/5.0)) + 32;
    System.out.printf("%.1f C = %.1f F\n", cTemp, fTemp);
    
  }
}