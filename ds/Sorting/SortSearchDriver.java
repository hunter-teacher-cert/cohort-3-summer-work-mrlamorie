import java.io.*;
import java.util.*;

public class SortSearchDriver {
  public static void main(String[] args) {


  	// Uncomment these to test part 1
  	
  	SortSearch ss = new SortSearch(20);
  	System.out.println(ss);
  	
  		
  	//Uncomment these to test part 2
  
  	int i;
  	i = ss.findSmallestIndex(0);
  	System.out.println("ss["+ i +"] = "+ss.get(i)+" : " + ss);
  
  	i = ss.findSmallestIndex(3);
  	System.out.println("ss["+ i + "] = "+ss.get(i)+" : " + ss);
  	
  	//Uncomment these to test part 3
  
  	System.out.println(ss);
  	ss.sort();
  	System.out.println(ss);
    System.out.println();
   
    

    // search test cases
    
    System.out.println("------------------lin test------------------");
    System.out.println(ss);
    long startTime = System.nanoTime();
    System.out.print("Index of 0: ");
    System.out.println(ss.linearSearch(0));
    System.out.print("Index of 10: ");
    System.out.println(ss.linearSearch(10));
    System.out.print("Index of 21: ");
	  System.out.println(ss.linearSearch(21));
    long endTime = System.nanoTime();
    System.out.println("Time to execute test series with lin: " + ((endTime - startTime)/1000) +"ms");
    
    System.out.println("------------------bin1 test------------------");
    System.out.println(ss);
    startTime = System.nanoTime();
    System.out.print("Index of 0: ");
    System.out.println(ss.binarySearch(0));
    System.out.print("Index of 10: ");
    System.out.println(ss.binarySearch(10));
    System.out.print("Index of 21: ");
    System.out.println(ss.binarySearch(21));
    endTime = System.nanoTime();
    System.out.println("Time to execute test series with bin1: " + ((endTime - startTime)/1000) + "ms");
    System.out.println();
    
    System.out.println("------------------bin2 test------------------");
    System.out.println(ss);
    startTime = System.nanoTime();
    System.out.print("Index of 0: ");
    System.out.println(ss.binarySearchRec(0));
    System.out.print("Index of 10: ");
    System.out.println(ss.binarySearchRec(10));
    System.out.print("Index of 21: ");
    System.out.println(ss.binarySearchRec(21));
    endTime = System.nanoTime();
    System.out.println("Time to execute test series with bin2: " + ((endTime - startTime)/1000) + "ms");
	      

  }
}