package sandbox;

import sandbox.Calculator.IntegerMath;

public class LambdaExpressions {

  public static void demoLambda() {

    // A lambda expression consists of the following:
    //
    // A comma-separated list of formal parameters enclosed in parentheses.
    //
    // The arrow token, ->
    //
    // A body, which consists of a single expression or a statement block
    //
    // Note: You can omit the data type of the parameters in a lambda expression.
    // In addition, you can omit the parentheses if there is only one parameter.

    Calculator myApp = new Calculator();

    // implement IntegerMath interface with addition and
    // subtraction IntegerMath objects from Calculator

    // a shorter way of writing something like...
    //   Class Add implements IntegerMath {
    //     public int addition(int a, int b) {
    //       return a + b;
    //     }
    //   }

    IntegerMath addition = (a, b) -> a + b;
    IntegerMath subtraction = (a, b) -> a - b;

    System.out.println("40 + 2 = " + myApp.operateBinary(40, 2, addition));
    System.out.println("20 - 10 = " + myApp.operateBinary(20, 10, subtraction));
  }


}
