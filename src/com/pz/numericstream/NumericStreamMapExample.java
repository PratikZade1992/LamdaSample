package com.pz.numericstream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Its example of mapToObj(),mapToLong(),mapToDouble()
 *
 * */
public class NumericStreamMapExample {

    public static List<Integer> mapToObject(){
        return IntStream.range(1,5)
                .mapToObj(i->Integer.valueOf(i))
                .collect(Collectors.toList());
    }
    public static List<Long> mapToLong(){
        return IntStream.range(1,5)
                .mapToObj(i->Long.valueOf(i))
                .collect(Collectors.toList());
    }
    public static double mapToDouble(){
        return IntStream.range(1,5)
                .mapToDouble((i)->i)
                .sum();
    }
  /**
   * The entry point of application.
   *
   * @param args the input arguments
   */
  public static void main(String[] args) {
    System.out.println(mapToObject());
    System.out.println(mapToLong());
    System.out.println(mapToDouble());
  }
}
