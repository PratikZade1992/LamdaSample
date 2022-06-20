package com.pz.stream;

import com.pz.data.Student;
import com.pz.data.StudentDatabase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/** The type Stream api example. */
public class StreamAPIExample {

  /**
   * The entry point of application.
   *
   * @param args the input arguments
   */
  public static void main(String[] args) {
    // create map of student name vs activity

    Map<String, List<String>> collect =
        StudentDatabase.getStudentList().stream()
            .collect(Collectors.toMap(Student::getName, Student::getActivities));
    Predicate<Student> predicate = student -> student.getGpa() > 4;

    System.out.println(" map student vs activity for all : " + collect);
    // create map of student name vs activity  with grade filter

    Map<String, List<String>> collect1 =
        StudentDatabase.getStudentList().stream()
            .filter(student -> student.getGrade() > 3)
            .collect(Collectors.toMap(Student::getName, Student::getActivities));

    System.out.println(" map student vs activity for all : " + collect1);

    // create map of student name vs activity  with grade filter and gpa filter

    Map<String, List<String>> collect2 =
        StudentDatabase.getStudentList().stream()
            .filter(
                student -> student.getGrade() > 3) // return Stream<Student> //filter is  operator
            .filter(
                predicate) // return Stream<Student> // we can predefined function interface and we
                           // can give
            .collect(
                Collectors.toMap(
                    Student::getName,
                    Student
                        ::getActivities)); // <MAP> // Collect is terminate operator Collect is
                                           // responsible for pipe between intermediate step

    System.out.println(" map student vs activity for all : " + collect2);

    // To debug the stream we used peek methode from stream which accept Consumer

    StudentDatabase.getStudentList().stream()
        .peek(System.out::println)
        .filter(student -> student.getGrade() > 3)
        .peek(student -> System.out.println("after first filter : " + student))
        .filter(predicate)
        .peek(student -> System.out.println("after 2nd filter : " + student))
        .collect(Collectors.toMap(Student::getName, Student::getActivities));
  }
}
