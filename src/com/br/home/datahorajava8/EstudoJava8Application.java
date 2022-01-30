package com.br.home.datahorajava8;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.chrono.ChronoLocalDate;
import java.time.temporal.ChronoUnit;

public class EstudoJava8Application {

  public static void main(String[] args) {

    //LocalDate - representar uma data: 06/12/1998
    LocalDate date1 = LocalDate.now();
    System.out.println(date1);
    LocalDate date2 = LocalDate.of(1998, Month.DECEMBER, 6);
    System.out.println(date2);

    System.out.println(date1.isBefore(date2));


    //LocalTime - representa uma hora: 11:40:00
    LocalTime time1 = LocalTime.now();
    System.out.println(time1);


    //LocalDateTime - representa data + hora: 06/12/1998 11:40:00
    LocalDateTime localDateTime1 = LocalDateTime.now();
    System.out.println(localDateTime1);
    LocalDateTime.of(date1, time1);


    //Instant - representa um instante/momento na linha do tempo (milissegundos a partir de 01/01/1970)
    //Instant não aceita plus em Months.
    Instant instant1 = Instant.now();
    System.out.println(instant1);

    Instant instant2 = Instant.ofEpochMilli(50000000000L);
    System.out.println(instant2);

    instant1.plus(1, ChronoUnit.MONTHS);



    //ZonedDateTime - LocalDateTime com TimeZone (fuso horário) 06/12/1998 11:40:00 GMT-3 (America/Sao_Paulo)
    ZonedDateTime zonedDateTime = ZonedDateTime.now();
    System.out.println(zonedDateTime);
    ZonedDateTime.of(localDateTime1, ZoneId.systemDefault());

    // Nenhuma dessas classes tem construtor

  }

}
