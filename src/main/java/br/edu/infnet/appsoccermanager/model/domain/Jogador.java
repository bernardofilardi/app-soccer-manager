package br.edu.infnet.appsoccermanager.model.domain;

import javax.persistence.*;

@Entity
@Table(name = "jogador")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Jogador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private Float peso;
    private Float altura;
    private String analise;

    @Override
    public String toString() {
        return  id + ";" + nome + ';' + peso + ";" + altura + ";" + analise;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }

    public Float getAltura() {
        return altura;
    }

    public void setAltura(Float altura) {
        this.altura = altura;
    }

    public String getAnalise() {
        return analise;
    }

    public void setAnalise(String analise) {
        this.analise = analise;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
