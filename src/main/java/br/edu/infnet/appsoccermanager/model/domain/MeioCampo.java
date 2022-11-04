package br.edu.infnet.appsoccermanager.model.domain;


import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "meiocampo")
public class MeioCampo extends Jogador {

    private boolean atua_ataque;
    private float acerto_passe;

    @Override
    public String toString() {
        return super.toString() + ";" + atua_ataque + ";" + acerto_passe;
    }

    public boolean isAtua_ataque() {
        return atua_ataque;
    }

    public void setAtua_ataque(boolean atua_ataque) {
        this.atua_ataque = atua_ataque;
    }

    public float getAcerto_passe() {
        return acerto_passe;
    }

    public void setAcerto_passe(float acerto_passe) {
        this.acerto_passe = acerto_passe;
    }
}
