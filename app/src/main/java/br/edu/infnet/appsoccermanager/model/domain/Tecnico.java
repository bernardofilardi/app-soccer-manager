package br.edu.infnet.appsoccermanager.model.domain;

import javax.persistence.*;

@Entity
@Table(name = "tecnico")
public class Tecnico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private int idade;
    private int tempo_carreira;

    @OneToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;
    @Override
    public String toString() {
        return nome + ';' + idade + ";" + tempo_carreira;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getTempo_carreira() {
        return tempo_carreira;
    }

    public void setTempo_carreira(int tempo_carreira) {
        this.tempo_carreira = tempo_carreira;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
