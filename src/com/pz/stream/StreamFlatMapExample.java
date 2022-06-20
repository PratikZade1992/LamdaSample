package com.pz.stream;


import com.pz.data.Student;
import com.pz.data.StudentDatabase;

import java.util.List;
import java.util.stream.Collectors;

// print all activity of student using flat map and stream
public class StreamFlatMapExample {

  static List<String> getListOfActivity(){
     return StudentDatabase.getStudentList().stream()
              .map(Student::getActivities)
              .flatMap(List::stream)
             .distinct()//Stream<String> with distinct function perform
             .sorted()
             .collect(Collectors.toList());
  }
  static long getNumberOfActivity(){
    return StudentDatabase.getStudentList().stream()
            .map(Student::getActivities)
            .flatMap(List::stream)
            .distinct()//Stream<String> with distinct function perform
            .count();
  }

  public static void main(String[] args) {
    System.out.println("getListOfActivity : "+getListOfActivity());
    System.out.println("getListOfActivity count : "+getNumberOfActivity());
    //
  }
}
