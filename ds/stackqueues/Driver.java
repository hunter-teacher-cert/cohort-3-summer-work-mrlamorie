import java.io.*;
import java.util.*;

/**
Driver.java
Owner: William LaMorie  
Collaborators: Kate M , Maxwell Y, Jerusha T
**/

public class Driver{

    public static void main(String[] args) {

      // LL & Node modification testing
      
     //  LinkedList l = new LinkedList();
     //  System.out.println(l.size()); // 0 item test
     //  l.add(0, 3); // add override test with i == 0
     //  System.out.println(l.size()); // 1 item test
     //  l.add(1); // add 1 param test
     //  l.add(1, 2); // overriden add insert test
     //  l.add(3, 4); // overridden append to end test
	    // System.out.println(l);
     //  l.remove(0);
     //  System.out.println(l);
     //  l.add(1);
     //  System.out.println(l.indexOf(2));
     //  int[] tst = l.toArray();
     //  for(int i = 0; i < tst.length; i++){
     //    System.out.print(tst[i] + ", ");
     //  }
     //  System.out.println();

      System.out.println("---------------- STACK LIFO Test ----------------");
	    // Stack s = new Stack();
      Stack s = new Stack();
      System.out.println("Empty: " + s.isEmpty());
      System.out.println("Size: " + s.size());
      System.out.println("Push order 3 then 2 then 1 then 0");
      s.push(3);
      s.push(2);
      s.push(1);
      s.push(0);
      System.out.println(s);
      System.out.println("Empty: " + s.isEmpty());
      System.out.println("Size: " + s.size());
      System.out.print("Top: ");
      System.out.println(s.top());
      System.out.println("Pop order 0 then 1 then 2 then 3");      
      System.out.print("Pop: ");
      System.out.println(s.pop());
      System.out.print("Pop: ");
      System.out.println(s.pop());
      System.out.print("Pop: ");
      System.out.println(s.pop());
      System.out.print("Pop: ");
      System.out.println(s.pop());
      System.out.println(s);
      System.out.println("Empty: " + s.isEmpty());
      System.out.println("Size: " + s.size());
      
      // System.out.println(s.top()); empty exception test

      System.out.println("---------------- QUEUE FIFO Test ----------------");
	    // Queue q = new Queue();
      Queue q = new Queue();
      System.out.println("Empty: " + q.isEmpty());
      System.out.println("Size: " + q.size());
      System.out.println("Enqueue order 0 then 1 then 2 then 3");
      q.enqueue(0);
      q.enqueue(1);
      q.enqueue(2);
      q.enqueue(3);
      System.out.println(q);
      System.out.println("Empty: " + q.isEmpty());
      System.out.println("Size: " + q.size());
      System.out.print("Front: ");
      System.out.println(q.front());
      System.out.println(q);
      System.out.println("Dequeue order 0 then 1 then 2 then 3");           
      System.out.println(q.dequeue() + ", " + q.dequeue() + ", " + q.dequeue() + ", " + q.dequeue());
      System.out.println(q);
      System.out.println("Empty: " + q.isEmpty());
      System.out.println("Size: " + q.size());
	
    }
}