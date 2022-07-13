import java.io.*;
import java.util.*;

public class Driver{
  public static void main(String[] args) {
    LinkedList l = new LinkedList();
    System.out.println(l.size()); // 0 item test
    l.add(0, "A"); // add override test with i == 0
    System.out.println(l.size()); // 1 item test
    l.add("C"); // add 1 param test
    System.out.println(l.size()); // 2+ item test
    l.add(1, "B"); // overreiden add insert test
    System.out.println(l.size()); // 3 item test
    l.add(3, "D"); // overridden append to end test
    System.out.println(l.size()); // 3 item test
    //l.add(-1, "Fail"); // negative index error check //PASSED
    l.add(34738, "Fail"); //IOOB error check // PASSED
  }
}