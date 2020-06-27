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
public class Clientes {

    int idClientes;
    String nombre;
    String telefono;
    int idConsecionario;

    public Clientes() {
    }

    public Clientes(int idClientes, String nombre, String telefono, int idConsecionario) {
        this.idClientes = idClientes;
        this.nombre = nombre;
        this.telefono = telefono;
        this.idConsecionario = idConsecionario;
    }

    public int getIdClientes() {
        return idClientes;
    }

    public void setIdClientes(int idClientes) {
        this.idClientes = idClientes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getIdConsecionario() {
        return idConsecionario;
    }

    public void setIdConsecionario(int idConsecionario) {
        this.idConsecionario = idConsecionario;
    }

    @Override
    public String toString() {
        return "Clientes{" + "idClientes=" + idClientes + ", nombre=" + nombre + ", telefono=" + telefono + ", idConsecionario=" + idConsecionario + '}';
    }

}
