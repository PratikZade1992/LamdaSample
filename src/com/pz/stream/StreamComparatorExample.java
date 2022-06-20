package com.pz.stream;

import com.pz.data.Student;
import com.pz.data.StudentDatabase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/** The type Stream comparator example. */
public class StreamComparatorExample {

    static List<Student> sortStudentByName(){
       return StudentDatabase.getStudentList().stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList());

    }


    static List<Student> sortStudentByGPA(){
        return StudentDatabase.getStudentList().stream()
                .sorted(Comparator.comparing(Student::getGpa))
                .collect(Collectors.toList());

    }


    static List<Student> sortStudentByGPADesc(){
        return StudentDatabase.getStudentList().stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed())
                .collect(Collectors.toList());

    }


    // Sort the student based on name and gpa using stream
  public static void main(String[] args) {
    System.out.println("Sort student by name ");
    sortStudentByName().forEach(System.out::println);
    System.out.println("Sort student by GPA ");
    sortStudentByGPA().forEach(System.out::println);
    System.out.println("Sort student by GPA DESC ");
    sortStudentByGPADesc().forEach(System.out::println);
  }

}
