package com.pz.dates;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class ComperingTimeDurationExample {

   /**
    * Duration is applicable for hour, minute ,second and nano second
    *
    * */
  public static void main(String[] args) {
      LocalTime localTime1 = LocalTime.of(6, 5, 30);
      LocalTime localTime2 = LocalTime.of(18, 5, 30);

      long diff = localTime1.until(localTime2, ChronoUnit.HOURS);
    System.out.println("diff : "+diff);

      Duration duration = Duration.between(localTime1, localTime2);

      System.out.println("duration toMinutes "+duration.toMinutes());

      Duration duration1 = Duration.ofHours(10);
    System.out.println("duration of Hours : "+duration1.toMinutes());

      LocalDate localDate = LocalDate.now();
      LocalDate localDate2 = LocalDate.now().plusMonths(2);

      Duration.between(localDate,localDate2);// it will give compile time error  as type not supported 

  }
}
