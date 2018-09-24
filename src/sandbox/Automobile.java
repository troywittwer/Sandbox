package sandbox;

public class Automobile {

  private String make;

  public Automobile(String m) {
    make = m;
  }

  public final String toString() {

    //return super.toString() + "This automobile is a " + make;
    return "This automobile is a " + make;

  }

}
