/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto4;

import java.util.ArrayList;

/**
 *
 * @author alex
 */
public class grupo {

    int cantidad_integrantes;
    boolean OneCouple;
    ArrayList<Individuo> integrantes = new ArrayList<Individuo>();

    public grupo(int cantidad_integrantes, boolean OneCouple) {
        this.cantidad_integrantes = cantidad_integrantes;
        this.OneCouple = OneCouple;
    }

    public int getCantidad_integrantes() {
        return cantidad_integrantes;
    }

    public void setCantidad_integrantes(int cantidad_integrantes) {
        this.cantidad_integrantes = cantidad_integrantes;
    }

    public boolean isOneCouple() {
        return OneCouple;
    }

    public void setOneCouple(boolean OneCouple) {
        this.OneCouple = OneCouple;
    }

    public ArrayList<Individuo> getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(ArrayList<Individuo> integrantes) {
        this.integrantes = integrantes;
    }

    @Override
    public String toString() {
        return "Grupo de: "+integrantes.get(0).toString();
    }

}
