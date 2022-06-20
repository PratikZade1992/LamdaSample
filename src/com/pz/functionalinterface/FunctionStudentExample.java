package com.pz.functionalinterface;

import com.pz.data.Student;
import com.pz.data.StudentDatabase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/** The type Function student to print student name and gpa . */
public class FunctionStudentExample {

  static Function<List<Student>, Map<String, Float>> functionAll =
      (students) -> {
        Map<String, Float> studentVsGpa = new HashMap<>();
        students.forEach(
            student -> {
              studentVsGpa.put(student.getName(), student.getGpa());
            });
        return studentVsGpa;
      };

    static Function<List<Student>, Map<String, Float>> functionCondition =
            (students) -> {
                Map<String, Float> studentVsGpa = new HashMap<>();
                students.forEach(
                        student -> {
                            if (PredicateStudentExample.predicateOnGrade.test(student)){
                            studentVsGpa.put(student.getName(), student.getGpa());
                            }
                        });
                return studentVsGpa;
            };
  /**
   * The entry point of application.
   *
   * @param args the input arguments
   */
  public static void main(String[] args) {
    System.out.println("student vs gpa for all "+ functionAll.apply(StudentDatabase.getStudentList()));
    System.out.println("student vs gpa for grater than 3 "+ functionCondition.apply(StudentDatabase.getStudentList()));
  }
}
