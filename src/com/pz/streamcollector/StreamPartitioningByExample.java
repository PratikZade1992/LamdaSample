package com.pz.streamcollector;

import com.pz.data.Student;
import com.pz.data.StudentDatabase;

import java.util.List;
import java.util.Map;
import java.util.Set;

import static java.util.stream.Collectors.partitioningBy;
import static java.util.stream.Collectors.toSet;

/**
 * Partitioning by get predicate and return map having key as Boolean
 *
 * */
public class StreamPartitioningByExample {

    private static void partitioningBy_1(){


        Map<Boolean, List<Student>> collect = StudentDatabase.getStudentList()
                .stream()
                .collect(partitioningBy(student -> student.getGpa() > 3));//Predicate<Student> predicate=student->student.getGpa()>3;
    System.out.println(collect);
    }

    //Partitioning with two argument
    private static void partitioningBy_2(){


        Map<Boolean, Set<Student>> collect = StudentDatabase.getStudentList()
                .stream()
                .collect(partitioningBy(student -> {return student.getGpa() > 3;},toSet()));//Predicate<Student> predicate=student->student.getGpa()>3;
        System.out.println(collect);
    }

  /**
   * The entry point of application.
   *
   * @param args the input arguments
   */
  public static void main(String[] args) {
      partitioningBy_1();
      partitioningBy_2();
    //
  }

}
