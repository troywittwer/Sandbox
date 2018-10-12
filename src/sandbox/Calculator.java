package sandbox;

public class Calculator {

  // nested interface
  interface IntegerMath {

    // method definition in nested interface
    int operation(int a, int b);
  }

  // concrete method in class Calculator
  // accepts 2 int arguments and an object of type IntegerMath (implementation of nested interface)
  public int operateBinary(int a, int b, IntegerMath op) {
    return op.operation(a, b);
  }

}
