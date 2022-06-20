package com.pz.functionalinterface;

import java.util.function.Function;

public class FunctionExample {

    static Function<String, String> functionUpper=(str)->str.toUpperCase();
    static Function<String, String> functionConcat2=(str)->str.concat(" junction");
    static Function<String, String> functionConcat=(str)->str.concat(" house");

  public static void main(String[] args) {
    System.out.println("Tu upper case : "+functionUpper.apply("power"));
    System.out.println("To concat case : "+functionConcat.apply("power"));

    System.out.println("And of function : "+functionUpper.andThen(functionConcat).apply("power"));

    System.out.println("And of try function : "+functionUpper.compose(functionConcat).apply("power"));

    System.out.println("And of try function : "+functionUpper.andThen(functionConcat).andThen(functionConcat).compose(functionConcat2).apply("power"));
  }

}
