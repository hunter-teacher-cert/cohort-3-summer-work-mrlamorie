import java.io.*;
import java.util.*;

public class Driver{
  public static void main(String[] args) {
    LinkedList l = new LinkedList();
    System.out.println(l.size()); // 0 item test
    l.add("Yeet"); // add test
    System.out.println(l.size()); // 1 item test
    l.add("Yeet"); 
    System.out.println(l.size()); // 2+ item test
  }
}