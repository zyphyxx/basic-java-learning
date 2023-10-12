package minisistema;

import java.util.ArrayList;
import java.util.List;

public class Cadastro {

    private String nome;
    private String sobrenome;


    public Cadastro(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public Cadastro() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    @Override
    public String toString() {
        return "Cadastro{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", lista=" + lista +
                '}';
    }

    List<Cadastro> lista = new ArrayList<>();

    public void criar(){
        for (Cadastro alunos : lista){
        System.out.println("Nomes:"+ alunos.getNome());
        System.out.println("Sobrenomes:"+ alunos.getSobrenome());}
    }

}
