package exercicios.datas;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DataHora {
    public static void main(String[] args) {

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate ld = LocalDate.now();
        LocalDateTime ldt = LocalDateTime.now();
        Instant ins = Instant.now();
        LocalDate ldp = LocalDate.parse("2023-07-20");
        LocalDateTime ldtp = LocalDateTime.parse("2023-07-20T01:30:26");

        LocalDate d08 = LocalDate.parse("14/10/2023", dateTimeFormatter);



        System.out.println(ld);
        System.out.println(ldt);
        System.out.println(ins);
        System.out.println(ldp);
        System.out.println(ldtp);
        System.out.println(d08);



    }
}
