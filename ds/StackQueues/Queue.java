import java.io.*;
import java.util.*;
/** Queue
William LaMorie

Use an arrayList because it has an add method attached to it, which is generally the same thing
as the enqueue fxn of the queue, so the build over will be small.

Recall, a queue is a First In First Out structure.

You should implement the following methods

x A constructor with no parameters
x void enqueue(int value) - add value to the end of the queue
x int dequeue() - remove and return the top value from front of the queue
x int front() - return but do not remove the top value from the front of the queue
x boolean isEmpty() - return true of the queue is empty, false otherwise
x int size() - return the number of elements currently in the queue
NA boolean isFull() - returns true if the queue is full, false otherwise - only implement this if you use an array for implementation
  */
public class Queue{

  /* ------ Instance Variables ------ */
  
  private ArrayList<Integer> list;
  private int size;

  /* ------ Constructors ------ */
  
  public Queue(){ // default constructor
    list = new ArrayList<Integer>();
    size = 0;
  }

  /* ------ Methods ------ */
  void enqueue(int value){
    list.add(value);
    size ++;
  }

  public int front(){
    if(size == 0){
      throw new IndexOutOfBoundsException("Queue is empty.");
    }
    return list.get(size-1); // end of list
  }

  public int pop(){
    if(size == 0){
      throw new IndexOutOfBoundsException("Queue is empty.");
    }
    
    int retVal = list.get(size-1); // end of list

    list.remove(size-1);
    size --;

    return retVal;
  }
  
  public int size(){
    return size;
  }

  public boolean isEmpty(){
    return (size == 0);
  }

  public String toString(){
    return list.toString();
  }

}