package com.pz.stream;

import com.pz.data.Student;
import com.pz.data.StudentDatabase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceExample {

  static Integer performMultiplication(List<Integer> integers) {
    return integers.stream() // 1, 3, 5, 7
        // 1
        // 3
        // 5
        // 7
        // a=1,b=1-> 1*1 return result 1
        // a=1,b=3-> 1*3 return result 3
        // a=3,b=5-> 3*5 return result 15
        // a=15,b=7-> 3*5 return result 105
        .reduce(
            1,
            (a, b) ->
                a
                    * b); // here 1 is identity and (a,b)->a*b Binary operator if i pass identity as
                          // 0 then O/P wil be 0
  }

  static Optional<Integer> performMultiplicationWithoutIdentity(List<Integer> integers) {
    return integers.stream() // 1, 3, 5, 7
        // 1
        // 3
        // 5
        // 7
        .reduce((a, b) -> a * b);
  }

  static Optional<Student> gteStudentWithHighestGPA(){
    return StudentDatabase.getStudentList().stream()
            .reduce((student1,student2)->student1.getGpa()>student2.getGpa()?student1:student2);
  }

  public static void main(String[] args) {

    List<Integer> integers = Arrays.asList(1, 3, 5, 7);
    List<Integer> integers1 = new ArrayList<>();
    System.out.println("Multiplication of all integer : " + performMultiplication(integers));
    Optional<Integer> optionalInteger = performMultiplicationWithoutIdentity(integers);
    System.out.println(optionalInteger.isPresent());
    System.out.println(optionalInteger.get());

    Optional<Integer> integerOptional = performMultiplicationWithoutIdentity(integers1);
    System.out.println(integerOptional.isPresent());
    if (integerOptional.isPresent()) {
      System.out.println(integerOptional.get());
    }

    Optional<Student> optionalStudent = gteStudentWithHighestGPA();
    if (optionalStudent.isPresent()){
      System.out.println(optionalStudent.get());
    }

  }
}
