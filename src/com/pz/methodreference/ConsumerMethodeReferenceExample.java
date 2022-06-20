package com.pz.methodreference;

import com.pz.data.Student;
import com.pz.data.StudentDatabase;

import java.util.function.Consumer;

public class ConsumerMethodeReferenceExample {
    static Consumer<Student> consumerWithLamda = student -> System.out.println(student.toString());
    static Consumer<Student> consumerWithMR = System.out::println;
  static  Consumer<Student> consumerPrintActivity=Student::printActivity;
    public static void main(String[] args) {
      StudentDatabase.getStudentList().forEach(student->consumerWithLamda.accept(student));
      StudentDatabase.getStudentList().forEach(student->consumerWithMR.accept(student));
    System.out.println("######## to to print list Activity create method in student class to print activity");
    StudentDatabase.getStudentList().forEach(student -> consumerPrintActivity.accept(student));


  }
}
