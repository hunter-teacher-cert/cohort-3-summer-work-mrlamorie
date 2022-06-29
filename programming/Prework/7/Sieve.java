import java.lang.Math.*;
import java.util.*;

public class Sieve {
  
  /*
  Write a method called sieve that takes an integer parameter, n, and returns a        boolean array that indicates, for each number from 0 to n - 1, whether the number    is prime.
  */
  public static boolean[] seive(int nums){
    boolean[] retarr = new boolean[nums]; // default fill is false 

    for (int i = 2; i < nums; i++){
      retarr[i] = true; // assume they are true (starting @ 2)and then knock them off
    }
    
    for (int i = 0; i < retarr.length; i++) {
      if(retarr[i] == true) { 
        int enu = i * i;
        // there are more elegant solutions, but this follows the overview on wiki
        while(enu < retarr.length){ 
          retarr[enu] = false;
          enu += i;
        }
      }
    }
    
    return retarr;
  }
  
  public static void main(String[] args){
    
    System.out.println(Arrays.toString(seive(30)));

    System.out.println("Sanity check");
    boolean[] output = seive(30);
    for (int i = 0; i < output.length; i++){
      if(output[i]== true){
        System.out.print(" " + i);
      }
    }
  }
}