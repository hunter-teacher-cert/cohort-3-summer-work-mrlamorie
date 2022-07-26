import java.io.*;
import java.util.*;

public class Driver{

    public static void main(String[] args) {

      // LL & Node modification testing
      LinkedList l = new LinkedList();
      System.out.println(l.size()); // 0 item test
      l.add(0, 3); // add override test with i == 0
      System.out.println(l.size()); // 1 item test
      l.add(1); // add 1 param test
      l.add(1, 2); // overreiden add insert test
      l.add(3, 4); // overridden append to end test
	    System.out.println(l);
      l.remove(0);
      System.out.println(l);
      l.add(1);
      System.out.println(l.indexOf(2));
      int[] tst = l.toArray();
      for(int i = 0; i < tst.length; i++){
        System.out.print(tst[i] + ", ");
      }
      System.out.println();
      
	    // Stack s = new Stack();
      Stack s = new Stack();
      System.out.println("Empty: " + s.isEmpty());
      System.out.println("Size: " + s.size());
      s.push(3);
      s.push(2);
      s.push(1);
      s.push(0);
      System.out.println("Empty: " + s.isEmpty());
      System.out.println("Size: " + s.size());
      System.out.println(s.top());
      System.out.println(s.pop() + ", " + s.pop() + ", " + s.pop() + ", " + s.pop());
      System.out.println("Empty: " + s.isEmpty());
      System.out.println("Size: " + s.size());
      // System.out.println(s.top()); empty exception test
	    // Queue q = new Queue();
	
    }
}