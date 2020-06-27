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
public class Planta {
    int idPlanta;
    String nombre;
    String tipo_planta;
    String direccion;

    public Planta() {
    }

    public Planta(int idPlanta, String nombre, String tipo_planta, String direccion) {
        this.idPlanta = idPlanta;
        this.nombre = nombre;
        this.tipo_planta = tipo_planta;
        this.direccion = direccion;
    }

    public int getIdPlanta() {
        return idPlanta;
    }

    public void setIdPlanta(int idPlanta) {
        this.idPlanta = idPlanta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo_planta() {
        return tipo_planta;
    }

    public void setTipo_planta(String tipo_planta) {
        this.tipo_planta = tipo_planta;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Planta{" + "idPlanta=" + idPlanta + ", nombre=" + nombre + ", tipo_planta=" + tipo_planta + ", direccion=" + direccion + '}';
    }
    
    
}
