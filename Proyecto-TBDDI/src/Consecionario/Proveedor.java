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
public class Proveedor {

    int idProveedor;
    String nombre;
    String contacto;
    String telefono;
    String correo;
    String status;

    public Proveedor() {
    }

    public Proveedor(int idProveedor, String nombre, String contacto, String telefono, String correo, String status) {
        this.idProveedor = idProveedor;
        this.nombre = nombre;
        this.contacto = contacto;
        this.telefono = telefono;
        this.correo = correo;
        this.status = status;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Proveedor{" + "idProveedor=" + idProveedor + ", nombre=" + nombre + ", contacto=" + contacto + ", telefono=" + telefono + ", correo=" + correo + ", status=" + status + '}';
    }

}
