import java.lang.Math.*;
import java.util.*;

public class Array {
  
  /*
  Starting with the code in Section 8.6, write a method called powArray that takes a   double array, a, and returns a new array that contains the elements of a squared.    Generalize it to take a second argument and raise the elements of a to the given     power.
  */
  public static double[] powArray(double[] a, double p){
    double[] retarr = new double[a.length];
    for(int i = 0; i < a.length; i++){
      retarr[i] = Math.pow(a[i], p);
    }
    return retarr;
  
    }
  /*
  Starting with the code in Section 8.10, write a method called histogram that takes   an int array of scores from 0 to (but not including) 100, and returns a histogram    of 100 counters. Generalize it to take the number of counters as an argument.
  */
  public static int[] histogram(int[] scores, int c){
    int[] counts = new int[c];
    for (int score : scores) {
      counts[score]++;
    }
    return counts;
  }
  
  public static void main(String[] args){
    double[] powarr = {2.0, 3.0, 4.0};
    double[] result = powArray(powarr, 3.0);
    System.out.println("powArray test:");
    System.out.println(Arrays.toString(result));

    int[] scores = {10, 15, 15, 40, 40, 11, 22, 40, 1};
    int[] histo = histogram(scores, 50);
    System.out.println("histogram test:");
    System.out.println(Arrays.toString(histo));
  }
}