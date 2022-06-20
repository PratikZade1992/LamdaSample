package com.pz.methodreference;

import com.pz.data.Student;
import com.pz.data.StudentDatabase;

import java.util.function.Predicate;

public class NonApplicableMethodeReferenceExample {

    static Predicate<Student> predicate=NonApplicableMethodeReferenceExample::studentGpaGraterThanThree;

    static boolean studentGpaGraterThanThree(Student student){
        return student.getGpa()>=3;
    }
    public static void main(String[] args) {

    System.out.println(predicate.test(StudentDatabase.studentSupplier.get()));
  }
}
