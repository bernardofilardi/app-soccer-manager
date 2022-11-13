package br.edu.infnet.appsoccermanager.model.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "escalacao")
public class Escalacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String descricao;
    private String organizacao;
    private boolean utilizada_anteriormente;
    private String analise;

    @Transient
    private Tecnico tecnico;

    @Transient
    private List<Jogador> jogadores;

    public Escalacao(Tecnico tecnico) {
        this.setTecnico(tecnico);
    }

    public Escalacao() {

    }

    @Override
    public String toString() {
        return descricao + ';' + organizacao + ';' + utilizada_anteriormente + ";" + analise + ";" + tecnico;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getOrganizacao() {
        return organizacao;
    }

    public void setOrganizacao(String organizacao) {
        this.organizacao = organizacao;
    }

    public boolean isUtilizada_anteriormente() {
        return utilizada_anteriormente;
    }

    public void setUtilizada_anteriormente(boolean utilizada_anteriormente) {
        this.utilizada_anteriormente = utilizada_anteriormente;
    }

    public String getAnalise() {
        return analise;
    }

    public void setAnalise(String analise) {
        this.analise = analise;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }

    public List<Jogador> getJogadores() {
        return jogadores;
    }

    public void setJogadores(List<Jogador> jogadores) {
        this.jogadores = jogadores;
    }


}
