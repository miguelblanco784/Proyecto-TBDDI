/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Consecionario;

import java.sql.Date;

/**
 *
 * @author migue
 */
public class Factura_Clientes {

    int idFactura_Clientes;
    Date fecha;
    String total;
    String impuesto;
    String subtotal;
    int idConcesionario;
    int idClientes;

    public Factura_Clientes() {
    }

    public Factura_Clientes(int idFactura_Clientes, Date fecha, String total, String impuesto, String subtotal, int idConcesionario, int idClientes) {
        this.idFactura_Clientes = idFactura_Clientes;
        this.fecha = fecha;
        this.total = total;
        this.impuesto = impuesto;
        this.subtotal = subtotal;
        this.idConcesionario = idConcesionario;
        this.idClientes = idClientes;
    }

    public int getIdFactura_Clientes() {
        return idFactura_Clientes;
    }

    public void setIdFactura_Clientes(int idFactura_Clientes) {
        this.idFactura_Clientes = idFactura_Clientes;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(String impuesto) {
        this.impuesto = impuesto;
    }

    public String getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(String subtotal) {
        this.subtotal = subtotal;
    }

    public int getIdConcesionario() {
        return idConcesionario;
    }

    public void setIdConcesionario(int idConcesionario) {
        this.idConcesionario = idConcesionario;
    }

    public int getIdClientes() {
        return idClientes;
    }

    public void setIdClientes(int idClientes) {
        this.idClientes = idClientes;
    }

    @Override
    public String toString() {
        return "Factura_Clientes{" + "idFactura_Clientes=" + idFactura_Clientes + ", fecha=" + fecha + ", total=" + total + ", impuesto=" + impuesto + ", subtotal=" + subtotal + ", idConcesionario=" + idConcesionario + ", idClientes=" + idClientes + '}';
    }
    
    
}
