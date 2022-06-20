package com.pz.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

/** The type Student database. */
public class StudentDatabase {

  // Supplier to return single record
  public static Supplier<Student> studentSupplier =
      () -> {
        Bike bike = new Bike();
        bike.setName("Harley");
        bike.setModel("VRod");
        Student student =
            new Student("Amar", 2, 4.1f, "Male", 10, Arrays.asList("gaming", "Soccer", "carrom"));
        student.setBike(Optional.of(bike));
        return student;
      };

  /**
   * Gets student list.
   *
   * @return the student list
   */
  public static List<Student> getStudentList() {
    List<Student> studentList = new ArrayList<>();
    studentList.add(
        new Student("Amar", 2, 4.1f, "Male", 4, Arrays.asList("gaming", "Soccer", "Singing")));

    studentList.add(
        new Student("Vikas", 2, 3.1f, "Female", 6, Arrays.asList("kabbadi", "Soccer", "Dancing")));

    studentList.add(
        new Student("Sid", 3, 3.2f, "Male", 7, Arrays.asList("gaming", "Gymnasium", "Acting")));

    studentList.add(
        new Student(
            "Kesav", 3, 4.4f, "Female", 13, Arrays.asList("gaming", "Soccer", "Anchoring")));

    studentList.add(
        new Student("Ravi", 4, 2.0f, "Male", 21, Arrays.asList("gaming", "comedian", "mimicking")));

    studentList.add(
        new Student("Umer", 4, 4.3f, "Female", 12, Arrays.asList("gaming", "Soccer", "carrom")));

    studentList.add(
        new Student("Majnu", 5, 2.1f, "Male", 11, Arrays.asList("gaming", "Soccer", "carrom")));
    studentList.add(
        new Student("Laila", 5, 4.1f, "Female", 10, Arrays.asList("gaming", "comedian", "carrom")));
      studentList.add(null);
    return studentList;
  }
}
