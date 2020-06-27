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
public class Detalla_Factura_Clientes {

    int precio;
    int idFactura_Clientes;
    int idInventario_Concecionario;

    public Detalla_Factura_Clientes() {
    }

    public Detalla_Factura_Clientes(int precio, int idFactura_Clientes, int idInventario_Concecionario) {
        this.precio = precio;
        this.idFactura_Clientes = idFactura_Clientes;
        this.idInventario_Concecionario = idInventario_Concecionario;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getIdFactura_Clientes() {
        return idFactura_Clientes;
    }

    public void setIdFactura_Clientes(int idFactura_Clientes) {
        this.idFactura_Clientes = idFactura_Clientes;
    }

    public int getIdInventario_Concecionario() {
        return idInventario_Concecionario;
    }

    public void setIdInventario_Concecionario(int idInventario_Concecionario) {
        this.idInventario_Concecionario = idInventario_Concecionario;
    }

    @Override
    public String toString() {
        return "Detalla_Factura_Clientes{" + "precio=" + precio + ", idFactura_Clientes=" + idFactura_Clientes + ", idInventario_Concecionario=" + idInventario_Concecionario + '}';
    }

}
