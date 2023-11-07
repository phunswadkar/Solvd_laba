package university;

public class Course {

  public static int instanceCount = 0;
  private String name;
  private String id;

  public Course(String name, String id) {
    this.name = name;
    this.id = id;
  }

  public void whoami() {
    System.out.println("Course " + this.name + " has an id " + this.id + ".");
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  @Override
  public String toString() {
    return "Course " + this.name + " has an id " + this.id + ".";
  }

  @Override
  public boolean equals(Object obj) {
    Course course = (Course) obj;


    if (this.name == course.name && this.id == course.id) {
      return true;
    }

    return false;
  }

  @Override
  public int hashCode() {
    return 200;
  }
}
