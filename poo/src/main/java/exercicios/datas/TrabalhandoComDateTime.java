package exercicios.datas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class TrabalhandoComDateTime {
    public static void main(String[] args) {

        // SOMENTE A DATA
        LocalDate localDate = LocalDate.now();
        System.out.println("localDate: " + localDate);

        // SOMENTE A HORA
        LocalTime localTime = LocalTime.now();
        System.out.println("localTime: "+ localTime);

        // DATA E HORA JUNTOS
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime: "+ localDateTime);

        System.out.println("Dia: " + localDateTime.getDayOfMonth());
        System.out.println("Mês: " + localDateTime.getMonthValue());
        System.out.println("Ano: " + localDateTime.getYear());

    }
}
