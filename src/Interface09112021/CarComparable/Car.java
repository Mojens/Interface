package Interface09112021.CarComparable;

public class Car implements Comparable {//Fordi at den implements Comparable, så skal den Have præcis samme metoder
  // som der er inde i classen Comparable.
  String type;

  public Car(String type) {
    this.type = type;
  }

  public int compareTo(Object o) {
    if (o instanceof Car) { //Her tjekker den om o er en Car
      if (type == ((Car) o).type) { //Her tjekker den om type for car er det samme som o.type
        return 1; //hvis det er så printer den 1
      }
    } else // ellers printer den 0
      return 0;
    return 0;
  }

}

