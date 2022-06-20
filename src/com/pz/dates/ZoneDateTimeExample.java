package com.pz.dates;

import java.time.*;

public class ZoneDateTimeExample {

  public static void main(String[] args) {

    ZonedDateTime zonedDateTime = ZonedDateTime.now();
    System.out.println(zonedDateTime);

    // get value from zonedatetime
    System.out.println("getZone :"+zonedDateTime.getZone());
    System.out.println("getOffset :"+zonedDateTime.getOffset());

    //ZoneId.getAvailableZoneIds().forEach(System.out::println);
    System.out.println("no of Zone : "+ZoneId.getAvailableZoneIds().size());

    // Asia/Calcutta
    System.out.println("IST ZONE :"+ZonedDateTime.ofInstant(Instant.now(),ZoneId.of("Asia/Calcutta")));
      //Asia/Aden
    System.out.println("Asia/Aden :"+ZonedDateTime.now(ZoneId.of("Asia/Aden")));
      //America/Cuiaba
    System.out.println("America/Cuiaba :"+ZonedDateTime.now(ZoneId.of("America/Cuiaba")));
      //Europe/London
    System.out.println("Europe/London :"+ZonedDateTime.now(ZoneId.of("Europe/London")));

    System.out.println("Zone date time using clock : "+ZonedDateTime.now(Clock.system(ZoneId.of("Europe/London"))));

    LocalDateTime dateTime = LocalDateTime.now(ZoneId.of("Europe/London"));
    System.out.println("Europe/London datetime : "+dateTime);

    Instant instant = Instant.now(Clock.system(ZoneId.of("Europe/London")));
    System.out.println(" ZoneId.of(\"Europe/London\") : "+instant);
  }
}
