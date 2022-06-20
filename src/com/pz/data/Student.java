package com.pz.data;

import java.util.List;
import java.util.Optional;

/** The type Student. */
public class Student {
  private String name;
  private Integer grade;
  private float gpa;
  private String gender;
  private int noteBook;
  private Optional<Bike> bike = Optional.empty();
  /**
   * Gets gender.
   *
   * @return the gender
   */
  public String getGender() {
    return gender;
  }

  /**
   * Sets gender.
   *
   * @param gender the gender
   */
  public void setGender(String gender) {
    this.gender = gender;
  }

  private List<String> activities;

  /**
   * Instantiates a new Student.
   *
   * @param name the name
   * @param grade the grade
   * @param gpa the gpa
   * @param gender the gender
   * @param noteBook the note book
   * @param activities the activities
   */
  public Student(
      String name, Integer grade, float gpa, String gender, int noteBook, List<String> activities) {
    this.name = name;
    this.grade = grade;
    this.gpa = gpa;
    this.gender = gender;
    this.noteBook = noteBook;
    this.activities = activities;
  }

  /** Instantiates a new Student. */
  public Student() {}

  /**
   * Instantiates a new Student.
   *
   * @param name the name
   */
  public Student(String name) {
    this.name = name;
  }

  /**
   * Gets name.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Sets name.
   *
   * @param name the name
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Gets grade level.
   *
   * @return the grade level
   */
  public Integer getGrade() {
    return grade;
  }

  /**
   * Sets grade level.
   *
   * @param grade the grade level
   */
  public void setGrade(Integer grade) {
    this.grade = grade;
  }

  /**
   * Gets gpa.
   *
   * @return the gpa
   */
  public float getGpa() {
    return gpa;
  }

  /**
   * Sets gpa.
   *
   * @param gpa the gpa
   */
  public void setGpa(float gpa) {
    this.gpa = gpa;
  }

  /**
   * Gets activities.
   *
   * @return the activities
   */
  public List<String> getActivities() {
    return activities;
  }

  /**
   * Sets activities.
   *
   * @param activities the activities
   */
  public void setActivities(List<String> activities) {
    this.activities = activities;
  }

  /** Print activity. */
  public void printActivity() {
    System.out.println(activities);
  }

  /**
   * Gets note book.
   *
   * @return the note book
   */
  public int getNoteBook() {
    return noteBook;
  }

  /**
   * Sets note book.
   *
   * @param noteBook the note book
   */
  public void setNoteBook(int noteBook) {
    this.noteBook = noteBook;
  }

  @Override
  public String toString() {
    return "Student{"
        + "name='"
        + name
        + '\''
        + ", grade="
        + grade
        + ", gpa="
        + gpa
        + ", gender='"
        + gender
        + '\''
        + ", noteBook="
        + noteBook
        + ", bike="
        + bike
        + ", activities="
        + activities
        + '}';
  }

  /**
   * Gets bike.
   *
   * @return the bike
   */
  public Optional<Bike> getBike() {
    return bike;
  }

  /**
   * Sets bike.
   *
   * @param bike the bike
   */
  public void setBike(Optional<Bike> bike) {
    this.bike = bike;
  }
}
