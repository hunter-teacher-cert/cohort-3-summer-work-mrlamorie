/** Stack

LinkedList.java
Owner: William LaMorie  
Collaborators: Kate M , Maxwell Y, Jerusha T

At fist I wanted to use a linked list of the sort we made because it is an intuatve structure for use with LIFO, however, I didn't want to mess with re-writing it and the node in a way as to allow them to deal with intigers, so I switched to array list. However, I really thought the LL struct was great for this, so I decided to make modifications to the LinkedList and the node we were provided to deal with the ints. 
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

  public boolean isEmpty(){
    return (size == 0);
  }

  public String toString(){
    String retStr = "[";
    
    for(int i  = 0; i < size; i++){
      if(i < size -1){ 
        retStr += list.get(i) + ", "; 
      } else{
       retStr += list.get(i);
      }
    }
    return retStr + "]";
  }

}