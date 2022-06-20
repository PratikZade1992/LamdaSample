package com.pz.streamcollector;

import com.pz.data.StudentDatabase;

import java.util.stream.Collectors;

/** counting collector is used to count no of element in stream */
public class StreamCountingCollector {

    private static Long counting(){
       return StudentDatabase.getStudentList()
                .stream()
                .filter(student -> student.getGrade()==3)
                .collect(Collectors.counting());
    }


  /**
   * The entry point of application.
   *
   * @param args the input arguments
   */
  public static void main(String[] args) {
    //
    System.out.println(counting());
  }
}
