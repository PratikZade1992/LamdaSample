package com.pz.functionalinterface;

import java.util.function.Predicate;

/** example of Predicate functional interface for boolean return */
public class PredicateExample {

    //for multiline statement
    static Predicate<Integer> predicate=(i)->{return i%2==0;};

    static Predicate<Integer> predicate1=(i)->i%5==0;
    static Predicate<Integer> predicate2=(i)->i%2==0;

    private static void predicateAnd(){
    System.out.println("Predicate and example : "+predicate1.and(predicate2).test(10));
    System.out.println("Predicate and example : "+predicate1.and(predicate2).test(5));
    }

    private static void predicateOr(){
    System.out.println("Predicate or example : "+predicate1.or(predicate2).test(10));
    System.out.println("Predicate or example : "+predicate1.or(predicate2).test(5));
    }

    //Negate is used to revers the out put
    private static void predicateNegate(){
        System.out.println("Predicate negate example : "+predicate1.or(predicate2).negate().test(5));
    }
  /**
   * The entry point of application.
   *
   * @param args the input arguments
   */
  public static void main(String[] args) {

    System.out.println("the eben predicate example "+predicate.test(6));

      predicateAnd();
      predicateOr();
      predicateNegate();

  }
}
