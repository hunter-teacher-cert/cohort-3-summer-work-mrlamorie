import java.io.*;
import java.util.*;

public class Driver{
  public static void main(String[] args) {
    LinkedList l = new LinkedList();
    System.out.println(l.size()); // 0 item test
    //System.out.println(l.get(0)); // empty LL error check // PASSED
    l.add(0, "C"); // add override test with i == 0
    System.out.println(l.size()); // 1 item test
    l.add("A"); // add 1 param test
    System.out.println(l.size()); // 2+ item test
    l.add(1, "B"); // overreiden add insert test
    System.out.println(l.size()); // 3 item test
    l.add(3, "D"); // overridden append to end test
    System.out.println(l.size()); // 3 item test
    //l.add(-1, "Fail"); // negative index error check //PASSED
    //l.add(34738, "Fail"); //IOOB error check // PASSED
    //System.out.println(l.get(-1)); // negative index error check //PASSED
    //System.out.println(l.get(3432535)); //IOOB error check // PASSED
    // get testing & correct use testing for above
    System.out.println(l.get(0) + " " + l.get(1) + " " + l.get(2) + " " + l.get(3));
    l.remove(1); // test of remove at 1
    System.out.println(l.size());
    System.out.println(l.get(0) + " " + l.get(1) + " " + l.get(2));
    l.remove(0);
    System.out.println(l.get(0) + " " + l.get(1));
    l.add("A");
    l.add(1, "B"); // reset to test case
    System.out.println(l.get(0) + " " + l.get(1) + " " + l.get(2) + " " + l.get(3));
    l.remove(3);
    System.out.println(l.get(0) + " " + l.get(1) + " " + l.get(2));
    l.add(3, "D");
    System.out.println(l.get(0) + " " + l.get(1) + " " + l.get(2) + " " + l.get(3));
    System.out.println(l.indexOf("C")); // tested index of
    //System.out.println(l.indexOf("FAIL")); // tested not on LL error //PASSED
    // toArray test begin
    String[] tst = l.toArray();
    for(int i = 0; i < tst.length; i++){
      System.out.print(tst[i] + ", ");
    }
    System.out.println();
    // toArray test end 
    // test toString()
    System.out.println(l);
  }
}