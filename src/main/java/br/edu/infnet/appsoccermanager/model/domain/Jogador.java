package br.edu.infnet.appsoccermanager.model.domain;

public abstract class Jogador {

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
