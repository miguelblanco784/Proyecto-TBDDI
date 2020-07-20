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
public class Modelo {

    int idModelo;
    String nombre;
    String tipo_motor;
    String tranmission;
    int idMarca;

    public Modelo() {
    }

    public Modelo(int idModelo, String nombre, String tipo_motor, String tranmission, int idMarca) {
        this.idModelo = idModelo;
        this.nombre = nombre;
        this.tipo_motor = tipo_motor;
        this.tranmission = tranmission;
        this.idMarca = idMarca;
    }

    public int getIdModelo() {
        return idModelo;
    }

    public void setIdModelo(int idModelo) {
        this.idModelo = idModelo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo_motor() {
        return tipo_motor;
    }

    public void setTipo_motor(String tipo_motor) {
        this.tipo_motor = tipo_motor;
    }

    public String getTranmission() {
        return tranmission;
    }

    public void setTranmission(String tranmission) {
        this.tranmission = tranmission;
    }

    public int getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(int idMarca) {
        this.idMarca = idMarca;
    }

    @Override
    public String toString() {
        return "Modelo{" + "idModelo=" + idModelo + ", nombre=" + nombre + ", tipo_motor=" + tipo_motor + ", tranmission=" + tranmission + ", idMarca=" + idMarca + '}';
    }

}
