package com.pz.defaults;

import com.pz.data.Student;
import com.pz.data.StudentDatabase;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class DefaultExample2 {
  static Consumer<Student> studentConsumer = (student -> System.out.println(student));
  static Comparator<Student> studentNameComparator = Comparator.comparing(Student::getName);
  static Comparator<Student> studentGradeComparator = Comparator.comparing(Student::getGrade);

  private static void shortByName(List<Student> studentList) {
    System.out.println("after the shorting by name:");
    studentList.sort(studentNameComparator);
    studentList.forEach(studentConsumer);
  }

  private static void shortByGPA(List<Student> studentList) {
    System.out.println("after the shorting by gpa:");
    studentList.sort(Comparator.comparingDouble(Student::getGpa).reversed());
    studentList.forEach(studentConsumer);
  }

  private static void sortByChaining(List<Student> studentList) {
    studentList.sort(studentGradeComparator.thenComparing(studentNameComparator));
    System.out.println("after the shorting by grade and name:");
    studentList.forEach(studentConsumer);
  }

  private static void sortWithNullValue(List<Student> studentList){
  //  Comparator<Student> studentComparator=Comparator.nullsLast(studentNameComparator);
    Comparator<Student> studentComparator=Comparator.nullsFirst(studentNameComparator);
    System.out.println("after sortWithNullValue");
    studentList.forEach(studentConsumer);
  }

  public static void main(String[] args) {

    List<Student> studentList = StudentDatabase.getStudentList();

    System.out.println("before the shorting :");
    studentList.forEach(studentConsumer);

   // shortByName(studentList);

    //shortByGPA(studentList);

   // sortByChaining(studentList);
    sortWithNullValue(studentList);
  }
}
