import java.io.*;
import java.util.*;

public class Driver{
  public static void main(String[] args) {
    LinkedList l = new LinkedList();
    System.out.println(l.size()); // 0 item test
    l.add(0, "A"); // add override test with i == 0
    System.out.println(l.size()); // 1 item test
    l.add("B"); // add 1 param test
    System.out.println(l.size()); // 2+ item test
    l.add(1, "C"); // overreiden add insert test
    System.out.println(l.size()); // 3 item test
  }
}