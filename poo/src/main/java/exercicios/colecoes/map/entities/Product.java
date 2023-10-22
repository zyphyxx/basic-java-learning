package exercicios.colecoes.map.entities;

import java.util.Objects;

public class Product {

    private String name;
    private Double valor;

    public Product(String name, Double valor) {
        this.name = name;
        this.valor = valor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;
        return Objects.equals(getName(), product.getName()) && Objects.equals(getValor(), product.getValor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getValor());
    }
}
