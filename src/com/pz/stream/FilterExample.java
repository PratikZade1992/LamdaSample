package com.pz.stream;

import com.pz.data.Student;
import com.pz.data.StudentDatabase;

import java.util.List;
import java.util.stream.Collectors;

public class FilterExample {

  static List<Student> getFilterList() {
    return StudentDatabase.getStudentList().stream() // Stream<Student>
        .filter((student -> student.getGender().equalsIgnoreCase("female"))) // Stream<Student>
        // Filter the stream of student on basis of gender
        .filter(student -> student.getGpa() > 4.1)
        .collect(Collectors.toList());
  }

  public static void main(String[] args) {

    getFilterList().forEach(System.out::println);
    //
  }
}
