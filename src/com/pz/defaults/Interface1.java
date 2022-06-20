package com.pz.defaults;

public interface Interface1 {

    default void methodeA(){
    System.out.println("inside interface 1"+Interface1.class);
    }
}
