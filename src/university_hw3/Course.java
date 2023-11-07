package university;

public class Course {
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
}
