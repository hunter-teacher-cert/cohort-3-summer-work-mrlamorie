import java.io.*;
import java.util.*;

/**

   For all attempted methods, make sensible decisions for error and
   edge cases (such as indexing out of bounds).
   
   Basic
   -----
   add(string value) x
   get(int index);
   indexOf(String value);
   
   
   Intermediate (at least add, size + one of the other two)
   ------------
   add(int index,String value) x
   size() x
   toString()
   toArray()

   
   Challenge
   --------
   remove(int index);
   
*/

public class LinkedList{

  private Node head;


  public LinkedList(){
    head = null;

  }

  /**
  Parameters:
  value - the new string to add to the list

  Adds a new node containing value to the front of the list.
  */
  public void add(String value){
    // make the new thing the head.
    // link it to the old head or the old head to it, functionally
  
    Node newHead = new Node(value, head);
    head = newHead;
    // should cover the case where head = null

  }

  /**
  returns the number of elements in the list
  */
  public int size(){

    // base case size is 0
    if(head == null){ return 0; }

    // otherwise, go though LL
    int s = 1; // track the size of the LL
    Node current = head; // init to head
    
    while(true){
      current = current.getNext(); // dig though the LL
      if(current == null) { return s;} // if the 'current' is non item member return
      else { s ++; } // else incriment
    }
  }

  /**
  Parameters:
  index - an int with the location to add
  value - the new value

  Adds a new node with the String value to the list.
  The new node should be added at the location specified by the index.

  For example, given the list:
  "a" -> "b" -> "c" -> "d"

  add(1,"z") results in:
  "a"-> "z" -> "b" -> "c" -> "d"

  */
  public void add(int index, String value){

    // edge cases - index = 0; index == length; index > length; negative index
    
    if (index < 0){ // negative indexing
      throw new IndexOutOfBoundsException("Negative indexing not supported.");
    }
    
    if (index == 0) { // base case i = 0
      head = new Node(value, null); // make the new node 
      
    } else {
      
      Node last = head; // init to head
      int idx = 1; // track the size of the LL
      boolean searching = true; // to stop in cas found

      
      // dig though the list to the index -1
      while(searching){
        if(last.getNext() == null && idx < index){
          
          // raise an error if the index is more than 1 greater than current
          // 1 greater works fine because that is an add to end.
          int size = idx + 1;
          throw new IndexOutOfBoundsException("Size: " + size + " Index: " + index);
        }
        if(idx == index){ // found the correct spot
          // make new node, linking to current next.
          Node newNode = new Node(value, last.getNext());
          last.setNext(newNode);
          searching = false;

        } else { // else increment, move last tracker
          idx ++; 
          last = last.getNext();
          
          
        } 
        
      }
    }
  }

  /**
  Returns the String in the node at location index.

  */
  public String get(int index){
    // edge cases - empty LL, i = 0, i < 0, i > size -1
    
    if(head == null){ // if empty thow exception
      throw new IndexOutOfBoundsException("LinkedList is empty."); }
    
    if (index < 0){ // negative indexing
      throw new IndexOutOfBoundsException("Negative indexing not supported.");
    }

    if (index >= size()){ // out of bounds
      throw new IndexOutOfBoundsException("Size: " + size() + " Index: " + index);
    }

    // go through the list, return value if i = index
    Node current = head;
    String retStr = ""; // to avoid missing return statement error
    for (int i = 0; i <= index; i++){
      
      if(i == index){
        retStr = current.getData(); // found it, put in container
      }
      else{
        current = current.getNext(); // keep looking
      }
    }
    return retStr;
  }

  /**
  Remove the Node at location index from the list.

  Ex:

  Given the list:
  "a"->"b"->"c"->"d"->"e"

  remove(2) results in:
  "a"->"b"->"d"->"e"
  */
  public void remove(int index){
  }

  /**
  Returns the index (location) of the first node in the list
  that contains value.

  Example:
  Given the list:
  "a"->"b"->"c"->"d"->"e"
  indexOf("d") would return 3 since "d" is at location 3.

  */
  public int indexOf(String value){
    return 0;
  }

  /**
  This routine should create a new array that is the same
  size as the number of Nodes in the list.

  It should then copy all of the values to the array and return
  the array.

  */
  public String[] toArray(){
    return null;
  }

  /**
  Return a string representation of the list
  */
  public String toString(){
    return "";
  }


}