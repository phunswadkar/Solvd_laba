package university;

import java.time.LocalDate;

public class Main {
  public static void main(String[] args) {

    University university = new University();

    for (int i = 0; i < university.getBuildings().size(); i++) {
      System.out.println(university.getBuildings().get(i));
    }

    Building.getNoOfBuildings();


    for (int i = 0; i < university.getPlaygrounds().size(); i++) {
      System.out.println(university.getPlaygrounds().get(i));
    }

    for (int i = 0; i < university.getPrograms().size(); i++) {
      System.out.println(university.getPrograms().get(i));
    }

    for (int i = 0; i < university.getParkingLots().size(); i++) {
      System.out.println(university.getParkingLots().get(i));
    }

    for (int i = 0; i < university.getProfessors().size(); i++) {
      System.out.println(university.getProfessors().get(i));
    }

    for (int i = 0; i < university.getStudents().size(); i++) {
      System.out.println(university.getStudents().get(i));
    }

    Person person = university.getProfessors().get(0);
    person.teach();
    person.study();

    person = university.getStudents().get(0);
    person.teach();
    person.study();
  }
}