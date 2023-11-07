package university;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Student extends Person {
  public Student(final String name, final LocalDate dateOfBirth, int id) {
    super(name, dateOfBirth, id);
  }

  @Override
  public void teach() {
    System.out.println("Student does not teach.");
  }

  @Override
  public void study() {
    System.out.println("Student studies.");
  }

  public void whoami() {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    String formattedDate = formatter.format(this.dateOfBirth);
    System.out.println(String.format("Student " + this.name + " whose id is " + this.id + " was born on " + formattedDate ));
  }

  @Override
  public String toString() {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    String formattedDate = formatter.format(this.dateOfBirth);
    return String.format("Student " + this.name + " whose id is " + this.id + " was born on " + formattedDate );
  }

  @Override
  public int hashCode() {
    return 800;
  }
}
