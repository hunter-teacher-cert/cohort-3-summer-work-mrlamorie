import java.io.*;
import java.util.*;

/**
 * Array2DPractice by Team LucidThinkeren
 * William LaMorie
 * collaborators: Marisa Shuman, Elizabeth Rechtin, Richard Parker
 */

/**
   INSTRUCTIONS:

   Place this file in a folder named programming/3/.

   This file contains the following completed method. Use it as a model
   to help you with the other methods:

   - buildBoard

   This file also contains stubs (empty methods) for the following
   methods (split into 3 levels):

   Basic level (complete all):
   - printBoard X
   - copyBoard X
   - setRow X

   Intermediate level (complete Basic methods plus this method):
   - explodeSquare X

   Advanced level (complete Basic + Intermediate + these two methods):
   - explodeAllChar X
   - downString

   The routines with the * will be particularly helpful for the
   Conway's Game of Life project that you'll work on after this one.
*/


/**
   creates and returns a 2D array of size rowsxcols chars. All elements
   in the 2D array will be set to the char value.

   Ex: buildBoard(3,4,'x') will return this 2D array:

   xxxx
   xxxx
   xxxx
   xxxx

   Use this completed method as an example to help you with some of the
   other methods.
*/

public class Array2DPractice
{
  public static char[][] buildBoard( int rows, int cols, char value )
  {
    char[][] board = new char[rows][cols];
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        board[i][j]=value;
      }
    }
    return board;
  }

  /**
     pretty prints a 2D array of characters

     This should print the array as a grid
  */
  public static void printBoard( char[][] board )
  {
    for (int i = 0; i < board.length; i ++){
      for (int j = 0; j < board[i].length; j++){
        System.out.print("" + board[i][j]);
      }
      System.out.println();
    }
  }

  /**
     Parameters:
     board - a 2D array of char
     row - the row you want to set
     value - the value to set all the elements in row

     Returns:
     Nothing

     Change the 2D array board so that all the elements in the
     specified row are set to value.

     Ex: Given array:
     xxxx
     xxxx
     xxxx
     xxxx

     setRow(board,2,'@') will change board to
     xxxx
     xxxx
     @@@@
     xxxx
  */
  public static void setRow( char[][] board, int row, char value )
  {
    for (int i = 0; i < board[row].length; i ++){
      board[row][i] = value;
    }
  }


  /**
     creates and returns a new 2D array of char the same size as
     original and copies all the elements
  */
  
  public static char[][] copyBoard( char[][] original )
  {
    char[][] newboard = new char[original.length][original[0].length];

    for (int i = 0; i < original.length; i++){
      for (int j = 0; j < original[i].length; j++){
        newboard[i][j] = original[i][j];
      }
    }
    
    return newboard;
  }
  

  /**
     Parameters:
     board - a 2D array of char
     row,col - ints specifying a location in board

     Returns:
     nothing

     A location in a 2D array can be though of as having 6
     neighbors.  In the below 2D array, the neighbors of the element
     marked Q are the numbered elements.

     oooooo
     o123oo
     o4Q5oo
     o678oo
     oooooo

     This method should change all the neighbor cells (elements) to an X
     but not change the element at row,col

     Ex:
     Given the 2D array
     QQQQQ
     QQQQQ
     QQQQQ
     QQQQQ

     explodeSquare(board,1,1) will change the array to
     XXXQQ
     XQXQQ
     XXXQQ
     QQQQQ

     Note: Make sure to correctly handle the cases when you try
     to explode an element on the edges.
  */
  public static void explodeSquare( char[][] board, int row, int col )
  {
    int y = row; // because reference
    int z = col; // because reference
    // for all from row -1 > row + 1 where value >= 0 and < board.length
    for(int i = row -1; i <= row +1; i++){
      if((i >= 0) && (i < board.length)){ // constrain to board

        // for all from col -1 > col + 1 where value >= 0 and < board[row].length
        for(int j = col -1; j <= col +1; j ++){
          
          if((j >= 0) && (j < board[row].length)){ // constrain to board
            // if i = row and j = col continue
            if((i != y) || (j != z)){
              board[i][j] = 'X';
            }
          }
            
        }
      }
    }
    
  }

  /**
     This method will search through the 2D array board and it will
     explode each square that contains the char c (using the above
     definition of exploding).

     Example:

     Given the array
     qXzXq
     qXXXq
     qqqqq
     XXXqq
     XzXqq
     XXXXX
     qqqXz

     explodeAllchar(board,'z') will change board to:
  */
  public static void explodeAllChar(char[][] board, char c)
  {
    // loop through the board rows
    for(int i = 0; i < board.length; i ++){

      // loop though the board cols
      for(int j = 0; j< board[i].length; j ++){
        if(board[i][j] == c){
          explodeSquare(board, i, j);
        }
      }
    }
  }


  /**
     Parameters:
     board - a 2D array of char
     row,col - ints specifying a location in board
     word - a String that you want to insert into the board.

     This will insert the parameter word into board in the downward
     direction. See examples below

     Example:

     Given this array
     xxxxxx
     xxxxxx
     xxxxxx
     xxxxxx
     xxxxxx
     xxxxxx
     xxxxxx

     downString(board,1,1,"Hello") will change board to:

     xxxxxx
     xHxxxx
     xExxxx
     xLxxxx
     xLxxxx
     xOxxxx
     xxxxxx

     Given the above array, downString(board,4,3,"World") will
     change board to:

     xxxxxx
     xHxxxx
     xExxxx
     xLxxxx
     xLxWxx
     xOxOxx
     xxxRxx

     Note that the method has to stop at the bottom of the array.
  */
  public static void downString( char[][] board, int row, int col, String word )
  {
    
    int current = 0; //tracker for word
    for(int i = row; i < board.length; i++){ // start at row
      
      if(current < word.length()){ // don't pass out of word!
        
        board[i][col] = word.charAt(current); // put word @ border col @ tracker
        current ++; //update tracker
      }
    }
  }


  public static void main( String[] args )
  {
    char[][] tst5 = buildBoard(6,8,'z');
    /*
      Note, you can directly set elements in the board
      using array notation like b[3][2]='z' and you
      can use array notation to also access individual
      elements
    */
    char[][] tst1 = buildBoard(3, 5, 'X');
    char[][] tst3 = buildBoard(6, 6, '-');
    char[][] tst4 = {{'q', 'q', 'z', 'q', 'q'},
                     {'q', 'q', 'q', 'q', 'q'},
                     {'q', 'q', 'q', 'q', 'q'},
                     {'q', 'q', 'q', 'q', 'q'},
                     {'q', 'z', 'q', 'q', 'q'},
                     {'q', 'q', 'q', 'q', 'q'},
                     {'q', 'q', 'q', 'q', 'z'}};
      
    System.out.println("--------- printBoard(3, 5, 'X') test ---------");
    printBoard(tst1);
    System.out.println("--------- copyBoard(tst1) test ---------");
    char[][] tst2 = copyBoard(tst1);
    tst1[0][0] = '!';
    System.out.println("Moded tst1:");
    printBoard(tst1);
    System.out.println("Copy tst2: ");
    printBoard(tst2);
    System.out.println("--------- setrow(tst2) test ---------");
    setRow(tst2, 1, '#');
    printBoard(tst2);
    System.out.println("--------- explodeSquare(tst3) test ---------");
    explodeSquare(tst3, 3, 3);
    printBoard(tst3);
    System.out.println("--------- explodeAllChar(tst4) test ---------");
    System.out.println("start tst4 :");
    printBoard(tst4);
    System.out.println("end tst4 :");
    explodeAllChar(tst4, 'z');
    printBoard(tst4);
    System.out.println("--------- downString(tst5,1,1,'Hello') test ---------");
    downString(tst5,1,1,"Hello");
    printBoard(tst5);
    System.out.println("--------- downString(tst5,4,3,'World') test ---------");
    downString(tst5,4,3,"World");
    printBoard(tst5);
  }
}