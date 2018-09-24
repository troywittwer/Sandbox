package sandbox;

class NestedClass {

  private int outerClassField;

  public int getOuterClassField() {
    return outerClassField;
  }
  class InnerClass {

    void changeOuterClassField() {
      outerClassField = 5;
    }

  }
}
