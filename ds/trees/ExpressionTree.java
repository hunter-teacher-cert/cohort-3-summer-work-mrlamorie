public class ExpressionTree{

  private double value;
  private ExpressionTree left,right;
  private char operator;

  //Tree can be a value
  public ExpressionTree(double val){
   value = val;
   left = null;
   right = null;
  }

  //Tree can be an operator that connects two sub-trees
  public ExpressionTree(char op, ExpressionTree l, ExpressionTree r){
    operator = op;
    left = l;
    right =r;
  }


  //Calculate the value of the entire tree
  public double evaluate(){
    if(isValue()) {
      return value;
    }
    return apply(left.evaluate(), right.evaluate(), operator);
  }

  // return the toString()
  public String toString(){
    // if isValue()
    // return "" + value
    if(isValue()){
      return "" + value;
    }
    // else
    // return "(" + left + op + right + ")"
    return "(" + left + " " + operator + " " + right + ")";
    
  }
  
  //Return true when the node is a value, false when it is an operator
  //when the children are null, the current tree is an operator
  private boolean isValue(){
    return left==null && right ==null;
  }

  //Return false when the node is a value, true when it is an operator
  private boolean isOperator(){
    return !isValue();
  }

  //To simplify things, you get a method to use to convert the
  //operator and two values into a result.
  private double apply(double a, double b, char op){
   if(op == '+'){
    return a+b;
   }else if(op == '-'){
    return a-b;
   }else if(op == '*'){
    return a*b;
   }else{ //  if(op == '/'){ //or any invalid operators
    return a/b;
   }
  }

  // alternate toString()
  public String toStringPrefix(){
    // if isValue()
    // return "" + value
    if(isValue()){
      return "" + value;
    }
    // else
    // return prefix notation
    return "(" + operator + " " + left.toStringPrefix() + " " + right.toStringPrefix() + ")";    
  }

 }