/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Concesionario;

/**
 *
 * @author migue
 */
public class Pieza_Has_Modelo {

    int idPieza;
    int idModelo;

    public Pieza_Has_Modelo() {
    }

    public Pieza_Has_Modelo(int idPieza, int idModelo) {
        this.idPieza = idPieza;
        this.idModelo = idModelo;
    }

    public int getIdPieza() {
        return idPieza;
    }

    public void setIdPieza(int idPieza) {
        this.idPieza = idPieza;
    }

    public int getIdModelo() {
        return idModelo;
    }

    public void setIdModelo(int idModelo) {
        this.idModelo = idModelo;
    }

    @Override
    public String toString() {
        return "Pieza_Has_Modelo{" + "idPieza=" + idPieza + ", idModelo=" + idModelo + '}';
    }

}
