/*
The purpose of this exercise is to take a problem and break it into smaller problems, and to solve the smaller problems by writing simple methods. Consider the first verse of the song “99 Bottles of Beer”

base case:
n bottles of beer on the wall,
n bottles of beer,
ya’ take one down, ya’ pass it around,
n-1 bottles of beer on the wall.

termination case:
No bottles of beer on the wall,
no bottles of beer,
ya’ can’t take one down, ya’ can’t pass it around,
’cause there are no more bottles of beer on the wall!

*/

public class Beer{
  
  public static void line(int bottles){
    if (bottles == 0){
      System.out.println("No bottles of beer on the wall,");
      System.out.println("no bottles of beer,");
      System.out.println("ya’ can’t take one down, ya’ can’t pass it around,");
      System.out.println("’cause there are no more bottles of beer on the wall!");
    } else {
      // I added some extra spacing to these to make it less sloopy
      System.out.println(bottles + " bottles of beer on the wall,");
      System.out.println(bottles + "  bottles of beer,");
      System.out.println("ya’ take one down, ya’ pass it around,");
      if((bottles - 1) > 0){ // just because 0 bottles of beer sounds dumb
        System.out.println((bottles -1) + " bottles of beer on the wall.\n");
      } else {
        System.out.println("No bottles of beer on the wall.\n");
      }
      line(bottles - 1);
    }
  }
  
  public static void main(String[] args){
    int bottles = 99;
    line(bottles);
  }
}