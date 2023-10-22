package exercicios.colecoes.map.application;

import java.util.Map;
import java.util.TreeMap;

public class Program {
    public static void main(String[] args) {

        Map<String,String> cookies = new TreeMap<>();
        cookies.put("username","Maria");
        cookies.put("email", "maria@gmail.com");
        cookies.put("phone", "99711122");

        cookies.put("phone", "99771133");

        System.out.println("ALL COKKIES: ");
        for (String key : cookies.keySet()){
            System.out.println(key + ": "+ cookies.get(key));
        }

    }
}
