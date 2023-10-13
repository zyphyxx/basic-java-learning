package exercicios.introducaoPOO.ConversorDeDollar;

public class Conversor {

    // methods
    public static double valorPagar(double dollarHoje,double qtdComprar){
       double valor = dollarHoje * qtdComprar;
        return (valor / 100 * 6) + valor;
    }
}
