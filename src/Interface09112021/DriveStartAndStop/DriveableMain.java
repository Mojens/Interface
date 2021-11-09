package Interface09112021.DriveStartAndStop;

public class DriveableMain {

  public static void main(String[] args) {
    //fordi at det er Classes der er implementet fra en interface, så kalder vi på Interface først, derefter kald vi
    //Objektet, og så er at vi intansier Selve classen.

    Driveable car = new Car();
    Driveable motorcycle = new Motorcycle();
    Driveable truck = new Truck();

    car.startEngine();
    motorcycle.startEngine();
    truck.startEngine();

    car.drive(100);
    motorcycle.drive(200);
    truck.drive(300);

    car.stopEngine();
    motorcycle.stopEngine();
    truck.stopEngine();

  }
}

