package br.edu.infnet.appsoccermanager.model.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nome;
    private String email;
    private String senha;

    @OneToMany
    @JoinColumn(name = "idUsuario")
    private List<Tecnico> tecnicos;
    @OneToMany
    @JoinColumn(name = "idUsuario")
    private List<Escalacao> escalacoes;
    @OneToMany
    @JoinColumn(name = "idUsuario")
    private List<Jogador> jogadores;
    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "idendereco")
    private Endereco endereco;


    @Override
    public String toString() {
        return id + ";" + nome + ";" + email + ";" + senha;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public List<Tecnico> getTecnicos() {
        return tecnicos;
    }

    public void setTecnicos(List<Tecnico> tecnicos) {
        this.tecnicos = tecnicos;
    }

    public List<Escalacao> getEscalacoes() {
        return escalacoes;
    }

    public void setEscalacoes(List<Escalacao> escalacoes) {
        this.escalacoes = escalacoes;
    }

    public List<Jogador> getJogadores() {
        return jogadores;
    }

    public void setJogadores(List<Jogador> jogadores) {
        this.jogadores = jogadores;
    }
}