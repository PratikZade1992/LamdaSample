package com.pz.streamcollector;

import com.pz.data.Student;
import com.pz.data.StudentDatabase;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.*;

public class StreamGroupByCollector {

    private static void groupByGender(){
        Map<String, List<Student>> collect = StudentDatabase.getStudentList()
                .stream()
                .collect(groupingBy(Student::getGender));

    System.out.println(collect);
    }
    private static void groupByCustomize(){
        Map<String, List<Student>> collect = StudentDatabase.getStudentList()
                .stream()
                .collect(groupingBy(student -> {
                    if(student.getGpa()>4)
                        return "outstanding";
                    else if (student.getGpa()<4 && student.getGpa()>2.5)
                        return "average";
                    else
                        return "failed";
                }));

        System.out.println(collect);
    }

    // two level /two argument group by
    private static void groupByTwoField_1(){

        Map<Integer, Map<String, List<Student>>> collect = StudentDatabase.getStudentList()
                .stream()
                .collect(groupingBy(Student::getGrade, groupingBy(student -> {
                    if (student.getGpa() > 4)
                        return "outstanding";
                    else if (student.getGpa() < 4 && student.getGpa() > 2.5)
                        return "average";
                    else
                        return "failed";
                })));

    System.out.println(collect);
    }
    private static void groupByTwoField_2(){

        Map<String, Integer> collect = StudentDatabase.getStudentList()
                .stream()
                .collect(groupingBy(Student::getName,summingInt(Student::getNoteBook)));

        System.out.println(collect);
    }

    // three argument grouping
    public static void threeArgumentGroup(){
        LinkedHashMap<String, Set<Student>> collect = StudentDatabase.getStudentList()
                .stream()
                .collect(groupingBy(Student::getName, LinkedHashMap::new, toSet()));
    System.out.println(collect);
    }

    private static void getTopGPAGradeVise(){
        Map<Integer,Optional<Student>> collect=StudentDatabase.getStudentList()
                .stream()
                .collect(groupingBy(Student::getGrade,maxBy(Comparator.comparing(Student::getGpa))));
   // System.out.println(collect);

        Map<Integer,Student> collect1=StudentDatabase.getStudentList()
                .stream()
                .collect(groupingBy(Student::getGrade,collectingAndThen(maxBy(Comparator.comparing(Student::getGpa)),
                        Optional::get )));
        System.out.println(collect1);
    }
    private static void getLeastGPAGradeVise(){
        Map<Integer,Optional<Student>> collect=StudentDatabase.getStudentList()
                .stream()
                .collect(groupingBy(Student::getGrade,minBy(Comparator.comparing(Student::getGpa))));
        // System.out.println(collect);

        Map<Integer,Student> collect1=StudentDatabase.getStudentList()
                .stream()
                .collect(groupingBy(Student::getGrade,collectingAndThen(minBy(Comparator.comparing(Student::getGpa)),
                        Optional::get )));
        System.out.println(collect1);
    }


  public static void main(String[] args) {
      //groupByGender();
     // groupByCustomize();
      //groupByTwoField_1();
      //groupByTwoField_2();
      //
      getTopGPAGradeVise();
      getLeastGPAGradeVise();
  }
}
