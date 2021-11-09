package Interface09112021.CarComparable;

public class Motorcycle implements Comparable { //Her er det præcis det samme som i Car Klassen

  String wheels;

  public Motorcycle(String wheels) {
    this.wheels = wheels;

  }

  public int compareTo(Object o) {
    if (o instanceof Motorcycle) {
      if (wheels == ((Motorcycle) o).wheels) {
        return 1;
      }
    }
    return 0;
  }
}

