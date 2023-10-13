package exercicios.introducaoPOO.projetoVendas.app.dao;

import exercicios.introducaoPOO.projetoVendas.app.entities.OrderItem;

public interface OrderDAO  {

    public void addItem (OrderItem item);

    public void removeItem(OrderItem item);

    public Double total();
}
