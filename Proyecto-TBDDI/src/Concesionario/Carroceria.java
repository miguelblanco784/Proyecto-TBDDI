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
public class Carroceria {

    int idCarroceria;
    String nombre;
    int idModelo;

    public Carroceria() {
    }

    public Carroceria(int idCarroceria, String nombre, int idModelo) {
        this.idCarroceria = idCarroceria;
        this.nombre = nombre;
        this.idModelo = idModelo;
    }

    public int getIdCarroceria() {
        return idCarroceria;
    }

    public void setIdCarroceria(int idCarroceria) {
        this.idCarroceria = idCarroceria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdModelo() {
        return idModelo;
    }

    public void setIdModelo(int idModelo) {
        this.idModelo = idModelo;
    }

    @Override
    public String toString() {
        return "Carroceria{" + "idCarroceria=" + idCarroceria + ", nombre=" + nombre + ", idModelo=" + idModelo + '}';
    }

}
