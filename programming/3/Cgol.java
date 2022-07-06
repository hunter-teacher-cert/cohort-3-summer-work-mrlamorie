import java.io.*;
import java.util.*;

/**
 * Conway's Game of Life by Team AreWeSentientYet?
 * William LaMorie
 * collaborators: Vanessa Z,Patti E,Alana R
 */

/**
   The Rules of Life:

   Survivals:
   * A living cell with 2 or 3 living neighbours will survive for the next generation.

   Deaths:
   * Each cell with >3 neighbours will die from overpopulation.
   * Every cell with <2 neighbours will die from isolation.

   Births:
   * Each dead cell adjacent to exactly 3 living neighbours is a birth cell. It will come alive next generation.

   NOTA BENE:  All births and deaths occur simultaneously. Together, they constitute a single generation.
*/

public class Cgol
{

  //create, initialize, and return  empty board (all cells dead)
  // done
  public static char[][] createNewBoard( int rows, int cols )
  {  // ported from 2D practice
    char[][] board = new char[rows][cols];
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        board[i][j]=' ';
      }
    }
    return board;    
  }


  //print the board to the terminal
  //done
  public static void printBoard( char[][] board )
  { // ported from 2D practice
    for (int i = 0; i < board.length; i ++){
      for (int j = 0; j < board[i].length; j++){
        System.out.print(" " + board[i][j]);
      }
      System.out.println();
    }
  }


  //set cell (r,c) to val
  //done
  public static void setCell( char[][] board, int r, int c, char val )
  {
    board[r][c] = val;
  }


  //return number of living neigbours of board[r][c]
  //done
  public static int countNeighbours( char[][] board, int row, int col ) { 
    // same logic for finding area around as explode 
    //-same as ExplodeSquare method from 2DArray
    //traverse through the elements in row and column 
    // this explodeSquare method was used in Cgol's countNeighbor method
    int total = 0;
    //the goal is to find the area around the grid finding 
    //the squares around your target "x"
    for (int i=0; i<board.length; i++){
      for (int j=0; j<board[i].length; j++){
        // if ((i>=row-1 && i<row+1) && (j>=col-1 && j<=col-1) && (i!=row || j!= col))
        
        if (i>=row-1 && i<=row+1) {  // constrain
          
          if(j>=col-1 && j<=col+1) { // constrain
            
            if(i!=row || j!= col){ // avoid self
              
              if(board[i][j] == 'X'){ total ++; }
              
            }
          }
        } 
      }
    } 
    return total;
  }


  /**
     precond: given a board and a cell
     postcond: return next generation cell state based on CGOL rules
     (alive 'X', dead ' ')
  */
  public static char getNextGenCell( char[][] board,int r, int c )
  {
    int n = countNeighbours(board, r, c);

    // if populated, survive if 2 or 3 friends
    if(board[r][c] == 'X'){
      if((n == 2) || (n == 3)){ return 'X';}
    }

    // if dead, come to life if 3 friends
    if(board[r][c] == ' '){
      if(n == 3){ return 'X'; }
      
    }
    return ' '; 
  }


  //generate and return a new board representing next generation
  public static char[][] generateNextBoard( char[][] board )
  {
    // make a new board
    char[][] newBoard = createNewBoard(25,25);

    // loop though the old board. 
    for(int i = 0; i < board.length; i++){
      for(int j = 0; j < board[0].length; j++){
        // check each cell in the old board for conditions
        char cell = getNextGenCell(board, i, j);
        // update the new board
        newBoard[i][j] = cell;
      }
    }

    // return board;
    return newBoard;
  }
  

  public static void main( String[] args )
  {
    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    char[][] board;
    board = createNewBoard(25,25);

    //breathe life into some cells:
    setCell(board, 0, 0, 'X');
    setCell(board, 0, 1, 'X');
    setCell(board, 1, 0, 'X');
    

    // TASK:
    // Once your initial version is running,
    // try out different starting configurations of living cells...
    // (Feel free to comment out the above three lines.)

    System.out.println("Gen X:");
    printBoard(board);
    System.out.println("--------------------------\n\n");

    
    board = generateNextBoard(board);

    System.out.println("Gen X+1:");
    printBoard(board);
    System.out.println("--------------------------\n\n");

    
    board = generateNextBoard(board);
    
    System.out.println("Gen X+2:");
    printBoard(board);
    System.out.println("--------------------------\n\n");


    board = generateNextBoard(board);
    
    System.out.println("Gen X+3:");
    printBoard(board);
    System.out.println("--------------------------\n\n");


    board = generateNextBoard(board);
    
    System.out.println("Gen X+4:");
    printBoard(board);
    System.out.println("--------------------------\n\n");


    board = generateNextBoard(board);
    
    System.out.println("Gen X+5:");
    printBoard(board);
    System.out.println("--------------------------\n\n");

    
    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    /*
    char[][] board;
    board = createNewBoard(25,25);
    setCell(board, 0, 0, 'X');
    setCell(board, 0, 1, 'X');
    setCell(board, 1, 0, 'X');
    printBoard(board);
    int neightest = countNeighbours(board, 0, 0);
    char alive = getNextGenCell(board, 0, 0);
    System.out.println(neightest);
    System.out.println(alive);
    alive = getNextGenCell(board, 7, 0);
    System.out.println(alive);
    
    char[][] board;
    board = createNewBoard(5,5);// changed from 25 x 25 to 5 x 5 based on classmate's presentation, makes board more managable
    setCell(board, 1, 1, 'H'); // for visualization in countNeighbours code, same position
    setCell(board, 0, 0, 'X');
    setCell(board, 0, 1, 'X');
    setCell(board, 1, 0, 'X');
    setCell(board, 1, 2, 'X');
    printBoard(board);
    int neightest = countNeighbours(board, 1, 1); // where the test is happening
    char alive = getNextGenCell(board, 1, 1);
    System.out.println(neightest);
    System.out.println(alive);
    alive = getNextGenCell(board, 0, 0);
    System.out.println(alive);
    */
  }//end main()

}//end class