package com.pz.numericstream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericBoxingAndUnBoxingExample {

    public static List<Integer> boxing(){
     return    IntStream.range(1,50) //it will give stream of int
                .boxed()// perform boxing stream<int> to stream<Integer>
                .collect(Collectors.toList());
    }

    public static int unBoxing(List<Integer> integerList){
       return integerList.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }

  public static void main(String... args) {
      List<Integer> boxing = boxing();
      System.out.println("boxing : "+ boxing);
    System.out.println("unboxing : "+unBoxing(boxing));
    }
}
