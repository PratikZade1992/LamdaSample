package com.pz.dates;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/** The type Date time formatter example. */
public class DateTimeFormatterExample {

  private static void LocalDateTimeFormatter() {
    DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("yyyy*MM*dd'T'HH|mm|ss");
    System.out.println(" Localdate Time : "+LocalDateTime.now().format(dateTimeFormatter));
  }

  private static void LocalDateTimeParser() {

    String dateTime="2020-12-12T10:10:10";

    LocalDateTime localDateTime = LocalDateTime.parse(dateTime);
    System.out.println("localDateTime : "+localDateTime);
    System.out.println("localDateTime with ISO "+LocalDateTime.parse(dateTime, DateTimeFormatter.ISO_LOCAL_DATE_TIME));

    //Custom Formatting

    String dateTime2="2020-12-12T10|10|10";
    DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH|mm|ss");
    System.out.println(" dateTimeFormatter : "+LocalDateTime.parse(dateTime2,dateTimeFormatter));

    String dateTime3="2020-12-12abc10|10|10";
    DateTimeFormatter dateTimeFormat3=DateTimeFormatter.ofPattern("yyyy-MM-dd'abc'HH|mm|ss");
    System.out.println(" dateTimeFormat3 : "+LocalDateTime.parse(dateTime3,dateTimeFormat3));
  }

  /**
   * The entry point of application.
   *
   * @param args the input arguments
   */
  public static void main(String[] args) {
    LocalDateTimeFormatter();
    LocalDateTimeParser();
  }
}
