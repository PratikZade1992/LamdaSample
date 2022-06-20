package com.pz.functionalinterface;

import com.pz.data.Student;
import com.pz.data.StudentDatabase;

import java.util.function.Predicate;

public class PredicateStudentExample {
  static Predicate<Student> predicateOnGrade = (student) -> student.getGrade() >= 4;
  static Predicate<Student> predicateOnGPA = (student) -> student.getGpa() >= 4;

  static void printStudentBaseOnGrade() {
    System.out.println("result of printStudentBaseOnGrade");
    StudentDatabase.getStudentList()
        .forEach(
            student -> {
              if (predicateOnGrade.test(student)) {
                System.out.println(student.toString());
              }
            });
  }

    static void printStudentBaseOnGPA() {
    System.out.println("result of printStudentBaseOnGPA");

        StudentDatabase.getStudentList()
                .forEach(
                        student -> {
                            if (predicateOnGPA.test(student)) {
                                System.out.println(student.toString());
                            }
                        });
    }
   static void filterStudent(){
    System.out.println("result of filterStudent");
    StudentDatabase.getStudentList()
        .forEach(
            student -> {
              if (predicateOnGrade.and(predicateOnGPA).test(student)) {  //here base on requirement we can used and, or , negate
                  System.out.println(student);
              }
            });
   }

  public static void main(String[] args) {
    printStudentBaseOnGrade();
      printStudentBaseOnGPA();
      filterStudent();
  }
}
