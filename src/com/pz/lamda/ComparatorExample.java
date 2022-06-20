package com.pz.lamda;

import java.util.Comparator;

/** The type Comparator example. */
public class ComparatorExample {
  /**
   * The entry point of application.
   *
   * @param args the input arguments
   */
  public static void main(String[] args) {
    // sample to compare two integer
   // legacy way
    Comparator<Integer> comparator =new Comparator<Integer>() {
      @Override
      public int compare(Integer o1, Integer o2) {
        return o2.compareTo(o1);
      }
    };
    System.out.println("Comparing two integer legacy way : "+comparator.compare(1,2));

    // Lambda 1
     Comparator<Integer> comparatorLamda=(Integer a,Integer b)->b.compareTo(a);

    System.out.printf("Comparing using comparator using lamda 1: "+comparatorLamda.compare(1,2));

    // Lambda 2
     Comparator<Integer> comparatorLamda1=(a,b)->b.compareTo(a);

    System.out.printf("Comparing using comparator using lamda 2: "+comparatorLamda1.compare(1,2));
  }
}
