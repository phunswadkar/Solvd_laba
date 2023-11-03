package university;

public class Main {
  public static void main(String[] args) {
    University university = new University();

    for (int i = 0; i < university.getBuildings().size(); i++) {
      university.getBuildings().get(i).whoami();
    }

    for (int i = 0; i < university.getPlaygrounds().size(); i++) {
      university.getPlaygrounds().get(i).whoami();
    }

    for (int i = 0; i < university.getPrograms().size(); i++) {
      university.getPrograms().get(i).whoami();
    }

    for (int i = 0; i < university.getParkingLots().size(); i++) {
      university.getParkingLots().get(i).whoami();
    }

    for (int i = 0; i < university.getProfessors().size(); i++) {
      university.getProfessors().get(i).whoami();
    }

    for (int i = 0; i < university.getStudents().size(); i++) {
      university.getStudents().get(i).whoami();
    }
  }
}