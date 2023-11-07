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

  @Override
  public String toString() {
    return "ParkingLot" + this.name + " has " + this.numberOfParkingSpots + " spots.";
  }

  @Override
  public boolean equals(Object obj) {
    ParkingLot parkingLot = (ParkingLot) obj;


    if (this.name == parkingLot.name && this.numberOfParkingSpots == parkingLot.numberOfParkingSpots) {
      return true;
    }

    return false;
  }

  @Override
  public int hashCode() {
    return 300;
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
