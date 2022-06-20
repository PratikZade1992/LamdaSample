package com.pz.optional;

import java.util.Optional;

public class OptionalPresentExample {
  public static void main(String[] args) {

      Optional<String> optionalS=Optional.ofNullable("hi there ");

      // isPresent
    System.out.println("is present : "+optionalS.isPresent());
    if (optionalS.isPresent()){
      System.out.println("the string is : "+optionalS.get());
    }

    //ifPresent
      optionalS.ifPresent(System.out::println);



  }
}
