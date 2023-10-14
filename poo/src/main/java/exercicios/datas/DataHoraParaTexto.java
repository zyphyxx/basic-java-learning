package exercicios.datas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DataHoraParaTexto {
    public static void main(String[] args) {

       DateTimeFormatter diaMesAnoHoras = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
       DateTimeFormatter diaMesAno = DateTimeFormatter.ofPattern("dd/MM/yyyy");

       LocalDateTime ldt = LocalDateTime.parse("2022-07-20T19:16");
       LocalDate ld = LocalDate.parse("2023-10-14");

        System.out.println(ldt.format(diaMesAnoHoras));

        System.out.println(ld.format(diaMesAno));
    }
}
