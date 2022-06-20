package com.pz.defaults;

import java.util.Arrays;
import java.util.List;

public class MultiplierClient {
  public static void main(String[] args) {
      List<Integer> integers = Arrays.asList(1, 3, 5);
      Multiplier multiplier=new MultiplierImpl();

      System.out.println("multiplier result is : "+multiplier.multiply(integers));
      System.out.println("size is : "+multiplier.size(integers));
      System.out.println("is not empty : "+Multiplier.isNotEmpty(integers));

  }
}
