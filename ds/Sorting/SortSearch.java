import java.io.*;
import java.util.*;

/*

Sort Project:

Part 1:  (BASIC)
  1. Analyze the two constructors - try to figure out how they work. x
  2. Compile and run the program (SortProjectDriver.java and SortProject.java) 
  and confirm the behavior of the constructors. x

  Part 2: (BASIC)
  1. Read the description of findSmallestIndex and complete the method. x
  2. Uncomment the lines in SortProjectDriver to test. x

  Part 3: (INTERMEDIATE)
  1. Complete the sort method - read comments for description
  2. Uncomment the lines in sortProjectDriver to test.



Search Project:
  1. Complete the linear search (BASIC)
  2. Complete the binary search (Intermediate)
  3. Complete the recursive version of binary search (Advanced)
*/

public class SortSearch{

    /* Sort project starts here */
    
    /* Instance Variables */
    private ArrayList<Integer> data;  // to store the data
    
    private Random r; 

    
    public SortSearch(){
	    data = new ArrayList<Integer>();
	    r = new Random();
	    for (int i=0;i<15;i++){
	      data.add(r.nextInt(20));
	    }
    }
    
    public SortSearch(int size){
	    data = new ArrayList<Integer>();
	    r = new Random();
	    for (int i=0;i<size;i++){
	      data.add(r.nextInt(20));
	    }
    }

  /* Convenience function to get data out of the ArrayList from the driver */
    public int get(int index){
	    return this.data.get(index);
    }
    


    /*
      return the index of the ArrayList data from index start to the end
      Example, if the arraylist has:
      5,3,10,6,8
      if start was 2 (start at index 2, value 10) then it woudl return 3 which is 
      the index of the value 6 which is the index with the smallest value from 
      start to end
    */
    public int findSmallestIndex(int start){
	    int smallIndex = start; // assume the item at start is the smallest.
      
      // search from start to the end of the array
      for(int i = start; i < data.size(); i++){
        if(data.get(i) < data.get(smallIndex)){
          smallIndex = i; // if a new item is smaller then update smallIndex
        }
      }
      
	    return smallIndex;
    }


    /**
      Implement the insertion sort algorithm by sorting the ArrayList data in place.
    */
    public void sort(){
      // start at index 1
      // for each item in list
        // store in a temp

          // loop down though the array from temp to (including) 0 as long as temp is
          // less than the current value
          // bump up the current value to index +1 
      
        // insert temp at last current index
        
          
            

    }



    /* Search project starts here */
    
    /**
      performs a linear search. Returns the index of the first occurence of
      value in the ArrayList data or -1 if not found.

      This works by starting at the first element and searching one element at a 
      time until either the element is found or you've looked at all the elements.

      This algorithm works on any ArrayList.
    */
    public int linearSearch(int value){
	
	    return 0; // replace this return
    }
    
    /**
       Implement a binary search as specified by the comments
       
       This algorithm only works on sorted ArrayLists.
    */
    public int binarySearch(int value){

	    // create assign variables  representing the high, low and middle indices 
	    // while we're not done:
	    //   if the item is at data.get(middle), return middle
	    //   otherwise, update high, low, and middle

	    return 0;
	    
    }
    
    /**
      Implement a RECURSIVE binary search as specified by the comments
       
      This algorithm only works on sorted ArrayLists.
    */

    public int binarySearchRecursive(int value, int lowIndex, int highIndex){
      
      // refer to class discussion
      
      return 0;
    }
    
	
    public String toString(){

	    return ""+data;
    }


    public void builtinSort(){
	    Collections.sort(data);
    }
    

    
}
