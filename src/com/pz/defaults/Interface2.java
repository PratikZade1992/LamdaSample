package com.pz.defaults;

public interface Interface2 extends Interface1{

    default void methodeB(){
        System.out.println("inside interface 2 :"+Interface2.class);
    }

    default void methodeA(){
        System.out.println("inside interface 1 :"+Interface2.class);
    }
}
