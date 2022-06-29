import java.io.*;
import java.util.*;
import java.lang.Math;

public class Guess {
    public static void main(String[] args){
      Random random = new Random();
      Scanner in = new Scanner(System.in);
      
      int number = random.nextInt(100) + 1;
      int guess, dif;
      
      System.out.println("I'm thinking of a number between 1 and 100");
      System.out.println("(including both). Can you guess what it is?");
      System.out.print("Type a number: "); // input on same line as prompt now
      guess = in.nextInt();
      dif = Math.abs(guess - number);
      System.out.println("Your guess is: " + guess);
      System.out.println("The number I was thinking of is: " + number);
      System.out.println("You were off by: " + dif);
    }
}
    