package exercicios.colecoes.generics.exemplo.service;

import java.util.ArrayList;
import java.util.List;

public class PrintService <T> {

    List<T>list = new ArrayList<>();

    public void addValue (T value){
        list.add(value);
    }

    public T first (){
      return list.get(0);
    }

    public void print(){
        System.out.println(list);
        System.out.println("First: " + first());
    }
}
