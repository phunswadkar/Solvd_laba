package university;

public class Building {
  private String name;

  private int numberOfRooms;

  public Building(final String name, final int numberOfRooms) {
    this.name = name;
    this.numberOfRooms = numberOfRooms;
  }

  public void whoami() {
    System.out.println("Building " + this.name + " has " + this.numberOfRooms + " rooms.");
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getNumberOfRooms() {
    return numberOfRooms;
  }

  public void setNumberOfRooms(int numberOfRooms) {
    this.numberOfRooms = numberOfRooms;
  }
}
