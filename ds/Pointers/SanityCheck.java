import java.io.*;
import java.util.*;

public class SanityCheck{
  public static void main(String[] args) {
    Node n1 = new Node("5");
    System.out.println("n1 toString dump at construction: " + n1);
    Node n2 = new Node("10");
    System.out.println("n2 toString dump at construction: " + n2);
    n1.setNext(n2);
    System.out.println("n1 toString dump at setNext(n2): " + n1);
    n2.setNext(new Node("15"));
    n2 = new Node("20");
    Node n3 = new Node("25",n2);
  }
}