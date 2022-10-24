package br.edu.infnet.appsoccermanager.model.domain;

public class Atacante extends Jogador {

    private boolean atua_meiocampo;
    private float acerto_finalizacao;

    @Override
    public String toString() {
        return super.toString() + ";" + atua_meiocampo + ";" + acerto_finalizacao;
    }

    public boolean isAtua_meiocampo() {
        return atua_meiocampo;
    }

    public void setAtua_meiocampo(boolean atua_meiocampo) {
        this.atua_meiocampo = atua_meiocampo;
    }

    public float getAcerto_finalizacao() {
        return acerto_finalizacao;
    }

    public void setAcerto_finalizacao(float acerto_finalizacao) {
        this.acerto_finalizacao = acerto_finalizacao;
    }
}
