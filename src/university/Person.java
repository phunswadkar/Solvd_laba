package university;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Person {
  private String name;
  private LocalDate dateOfBirth;
  private int id;

  public Person(final String name, final LocalDate dateOfBirth, int id) {
    this.name = name;
    this.dateOfBirth = dateOfBirth;
    this.id = id;
  }

  public void whoami() {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    String formattedDate = formatter.format(this.getDateOfBirth());
    System.out.println(String.format(this.getName() + " whose id is " + this.getId() + " was born on " + formattedDate ));
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
