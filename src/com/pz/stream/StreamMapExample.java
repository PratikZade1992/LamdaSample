package com.pz.stream;

import com.pz.data.Student;
import com.pz.data.StudentDatabase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamMapExample {

    // Converting List of Student object to List of name

    static List<String> getStudentNameList(){
        return  StudentDatabase.getStudentList().stream()
                //Student as input ->Student name
                .map(Student::getName)//  Stream<String>
                .map(String::toUpperCase)// Stream<String> //perform operation
                .collect(Collectors.toList());

    }

    // Converting List of Student object to set of name

    static Set<String> getStudentNameSet(){
        return  StudentDatabase.getStudentList().stream()
                .map(Student::getName)
                .map(String::toUpperCase)// Stream<String> //perform operation
                .collect(Collectors.toSet());

    }

    public static void main(String[] args) {
    System.out.println("List of student name : "+getStudentNameList() );
    System.out.println("Set of student name : "+getStudentNameSet() );
  }
}
