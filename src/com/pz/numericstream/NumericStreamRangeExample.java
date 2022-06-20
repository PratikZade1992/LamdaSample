package com.pz.numericstream;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamRangeExample {

  public static void main(String[] args) {
    System.out.println(IntStream.range(1,5).count());

    System.out.println("For IntStream range :");
    IntStream.range(1, 50).forEach(value -> System.out.print(value+","));
      System.out.println();
      System.out.println("For IntStream close range :");
    IntStream.rangeClosed(1, 50).forEach(value -> System.out.print(value+","));
      System.out.println();
      System.out.println("For LongStream range :");
    LongStream.range(1, 50).forEach(value -> System.out.print(value+","));
      System.out.println();
      System.out.println("For LongStream close range :");
    LongStream.rangeClosed(1, 50).forEach(value -> System.out.print(value+","));
      System.out.println();

      // for double stream we don't have range or close range so using IntStream() or LongStream() we can create double range

      IntStream.rangeClosed(1, 50).asDoubleStream().forEach((a)->System.out.print(a+","));

  }
}
