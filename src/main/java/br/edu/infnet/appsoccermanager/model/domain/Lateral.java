package br.edu.infnet.appsoccermanager.model.domain;

public class Lateral extends Jogador {

    private boolean atua_ala;
    private float acerto_cruzamento;

    @Override
    public String toString() {
        return super.toString() + ";" + atua_ala + ";" + acerto_cruzamento;
    }

    public boolean isAtua_ala() {
        return atua_ala;
    }

    public void setAtua_ala(boolean atua_ala) {
        this.atua_ala = atua_ala;
    }

    public float getAcerto_cruzamento() {
        return acerto_cruzamento;
    }

    public void setAcerto_cruzamento(float acerto_cruzamento) {
        this.acerto_cruzamento = acerto_cruzamento;
    }
}
