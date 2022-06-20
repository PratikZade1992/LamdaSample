package com.pz.functionalinterface;

import com.pz.data.Student;
import com.pz.data.StudentDatabase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionExample {

    static BiFunction<List<Student>, Predicate<Student>, Map<String,Float>> function=(students, studentPredicate)->{
        Map<String,Float> studentVsGpa  =  new HashMap<>();
        students.forEach(student -> {
            if(studentPredicate.test(student)){
                studentVsGpa.put(student.getName(),student.getGpa());
            }
        });
        return studentVsGpa;
    };

  public static void main(String[] args) {
    System.out.println("Bi Student function  by grade: "+function.apply(StudentDatabase.getStudentList(),PredicateStudentExample.predicateOnGrade));
    System.out.println("Bi Student function by gpa: "+function.apply(StudentDatabase.getStudentList(),PredicateStudentExample.predicateOnGPA));
  }
}
