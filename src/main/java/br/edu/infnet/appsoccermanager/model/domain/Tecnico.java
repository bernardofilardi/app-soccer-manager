package br.edu.infnet.appsoccermanager.model.domain;

public class Tecnico {

    private String nome;
    private int idade;
    private int tempo_carreira;

    @Override
    public String toString() {
        return nome + ';' + idade + ";" + tempo_carreira;
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
}
