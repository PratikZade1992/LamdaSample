package com.pz.defaults;

import java.util.List;

public interface Multiplier {
    int multiply(List<Integer> integerList);

    default int size(List<Integer> integerList){
    System.out.println("inside Multiplier interface");
        return integerList.size();
    }

    static boolean isNotEmpty(List<Integer> integerList){
        return integerList !=null && integerList.size()>0;
    }
}
