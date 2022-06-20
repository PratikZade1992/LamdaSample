package com.pz.numericstream;

import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamAggregateExample {

  public static void main(String[] args) {

    System.out.println("sum of : " + IntStream.range(1, 50).sum());
    System.out.println("average of : " + IntStream.rangeClosed(1, 50).average());

    OptionalInt optionalInt = IntStream.range(1, 44).min();
    System.out.println(
        "min value of optionalInt : " + (optionalInt.isPresent() ? optionalInt.getAsInt() : 0));
    OptionalLong optionalLong = LongStream.range(50, 400).max();
    System.out.println(
        "max value of optionalLong : " + (optionalLong.isPresent() ? optionalLong.getAsLong() : 0));
  }
}
