/**
 * SuperArray by Team MarvelvsDC
 * William LaMorie
 * collaborators: First Last, First Last
 */

/**
   SKELETON
   SuperArray is a wrapper class for an array.

   Provides "pass-thru" accessibility to pre-existing array capabilities:
   - get/set by index
   - get length

   Adds functionality:
   - dynamic capacity
   - auto-grow capacity if necessary
*/

import java.io.*;
import java.util.*;

public class SuperArray
{
  /**
     SUBGOAL:
     declare instance vars
     ...and initialize?
  */


  //instance vars
  private int[] data;           // "interior"/"underlying" data container
  private int numberElements;   // number of "meaningful" elements


  // ~~~~~~~~~~~~~~~ CONSTRUCTORS ~~~~~~~~~~~~~~~
  //overloaded constructor -- allows specification of initial capacity
  public SuperArray( int size )
  {
    //init underlying/inner storage of specified capacity
    data = new int[size];

    //init instance vars
    numberElements = 0;

  }

  //default constructor -- initializes capacity to 10
  public SuperArray()
  {
    //init underlying/inner storage of capacity 10
    data = new int[10];

    //init instance vars
    numberElements = 0;
  }


  // ~~~~~~~~~~~~~~~ METHODS ~~~~~~~~~~~~~~~
  public void add( int value )
  {
    // test to see if we need to grow, then grow
    if(numberElements == data.length){ grow(); }
    
    // add item
    data[numberElements] = value;

    // increment numberElements
    numberElements ++;

  }


  public boolean isEmpty()
  {
    if(numberElements != 0){ return false; }
    return true; 
  }


  public int get(int index)
  {
    return data[index];
  }


  public String toString()
  {
    String s = "";
    for(int i = 0; i < numberElements; i++){
      if (i >= 1 ){ s = s + ", " + data[i]; }
      else { s = s + data[i]; }
    }
    return s;
  }


  //return Stringified version of this Object,
  // with extra debugging info
  //(helper method for debugging/development phase)
  public String debug()
  {
    String s = "";
    s = "Size: " + this.data.length;
    s = s + " LastItem: " + numberElements + "  Data: ";
    for (int i = 0; i < numberElements; i++) {
      s = s + data[i] + ", ";
    }
    s = s + "\n";
    return s;
  }

  // should this rebuild a smaller array as well, was not asked for
  public void remove(int index)
  {
    // shift items down to remove the item at index
    // start at index
    // until numberElements -1
    // move i + 1 to i
    for(int i = index; i < numberElements -1; i++){ data[i] = data[i + 1]; }
    
    // subtract fom numElements;
    numberElements --;
  }


  public void add(int index, int value)
  {
    // see if there's enough room
    /* YOUR SIMPLE+SMART CODE HERE */

    // shift elements toward the end of the array
    /* YOUR SIMPLE+SMART CODE HERE */

    // insert new element
    /* YOUR SIMPLE+SMART CODE HERE */

    // increment numElements
    /* YOUR SIMPLE+SMART CODE HERE */
  }


  private void grow()
  {
    /* create a new array with extra space
    // Q: How did you decide how much to increase capacity by? 
    // A: the spec never has a fxn where there is a case where we add more than 1
    // item to the array at once
     */
    int newSize = data.length + 1; // add one to it!
    int[] newData = new int[newSize];

    // copy over all the elements from the old array to the new one
    for (int i = 0; i < data.length; i ++){
      newData[i] = data[i];
    }
    
    // point data to the new array
    // Q: How does this look when illustrated using encapsulation diagram?
    data = newData;
  }

}//end class