package model;
import java.io.Serializable;


public class state implements Serializable{

    private String nome;
    private String descricao;
    private String area;
    private String populacao;

    public state(String nome, String descricao, String area, String populacao) {
        this.nome = nome;
        this.descricao = descricao;
        this.area = area;
        this.populacao = populacao;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getArea() {
        return area;
    }

    public String getPopulacao() {
        return populacao;
    }
}
