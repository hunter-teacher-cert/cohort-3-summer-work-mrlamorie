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

    // linearSearch test
    System.out.println("------------------lin test------------------");
    System.out.println(ss);
    System.out.println(ss.linearSearch(0));
    System.out.println(ss.linearSearch(7));
	  System.out.println(ss.linearSearch(21));
    System.out.println("------------------bin1 test------------------");
    System.out.println(ss);
    System.out.println(ss.binarySearch(0));
    System.out.println(ss.binarySearch(10));
    System.out.println(ss.binarySearch(21));
    System.out.println("------------------bin2 test------------------");
    System.out.println(ss);
    System.out.println(ss.binarySearchRecursive(0, 0, ss.size()-1));
    System.out.println(ss.binarySearchRecursive(6, 0, ss.size()-1));
    System.out.println(ss.binarySearchRecursive(21, 0, ss.size()-1));

	      

  }
}