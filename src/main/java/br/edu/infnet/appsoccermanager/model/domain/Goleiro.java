package br.edu.infnet.appsoccermanager.model.domain;

public class Goleiro extends Jogador {

    private boolean atua_libero;
    private float acerto_defesa_penalti;

    @Override
    public String toString() {
        return super.toString() + ";" + atua_libero + ":" + acerto_defesa_penalti;
    }

    public boolean isAtua_libero() {
        return atua_libero;
    }

    public void setAtua_libero(boolean atua_libero) {
        this.atua_libero = atua_libero;
    }

    public float getAcerto_defesa_penalti() {
        return acerto_defesa_penalti;
    }

    public void setAcerto_defesa_penalti(float acerto_defesa_penalti) {
        this.acerto_defesa_penalti = acerto_defesa_penalti;
    }
}
