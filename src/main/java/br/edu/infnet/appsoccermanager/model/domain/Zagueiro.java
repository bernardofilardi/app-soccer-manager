package br.edu.infnet.appsoccermanager.model.domain;

public class Zagueiro extends Jogador {

    private boolean atua_volante;
    private float acerto_desarme;

    @Override
    public String toString() {
        return super.toString() + ";" + atua_volante + ";" + acerto_desarme;
    }

    public boolean isAtua_volante() {
        return atua_volante;
    }

    public void setAtua_volante(boolean atua_volante) {
        this.atua_volante = atua_volante;
    }

    public float getAcerto_desarme() {
        return acerto_desarme;
    }

    public void setAcerto_desarme(float acerto_desarme) {
        this.acerto_desarme = acerto_desarme;
    }
}
