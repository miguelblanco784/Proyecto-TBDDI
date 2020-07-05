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
public class Empresa {

    String tipo_empresa;
    int idClientes;

    public String getTipo_empresa() {
        return tipo_empresa;
    }

    public void setTipo_empresa(String tipo_empresa) {
        this.tipo_empresa = tipo_empresa;
    }

    public int getIdClientes() {
        return idClientes;
    }

    public void setIdClientes(int idClientes) {
        this.idClientes = idClientes;
    }

    public Empresa(String tipo_empresa, int idClientes) {
        this.tipo_empresa = tipo_empresa;
        this.idClientes = idClientes;
    }

    public Empresa() {
    }

    @Override
    public String toString() {
        return "Empresa{" + "tipo_empresa=" + tipo_empresa + ", idClientes=" + idClientes + '}';
    }

}
