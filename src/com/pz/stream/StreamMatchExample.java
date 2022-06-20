package com.pz.stream;

import com.pz.data.StudentDatabase;

public class StreamMatchExample {
    static boolean getAllMatch(){
        return StudentDatabase.getStudentList().stream()
                .allMatch((student -> student.getGpa()>=4));// only return true when condition true for all element

    }
    static boolean getAnyMatch(){
        return StudentDatabase.getStudentList().stream()
                .anyMatch(student -> student.getGpa()>=3);// only return true when condition true for one of element

    }
    static boolean getNoneMatch(){
        return StudentDatabase.getStudentList().stream()
                .noneMatch(student -> student.getGpa()<2);// only return true when condition false for all element

    }

  public static void main(String[] args) {
    System.out.println("All Match output : "+getAllMatch());
    System.out.println("Any Match output : "+getAnyMatch());
    System.out.println("Any Match output : "+getNoneMatch());
  }
}
