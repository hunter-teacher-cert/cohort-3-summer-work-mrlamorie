/**
 * Rational class by Team BangPi
 * First Last
 * collaborators: First Last, First Last
 */


/**
   class Rational
   An instance of this class will represent a rational number (p/q s.t. p,q ints && q!=0),
   and facilitate mathematical operations with another instance of class Rational.

   Basic level (complete all):
   - toString x
   - default constructor x
   - multiply x
   - divide

   Intermediate level (complete Basic methods plus these methods):
   - floatValue
   - overloaded constructor x

   Advanced level (complete Basic + Intermediate + these methods):
   -

*/


public class Rational
{
  // Instance variables aka attributes for numerator and denominator
  private int _numerator;
  private int _denominator;


  // default constructor (no parameters)
  // creates a new Rational with value 0/1
  public Rational()
  {
    _numerator = 0;
    _denominator = 1;
      
  }


  // overloaded constructor
  // takes 2 parameters, one for the numerator, one for the denominator
  // if an invalid denominator is attempted, should print a message and set the number to 0/1
  public Rational( int n, int d )
  {
    this();
    _numerator = n;
    _denominator = d;
  }


  // toString
  // returns a string representation of the rational number (formatting of your choice)
  public String toString()
  {
    /* YOUR ELEGANT CODE HERE */
    return "" + _numerator + "/" + _denominator;
  }


  // floatValue
  // returns floating point approximation of the number
  // uses the most precise floating point primitive
  public double floatValue()
  {
    double n = _numerator;
    double d = _denominator;
    return n/d;
  }


  // multiply
  // takes a Rational parameter and multiplies it by this Rational
  // does not return a value
  // modifies this object
  // does not modify input
  // need not reduce
  public void multiply( Rational r )
  {
    _numerator *= r._numerator;
    _denominator *= r._denominator;
  }


  // divide
  // same as multiply, except operation is division
  public void divide( Rational r )
  {
    // t.n/t.d ÷ r.n/r.d = t.n/t.d × r.d/r.n
    _numerator *= r._denominator;
    _denominator *= r._numerator;
  }

}//end class