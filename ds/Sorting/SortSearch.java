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
  1. Complete the sort method - read comments for description x
  2. Uncomment the lines in sortProjectDriver to test. x



Search Project:
  1. Complete the linear search (BASIC) x
  2. Complete the binary search (Intermediate) x
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
      if start was 2 (start at index 2, value 10) then it would return 3 which is 
      the index of the value 6 which is the index with the smallest value from 
      start of arrayList to end
    */
    public int findSmallestIndex(int start){
      // TODO: add some error throws - start < 0, start >= len?
      
	    int smallIndex = start; // assume the item at start is the smallest.
      
      // search from start to the end of the array
      for(int i = start; i < data.size(); i++){
        if(data.get(i) < data.get(smallIndex)){
          smallIndex = i; // if a new item is smaller then update smallIndex
        }
      }
      
	    return smallIndex; // index from start of AL to end
    }


    /**
      Implement the insertion sort algorithm by sorting the ArrayList data in place.
    */
    public void sort(){
      // start at index 1, for each item in list
      for(int i = 1; i < data.size(); i++){
        
        int temp = data.get(i); // store in a temp
        int pos = i -1; // set to the index below moving number

        // loop down though the array from temp to (including) 0 as long as temp is
        // less than the current value data[pos] 
        // could be done with a for & if as well
        while((pos >= 0) && temp < data.get(pos)){
          data.set(pos + 1, data.get(pos));  // bump up the current value to index +1
          
          pos --; // bring the position down  (this can go to -1, fix below)
        }
        // insert temp at last current index above pos (pos will go to -1)
        // if the temp is the lowest value but that is okay, becuase we are putting
        // the temp at the pos + 1.
        data.set(pos + 1, temp);
        
      }

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
	    int retVal = -1; // init return to base case

      int i = 0;  
      // I'm starting to like while loops more for loops with conditionals
      while((i < data.size()) && (retVal == -1)){
        if(data.get(i) == value){ retVal = i; }
        i++;
      }
      
	    return retVal; // replace this return
    }
    
    /**
       Implement a binary search as specified by the comments
       
       This algorithm only works on sorted ArrayLists.
    */
    public int binarySearch(int value){

      // assuming we are not looking for the first occurance, just the first one
      // found.
      
	    // create assign variables  representing the high, low and middle indices 
      int low = 0;  // start of AL
      int high = data.size() -1; // end of AL
      int mid = (low + high) /2; // init to middle of AL
      
	    // while we're not done:
      while(true){
        //   if the item is at data.get(middle), return middle
        if(data.get(mid) == value){ // check first for return to break loop
          return mid;
        } else if (high <= low) {  // edge case - not found
          // high can only equal low if item not in list or if the item is
          // very last number searched. If it is the last number searched
          // then the mid also == high == low and we checked the mid before
          // this with a return, so this should never cause an issue
          return -1; // consistent with lin above
        } else if (data.get(mid) > value){ // too far right
          high = mid -1; // mid was wrong too so we can exclude it
        } else { // too far left
          low = mid +1; // mid was wrong too so we can exclude it
        }
        mid = (low + high) /2;  //update mid to new range	      
      }

    }
    
    /**
      Implement a RECURSIVE binary search as specified by the comments
       
      This algorithm only works on sorted ArrayLists.
    */

    public int binarySearchRecursive(int value, int lowIndex, int highIndex){
      
      // condition logic
      // we should search until found or not found. Found is mid value = val
      // not found is high <= low or high < low? hmm...
      // so still searching case is high > low or high >= low
        // make a middle of current range
      
        // return if found
      
        // else if mid greater than value search high
        // else search low
      
      // outside of conditonal, where not found is true
      return -1; // element not found
    }
    
	
    public String toString(){

	    return ""+data;
    }


    public void builtinSort(){
	    Collections.sort(data);
    }
    

    
}
