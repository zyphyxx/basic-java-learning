package exercicios.introducaoPOO.rental;


import java.time.LocalDateTime;

public class Rental extends Model{

   private LocalDateTime pickUp;
   private LocalDateTime returnn;

    public Rental(String carModel, LocalDateTime pickUp, LocalDateTime returnn) {
        super(carModel);
        this.pickUp = pickUp;
        this.returnn = returnn;
    }

    public LocalDateTime getPickUp() {
        return pickUp;
    }

    public void setPickUp(LocalDateTime pickUp) {
        this.pickUp = pickUp;
    }

    public LocalDateTime getReturnn() {
        return returnn;
    }

    public void setReturnn(LocalDateTime returnn) {
        this.returnn = returnn;
    }
}
