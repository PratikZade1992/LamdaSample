package com.pz.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamLimitAndSkipExample {

  static Optional<Integer> additionWithLimit(List<Integer> integers) {
    return integers.stream() // Stream<Integer>(5, 6, 8, 3, 7, 10)
        .limit(3) // //Stream<Integer>(5, 6, 8) // As limit set is 3 so it will take only starting 3
        .reduce((x, y) -> x + y);
  }
  static Optional<Integer> additionWithSkip(List<Integer> integers) {
    return integers.stream() // Stream<Integer>(5, 6, 8, 3, 7, 10)
            .skip(3) // //Stream<Integer>( 3, 7, 10) // As skip set is 3 so it will skip starting 3
            .reduce((x, y) -> x + y);
  }
  public static void main(String[] args) {
    List<Integer> integers = Arrays.asList(5, 6, 8, 3, 7, 10);
    ArrayList<Integer> integers1 = new ArrayList<>();
    Optional<Integer> integerOptional = additionWithLimit(integers);
    if (integerOptional.isPresent()) {
      System.out.println(integerOptional.get());
    }

    Optional<Integer> integerOptional1 = additionWithSkip(integers);
    if (integerOptional1.isPresent()) {
      System.out.println(integerOptional1.get());
    }
  }
}
