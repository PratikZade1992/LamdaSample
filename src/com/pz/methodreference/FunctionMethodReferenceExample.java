package com.pz.methodreference;

import java.util.function.Function;

public class FunctionMethodReferenceExample {

    static Function<String,String> functionWithLamda=(str)->str.toUpperCase();
    static Function<String,String> functionWithMethodeReference= String::toUpperCase;

  public static void main(String[] args) {
    System.out.println(functionWithLamda.apply("hey"));


      System.out.println(functionWithMethodeReference.apply("how are you"));
  }
}
