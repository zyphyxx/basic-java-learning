package projetoVendas.app.entities;

import projetoVendas.app.MainProduct;
import projetoVendas.app.enums.OrderStatus;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.function.ToDoubleBiFunction;

public class Order {

    private String moment;
    private OrderStatus status;
    private Client client;
    private List<OrderItem> items = new ArrayList<>();

    public Order() {
    }

    public Order(String moment, OrderStatus status, Client client) {
        this.status = status;
        this.client = client;
    }

    public String getMoment() {
        return moment;
    }

    public void setMoment(String moment) {
        this.moment = moment;
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

    public List<OrderItem> getItems() {
        return items;
    }

    public void setItems(List<OrderItem> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Order{" +
                "moment='" + moment + '\'' +
                ", status=" + status +
                ", client=" + client +
                ", items=" + items +
                '}';
    }

    public void addItem (OrderItem item){

        //TODO
    }
    public void removeItem(OrderItem item){
        //TODO
    }
    public Double total(){
        return null;

    }

}
