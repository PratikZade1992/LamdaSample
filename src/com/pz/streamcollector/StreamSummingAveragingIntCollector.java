package com.pz.streamcollector;

import com.pz.data.Student;
import com.pz.data.StudentDatabase;

import java.util.stream.Collectors;

public class StreamSummingAveragingIntCollector {

    private static Integer summingInt(){
       return StudentDatabase.getStudentList()
                .stream()
                .collect(Collectors.summingInt(Student::getNoteBook));
    }
    private static Double averagingInt(){
        return StudentDatabase.getStudentList()
                .stream()
                .collect(Collectors.averagingInt(Student::getNoteBook));
    }
  public static void main(String[] args) {//
    System.out.println(summingInt());
    System.out.println(averagingInt());
  }
}
