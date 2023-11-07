package university;

import java.time.LocalDate;
import java.util.ArrayList;

public class University {
  private ArrayList<Building> buildings;
  private ArrayList<ParkingLot> parkingLots;
  private ArrayList<Playground> playgrounds;
  private ArrayList<Professor> professors;
  private ArrayList<Student> students;
  private ArrayList<Program> programs;

  public University() {
    this.buildings = new ArrayList<>();
    this.parkingLots = new ArrayList<>();
    this.playgrounds = new ArrayList<>();
    this.professors = new ArrayList<>();
    this.students = new ArrayList<>();
    this.programs = new ArrayList<>();

    final Building csDepartment = new Building("CS Department", 100);
    final Building mechDepartment = new Building("Mechanical Department", 100);
    final Building qualityAssuranceDepartment = new Building("QA Department", 50);
    final Building businessAnalyticsDepartment = new Building("BA Department", 50);

    this.buildings.add(csDepartment);
    this.buildings.add(mechDepartment);
    this.buildings.add(qualityAssuranceDepartment);
    this.buildings.add(businessAnalyticsDepartment);

    final ParkingLot parkingLotA = new ParkingLot("A", 50);
    final ParkingLot parkingLotB = new ParkingLot("B", 20);

    parkingLots.add(parkingLotA);
    parkingLots.add(parkingLotB);

    final Playground trackfield = new Playground("Track field");
    final Playground soccerfield = new Playground("Soccer field");

    playgrounds.add(trackfield);
    playgrounds.add(soccerfield);

    final Professor joe = new Professor("Joe", LocalDate.of(1950, 11, 1), 11);
    final Professor donald = new Professor("Donald", LocalDate.of(1960, 1,12), 12);
    final Professor george = new Professor("George", LocalDate.of(1970, 2,21), 13);

    professors.add(joe);
    professors.add(donald);
    professors.add(george);

    final Student tom = new Student("Tom", LocalDate.of(1991,4,6), 21);
    final Student jerry = new Student("Jerry", LocalDate.of(1992, 2, 26), 22);

    students.add(tom);
    students.add(jerry);

    final Course java = new Course("Java", "JV101");
    final Course dbms = new Course("DBMS", "DB102");
    final Course softwareTesting = new Course("Software Testing", "ST101");

    final ArrayList<Course> csCourses = new ArrayList<>();
    csCourses.add(java);
    csCourses.add(dbms);

    final ArrayList<Course> qaCourses = new ArrayList<>();
    qaCourses.add(softwareTesting);
    qaCourses.add(java);

    final Program csProgram = new Program("Computer Science Engineering", csCourses, LocalDate.of(2023, 8, 8));
    final Program qaProgram = new Program("Quality Assurance", qaCourses, LocalDate.of(2023, 8,8));

    programs.add(csProgram);
    programs.add(qaProgram);

  }

  public void setBuildings(ArrayList<Building> buildings) {
    this.buildings = buildings;
  }

  public ArrayList<Building> getBuildings() {
    return buildings;
  }

  public void setParkingLots(ArrayList<ParkingLot> parkingLots) {
    this.parkingLots = parkingLots;
  }

  public ArrayList<ParkingLot> getParkingLots() {
    return parkingLots;
  }

  public void setPlaygrounds(ArrayList<Playground> playgrounds) {
    this.playgrounds = playgrounds;
  }

  public ArrayList<Playground> getPlaygrounds() {
    return playgrounds;
  }

  public void setProfessors(ArrayList<Professor> professors) {
    this.professors = professors;
  }

  public ArrayList<Professor> getProfessors() {
    return professors;
  }

  public ArrayList<Student> getStudents() {
    return students;
  }

  public void setStudents(ArrayList<Student> students) {
    this.students = students;
  }

  public ArrayList<Program> getPrograms() {
    return programs;
  }

  public void setPrograms(ArrayList<Program> programs) {
    this.programs = programs;
  }
}
