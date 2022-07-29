import java.io.*;
import java.util.*;

/* 
LinkedList.java
Owner: William LaMorie  
Collaborators: Kate M , Maxwell Y, Jerusha T

First in, First Out
I am using a Array list, because it has all the functionality I want for a first in first out, I can
pull from any place with remove, and it has add as a builtin.

*/


public class Queue {

  //Recall, a queue is a First In First Out structure.
  // ArrayList is intuative for this structure because it had an add which is an
  // annology to the enqueue
  
  /* ------ Instance Variables ------ */
  private ArrayList<Integer> data;
  private int size;

  
  /* ------ Constructors ------ */
  public Queue() {
    data = new ArrayList<Integer>();
    size = 0;
  }


  /* ------ Methods ------ */  
  public void enqueue(int value) {
    data.add(value);
    size ++;
  }
  
    
  // int dequeue() - remove and return the top value from front of the queue
  public int dequeue() {
    if(this.isEmpty()) {
      throw new IndexOutOfBoundsException("Queue is empty.");
    } else {
      
      int top = data.get(0);
      
      data.remove(0);
      size --;
      
      return top;
    }
    
  }
    
  // int front() - return but do not remove the top value from the front of the queue
  public int front() {
    if(this.isEmpty()) {
      throw new IndexOutOfBoundsException("Queue is empty.");
    } else {
      return data.get(0);
    }
  }
    
  // boolean isEmpty() - return true of the queue is empty, false otherwise
  public boolean isEmpty() {
    return data.isEmpty();
  }
    
  // int size() - return the number of elements currently in the queue
  public int size() {
    return data.size(); 
  }
    

  public String toString() {
    String s = "[";
    for(int i = 0; i < size; i++) {
      if(i < size -1){
        s += data.get(i) + ", ";
      } else {
        s += data.get(i);
      } 
    }
    s += "]";
    return s; 
  }
  

}