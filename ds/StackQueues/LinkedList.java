import java.io.*;
import java.util.*;

/**
LinkedList.java
Owner: William LaMorie  
Collaborators: Théa W, Maxwell Y, Jerusha T
**/

/**

   For all attempted methods, make sensible decisions for error and
   edge cases (such as indexing out of bounds).
   
   Basic
   -----
   add(int value) x
   get(int index); x
   indexOf(int value); x
   
   
   Intermediate (at least add, size + one of the other two)
   ------------
   add(int index,int value) x
   size() x
   toString() x
   toArray() x

   
   Challenge
   --------
   remove(int index); x
   
*/

public class LinkedList{

  private Node head;


  public LinkedList(){
    head = null;

  }

  /**
  Parameters:
  value - the new int to add to the list

  Adds a new node containing value to the front of the list.
  */
  public void add(int value){
    
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
    Node current = head; // init to head (walker in example they added)
    
    while(true){ //could be while != null and in that case s = 0 above
      current = current.getNext(); // dig though the LL
      if(current == null) { return s;} // if the 'current' is non item member return
      else { s ++; } // else incriment
    }
  }

  /**
  Parameters:
  index - an int with the location to add
  value - the new value

  Adds a new node with the int value to the list.
  The new node should be added at the location specified by the index.

  For example, given the list:
  "a" -> "b" -> "c" -> "d"

  add(1,"z") results in:
  "a"-> "z" -> "b" -> "c" -> "d"

  */
  public void add(int index, int value){

    // edge cases - index = 0; index == length; index > length; negative index
    
    if (index < 0){ // negative indexing
      throw new IndexOutOfBoundsException("Negative indexing not supported.");
    }
    
    if (index == 0) { // base case i = 0
      
      Node temp = new Node(value, head); // make the new node 
      
      head = temp;
      
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
  Returns the int in the node at location index.

  */
  public int get(int index){
    // edge cases - empty LL, i = 0, i < 0, i > size -1
    
    if(head == null){ // if empty thow exception
      throw new IndexOutOfBoundsException("LinkedList is empty."); 
    }
    
    index = indexCheck(index); //Standard EC

    // go through the list, return value if i = index
    // would have been nicer with a while loop
    Node current = head;
    int retStr = -1; // to avoid missing return statement error
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
    if(head == null){ // if empty thow exception
      throw new IndexOutOfBoundsException("LinkedList is empty."); 
    }
    
    index = indexCheck(index); // standard EC

    // will need to track the current node to get it's next and the last node
    // so that it may be updated with the current node's next

    // if the index is 0; set the head to the current head's next.
    if(index == 0){
      head = head.getNext();
    } else {
      Node last = head;
      Node current = head.getNext();
      for(int i = 1; i < size(); i++){
        if(i == index){
          last.setNext(current.getNext()); // just skip past
        } else {
          last = current;
          current = current.getNext();
        }
      }
    }
  }

  /**
  Returns the index (location) of the first node in the list
  that contains value.

  Example:
  Given the list:
  "a"->"b"->"c"->"d"->"e"
  indexOf("d") would return 3 since "d" is at location 3.

  */
  public int indexOf(int value){
    if(head == null){ // if empty thow exception
      throw new IndexOutOfBoundsException("LinkedList is empty."); 
    }

    Node current = head;
    int index = -1; // for error checking && transveral halting without break
    
    for (int i = 0; i < size(); i ++){
      if((current.getData() == value) && index == -1){ // only happens once
        index = i;
      }
      current = current.getNext();
    }
    if(index == -1){ // not found, throw an error
      throw new IllegalArgumentException("Value not in LinkedList");
    }
    
    return index;
  }

  /**
  This routine should create a new array that is the same
  size as the number of Nodes in the list.

  It should then copy all of the values to the array and return
  the array.

  */
  public int[] toArray(){
    int[] retArr = new int[size()]; // make a new int array of size
    
    Node current = head; // start up a node tracker
    for(int i = 0; i < size(); i++){
      retArr[i] = current.getData();
      current = current.getNext();
    }

    return retArr;
  }

  /**
  Return a string representation of the list
  I formated this to look like Node -> Node -> Node ... 
  I did not use the tostring of the node because unless I am mistaken, it gives a hanging
  arrow and I did not like the look of it
  */
  public String toString(){
    String retStr = "";
    Node current = head; // start up a node tracker
    for(int i = 0; i < size(); i++){
      if (i > 0 ){ retStr += " -> "; }
      retStr += current.getData();
      current = current.getNext();
    }
    
    return retStr;
  }

  /** 
  @param {int} index - an index to be checked for being within the range of the LL

  This is a pass though function that generates an error if the index is out of 
  range for the LL

  @return {int} the same index
  */
  private int indexCheck(int index){
    if (index < 0){ // negative indexing
      throw new IndexOutOfBoundsException("Negative indexing not supported.");
    }

    if (index >= size()){ // out of bounds
      throw new IndexOutOfBoundsException("Size: " + size() + " Index: " + index);
    }
    return index;
  }

}