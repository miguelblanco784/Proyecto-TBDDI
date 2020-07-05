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
public class Concesionario {

    int idConsecionario;
    String nombre;
    char status;
    String correo;
    String telefono;

    public Concesionario() {
    }

    public Concesionario(int idConsecionario, String nombre, char status, String correo, String telefono) {
        this.idConsecionario = idConsecionario;
        this.nombre = nombre;
        this.status = status;
        this.correo = correo;
        this.telefono = telefono;
    }

    public int getIdConsecionario() {
        return idConsecionario;
    }

    public void setIdConsecionario(int idConsecionario) {
        this.idConsecionario = idConsecionario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Concesionario{" + "idConsecionario=" + idConsecionario + ", nombre=" + nombre + ", status=" + status + ", concecionarioCol=" + correo + ", telefono=" + telefono + '}';
    }

}
