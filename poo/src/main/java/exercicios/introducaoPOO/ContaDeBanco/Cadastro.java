package exercicios.introducaoPOO.ContaDeBanco;

public class Cadastro {

    // var
    int numConta;
    String nome;
    String depositoInicial;
    double deposito;
    double saldo;

    // constructor
    public Cadastro(){}

    // getters and setters

    public double getSaldo() {
        return saldo;
    }
    private void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public int getNumConta() {
        return numConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepositoInicial() {
        return depositoInicial;
    }

    public double getDeposito() {
        return deposito;
    }

    // toString

    @Override
    public String toString() {
        return "Cadastro{" +
                "numConta=" + getNumConta()+
                ", nome='" + getNome() + '\'' +
                ", depositoInicial='" + getDepositoInicial() + '\'' +
                ", deposito=" + getDeposito() +
                ", saldo=" + getSaldo() +
                '}';
    }

    // metodos

    public void infoConta (){
        System.out.println("--------- INFORMAÇOES DA CONTA -------");
        System.out.print("Conta: " + getNumConta()+"," +
                        " Usuario: "+ getNome() +
                        " Saldo: "+ getSaldo() +" R$");
        System.out.println(" ");
    }

    public void depositar (double valor) {
        setSaldo(getSaldo() + valor);
        System.out.println("----------- DEPOSITO -----------------");
        System.out.println("Entre com o valor do deposito: "+ valor);
        System.out.println("     ");
        System.out.println("Saldo atualizado: ");
        System.out.print ("Conta: "+getNumConta()+"," +
                            " Usuario: " + getNome() +
                            " Saldo: " + getSaldo()+ "R$");
        System.out.println(" ");

    }

    public void retirar(double valor){
        setSaldo(getSaldo() - valor);
        System.out.println("----------- RETIRAR -----------------");
        System.out.println("Entre com o valor do deposito: "+ valor);
        System.out.println("     ");
        System.out.println("Saldo atualizado: ");
        System.out.print ("Conta: "+getNumConta()+"," +
                " Usuario: " + getNome() +
                " Saldo: " + getSaldo()+ "R$");
        System.out.println(" ");
    }
}
