package sandbox;

class SuperClass {
  SuperClass(int x) {
    System.out.println("Super");
  }
}
class SubClass extends SuperClass {
  SubClass() {
    super(10);
    System.out.println("Sub 2");
  }
}