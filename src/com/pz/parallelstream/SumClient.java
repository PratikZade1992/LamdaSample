package com.pz.parallelstream;

import java.util.stream.IntStream;

public class SumClient {

  public static void main(String[] args) {

      Sum sum=new Sum();

      IntStream.rangeClosed(1,1000)
              .forEach(sum::performSum);
    for (int i = 0;i < 100; i++) {
        System.out.println("sequential sum is : "+ sum.getTotal());

        Sum sum1=new Sum();

        IntStream.rangeClosed(1,1000)
                .parallel()// not necessarily give always correct response
                .forEach(sum1::performSum);

        System.out.println("parallel sum is : "+ sum1.getTotal());
    }


     // sequential sum is : 500500
     // parallel sum is : 469859

    //  sequential sum is : 500500
     // parallel sum is : 475562

  }
}
