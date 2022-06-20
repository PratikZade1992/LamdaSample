package com.pz.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAmount;

public class LocalDateTimeExample {
  public static void main(String[] args) {

    System.out.println("LocalDateTime.MAX :" + LocalDateTime.MAX);
    LocalDateTime localDateTime = LocalDateTime.now();
    System.out.println("localDateTime :" + localDateTime);

    LocalDateTime localDateTime1 = LocalDateTime.of(2020, 12, 21, 12, 12, 12, 20202020);
    System.out.println("localDateTime1 :" + localDateTime1);

    LocalDateTime localDateTime2 = LocalDateTime.of(LocalDate.now(), LocalTime.now());
    System.out.println("localDateTime2 :" + localDateTime2);

    // Fetching value form date time

    System.out.println("getHour :"+localDateTime.getHour());
    System.out.println("getMonth :"+localDateTime.getMonth());
    System.out.println("getDayOfMonth :"+localDateTime.getDayOfMonth());
    System.out.println("DAY_OF_YEAR :"+localDateTime.get(ChronoField.DAY_OF_YEAR));

    // Modifying date time


    System.out.println(" plusHours :"+localDateTime.plusHours(2));
    System.out.println(" minusDays :"+localDateTime.minusDays(2));
    System.out.println(" withMonth :"+localDateTime.withMonth(2));

    // Getting Localdatetime from local date and local time and vice versa

    LocalDate localDate = LocalDate.of(2011, 12, 12);
    System.out.println( " atTime: "+localDate.atTime(10,11));

    LocalTime localTime= LocalTime.of(22,22,22,1231);
    LocalDateTime localDateTime3 = localTime.atDate(LocalDate.of(1992, 02, 26));
    System.out.println("localDateTime3 :"+localDateTime3);

    System.out.println(" toLocalDate : "+localDateTime3.toLocalDate());
    System.out.println(" toLocalTime : "+localDateTime3.toLocalTime());
  }
}
