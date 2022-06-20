package com.pz.functionalinterface;

import com.pz.data.StudentDatabase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerInterfaceExample {

    private static void printNameAndActivity(){
        BiConsumer<String, List<String>> biConsumer=(name,activityList)->System.out.println(" name : "+name+ ", Activity : "+activityList);
        StudentDatabase.getStudentList().forEach(student -> biConsumer.accept(student.getName(),student.getActivities()));

    }


    public static void main(String[] args) {

        BiConsumer<String,String> biConsumer=(s1,s2)->System.out.println("a : "+s1 +" , b : "+s2 );
        biConsumer.accept("hi","hello");

        BiConsumer<Integer, Integer> multiply=(value1,value2)->System.out.println("Multiplication : "+value1*value2);

        BiConsumer<Integer, Integer> division=(value1,value2)->System.out.println("division : "+value1/value2);

        multiply.andThen(division).accept(10,5);

        printNameAndActivity();


  }
}
