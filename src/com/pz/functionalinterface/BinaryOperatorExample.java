package com.pz.functionalinterface;

import java.util.Comparator;
import java.util.function.BinaryOperator;

// example for binary operator
public class BinaryOperatorExample {

  static Comparator<Integer> comparator=(a,b)->a.compareTo(b);

  // executable main
  public static void main(String[] args) {

    // Binary Operator internally implement BiFunction interface
    BinaryOperator<Integer> multiply = (a, b) -> a * b;
    System.out.println("Binary operator example for multiply: " + multiply.apply(3, 4));

    // Binary Operator example for min by and max by
    BinaryOperator<Integer> minBy = BinaryOperator.minBy(comparator);
    BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(comparator);
    System.out.println("Binary operator example for min by: " + minBy.apply(3, 4));
    System.out.println("Binary operator example for max by: " + maxBy.apply(3, 4));


  }
}
