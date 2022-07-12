import java.io.*;
import java.util.*;

public class Driver{
  public static void main(String[] args) {
    LinkedList l = new LinkedList();
    System.out.println(l.size()); // 0 item test
    l.add(0, "Yeet"); // add override test with i == 0
    System.out.println(l.size()); // 1 item test
    l.add("Yeet"); // add 1 param test
    System.out.println(l.size()); // 2+ item test
  }
}