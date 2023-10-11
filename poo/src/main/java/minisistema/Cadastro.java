package minisistema;

import java.util.ArrayList;
import java.util.List;

public class Cadastro {

    private String nome;
    private String sobrenome;
    private List<Cadastro> lista = new ArrayList<>();


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
        return "cadastro{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                '}';
    }


    public void criar(){

    }

}
