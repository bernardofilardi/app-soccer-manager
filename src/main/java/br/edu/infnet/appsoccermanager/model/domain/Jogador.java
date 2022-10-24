package br.edu.infnet.appsoccermanager.model.domain;

public abstract class Jogador {

    String nome;
    Float peso;
    Float altura;
    String analise;

    @Override
    public String toString() {
        return  nome + ';' + peso + ";" + altura + ";" + analise;
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
}
