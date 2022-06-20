package com.pz.defaults;

public interface Interface3 {

    default void methodeC(){
        System.out.println("inside interface 3"+Interface3.class);
    }

}
