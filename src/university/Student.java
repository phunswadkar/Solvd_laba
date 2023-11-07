package university;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Student extends Person {
  public Student(final String name, final LocalDate dateOfBirth, int id) {
    super(name, dateOfBirth, id);
  }

  public void whoami() {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    String formattedDate = formatter.format(this.getDateOfBirth());
    System.out.println(String.format("Student " + this.getName() + " whose id is " + this.getId() + " was born on " + formattedDate ));
  }
}
