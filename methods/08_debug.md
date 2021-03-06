## 08_Debugging Activity

### Group Name: Error on Line 10

**Group Members**: Marisa Shuman, Yeidy Levels, Wayne Tobias, Will LaMorie

---

**Activity**: Students are given a block of code that has ONE error in it. 
Students are familiar with the concepts that are present in the code but not how to find the error. 

Students will add a comment to each line of code where they explain what that line is doing (what it means in non code words). 

Students will identify the error in the code and indicate a correction.

````java
for (int i=0; i>data.length; i++) {

  if (data[i]%2 == 0) {
    System.out.print(data[i] + " is even");
  }

  else {
    System.out.print(data[i] + " is odd");
  }

}
````

**Scaffolding Variations**: 
- Other types of errors that could be included are:
    * `==` vs `=` equal useage or other equality evaluation errors
    * `,` instead of `;` in `for()` loop
    * switch the print statements so even/odd are swapped
    * add `()` after the `.length` in the `for()` loop
    * use `.size()` instead of `.length`

**Extension**: 
- Ask the students "*Where do you think another student might make an error?*".
- Have the students build a function from scratch without testing, and pass off to other students to have them look for bugs ala *paired coding* or *rubbyducky coding*.
- A recusive method where recursion is though reassigment of a variable, but the variable value is not updated. Eg:
    ````java
      doSomethingRecursive(foo) //should be foo = doSomethingRecursive(foo)
    ````
- A section of code with an inordiant number of extra variable for extra steps, where there are incorrect results because the wrong variable are used in the wrong places.