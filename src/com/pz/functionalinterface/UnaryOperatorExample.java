package com.pz.functionalinterface;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
// executable class
  public static void main(String[] args) {

      // Unary operator used when input and output is same type

    UnaryOperator<String> integerUnaryOperator=(str)->str.toUpperCase();
    System.out.println(integerUnaryOperator.apply("helloo"));
  }
}
