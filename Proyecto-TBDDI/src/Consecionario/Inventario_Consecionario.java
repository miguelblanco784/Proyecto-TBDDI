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
public class Inventario_Consecionario {

    int idInventario_Consecionario;
    String status;
    int idConsecionario;
    int VIN;

    public Inventario_Consecionario() {
    }

    public Inventario_Consecionario(int idInventario_Consecionario, String status, int idConsecionario, int VIN) {
        this.idInventario_Consecionario = idInventario_Consecionario;
        this.status = status;
        this.idConsecionario = idConsecionario;
        this.VIN = VIN;
    }

    public int getIdInventario_Consecionario() {
        return idInventario_Consecionario;
    }

    public void setIdInventario_Consecionario(int idInventario_Consecionario) {
        this.idInventario_Consecionario = idInventario_Consecionario;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getIdConsecionario() {
        return idConsecionario;
    }

    public void setIdConsecionario(int idConsecionario) {
        this.idConsecionario = idConsecionario;
    }

    public int getVIN() {
        return VIN;
    }

    public void setVIN(int VIN) {
        this.VIN = VIN;
    }

    @Override
    public String toString() {
        return "Inventario_Consecionario{" + "idInventario_Consecionario=" + idInventario_Consecionario + ", status=" + status + ", idConsecionario=" + idConsecionario + ", VIN=" + VIN + '}';
    }

}
