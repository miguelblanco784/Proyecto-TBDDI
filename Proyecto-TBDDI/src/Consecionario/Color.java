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
public class Color {

    int idColor;
    String nombre;
    int idModelo;

    public Color() {
    }

    public Color(int idColor, String nombre, int idModelo) {
        this.idColor = idColor;
        this.nombre = nombre;
        this.idModelo = idModelo;
    }

    public int getIdColor() {
        return idColor;
    }

    public void setIdColor(int idColor) {
        this.idColor = idColor;
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
        return "Color{" + "idColor=" + idColor + ", nombre=" + nombre + ", idModelo=" + idModelo + '}';
    }

}
