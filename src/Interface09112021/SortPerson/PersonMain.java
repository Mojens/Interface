package Interface09112021.SortPerson;

import java.util.ArrayList;
import java.util.Collections;

public class PersonMain {
  public static void main(String[] args) {

//Laver 4 person objekter med forskellige fødelsår
    Person person1 = new Person(2000);
    Person person2 = new Person(2001);
    Person person3 = new Person(1996);
    Person person4 = new Person(2001);

//Laver en ArrayList
    ArrayList<Person> personBirthYear = new ArrayList();

//Tilføjer alle person objekter ind i ArrayListen
    personBirthYear.add(person1);
    personBirthYear.add(person2);
    personBirthYear.add(person3);
    personBirthYear.add(person4);

//Printer listen ud før den bliver sorteret
    System.out.println("Before Sort");
    System.out.println(personBirthYear);

//Printer listen ud efter sorteret
    System.out.println("After Sort");
    Collections.sort(personBirthYear); //Denne her sorter min arrayList ud fra Laveste tal til det højeste
    System.out.println(personBirthYear); //Den her printer den arrayList ud efter den er sorteret
  }
}

