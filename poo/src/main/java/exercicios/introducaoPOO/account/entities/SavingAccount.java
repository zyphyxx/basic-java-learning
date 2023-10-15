package exercicios.introducaoPOO.account.entities;

public class SavingAccount extends Account{

    private final Double interestRate;

    public SavingAccount(Integer number, String holder, Double balance) {
        super(number, holder, balance);
        interestRate = 0.06;
    }

    public void updateBalance(){
        double valor = getBalance() * interestRate;
        setBalance(getBalance() + valor);
        System.out.println("O juros da conta poupança rendeu "+ valor+" R$");
        System.out.println("Saldo: " +getBalance() +" R$");
    }

    @Override
    public void withdraw(Double amount) {
        super.withdraw(amount);
        System.out.println("Saldo: " +getBalance() +" R$");
    }
}
