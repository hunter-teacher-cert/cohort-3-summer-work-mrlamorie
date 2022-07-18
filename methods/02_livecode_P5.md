## Intro
[Before code-along with students, post link to https://editor.p5js.org/kmaschmeyer/full/Ibe9Ugd-w to have students explore/play game]

## Code 

````Javascript
// PROVIDE
// Variables go up here
// STUDENT-PROMPT: How do we declare a variable? (Flow: declare, instantiate, use & test, then wrote code to have value change)


function setup() {
  // STUDENT-PROMPT: How big is our canvas?  What if we want to change the size?
	createCanvas(400, 400);
}

function draw() {
	// Set your background to a color of your choice
 // STUDENT-PROMPT: How do we set the color of the background?  Does anyone have a color they love?
	background(220);


 // BEEG REVEAL: The background is one of our game colors and there is only 1 rectangle drawn, not 2!
 
	// Make a rectangle that covers the left half of your canvas.  Fill it with your second color, then use noStroke() to remove the outline.

  // DELIBERATE-ERROR: create rectangle of wrong size/location
  // STUDENT-PROMPT: how do we color in our rectangle?  (Make sure to discuss order.)

  
  
  // If we have time: write code to display who wins!

	
  // supporting text

	text("x: " + int(mouseX) + ", y:" + int(mouseY), 50, 50 

}


// use this function to change the width of your rectangle

// BIG IDEA: We're using a new-to-us function called keyPressed()
// MUST-ANSWER-Q: What is a function?  How do we use this one? 

function keyPressed() {	
}
`````