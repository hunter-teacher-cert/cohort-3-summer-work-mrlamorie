public class Loops{

    public static void main(String[] args) {

      // make a loop that runs 10 times
      for(int i =0; i < 10; i ++){

        // add a message to let people know the outer loop is running
        System.out.println("I am the outer loop");

        // make a loop INSIDE the loop you made, run it 5 times
        // if this loop seems to happen too few times, or if you get an error, talk it out with
        // your group, and then check with me to see if you've figured out why
        for(int j = 0; j < 5; j++){  // students will often use i again, causing errors
          // add a message to let people know the inner loop is running
          System.out.println("I am the inner loop");
        }
      }


      // expand and intigrate activites
      // make a loop that runs 10 times
      for(int i =0; i < 10; i ++){
        // add a message to let people know the outer loop is running
        System.out.println("I am the outer loop");
        // if i is even
          // then loop 10 times
            // add a message to let people know the inner loop is running
            // every other loop print "i and j are both even!"
        if((i % 1) == 0){
          for(int j = 0; j < 10; j++){  // students will often use i again, causing errors
            // add a message to let people know the inner loop is running
            System.out.println("I am the inner loop");
            if((j % 1) == 0){
              System.out.println("i and j are both even!");
            }
          }
        }

      }
	
    }

}