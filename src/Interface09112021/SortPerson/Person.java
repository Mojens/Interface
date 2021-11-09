package Interface09112021.SortPerson;

public class Person implements Comparable { //Man kan skrive således public class Person implements Comparable<Person>
  //Så slipper vi for at lave en instance of længere ned i compareTo
  Integer yearOfBirth;

  public Person(Integer yearOfBirth) { //Konstruktør med int med tal af årstal for fødsel
    this.yearOfBirth = yearOfBirth;
  }

  @Override
  public String toString() { //Laver en toString til min arrayList så den ikke kommer i koder
    return "" + yearOfBirth;
  }


  public int compareTo(Object o) { //Denne metode sammenligner Person objekterne med hinanden med deres årstal
    if (o instanceof Person) {
      if (yearOfBirth < ((Person) o).yearOfBirth) { //Mindre end -1
        return -1;
      } else if (yearOfBirth > ((Person) o).yearOfBirth) { //Større end 1
        return 1;
      }
    }
    return 0; //Ligmed 0
  }//Uden denne compareTo Metode så kan man ikke bruge Collections.Sort
}

