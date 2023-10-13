package exercicios.introducaoPOO.aluno;

public class Aluno {

    private String nome;
    private double notaA;
    private double notaB;
    private double notaC;
    private static double notaFinal;

    // constructor

    public Aluno(String nome, double notaA, double notaB, double notaC) {
        this.nome = nome;
        this.notaA = notaA;
        this.notaB = notaB;
        this.notaC = notaC;
    }

    public static double getNotaFinal() {
        return notaFinal;
    }

    public static void setNotaFinal(double notaFinal) {
        notaFinal = notaFinal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static double getNotaA() {
        return getNotaA();
    }

    public void setNotaA(double notaA) {
        this.notaA = notaA;
    }

    public static double getNotaB() {
        return getNotaB();
    }

    public void setNotaB(double notaB) {
        this.notaB = notaB;
    }

    public static double getNotaC() {
        return ge;
    }

    public void setNotaC(double notaC) {
        this.notaC = notaC;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", notaA=" + notaA +
                ", notaB=" + notaB +
                ", notaC=" + notaC +
                ", notaFinal=" + notaFinal +
                '}';
    }

    // methods
    public static void notaFinal(){

        setNotaFinal((getNotaA()+ getNotaB() + getNotaC()) / 3);
        if (notaFinal > 60) {
            System.out.println("PASS");
            System.out.println("FINAL GRADE = " + getNotaFinal());
        } else {

            double media = 60.00 - getNotaFinal();
            System.out.println("FINAL GRADE = " + getNotaFinal());
            System.out.println("FAILED");
            System.out.println("MISSING "+ media + " POINTS" );
        }

    }

    public static void metodoEstatico(){
        System.out.println("oi");
    }
}
