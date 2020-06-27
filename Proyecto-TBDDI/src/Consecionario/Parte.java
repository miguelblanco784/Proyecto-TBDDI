/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Consecionario;

/**
 *
 * @author migue
 */
public class Parte {

    int idParte;
    String Nombre;
    int idPlanta;
    int idModelo;

    public Parte() {
    }

    public Parte(int idParte, String Nombre, int idPlanta, int idModelo) {
        this.idParte = idParte;
        this.Nombre = Nombre;
        this.idPlanta = idPlanta;
        this.idModelo = idModelo;
    }

    public int getIdParte() {
        return idParte;
    }

    public void setIdParte(int idParte) {
        this.idParte = idParte;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getIdPlanta() {
        return idPlanta;
    }

    public void setIdPlanta(int idPlanta) {
        this.idPlanta = idPlanta;
    }

    public int getIdModelo() {
        return idModelo;
    }

    public void setIdModelo(int idModelo) {
        this.idModelo = idModelo;
    }

    @Override
    public String toString() {
        return "Parte{" + "idParte=" + idParte + ", Nombre=" + Nombre + ", idPlanta=" + idPlanta + ", idModelo=" + idModelo + '}';
    }

}
