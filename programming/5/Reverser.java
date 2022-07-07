/**
 * Recursive String Reverser by Team Palindromotosis
 * First Last
 * collaborators: First Last, First Last
 */


public class Reverser
{
  /**
     String reverseF(String) -- recursive String reverser
     precond:  input String is non-empty
     postcond: returns input String with chars in reverse order
  */
  public static String reverseR( String s )
  { 
    // if the length of the string is 1 return it
    if(s.length() == 1 || s.length() == 0){
      return s;
    }
    
    // last leter = index at string len - 1
    // String news - last char = 0 - string len - 2
    int lasti = s.length() -1; // location of last letter
    char last = s.charAt(lasti); // last letter
    String ns = s.substring(0,lasti);// second param non inclucsive
    
    // return last leter + reverseR(String s - last char)
    return last + reverseR(ns);
  }


  public static void main( String[] args )
  {
    System.out.println( reverseR("odd") );
    System.out.println( reverseR("even") );
    System.out.println( reverseR("abcdefg") );
    System.out.println( reverseR("stressed") );
    System.out.println( reverseR("amanaplanacanalPanama") );

    //more tests welcome
    // got some good palindromes?
  }
}