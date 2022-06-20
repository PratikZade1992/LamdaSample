package com.pz.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class NewDateTimeExample {

  public static void main(String[] args) {
    //Local date
      LocalDate localDate = LocalDate.now();
    System.out.println("Local date : "+localDate);
      //Local time
      LocalTime localTime=LocalTime.now();
    System.out.println("Local time : "+localTime);
    //Local date time
      LocalDateTime localDateTime=LocalDateTime.now();
    System.out.println("Local date time : "+localDateTime);
  }
}
