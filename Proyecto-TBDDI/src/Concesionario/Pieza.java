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
public class Pieza {

    int idPieza;
    String nombre;

    public Pieza() {
    }

    public Pieza(int idPieza, String nombre) {
        this.idPieza = idPieza;
        this.nombre = nombre;
    }

    public int getIdPieza() {
        return idPieza;
    }

    public void setIdPieza(int idPieza) {
        this.idPieza = idPieza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Pieza{" + "idPieza=" + idPieza + ", nombre=" + nombre + '}';
    }

}
