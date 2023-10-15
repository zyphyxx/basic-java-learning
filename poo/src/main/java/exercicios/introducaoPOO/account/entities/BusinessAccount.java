package exercicios.introducaoPOO.account.entities;

public class BusinessAccount extends Account {

    private Double loanLimit;


    public BusinessAccount(Integer number, String holder, Double balance) {
        super(number, holder, balance);
        loanLimit = 1000.00;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void loan(double amount) {
        System.out.println("Limite de emprestimo: " + getLoanLimit());

        if (amount > loanLimit) {
            System.out.println(getHolder()+" não tem limite para efetuar o emprestimo");

        } else {
            setBalance(getBalance() + amount);
            System.out.println(getHolder()+" pegou um emprestimo de " + amount + "R$");
            System.out.println("Saldo: " + getBalance() + " R$");
        }
    }
}
