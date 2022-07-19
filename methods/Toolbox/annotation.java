// BIG IDEA - ArrayList work a lot like arrays
// PROVIDE this code as a starter for the discussion.
// PROVIDE example arrayList(s) for students  like {0,1,2,3,3,4,5}  //STUDENT PROMPT: Discuss why it returns location of first 3
  public int linearSearch(int value, ArrayList<Integer> data) {
     //declaration for the function integer called value - array list of integers called data

    int foundIndex = -1; //the integer  // FIRSTDRAFT REVISION remove

    for (int i=0; i < data.size(); i++) {
      //Student prompt: Can someone say in words what line 7 means?

      int element = data.get(i);

      if (element == value) { // STUDENT-PROMPT How can we revise this? DELIBERATE-ERROR make this e not element =P
        foundIndex = i;   // FIRSTDRAFT REVISION turn this into return i;
        break;            // FIRSTDRAFT REVISION remove when you do above
        }
      }
    return foundIndex;    // FIRSTDRAFT REVISION return -1;
  }

//purpose of function is to return index of the value and if there isn't one then return -1

//MUST-ANSWER-Q :: a question that must be resolved, that a majority of your class must understand before moving on - why do we need i++ on line 6
