package exercicios.introducaoPOO.account;

import exercicios.introducaoPOO.account.entities.Account;
import exercicios.introducaoPOO.account.entities.BusinessAccount;
import exercicios.introducaoPOO.account.entities.SavingAccount;

import java.util.Locale;

public class AppAccount {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Account account = new Account(1234,"Alex",0.0);
        BusinessAccount businessAccount = new BusinessAccount(32423,"Maria",0.0);
        SavingAccount savingAccount = new SavingAccount(53421,"Joao",0.0);

        // testando a classe account
        account.deposit(100.00);
        System.out.println();
        account.withdraw(50.00);

        // testando a classe businessAccount
        System.out.println();
        businessAccount.loan(1500.00);
        System.out.println();
        businessAccount.loan(900.00);

        // testando a classe savingAccount
        System.out.println();
        System.out.println(savingAccount.getBalance());
        System.out.println();
        savingAccount.deposit(200.00);
        savingAccount.updateBalance();
        savingAccount.withdraw(100.00);




    }
}
