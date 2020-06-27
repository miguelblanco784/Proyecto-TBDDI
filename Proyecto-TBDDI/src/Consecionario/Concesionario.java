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
    String status;
    String concecionarioCol;
    String telefono;

    public Concesionario() {
    }

    public Concesionario(int idConsecionario, String nombre, String status, String concecionarioCol, String telefono) {
        this.idConsecionario = idConsecionario;
        this.nombre = nombre;
        this.status = status;
        this.concecionarioCol = concecionarioCol;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getConcecionarioCol() {
        return concecionarioCol;
    }

    public void setConcecionarioCol(String concecionarioCol) {
        this.concecionarioCol = concecionarioCol;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Concesionario{" + "idConsecionario=" + idConsecionario + ", nombre=" + nombre + ", status=" + status + ", concecionarioCol=" + concecionarioCol + ", telefono=" + telefono + '}';
    }
    
    
}
