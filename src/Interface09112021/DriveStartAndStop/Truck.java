package Interface09112021.DriveStartAndStop;

public class Truck implements Driveable {//Fordi at den implements Drivable, så skal den Have præcis samme 3 metoder
  // som der er inde i classen Drivable.


  @Override
  public void drive(int distance) {
    System.out.println("I am driving the distance " + distance);

  }

  @Override
  public void startEngine() {
    System.out.println("Im starting the engine! 'BrOoOoM', My truck is big");

  }

  @Override
  public void stopEngine() {
    System.out.println("My truck is stopping 'Pshhhh'");

  }
}

