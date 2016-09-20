/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto4;

/**
 *
 * @author alex
 */
public class Individuo {
    String nombre;
    boolean EsPareja;
    boolean Lider;
    boolean enGrupo;
    int descansos_como_lider;

    public Individuo(String nombre, boolean EsPareja, boolean Lider, boolean enGrupo, int descansos_como_lider) {
        this.nombre = nombre;
        this.EsPareja = EsPareja;
        this.Lider = Lider;
        this.enGrupo = enGrupo;
        this.descansos_como_lider = descansos_como_lider;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEsPareja() {
        return EsPareja;
    }

    public void setEsPareja(boolean EsPareja) {
        this.EsPareja = EsPareja;
    }

    public boolean isLider() {
        return Lider;
    }

    public void setLider(boolean Lider) {
        this.Lider = Lider;
    }

    public boolean isEnGrupo() {
        return enGrupo;
    }

    public void setEnGrupo(boolean enGrupo) {
        this.enGrupo = enGrupo;
    }

    public int getDescansos_como_lider() {
        return descansos_como_lider;
    }

    public void setDescansos_como_lider(int descansos_como_lider) {
        this.descansos_como_lider = descansos_como_lider;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
