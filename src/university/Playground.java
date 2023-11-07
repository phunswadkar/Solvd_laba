package university;

public class Playground {
  private String name;

  public Playground(final String name) {
    this.name = name;
  }

  public void whoami() {
    System.out.println("This playground is a " + this.name);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
