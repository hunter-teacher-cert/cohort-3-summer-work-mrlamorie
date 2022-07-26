/** Stack
William LaMorie

At fist I wanted to use a linked list of the sort we made because it is an intuatve structure for use with LIFO, however, I didn't want to mess with re-writing it and the node in a way as to allow them to deal with intigers, so I switched to array list. Howver, I really thought the LL struct was great for this, so I decided to make modifications to the LinkedList and the node we were provided to deal with the ints.

Recall, a stack is a Last In First Out structure. 


You should implement the following methods

x A constructor with no parameters 
x void push(int value) - add value to the top of the stack
x int pop() - remove and return the top value from the stack
x int top() - return but do not remove the top value from the stack
- boolean isEmpty() - return true of the stack is empty, false otherwise
x int size() - return the number of elements currently in the stack
NA boolean isFull() - returns true if the stack is full, false otherwise - only implement this if you use an array for implementation
*/

public class Stack{

  /* ------ Instance Variables ------ */
  private LinkedList list;
  private int size;

  /* ------ Constructors ------ */
  
  public Stack(){ // default construtor
    list = new LinkedList();
    size = 0;
  }

  /* ------ Methods ------ */
  
  public void push(int value){ // default add
    list.add(value);
    size ++;
  }

  public int top(){
    if(size == 0){
      throw new IndexOutOfBoundsException("Stack is empty.");
    }
    return list.get(0);
  }

  public int pop(){
    if(size == 0){
      throw new IndexOutOfBoundsException("Stack is empty.");
    }
    
    int retVal = list.get(0);

    list.remove(0);
    size --;

    return retVal;
  }
  
  public int size(){
    return size;
  }

  boolean isEmpty(){
    return (size == 0);
  }

}