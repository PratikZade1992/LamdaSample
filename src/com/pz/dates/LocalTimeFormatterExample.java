package com.pz.dates;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalTimeFormatterExample {
  private static void LocalTimeParser() {
    String time="20:33";

    LocalTime localTime = LocalTime.parse(time);
    System.out.println("localTime :"+localTime);

    LocalTime localTime1 = LocalTime.parse(time, DateTimeFormatter.ISO_LOCAL_TIME);
    System.out.println("localTime1 :"+localTime1);

    String format2="13*14*14";
    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH*mm*ss");
    LocalTime localTime2 = LocalTime.parse(format2, dateTimeFormatter);

    System.out.println("localTime2 :"+localTime2 );
  }

  private static void LocalTimeFormat() {
    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH*mm*ss");
    String formatDate = LocalTime.now().format(dateTimeFormatter);
    System.out.println("formatDate :"+formatDate);
  }

  public static void main(String[] args) {

    LocalTimeFormat();
    LocalTimeParser();
  }
}
