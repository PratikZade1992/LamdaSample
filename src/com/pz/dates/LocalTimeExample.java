package com.pz.dates;

import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

/** The type Local time example. */
public class LocalTimeExample {

  /**
   * The entry point of application.
   *
   * @param args the input arguments
   */
  public static void main(String[] args) {

    LocalTime localTime = LocalTime.now();
    System.out.println("local time :" + localTime);

    LocalTime localTime1 = LocalTime.of(12, 33);
    System.out.println("local time1 :" + localTime1);

    LocalTime localTime2 = LocalTime.of(12, 33, 20);
    System.out.println("local time2 :" + localTime2);

    LocalTime localTime3 = LocalTime.of(12, 33, 20, 3333333);
    System.out.println("localTime3 :" + localTime3);

    // getting value from Local time
    System.out.println(" getHour : " + localTime.getHour());
    System.out.println(" getSecond : " + localTime.getSecond());
    System.out.println(" CLOCK_HOUR_OF_AMPM : " + localTime.get(ChronoField.CLOCK_HOUR_OF_AMPM));
    System.out.println(" CLOCK_HOUR_OF_DAY : " + localTime.get(ChronoField.CLOCK_HOUR_OF_DAY));
    System.out.println(" CLOCK_HOUR_OF_DAY : " + localTime.toSecondOfDay());

    // modifying the time

    System.out.println("minusHours: "+localTime.minusHours(2));
    System.out.println("minusHours with ChronoUnit: "+localTime.minus(2,ChronoUnit.HOURS));
    System.out.println("MIDNIGHT: "+localTime.with(LocalTime.MIDNIGHT));
    System.out.println("HOUR_OF_DAY: "+localTime.with(ChronoField.HOUR_OF_DAY,22));
    System.out.println("withHour: "+localTime.withHour(4));

  }
}
