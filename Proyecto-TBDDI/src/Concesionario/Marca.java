/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Concesionario;

/**
 *
 * @author migue
 */
public class Marca {

    int idMarca;
    String Nombre;
    int status;

    public Marca() {
    }

    public Marca(int idMarca, String Nombre, int status) {
        this.idMarca = idMarca;
        this.Nombre = Nombre;
        this.status = status;
    }

    public int getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(int idMarca) {
        this.idMarca = idMarca;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Marca{" + "idMarca=" + idMarca + ", Nombre=" + Nombre + ", status=" + status + '}';
    }

}
