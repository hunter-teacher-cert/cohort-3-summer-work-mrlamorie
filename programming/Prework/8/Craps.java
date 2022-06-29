import java.lang.Math.*;
import java.util.*;
import java.io.*;


public class Craps{

  // roll - takes an int and returns a value btw 1 & int inclusive (+1 rand)
  public static int roll(int max){
    Random num = new Random();
    
    return (num.nextInt(max) + 1);
  }

  // shoot - could really just be done with 1 arg and assuming d6, but hey
  // you might play craps with a d12, I guess!
  public static int shoot(int dice, int max){
    int total = 0;
    
    for(int i = 0; i < dice; i ++){
      total += roll(max);
    }
    return total;
  }

  // returns true for a win, false for a loss
  // NOTE: I assumed with the instruction that the program print out status you
  // just wanted wins or losses, if you wanted roll reports, I can easily add
  // some side effects to this method for that.
  public static boolean round(){
    int roll = shoot(2, 6); // role dem bones

    if((roll == 2) || (roll == 3) || (roll == 12)){ // craps
      return false;
    }
    else if((roll == 7) || (roll == 11)){ // natural
      return true;
    } else { // keep rolling
      int point = roll;
      while(true){
        roll = shoot(2, 6);

        // hanging ifs with returns act as breaks
        if(roll == 7){ // loss
          return false; 
        }
        if(roll == point){
          return true;
        }
      }
    }
  }
  public static void main(String[] args){
    int rolls;
    // I was unsure if you wanted a console prompt for rolls or rolls from arg
    // so I did it both ways
    if(args.length == 0){
      System.out.print("No number of games provided at run, number of games? ");
      Scanner in = new Scanner(System.in);
      rolls = in.nextInt();
    } else { // we're just going to assume 1 arg and is an int
      System.out.println("Launching Craps with " + args[0] + " games to run.");
      rolls = Integer.valueOf(args[0]);
    }
    
    int wins = 0;
    for(int i = 1; i <= rolls; i ++){
      if(round()){ // truthfully, I could have generalized this text more
        wins ++;
        System.out.println("Round: " + i + " player wins!") ;
      } else {
        System.out.println("Round: " + i + " player loses.");
      }
    }
    System.out.print("\nFinal tally: Total wins: "+ wins);
    System.out.println(", Total Losses: " + (rolls-wins) + ".\n");
  }

  
}