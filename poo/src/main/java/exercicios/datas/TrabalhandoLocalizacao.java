package exercicios.datas;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class TrabalhandoLocalizacao {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();

        DateTimeFormatter localDateTimeFormatter = DateTimeFormatter.ofPattern("dd MMMM yyyy", new Locale("PT","br"));
        System.out.println("Data formatada BR: " + localDateTime.format(localDateTimeFormatter));

    }
}
