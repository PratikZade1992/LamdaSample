package com.pz.streamcollector;

import com.pz.data.Student;
import com.pz.data.StudentDatabase;

import java.util.Comparator;
import java.util.Optional;

import static java.util.stream.Collectors.maxBy;
import static java.util.stream.Collectors.minBy;

public class StreamMinByMaxByCollector {

    private static Optional<Student> minBy_example(){
        return StudentDatabase.getStudentList()
                .stream()
                .collect(minBy(Comparator.comparing(Student::getGpa)));
    }

    private static Optional<Student> maxBy_example(){
        return StudentDatabase.getStudentList()
                .stream()
                .collect(maxBy(Comparator.comparing(Student::getGpa)));
    }
    public static void main(String[] args) {

    System.out.println(maxBy_example().get());
    System.out.println(minBy_example().get());
  }
}
