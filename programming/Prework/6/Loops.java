import java.lang.Math;

public class Loops{

  // Exercise 2
  public static double squareRoot(double a){
    // formula: x1 = (x0 + a/x0)/2  initual x0 should be a/2
    // this should happen until x0 and x0 less then 0.0001 apart
    double x0, x1;
    x0 = a/2;
    x1 = (x0 + (a/x0))/2;
  
    while (Math.abs(x0 - x1) > 0.0001){
      x0 = x1;
      x1 = (x0 + (a/x0))/2;
    }
    return x1; // could be either I guess. 
  }

  // Exercise 3
  public static double power(double x, int n){
    double retNum = 1;
    for(int i = 1; i <= n; i ++){
      retNum *= x;
    }
    return retNum;
  }

  // Exercise 4
  public static int factorial(int n){
    
    for(int i = n-1; i > 0; i-- ){
      n *= i;  
    }
    return n;
  }
  
  public static void main(String[] args) {

    System.out.println("Test of Exercise 2:");
    System.out.println(squareRoot(9));

    System.out.println("Test of Exercise 3:");
    System.out.println(power(5, 9));
    System.out.println(power(0, 9));
    System.out.println(power(0, 0));

    System.out.println("Test of Exercise 4:");
    System.out.println(factorial(5));

  }
  
}