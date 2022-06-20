package com.pz.streamcollector;

import com.pz.data.Student;
import com.pz.data.StudentDatabase;

import java.util.List;

import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.toList;

/**
 * mapping Collector is used to convert first and then collect
 * */
public class StreamMappingCollectorExample {

  /**
   * The entry point of application.
   *
   * @param args the input arguments
   */
  public static void main(String[] args) {
      List<String> collect = StudentDatabase.getStudentList()
              .stream()
              .collect(mapping(Student::getName, toList()));

    System.out.println(collect);
  }
}
