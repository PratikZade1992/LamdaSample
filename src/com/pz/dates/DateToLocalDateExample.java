package com.pz.dates;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

public class DateToLocalDateExample {
  public static void main(String[] args) {

    Date date = new Date();
    System.out.println("date : " + date);

    // date to Local Date
    LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

    System.out.println("Date to Local date : " + localDate);

    Date date1 =
        Date.from(localDate.atTime(LocalTime.now()).atZone(ZoneId.systemDefault()).toInstant());
    localDate.atTime(LocalTime.now());

    System.out.println("Date1 :  " + date1);

    // local date to sql date

    java.sql.Date sqlDate= java.sql.Date.valueOf(localDate);
    System.out.println("Local date : "+sqlDate);

    // sql date to local date
    System.out.println("Local date from sql date : "+sqlDate.toLocalDate());
  }
}
