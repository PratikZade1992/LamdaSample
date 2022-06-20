package com.pz.parallelstream;

import java.util.function.Supplier;
import java.util.stream.IntStream;

/** Bream the stream in small chunk of stream and the combine the result */
public class ParallelStreamExample {

  private static long checkPerformance(Supplier<Integer> supplier, int noOfTimes) {

    Long starTime = System.currentTimeMillis();
    for (int i = 0; i <= noOfTimes; i++) {
      supplier.get();
    }
    Long endTime = System.currentTimeMillis();
    return endTime - starTime;
  }

  private static int sumOfSequentialStreamInt() {
    return IntStream.rangeClosed(1, 100000).sum();
  }
  ;

  private static int sumOfParallelStreamInt() {
    return IntStream.rangeClosed(1, 100000).parallel().sum();
  }
  ;

  /**
   * The entry point of application.
   *
   * @param args the input arguments
   */
  public static void main(String[] args) {
    System.out.println(Runtime.getRuntime().availableProcessors());
    System.out.println("Time Required in sequential stream : "+checkPerformance(ParallelStreamExample::sumOfSequentialStreamInt,10));
    System.out.println("Time Required in parallel stream : "+checkPerformance(ParallelStreamExample::sumOfParallelStreamInt,10));
  }
}
