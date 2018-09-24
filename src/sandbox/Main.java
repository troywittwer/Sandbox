package sandbox;

import static sandbox.Planet.EARTH;

public class Main {

  public static void main(String[] args) {
    //Scanner scan = new Scanner(System.in);

    demoToStringOverride();
    demoAbstractClass();
    demoInterfaceImplementation();
    demoEnum();
    demoNestedClass();

  }

  public static void demoToStringOverride() {
    // override toString
    Automobile myAuto = new Automobile("Tesla");
    System.out.println(myAuto.toString());

    Automobile myAuto2 = new Automobile("Honda");
    System.out.println(myAuto2.toString());
  }

  public static void demoAbstractClass() {

    // AbstractClass cannot be instantiated
    // AbstractClass abClass = new AbstractClass();
    ConcreteClass conClass = new ConcreteClass();
    conClass.printAbstractInfo();

  }

  public static void demoInterfaceImplementation() {

    RectanglePlus rect1 = new RectanglePlus(5, 5);
    RectanglePlus rect2 = new RectanglePlus(6, 6);
    if (rect1.isLargerThan(rect2) == 1) {
      System.out.println("rect1 is larger");
    } else if (rect1.isLargerThan(rect2) == -1) {
      System.out.println("rect2 is larger");
    } else {
      System.out.println("the rectangles are the same size");
    }

  }

  public static void demoEnum() {

    System.out.println("Check your weight on another planet");
    System.out.println("Enter your weight on Earth in pounds");

    double earthWeight;

    // comment / uncomment these sections for testing

    // for user input
    //Scanner scanner = new Scanner(System.in);
    //earthWeight = scanner.nextDouble();
    //scanner.close();

    // for quick testing
    earthWeight = 200;

    double mass = earthWeight / EARTH.surfaceGravity();
    // The compiler automatically adds some special methods when it creates an enum. For example,
    // they have a static values method that returns an array containing all of the values of the
    // enum in the order they are declared.
    // https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html
    for (Planet p : Planet.values()) {
      System.out.printf("Your weight on %s is %f%n",
          p, p.surfaceWeight(mass));
    }
  }

  public static void demoNestedClass() {
    NestedClass n = new NestedClass();
    n.getOuterClassField();
    //InnerClass i = new InnerClass(); // illegal

  }
}
