package com.pz.dates;

import java.time.Duration;
import java.time.Instant;

public class InstantExample {
  public static void main(String[] args) {

    Instant instant = Instant.now();
    System.out.println("Instant : " + instant);

    System.out.println(" getEpochSecond: "+instant.getEpochSecond());

    // Instant epoch time started from 1-jan 1970
    System.out.println(Instant.ofEpochSecond(0));
      Instant instant1 = Instant.now();
      Duration duration = Duration.between(instant, instant1);
      System.out.println("diff : "+duration.toNanos());
  }
}
