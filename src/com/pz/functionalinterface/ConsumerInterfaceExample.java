package com.pz.functionalinterface;

import com.pz.data.Student;
import com.pz.data.StudentDatabase;

import java.util.List;
import java.util.function.Consumer;

/** The type Consumer interface example. */
public class ConsumerInterfaceExample {

 static Consumer<Student> consumer1 = student -> System.out.println(student.toString());
 static Consumer<Student> consumerName = student -> System.out.printf(student.getName()+" ");
 static Consumer<Student> consumerActivity=student -> System.out.println(student.getActivities());
  /**
   * The entry point of application.
   *
   * @param args the input arguments
   */
  public static void main(String[] args) {

    Consumer<String> consumer =
        (s) ->
            System.out.println(" Consumer interface example to do upper case: " + s.toUpperCase());
    consumer.accept("consumer interface with java 8");

    printAllStudent();

    System.out.println("##################################################################################");
    printStudentNameAndActivity();
    System.out.println("##################################################################################");
    printStudentNameAndActivityOnGradeCondition();
  }

  /** This is simple consumer example ti print all the student List */
  private static void printAllStudent() {
    List<Student> studentList = StudentDatabase.getStudentList();

    studentList.forEach(consumer1);
  }

  /**
   * printStudentNameAndActivity : to print student name and their respective activity
   */
  private static void printStudentNameAndActivity() {
    StudentDatabase.getStudentList().forEach(consumerName.andThen(consumerActivity));
  }
  /**
   * printStudentNameAndActivityOnGradeCondition : this is used to print student base on condition of grade
   */
  private static void printStudentNameAndActivityOnGradeCondition(){
    List<Student> studentList = StudentDatabase.getStudentList();

    studentList.forEach(student -> {
      if(student.getGrade()>=3)
        consumerName.andThen(consumerActivity).accept(student);
    });

  }

}
