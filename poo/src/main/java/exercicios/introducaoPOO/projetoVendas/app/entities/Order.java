package exercicios.introducaoPOO.projetoVendas.app.entities;

import exercicios.introducaoPOO.projetoVendas.app.enums.OrderStatus;

import java.util.ArrayList;
import java.util.List;

public class Order {


    private OrderStatus status;
    private Client client;

    List<OrderItem> listaDeItems = new ArrayList<>();

    public Order() {
    }

    public Order(OrderStatus status, Client client) {
        this.status = status;
        this.client = client;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }


    public void addItem(OrderItem item) {
        listaDeItems.add(item);
        for (OrderItem produtos : listaDeItems){
            System.out.print(produtos.getProduct()+", "+ produtos.getQuantity()+", "+ produtos.subTotal());
            System.out.println("Total price: " + total());
        }
    }

    public void removeItem(OrderItem item) {
        listaDeItems.remove(item);
    }

    public double total() {
        double total = 0.0;
        for (OrderItem item : listaDeItems) {
            total += item.subTotal();
        }
        return total;

    }

    public void summary(){
        for (OrderItem produtos : listaDeItems);
        System.out.println("total price: "+ total());
    }

}
