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
public class Proveedor_Has_Pieza {
    int idProveedor;
    int idPieza;

    public Proveedor_Has_Pieza() {
    }

    public Proveedor_Has_Pieza(int idProveedor, int idPieza) {
        this.idProveedor = idProveedor;
        this.idPieza = idPieza;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public int getIdPieza() {
        return idPieza;
    }

    public void setIdPieza(int idPieza) {
        this.idPieza = idPieza;
    }

    @Override
    public String toString() {
        return "Proveedor_Has_Pieza{" + "idProveedor=" + idProveedor + ", idPieza=" + idPieza + '}';
    }
    
    
}
