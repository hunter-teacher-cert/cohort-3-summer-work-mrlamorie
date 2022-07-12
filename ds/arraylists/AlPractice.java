import java.io.*;
import java.util.*;
/**
ALPractice.java
Owner: William LaMorie
Collaborators: Théa W,	Maxwell Y
**/


/** Methods to write

Basic level:
------------
public static ArrayList<Integer> buildRandomList(int size, int maxval) x
public static int sumOfList(ArrayList<Integer> dataList) x

Intermediate level:
-------------------
public static void swapElements(ArrayList<Integer> dataList, int indexA,int indexB) x
public static void removeValue(ArrayList<Integer> dataList, int valueToRemove) x

Advanced level:
-------------------
public static ArrayList<Integer> sumLists(ArrayList<Integer>ListA,ArrayList<Integer>ListB) x
public static ArrayList<Integer> zipLists(ArrayList<Integer>ListA,ArrayList<Integer>ListB) x
*/


public class AlPractice{

  /**
  Parameters:
  - size - an integer representing how many items to add to the list
  - maxval - the largest value to store in the list
  Preconditions:
  - size >= 0
  - maxVal > 0
  Returns:
  - A new ArrayList of Integers with each value being a random
    number between 0 and maxval (not including maxval).
  */
  public static ArrayList<Integer> buildRandomList(int size, int maxval){
    Random rand = new Random(); // number gen
    ArrayList<Integer> retList = new ArrayList<Integer>(); // empty list

    for(int i = 0; i < size; i++){
      retList.add(rand.nextInt(maxval));
    }
    
    return retList;
  }

  /**
  Parameters:
  - dataList - an ArrayList of integer values.
  Returns:
  - The sum of all of the elements of the ArrayList.
  */
  public static int sumOfList(ArrayList<Integer> dataList){
    int retVal = 0;
    for(int i = 0; i < dataList.size(); i++){
      retVal += dataList.get(i);
    }
    return retVal;
  }

  /**
  Parameters:
  - dataList - an ArrayList of Integers
  - index1, index2 - the two locations to swap.
  Postconditions:
  - The ArrayList is modified such that
    The value that was in dataList[index1] is now in dataList[index2], and
    the value  that was in dataList[index2] is now in dataList[index1].
  - No other values should be modified.
  */
  public static void swapElements(ArrayList<Integer> dataList, int index1,int index2){
    // assuming I can not use Collections swaping:
    int a = dataList.get(index1);
    int b = dataList.get(index2);
    dataList.set(index1, b);
    dataList.set(index2, a);
    
  }

  /**
  Parameters:
  - dataList - an AraryList of Integers
  - valueToRemove - the value to remove
  Postconditions:
  - The dataList is modified such that all occurances of valueToRemove are removed.
  */
  public static void removeValue(ArrayList<Integer> dataList, int valueToRemove){
    // this will reduce the length of the list, so we will want to start at the end
    // and work our way down.
    for(int i = dataList.size() -1; i >= 0; i--){
      if(dataList.get(i) == valueToRemove){
        dataList.remove(i); // shinks the size by 1
      }
    }
  }


  /**
  Parameters:
  - ListA,ListB - ArrayLists of integer values.
  Preconditions:
  - ListA and ListB have equal lengths.
  Returns:
  - A new ArrayList that contains the sum of the corresponding indecies of the two arraylists.
    e.g. sumLists( [1,2,3], [4,0,5]) would return: [5,2,8]
  Postconditions:
  - The parameter ArrayLists should not be modified.
  */
  public static ArrayList<Integer> sumLists(ArrayList<Integer>ListA,ArrayList<Integer>ListB){
    ArrayList<Integer> retList = new ArrayList<Integer>(); // empty list
    // per preconditions, assumes 2 list of same size
    for(int i = 0; i < ListA.size(); i++){
      retList.add(ListA.get(i) + ListB.get(i));
    }
    return retList;//placeholder to compile.
  }

  /** zipLists
  Parameters:
  - ListA,ListB - ArrayLists of integer values.
  Returns:
  - A new ArrayList that contains all of the elements from both ArrayLists in alternating order starting with ListA's first element.
    When one list has no more values to add, continue adding the remaining values of the longer list.
    e.g. zipLists( [1,2,3,4], [8,9]) would return: [1,8,2,9,3,4]
  Postconditions:
  - The parameter ArrayLists should not be modified.
  */
  public static ArrayList<Integer> zipLists(ArrayList<Integer>ListA,ArrayList<Integer>ListB){
    // make new AL
    ArrayList<Integer> retList = new ArrayList<Integer>(); // empty list
    
    // figure out the bigger size
    // assuming I can't use libs not imported (eg max)
    int max = (ListA.size() > ListB.size()) ? ListA.size() : ListB.size();

    // while we are less then the bigger size
    for(int i = 0; i < max; i++){
      // if LA still has items, add
      if(i < ListA.size()){ retList.add(ListA.get(i)); }
      // if LB still has items, add
      if(i < ListB.size()){ retList.add(ListB.get(i)); }
    }
    
    return retList;//placeholder to compile.
  }




  public static void main(String[] args) {

    ArrayList<Integer> al;

    // Uncomment these to test buildRandomList
    al = buildRandomList(10,100);
    System.out.println(al);
    System.out.println(sumOfList(al));

    // Uncomment these to test swapElements
    swapElements(al, 2,6);
    System.out.println(al);

    // Uncomment these to test removeValue
    al.add(5);
    al.add(10);
    al.add(5);
    al.add(13);
    al.set(2,5);
    al.set(3,5);
    System.out.println(al);
    removeValue(al,5);
    System.out.println(al);

    // testing sumList
    ArrayList<Integer> aa;
    ArrayList<Integer> ab;
    ArrayList<Integer> ac;
    aa = buildRandomList(10,10);
    System.out.println(aa);
    ab = buildRandomList(10,10);
    System.out.println(ab);
    System.out.println("------------------------------");
    ac = sumLists(aa, ab);
    System.out.println(ac);

    ArrayList<Integer> ad;
    ArrayList<Integer> ae;
    ArrayList<Integer> af;
    ArrayList<Integer> ag;
    ad = buildRandomList(3, 10);  // short list "a" -> "b"
    System.out.println(ad);
    ae = buildRandomList(5, 10);  // longer list "b" -> "a"
    System.out.println(ae);
    System.out.println("------------------------------");
    af = zipLists(ad, ae);
    System.out.println(af); // should be 8 elements
    System.out.println("------------------------------");
    ag = zipLists(ae, ad);
    System.out.println(ag); // should be 8 elements
    
    
  }

}