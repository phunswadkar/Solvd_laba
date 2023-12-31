package university_hw1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Program {
  private String name;
  private ArrayList<Course> courses;

  private LocalDate startDate;

  public Program(String name, ArrayList<Course> courses, LocalDate startDate) {
    this.name = name;
    this.courses = courses;
    this.startDate = startDate;
  }

  public void whoami() {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    String formattedDate = formatter.format(this.startDate);
    System.out.println("Program " + this.name + " starts on " + this.startDate + ".");

    for (int i = 0; i < courses.size(); i++) {
      courses.get(i).whoami();
    }
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ArrayList<Course> getCourses() {
    return courses;
  }

  public void setCourses(ArrayList<Course> courses) {
    this.courses = courses;
  }
}
