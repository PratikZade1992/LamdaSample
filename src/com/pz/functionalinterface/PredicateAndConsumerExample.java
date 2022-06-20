package com.pz.functionalinterface;

import com.pz.data.Student;
import com.pz.data.StudentDatabase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumerExample {

  Predicate<Student> predicateGrade = (student) -> student.getGrade() >= 3;
  Predicate<Student> predicateGPA = (student) -> student.getGpa() >= 3.5;

  BiPredicate<Integer, Float> biPredicate=(grade,gpa)->grade>=3&&gpa>=2.5;

  BiConsumer<String, List<String>> biConsumerNameAndActivity =
      (name, activity) -> System.out.println(name + " : " + activity);

  Consumer<Student> consumer =
      (student) -> {
        if (predicateGrade.and(predicateGPA).test(student)) {
          biConsumerNameAndActivity.accept(student.getName(), student.getActivities());
        }
      };
    Consumer<Student> consumerBiPredicate =
            (student) -> {
                if (biPredicate.test(student.getGrade(),student.getGpa())) {
                    biConsumerNameAndActivity.accept(student.getName(), student.getActivities());
                }
            };

  void printStudentNameAndActivity() {
    System.out.println("with predicate");
    StudentDatabase.getStudentList().forEach(student -> consumer.accept(student));
    System.out.println("with bi predicate");
    StudentDatabase.getStudentList().forEach(student -> consumerBiPredicate.accept(student));
  }

  public static void main(String[] args) {
    new PredicateAndConsumerExample().printStudentNameAndActivity();
  }
}
