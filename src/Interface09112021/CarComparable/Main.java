package Interface09112021.CarComparable;

public class Main {
  public static void main(String[] args) {

//Laver 4 forskellige Car objekter med forskellige Type
    Comparable car1 = new Car("Familiy Car");
    Comparable car2 = new Car("Sports Car");
    Comparable car3 = new Car("Cool Car");
    Comparable car4 = new Car("Familiy Car");

//Laver 3 forskellige motorcykler med forskellige Wheels
    Comparable motorcycle1 = new Motorcycle("Big");
    Comparable motorcycle2 = new Motorcycle("Small");
    Comparable motorcycle3 = new Motorcycle("Big");

    //Her sammenligner jeg cars med hinanden.
    System.out.println(car1.compareTo(car2));
    System.out.println(car2.compareTo(car3));
    System.out.println(car3.compareTo(car1));
    System.out.println(car1.compareTo(car4));

    System.out.println(" ");
    //Her sammenligner jeg motorcycle med hinanden
    System.out.println(motorcycle1.compareTo(motorcycle2));
    System.out.println(motorcycle1.compareTo(motorcycle3));

  }
}

