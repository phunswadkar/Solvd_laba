package university;

import javax.sound.midi.Soundbank;

public class Building {

  private static int noOfBuildings;
  private String name;

  private int numberOfRooms;

  public Building(final String name, final int numberOfRooms) {
    this.name = name;
    this.numberOfRooms = numberOfRooms;
    noOfBuildings++;
  }

  public static void getNoOfBuildings() {
    System.out.println("There are " + noOfBuildings + " buildings in the University.");
  }

  public void whoami() {
    System.out.println("Building " + this.name + " has " + this.numberOfRooms + " rooms.");
  }

  @Override
  public String toString() {
    return "Building " + this.name + " has " + this.numberOfRooms + " rooms.";
  }

  @Override
  public boolean equals(Object obj) {
    Building bldg = (Building) obj;


    if (this.name == bldg.name && this.numberOfRooms == bldg.numberOfRooms) {
      return true;
    }

    return false;
  }

  @Override
  public int hashCode() {
    return 100;
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
