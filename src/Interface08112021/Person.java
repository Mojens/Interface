package Interface08112021;

import java.util.Arrays;

public class Person implements DatabaseObject {
  private String name;
  private int age;
  public static void main(String[] args) {

  }

  public void storeInDatabase() {

  }

  public String toStorageString() {
    return name + ", "+age;
  }

  public void fromStorageString(String text) {
    String [] data = text.split(",");
    this.name = data[0];
    this.age = Integer.parseInt(data[1]);
  }
}

