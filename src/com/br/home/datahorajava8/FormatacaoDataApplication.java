package com.br.home.datahorajava8;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.time.LocalTime.now;

public class FormatacaoDataApplication {

  public static void main(String[] args) {
    //Formatação de Datas.

    //DateTimeFormatter
    DateTimeFormatter isoDateTime = DateTimeFormatter.ISO_TIME;
    DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
    DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    LocalDateTime localDateTime = LocalDateTime.now();
    LocalDateTime localDateTime2 = LocalDateTime.now();
    LocalDateTime localDateTime3 = LocalDateTime.now();
    LocalDateTime localDateTime4 = LocalDateTime.now();
    List<LocalDateTime> times = Arrays.asList(localDateTime, localDateTime2, localDateTime3, localDateTime4);

    List<String> timesString = times.stream().map(formatter2::format).collect(Collectors.toList());


    System.out.println(localDateTime);

    String dateFormatted = formatter2.format(localDateTime);
    System.out.println(dateFormatted);
  }

}
