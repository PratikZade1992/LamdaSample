package com.pz.dates;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

/** The type Compering local date with period. */
public class ComperingLocalDateWithPeriod {

  public static void main(String[] args) {
    LocalDate localDate1 = LocalDate.of(2020, 03, 12);
    LocalDate localDate2 = LocalDate.of(2021, 02, 9);
    Period period = localDate1.until(localDate2);
    System.out.println("period : " + period);
    System.out.println("getDays : "+period.getDays());
    System.out.println("getMonths : "+period.getMonths());

      Period period1 = Period.between(localDate1, localDate2);

      System.out.println("period1 : " + period1.getDays());
    Period period2 = Period.ofDays(20);
    System.out.println("period2.getDays() : "+period2.getDays());


    Period period3 = Period.ofYears(20);
    System.out.println("period3.years : "+period3.getYears());
    System.out.println("period3.years : "+period3.toTotalMonths());

    // Period.between(LocalTime.now(),LocalTime.now().plusHours(24)); Period is  not support Time
  }
}
