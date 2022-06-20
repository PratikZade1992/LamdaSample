package com.pz.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateFormatterExample {

  public static void main(String[] args) {

    // formatter is used to convert object to string
    String formatDate = LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
    System.out.println("formatDate : " + formatDate);
    parseLocalDate();
    formatLocalDate();
  }

  static void parseLocalDate() {
    // string to Local date

    String date = "2011-12-03+01:00";
    LocalDate localDate = LocalDate.parse("2021-12-12");
    System.out.println("formatted date : " + localDate);
    LocalDate localDate1 = LocalDate.parse(date, DateTimeFormatter.ISO_OFFSET_DATE);
    System.out.println("localDate1 : " + localDate1);

    String basicDate = "20201203";
    LocalDate localDate2 = LocalDate.parse(basicDate, DateTimeFormatter.BASIC_ISO_DATE);
    System.out.println("localDate2 : " + localDate2);

    // Custom formatter date conversion
    String date2 = "12|12|2001";
    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MM|dd|yyyy");
    LocalDate localDate3 = LocalDate.parse(date2, dateTimeFormatter);
    System.out.println("localDate3 : " + localDate3);

    String date3 = "12*12*2001";
    DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("MM*dd*yyyy");
    LocalDate localDate4 = LocalDate.parse(date2, dateTimeFormatter);
    System.out.println("localDate3 : " + localDate4);
  }

  static void formatLocalDate() {
    DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("MM*dd*yyyy");

    String formatDate = LocalDate.now().format(dateTimeFormatter2);
    System.out.println("formatDate : " + formatDate);
  }
}
