package com.pz.defaults;

import java.util.*;
import java.util.stream.Collectors;

public class DefaultExample {

  public static void main(String[] args) {

      List<String> arrayList= Arrays.asList("Ajay","Robin","Tresa","Alex","Ronny","Karan","Rohan");

    // Prior Java 8
      Collections.sort(arrayList);
    System.out.println("Prior sort example : "+ arrayList);

    // In Java 8
  //In List we have multiple 3 default methode has added
      arrayList.sort(Comparator.naturalOrder());
    System.out.println("Array List in ascending order/natural order : "+arrayList);
      arrayList.sort(Comparator.reverseOrder());

    System.out.println("Array List in descending order/reverse  order : "+arrayList);
  }
}
