package sandbox;

public class Programmer extends Writer {
  public static void write() {
    System.out.println("Writing code");
  }

  public Programmer() {
    System.out.println("In Programmer constructor");
  }

  public static void main(String[] args) {
    Programmer w = new Programmer();
    w.write();
  }
}