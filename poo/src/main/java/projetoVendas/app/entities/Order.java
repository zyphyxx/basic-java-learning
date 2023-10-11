package projetoVendas.app.entities;

import projetoVendas.app.MainProduct;
import projetoVendas.app.enums.OrderStatus;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.function.ToDoubleBiFunction;

public class Order {


    private OrderStatus status;
    private Client client;
    private List<OrderItem> items = new ArrayList<>();

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


    @Override
    public String toString() {
        return "Order{" +
                "status=" + status +
                ", client=" + client +
                ", items=" + items +
                '}';
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public void show(OrderItem item){
        System.out.print("Cliente: " + client.getName()
        + "- "+ client.getEmail());
        for (OrderItem x : items){
            System.out.print("Quantidade: "+ x.getQuantity() + "preço: "+ x.getPrice());
        }
    }
}
