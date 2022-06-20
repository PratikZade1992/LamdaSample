package com.pz.streamcollector;

import com.pz.data.Student;
import com.pz.data.StudentDatabase;

import java.util.stream.Collectors;

import static java.util.stream.Collectors.joining;

public class StreamJoiningCollector {

    private static String joinning_1(){
        return StudentDatabase.getStudentList()
                .stream()
                .map(Student::getName)
                .collect(joining());

    }

    private static String joinning_2(){
        return StudentDatabase.getStudentList()
                .stream()
                .map(Student::getName)
                .collect(joining(","));

    }

    private static String joinning_3(){
        return StudentDatabase.getStudentList()
                .stream()
                .map(Student::getName)
                .collect(joining(",","(",")"));

    }
  public static void main(String[] args) {
    System.out.println(joinning_1());
    System.out.println(joinning_2());
    System.out.println(joinning_3());
  }
}
