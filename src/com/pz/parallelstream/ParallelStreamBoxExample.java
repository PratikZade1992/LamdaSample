package com.pz.parallelstream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class ParallelStreamBoxExample {

  private static void sequentialSum(List<Integer> collect) {

    Long startTime = System.currentTimeMillis();
    int reduce = collect.stream().reduce(0, (x, y) -> x + y);
    Long endTime = System.currentTimeMillis();
    System.out.println("Time taken by sequential  stream is : " + (endTime - startTime));
  }

  private static void parallelSum(List<Integer> collect) {

    Long startTime = System.currentTimeMillis();
    int reduce = collect.stream().
            parallel().
            reduce(0, (x, y) -> x + y);// autoboxing is performing that why it is taking time
    Long endTime = System.currentTimeMillis();
    System.out.println("Time taken by parallel  stream is : " + (endTime - startTime));
  }

  public static void main(String[] args) {

    List<Integer> collect = IntStream.rangeClosed(1, 10000).boxed().collect(toList());

    sequentialSum(collect);
    parallelSum(collect);
  }
}
