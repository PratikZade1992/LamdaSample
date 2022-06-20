package com.pz.numericstream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class NumericStreamExample {

    public static Integer getSumOfNumber(List<Integer> integers){
       return integers.stream()
                .reduce(0,(x,y)->x+y);// It is performing auto unboxing from Integer to int
    }

    public static Integer getSumOfNumberIntStream(){
        return IntStream.rangeClosed(1,6)
                // 1
                //2
                //3
                //4
                //5
                //6
                .sum();
    }
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6);
    System.out.println("Sum of no using stream with reduce  "+getSumOfNumber(integers));
    System.out.println("Sum of no using stream with IntStream  "+getSumOfNumberIntStream());
    }
}
