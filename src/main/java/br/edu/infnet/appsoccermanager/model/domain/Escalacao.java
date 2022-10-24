package br.edu.infnet.appsoccermanager.model.domain;

public class Escalacao {

    private String descricao;
    private String organizacao;
    private boolean utilizada_anteriormente;
    private String analise;

    @Override
    public String toString() {
        return descricao + ';' + organizacao + ';' + utilizada_anteriormente + analise;
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
}
