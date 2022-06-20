package com.pz.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMAxAndMinValue {

    static Integer getMAxValue(List<Integer> integers){
        return integers.stream()//5, 6, 8, 3, 7, 10
                //b=5
                //b=6
                //b=8
                //b=3
                //b=7
                //b=10
                // a=0, b=5 ->return  5
                //a=5, b=6 ->return 6
                //a=6, b=8 ->return 8
                //a=8, b=3 ->return 8
                //.
                //.
                .reduce(0,(a,b)->a>b?a:b);
    }
    static Optional<Integer> getMAxValueOption(List<Integer> integers){
        return integers.stream()
                .reduce((a,b)->a>b?a:b);
    }
    static Optional<Integer> getMinValueOption(List<Integer> integers){
        return integers.stream()
                .reduce((a,b)->a>b?b:a);
    }

  public static void main(String[] args) {
      List<Integer> integers = Arrays.asList(5, 6, 8, 3, 7, 10);
      ArrayList<Integer> integers1 = new ArrayList<>();
      System.out.println("max value : "+getMAxValue(integers));
      System.out.println("max value with empty list : "+getMAxValue(integers1));// it will return 0 as value because ve set value of identity as 0

      Optional<Integer> mAxValueOption = getMAxValueOption(integers);
      if (mAxValueOption.isPresent()){
      System.out.println(mAxValueOption.get());
      }
      Optional<Integer> integerOptional = getMAxValueOption(integers1);
      if (integerOptional.isPresent()){
      System.out.println(integerOptional.get());
      }
      Optional<Integer> minValueOption = getMinValueOption(integers);
      if (minValueOption.isPresent()){
      System.out.println(minValueOption.get());
      }
  }
}
