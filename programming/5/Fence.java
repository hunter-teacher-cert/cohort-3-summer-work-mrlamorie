/**
 * Recursion Practice with Strings by Team SweatEquity
 * William LaMorie
 * collaborators: Nicole C, Latoya B
 */

public class Fence
{

  /**
     String fenceR(int) -- recursive fence generator
     precond:  input is a positive integer
     postcond: returns fence with n posts

     eg
     fenceR(1) -> "|"
     fenceR(2) -> "|--|"
  */
  public static String fenceR( int n )
  {
    if(n == 0){
      return " ";
    }
    if(n == 1){
      return "|";
    }
    return fenceR(n-1) + "--|";
  }


  public static void main( String[] args )
  {

    for( int i = 0; i < 10; i++ ) {
      System.out.println( i + "-post fences: " );
      System.out.println( fenceR(i) );
    }

    /* feel free to add extra tests... */

  }
}