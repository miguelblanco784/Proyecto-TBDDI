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
public class Persona {

    char sexo;
    double ingreso;
    int id_cliente;

    public Persona() {
    }

    public Persona(char sexo, double ingreso,  int id_cliente) {
        this.sexo = sexo;
        this.ingreso = ingreso;
        this.id_cliente = id_cliente;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getIngreso() {
        return ingreso;
    }

    public void setIngreso(double ingreso) {
        this.ingreso = ingreso;
    }


    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    @Override
    public String toString() {
        return "Persona{" + "sexo=" + sexo + ", ingreso=" + ingreso  + ", id_cliente=" + id_cliente + '}';
    }

}
