package com.br.home.datahorajava8;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;

public class PeriodDurationApplication {

  public static void main(String[] args) {



    //Para guardar um período de tempo: P1Y4M8D (1 year, 4 months, 8 days)
    //Period trabalha com DATA!
    Period period = Period.of(1, 12, 06);
    System.out.println(period);

    Period period1 = Period.ofDays(50);
    System.out.println(period1);


    Period period2 = Period.ofMonths(12);
    System.out.println(period2);

    LocalDate date1 = LocalDate.now();
    System.out.println(date1);
    LocalDate date2 = LocalDate.of(1998, Month.DECEMBER, 6);
    System.out.println(date2);

    Period between = date1.until(date2);
    System.out.println(between);


    LocalDate plus = date1.plus(period2);
    System.out.println(plus);


    //Duration - Trabalha com Tempo - horas, minutos e segundos e nanosegundos.

    System.out.println("-------------- DURATION --------------");

    Duration duration1 = Duration.ofDays(2);
    System.out.println(duration1);

    Duration duration2 = Duration.ofHours(1);
    System.out.println(duration2);

    Duration duration3 = Duration.ofMinutes(500);
    System.out.println(duration3);


    // Hours Diff

    LocalTime time1 = LocalTime.now();
    LocalTime time2 = LocalTime.of(11, 10, 1);

    Duration diff = Duration.between(time1, time2);
    System.out.println(diff);

  }

}
