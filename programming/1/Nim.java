/**
 * Game of Nim by Team BossCoders
 * William LaMorie
 * collaborators: First Last, First Last
 */
import java.io.*;
import java.util.*;
import java.lang.Math.*;

/*
bag contains 12 stones initially
a move consists of removing 1-3 stones from the bag
prompt user for number of stones they wish to remove each turn
tell user how many stones the AI removed and how many stones remain
facilitate play until human or AI wins, and announce winner
*/

public class Nim {


  public static void main(String[] args){

    int stones = 12; // bag contains 12 stones initially    
    int stonesTaken; // check for valid range?
    
    Scanner input = new Scanner(System.in); // scanner should run fine here
    Random num = new Random();
    
    // facilitate play until human or AI wins, and announce winner
    while(stones > 0){
      System.out.println("There are currently " + stones + " stones left.");
      
      // player move //
      // prompt user for number of stones they wish to remove each turn
      System.out.print("How many stones (1-3) would you like to take? ");
      stonesTaken = input.nextInt();
      while(stonesTaken > 3){
        System.out.print("Please make a choice from 1 - 3 ");
        stonesTaken = input.nextInt();
      }
      stones -= stonesTaken;
      if (stones < 0) { stones = 0; } // keep it >= 0!
      if (stones <= 0) {  // check for a player win
        System.out.println("Player Wins! ");
        break;
      }
      // End player move //

      // AI move //
      stonesTaken = num.nextInt(3) + 1;
      if (stonesTaken > stones){ stonesTaken = stones; } // keep it >= 0!
      // a move consists of removing 1-3 stones from the bag
      System.out.println("The computer takes " + stonesTaken + " stones.");
      stones -= stonesTaken;
      if (stones <= 0) { // check for win
        System.out.println("Computer Wins! ");
        break;
      }      
      // End AI move //
      
    } 
    
  }
  
} 