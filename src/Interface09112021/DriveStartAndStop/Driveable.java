package Interface09112021.DriveStartAndStop;

public abstract interface Driveable { //Alle classes der "implements" denne class Skal bruge de metoder der står i den.
  //I dette eksempel vil det være smart hvis vi ved at vi har f.eks. 4 forskellige biler, motorcykler, knallert og lastbil.
  //Så vil det være smart at have en interface, med metoder som gentager sig gennem de forskellige føretøjer.

  public void startEngine();

  public void drive(int distance);

  public void stopEngine();
}

