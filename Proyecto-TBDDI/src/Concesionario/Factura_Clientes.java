/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Concesionario;

import java.util.Date;

/**
 *
 * @author migue
 */
public class Factura_Clientes {

    int idFactura_Clientes;
    Date fecha;
    Double total;
    Double impuesto;
    Double subtotal;
    int idConcesionario;
    int idClientes;

    public Factura_Clientes() {
    }

    public Factura_Clientes(int idFactura_Clientes, Double total, Double impuesto, int idConcesionario, int idClientes) {
        this.idFactura_Clientes = idFactura_Clientes;
        this.fecha = new Date();
        this.total = total;
        this.impuesto = impuesto;
        this.subtotal = total+impuesto;
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

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Double getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(Double impuesto) {
        this.impuesto = impuesto;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
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
    
    
    
    
}
