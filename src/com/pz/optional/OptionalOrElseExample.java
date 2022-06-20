package com.pz.optional;

import com.pz.data.Student;
import com.pz.data.StudentDatabase;

import java.util.Optional;

public class OptionalOrElseExample {

  private static String optionalOrElse() {
    // Optional<Student> studentOptional =
    // Optional.ofNullable(StudentDatabase.studentSupplier.get());
    Optional<Student> studentOptional = Optional.ofNullable(null);

    String name = studentOptional.map(Student::getName).orElse("Default");

    return name;
  }

  private static String optionalOrElseGet() {
    // Optional<Student> studentOptional =
    // Optional.ofNullable(StudentDatabase.studentSupplier.get());
    Optional<Student> studentOptional = Optional.ofNullable(null);

    String name =
        studentOptional
            .map(Student::getName)
            .orElseGet(
                () ->
                    "Default"); //  orElseGet accept supplier as in put if value is null the it will
    // return default supplier
    return name;
  }

  private static String optionalOrElseThrow() {
     Optional<Student> studentOptional =
     Optional.ofNullable(StudentDatabase.studentSupplier.get());
   // Optional<Student> studentOptional = Optional.ofNullable(null);

    String name  = studentOptional.map(Student::getName).orElseThrow(()->new RuntimeException("Student not available.."));
    // if student name is not found then in that case it will throw run time exception
    return name;
  }

  public static void main(String[] args) {
    System.out.println("optional or Else : "+optionalOrElse());
    System.out.println("optional or else get : "+optionalOrElseGet());
    System.out.println("optional or else throw : "+optionalOrElseThrow());
  }
}
