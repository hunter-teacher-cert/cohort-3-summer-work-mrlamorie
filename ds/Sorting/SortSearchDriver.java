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


    /** long run test cases **/

    System.out.println("------------------speed test - sort------------------");
    int size = 1000;
    SortSearch test = new SortSearch(size);
    startTime = System.nanoTime();
    test.sort();
    endTime = System.nanoTime();
    System.out.println("Time to execute test with of size " + size + ": " + ((endTime - startTime)/1000) + " ms");
    
    size = 10000;
    test = new SortSearch(size);
    startTime = System.nanoTime();
    test.sort();
    endTime = System.nanoTime();
    System.out.println("Time to execute test with of size " + size + ": " + ((endTime - startTime)/1000) + " ms");

    size = 50000;
    test = new SortSearch(size);
    startTime = System.nanoTime();
    test.sort();
    endTime = System.nanoTime();
    System.out.println("Time to execute test with of size " + size + ": " + ((endTime - startTime)/1000) + " ms");
    
    System.out.println("------------------speed test - 50k  0, Mid, NF total------------------");   
    int mid = size / 2;
    startTime = System.nanoTime();
    test.linearSearch(0);
    test.linearSearch(mid);
    test.linearSearch(test.size());
    endTime = System.nanoTime();
    System.out.print("Linear search: ");
    System.out.println("Time to execute test with of size " + size + ": " + ((endTime - startTime)/1000) + " ms");
    mid = size / 2;
    startTime = System.nanoTime();
    test.binarySearch(0);
    test.binarySearch(mid);
    test.binarySearch(test.size());
    endTime = System.nanoTime();    
    System.out.print("Binary search: ");    
    System.out.println("Time to execute test with of size " + size + ": " + ((endTime - startTime)/1000) + " ms"); 
    mid = size / 2;
    startTime = System.nanoTime();
    test.binarySearchRec(0);
    test.binarySearchRec(mid);
    test.binarySearchRec(test.size());
    endTime = System.nanoTime(); 
    System.out.print("Binary search recusive: ");        
    System.out.println("Time to execute test with of size " + size + ": " + ((endTime - startTime)/1000) + " ms");
    
    System.out.println("------------------speed test - 100k------------------");   
    size = 100000;
    test = new SortSearch(size, "V");
    mid = size / 2;
    startTime = System.nanoTime();
    test.linearSearch(0);
    test.linearSearch(mid);
    test.linearSearch(test.size());
    endTime = System.nanoTime();
    System.out.print("Linear search: ");
    System.out.println("Time to execute test with of size " + size + ": " + ((endTime - startTime)/1000) + " ms");
    mid = size / 2;
    startTime = System.nanoTime();
    test.binarySearch(0);
    test.binarySearch(mid);
    test.binarySearch(test.size());
    endTime = System.nanoTime();    
    System.out.print("Binary search: ");    
    System.out.println("Time to execute test with of size " + size + ": " + ((endTime - startTime)/1000) + " ms"); 
    mid = size / 2;
    startTime = System.nanoTime();
    test.binarySearchRec(0);
    test.binarySearchRec(mid);
    test.binarySearchRec(test.size());
    endTime = System.nanoTime(); 
    System.out.print("Binary search recusive: ");        
    System.out.println("Time to execute test with of size " + size + ": " + ((endTime - startTime)/1000) + " ms");
    
    System.out.println("------------------speed test - 500k------------------");   
    size = 500000;
    test = new SortSearch(size, "V");
    mid = size / 2;
    startTime = System.nanoTime();
    test.linearSearch(0);
    test.linearSearch(mid);
    test.linearSearch(test.size());
    endTime = System.nanoTime();
    System.out.print("Linear search: ");
    System.out.println("Time to execute test with of size " + size + ": " + ((endTime - startTime)/1000) + " ms");
    mid = size / 2;
    startTime = System.nanoTime();
    test.binarySearch(0);
    test.binarySearch(mid);
    test.binarySearch(test.size());
    endTime = System.nanoTime();    
    System.out.print("Binary search: ");    
    System.out.println("Time to execute test with of size " + size + ": " + ((endTime - startTime)/1000) + " ms"); 
    mid = size / 2;
    startTime = System.nanoTime();
    test.binarySearchRec(0);
    test.binarySearchRec(mid);
    test.binarySearchRec(test.size());
    endTime = System.nanoTime(); 
    System.out.print("Binary search recusive: ");        
    System.out.println("Time to execute test with of size " + size + ": " + ((endTime - startTime)/1000) + " ms");

    System.out.println("------------------speed test - 1M------------------");
    size = 1000000;
    test = new SortSearch(size, "V");
    mid = size / 2;
    startTime = System.nanoTime();
    test.linearSearch(0);
    test.linearSearch(mid);
    test.linearSearch(test.size());
    endTime = System.nanoTime();
    System.out.print("Linear search: ");
    System.out.println("Time to execute test with of size " + size + ": " + ((endTime - startTime)/1000) + " ms");
    mid = size / 2;
    startTime = System.nanoTime();
    test.binarySearch(0);
    test.binarySearch(mid);
    test.binarySearch(test.size());
    endTime = System.nanoTime();    
    System.out.print("Binary search: ");    
    System.out.println("Time to execute test with of size " + size + ": " + ((endTime - startTime)/1000) + " ms"); 
    mid = size / 2;
    startTime = System.nanoTime();
    test.binarySearchRec(0);
    test.binarySearchRec(mid);
    test.binarySearchRec(test.size());
    endTime = System.nanoTime(); 
    System.out.print("Binary search recusive: ");        
    System.out.println("Time to execute test with of size " + size + ": " + ((endTime - startTime)/1000) + " ms");

    System.out.println("------------------speed test - 5M------------------");
    size = 5000000;
    test = new SortSearch(size, "V");
    mid = size / 2;
    startTime = System.nanoTime();
    test.linearSearch(0);
    test.linearSearch(mid);
    test.linearSearch(test.size());
    endTime = System.nanoTime();
    System.out.print("Linear search: ");
    System.out.println("Time to execute test with of size " + size + ": " + ((endTime - startTime)/1000) + " ms");
    mid = size / 2;
    startTime = System.nanoTime();
    test.binarySearch(0);
    test.binarySearch(mid);
    test.binarySearch(test.size());
    endTime = System.nanoTime();    
    System.out.print("Binary search: ");    
    System.out.println("Time to execute test with of size " + size + ": " + ((endTime - startTime)/1000) + " ms"); 
    mid = size / 2;
    startTime = System.nanoTime();
    test.binarySearchRec(0);
    test.binarySearchRec(mid);
    test.binarySearchRec(test.size());
    endTime = System.nanoTime(); 
    System.out.print("Binary search recusive: ");        
    System.out.println("Time to execute test with of size " + size + ": " + ((endTime - startTime)/1000) + " ms");

    
  }
}