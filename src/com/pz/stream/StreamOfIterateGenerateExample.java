package com.pz.stream;

import java.io.Serializable;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamOfIterateGenerateExample {

  public static void main(String[] args) {
      // Stream of() example
      Stream<String> stringStream= Stream.of("Ash","Julee","mariya");
    stringStream.forEach(System.out::println);

    //Stream iterate()

      Stream.iterate(1,(x)->x*2) // can perform operation infinite time
              .limit(10) // to restrict operation
              .forEach(System.out::println);

      Supplier<Integer> integerSupplier=new Random()::nextInt;

      Stream.generate(integerSupplier)
              .limit(5)
              .forEach(System.out::println);


  }
}
