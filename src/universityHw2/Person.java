package university;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Person {
  protected String name;
  protected LocalDate dateOfBirth;
  protected int id;

  public Person(final String name, final LocalDate dateOfBirth, int id) {
    this.name = name;
    this.dateOfBirth = dateOfBirth;
    this.id = id;
  }

  public abstract void teach();

  public abstract void study();


  public void whoami() {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    String formattedDate = formatter.format(this.getDateOfBirth());
    System.out.println(String.format(this.getName() + " whose id is " + this.getId() + " was born on " + formattedDate ));
  }

  @Override
  public String toString() {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    String formattedDate = formatter.format(this.getDateOfBirth());
    return String.format(this.getName() + " whose id is " + this.getId() + " was born on " + formattedDate);
  }

  @Override
  public boolean equals(Object obj) {
    Person person = (Person) obj;


    if (this.name == person.name && this.id == person.id && this.dateOfBirth == person.dateOfBirth) {
      return true;
    }

    return false;
  }

  @Override
  public int hashCode() {
    return 400;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LocalDate getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

}
