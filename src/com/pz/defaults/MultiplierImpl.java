package com.pz.defaults;

import java.util.List;

public class MultiplierImpl implements Multiplier{
    @Override
    public int multiply(List<Integer> integerList) {
        return integerList.stream()
                .reduce(1,(x,y)->x*y);
    }
    public int size(List<Integer> integerList){
        System.out.println("inside MultiplierImpl");
        return integerList.size();
    }

}
