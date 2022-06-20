package com.pz.optional;

import com.pz.data.Student;
import com.pz.data.StudentDatabase;

import java.util.Optional;

/** get student name with optional . */
public class OptionalExample {

  private static String getStudentName() {
    Student student = StudentDatabase.studentSupplier.get();

    if (student != null) {
      return student.getName();
    }
    return null;
  }

  private static Optional<String> getStudentNameOptional() {
   // Optional<Student> studentOptional= Optional.of(StudentDatabase.studentSupplier.get());
    Optional<Student> studentOptional= Optional.ofNullable(null);
    if(studentOptional.isPresent()){
      return studentOptional.map(Student::getName);
    }
    return Optional.empty();// return empty optional object
  }
  /**
   * The entry point of application.
   *
   * @param args the input arguments
   */
  public static void main(String[] args) {

    /*String studentName = getStudentName();

    if (studentName != null) {
      System.out.println("Student name length is : " + studentName);
    } else {
      System.out.println("Student name is not found ");
    }*/

    Optional<String> studentNameOptional = getStudentNameOptional();
    if (studentNameOptional.isPresent()){
      System.out.println("Student name length is : " + studentNameOptional.get());
    } else {
      System.out.println("Student name is not found ");
    }

  }
}
