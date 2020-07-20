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
public class Inventario_Concesionario {

    int idInventario_Concesionario;
    String status;
    int idConcesionario;
    int VIN;

    public Inventario_Concesionario() {
    }

    public Inventario_Concesionario(int idInventario_Concesionario, String status, int idConcesionario, int VIN) {
        this.idInventario_Concesionario = idInventario_Concesionario;
        this.status = status;
        this.idConcesionario = idConcesionario;
        this.VIN = VIN;
    }

    public int getIdInventario_Concesionario() {
        return idInventario_Concesionario;
    }

    public void setIdInventario_Concesionario(int idInventario_Concesionario) {
        this.idInventario_Concesionario = idInventario_Concesionario;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getIdConcesionario() {
        return idConcesionario;
    }

    public void setIdConcesionario(int idConcesionario) {
        this.idConcesionario = idConcesionario;
    }

    public int getVIN() {
        return VIN;
    }

    public void setVIN(int VIN) {
        this.VIN = VIN;
    }

    @Override
    public String toString() {
        return "Inventario_Concesionario{" + "idInventario_Concesionario=" + idInventario_Concesionario + ", status=" + status + ", idConcesionario=" + idConcesionario + ", VIN=" + VIN + '}';
    }

}
