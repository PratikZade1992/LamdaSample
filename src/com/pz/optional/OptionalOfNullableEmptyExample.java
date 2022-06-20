package com.pz.optional;

import java.util.Optional;

/** The type Optional of nullable empty example. */
public class OptionalOfNullableEmptyExample {
  /**
   *
   * in case of nullable we can set null value so if we are not sure of the v value then we can used ofNullable
   */
    private static Optional<String> ofNullable(){
      return Optional.ofNullable("Hello");
  }
  /**
   *
   * when we are sure if we always get the value in that case we can used of
   * if we pass null then it will give null pointer
   * */
  private static Optional<String> of(){
      return Optional.of("Hello");
  }

  /**
   * it is empty optional object
   *
   * */
  private static Optional<String> empty(){
      return Optional.empty();
  }

  /**
   * The entry point of application.
   *
   * @param args the input arguments
   */
  public static void main(String[] args) {
    System.out.println("of nullable "+ofNullable());
    System.out.println("of : "+of());
    System.out.println("empty : "+empty());
  }
}
