package com.pz.optional;

import com.pz.data.Bike;
import com.pz.data.Student;
import com.pz.data.StudentDatabase;

import java.util.Optional;

public class OptionalFilterMapFlatMapExample {

  // filter
  private static void optionalFilter() {
    Optional<Student> studentOptional = Optional.ofNullable(StudentDatabase.studentSupplier.get());

    studentOptional.filter(student -> student.getGpa() > 4.5).ifPresent(System.out::println);
  }
  // map
  private static void optionalMap() {
    Optional<Student> studentOptional = Optional.ofNullable(StudentDatabase.studentSupplier.get());

    if (studentOptional.isPresent()) {
      Optional<String> optionalS =
          studentOptional.filter(student -> student.getGpa() > 4).map(Student::getName);
      optionalS.ifPresent(System.out::println);
    }
  }

  // flat map
  private static void optionalFlatMap() {
    Optional<Student> studentOptional = Optional.ofNullable(StudentDatabase.studentSupplier.get());
    if (studentOptional.isPresent()) {
      Optional<String> optionalS =
          studentOptional
              .filter(student -> student.getGpa() > 4) // Optional<Student>
              .flatMap(Student::getBike) // Optional<Bike> : it will used to flatten object
              .map(Bike::getName); // Optional<String>
      optionalS.ifPresent(System.out::println);
    }
  }

  public static void main(String[] args) {
    optionalFilter();
    optionalMap();
    optionalFlatMap();
  }
}
