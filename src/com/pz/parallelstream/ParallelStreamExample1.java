package com.pz.parallelstream;

import com.pz.data.Student;
import com.pz.data.StudentDatabase;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class ParallelStreamExample1 {

  private static List<String> printListOfActivitySequentially() {

    Long startTime = System.currentTimeMillis();
    List<String> sorted =
        StudentDatabase.getStudentList().stream()
            .map(Student::getActivities)
            .flatMap(List::stream)
            .distinct()
            .sorted()
            .collect(toList());
    Long endTime = System.currentTimeMillis();
    System.out.println("Time taken by sequential stream is : " + (endTime - startTime));
    return sorted;
  }

  private static List<String> printListOfActivityParallel() {

    Long startTime = System.currentTimeMillis();
    List<String> sorted =
        StudentDatabase.getStudentList().stream()
            .parallel()
            .map(Student::getActivities)
            .flatMap(List::stream)
            .distinct()
            .sorted()
            .collect(toList());
    Long endTime = System.currentTimeMillis();
    System.out.println("Time taken by parallel  stream is : " + (endTime - startTime));
    return sorted;
  }

  public static void main(String[] args) {
    printListOfActivitySequentially();
    printListOfActivityParallel();
  }
}
