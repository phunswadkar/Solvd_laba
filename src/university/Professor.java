package university;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Professor extends Person {

  public Professor(final String name, final LocalDate dateOfBirth, int id) {
    super(name, dateOfBirth, id);
  }

  public void whoami() {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    String formattedDate = formatter.format(this.getDateOfBirth());
    System.out.println(String.format("Professor " + this.getName() + " whose id is " + this.getId() + " was born on " + formattedDate + "."));
  }
}
