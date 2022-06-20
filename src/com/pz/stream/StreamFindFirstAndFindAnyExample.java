package com.pz.stream;

import com.pz.data.Student;
import com.pz.data.StudentDatabase;

import java.util.Optional;

public class StreamFindFirstAndFindAnyExample {

  public static Optional<Student> findAny() {
    return StudentDatabase.getStudentList().stream()
        .filter((student -> student.getGpa() > 4))
        .findAny();//as soon as it get the value it sent the object
  }

  public static Optional<Student> findFirst() {
    return StudentDatabase.getStudentList().stream()
        .filter((student -> student.getGpa() > 4.5))
        .findFirst();
  }

  public static void main(String[] args) {
    Optional<Student> optionalStudentFindAny = findAny();
    if (optionalStudentFindAny.isPresent()) {
      System.out.println("Student found is : " + optionalStudentFindAny.get());
    } else {
      System.out.println("Student not found..");
    }

      Optional<Student> optionalStudentFindFirst = findFirst();
      if (optionalStudentFindFirst.isPresent()) {
          System.out.println("Student found is : " + optionalStudentFindFirst.get());
      } else {
          System.out.println("Student not found..");
      }
  }
}
