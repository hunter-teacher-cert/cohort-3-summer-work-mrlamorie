

public class Methods {

  // exercise 2
  public static double multadd(double a, double b, double c){
    return (a * b) + c;
  }

  // exercise 8 - I really strugle with math alogortihm notation. 
  // have to read it like 20 times even on simple things.
  public static int ack(int m, int n){

    // will break if numbers are less then 0;
    if(m == 0){
      return n + 1;
    } else if ((m > 0) && (n == 0)) {
      return ack(m-1, 1);
    } else {
      return ack(m-1, ack(m, n-1));
    }
  }
  
  public static void main(String[] args){
    // exercise 3
    System.out.println("multadd test (1, 2, 3):");
    System.out.println(multadd(1.0, 2.0, 3.0));

    // exercuse 8 - test
    System.out.println("\nacktest (3, 3):");
    System.out.println(ack(3, 3));
  }
}