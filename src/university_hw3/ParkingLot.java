package university;

public class ParkingLot {
  private String name;
  private int numberOfParkingSpots;

  public ParkingLot(final String name, final int numberOfParkingSpots) {
    this.name = name;
    this.numberOfParkingSpots = numberOfParkingSpots;
  }

  public void whoami() {
    System.out.println("ParkingLot" + this.name + " has " + this.numberOfParkingSpots + " spots.");
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getNumberOfParkingSpots() {
    return numberOfParkingSpots;
  }

  public void setNumberOfParkingSpots(int numberOfParkingSpots) {
    this.numberOfParkingSpots = numberOfParkingSpots;
  }
}
