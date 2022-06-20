package com.pz.dates;

import java.time.LocalDate;
import java.time.temporal.*;

public class LocalSateExample {
  public static void main(String[] args) {
    LocalDate localDate = LocalDate.now();
    System.out.println("Current date : " + localDate);
    LocalDate oLocalDate1f = LocalDate.of(1994, 3, 4);
    System.out.println("oLocalDate1f : " + oLocalDate1f);
    LocalDate localDate2 = LocalDate.ofYearDay(2021, 365);
    System.out.println("localDate2 : " + localDate2);

    /*
    get value form locale date
     */
    System.out.println("getChronology : "+localDate.getChronology());
    System.out.println("getDayOfMonth : "+localDate.getDayOfMonth());
    System.out.println("getMonth : "+localDate.getMonth());
    System.out.println("getEra : "+localDate.getEra());
    System.out.println("getEra : " + localDate.get(ChronoField.DAY_OF_MONTH));

    // Modifying local date
    System.out.println("Adding days : "+localDate.plusDays(1));
    System.out.println("Adding month : "+localDate.plusMonths(2));
    System.out.println("Adding year : "+localDate.plusYears(2));
    System.out.println("Adding with date  : "+localDate.withYear(1992));

    System.out.println("Adding with ChronoField  : "+localDate.with(ChronoField.YEAR,1994));
    System.out.println("Adding with TemporalAdjusters  : "+localDate.with(TemporalAdjusters.lastDayOfMonth()));
    System.out.printf("subtracting  with TemporalAdjusters  : %s%n", localDate.minus(1, ChronoUnit.YEARS));

    // supportive methode

    System.out.println("is leap year  : "+LocalDate.ofYearDay(2024,1).isLeapYear());
    System.out.println("is equal  : "+localDate.isEqual(localDate2));
    System.out.println("is isBefore  : "+localDate.isBefore(localDate2));

    // unsupported we can not perform time operation on local date
    //System.out.printf("subtracting  with TemporalAdjusters  : %s%n", localDate.minus(1, ChronoUnit.MINUTES));
    System.out.printf("is supported"+ localDate.isSupported(ChronoUnit.HOURS));



  }
}
