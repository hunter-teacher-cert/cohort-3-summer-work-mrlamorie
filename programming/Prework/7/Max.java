import java.lang.Math.*;
import java.util.*;

public class Max {
  
  /*
  Write a method called indexOfMax that takes an array of integers and returns the     index of the largest element.
  */
  public static int indexOfMax(int[] nums){
    int index = 0; 
    for (int i = 0; i < nums.length; i++) {
      if(nums[i] > nums[index]) { // will return first index on max duplicates
        index = i;
      }
    }
    return index;
  }
  
  public static void main(String[] args){
    int[] testArr = {1, 2, 3, 4, 42, 5, 6, 7};
    System.out.println("indexOfMax test:");
    System.out.println(indexOfMax(testArr));

  }
}