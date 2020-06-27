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
public class Vehiculo {

    int VIN;
    int prcio;
    int status;
    int idModelo;
    int idPlanta;

    public Vehiculo() {
    }

    public Vehiculo(int VIN, int prcio, int status, int idModelo, int idPlanta) {
        this.VIN = VIN;
        this.prcio = prcio;
        this.status = status;
        this.idModelo = idModelo;
        this.idPlanta = idPlanta;
    }

    public int getVIN() {
        return VIN;
    }

    public void setVIN(int VIN) {
        this.VIN = VIN;
    }

    public int getPrcio() {
        return prcio;
    }

    public void setPrcio(int prcio) {
        this.prcio = prcio;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getIdModelo() {
        return idModelo;
    }

    public void setIdModelo(int idModelo) {
        this.idModelo = idModelo;
    }

    public int getIdPlanta() {
        return idPlanta;
    }

    public void setIdPlanta(int idPlanta) {
        this.idPlanta = idPlanta;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "VIN=" + VIN + ", prcio=" + prcio + ", status=" + status + ", idModelo=" + idModelo + ", idPlanta=" + idPlanta + '}';
    }

}
