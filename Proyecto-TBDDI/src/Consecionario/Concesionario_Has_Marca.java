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
public class Concesionario_Has_Marca {

    int idConsecionario;
    int idMarca;

    public Concesionario_Has_Marca(int idConsecionario, int idMarca) {
        this.idConsecionario = idConsecionario;
        this.idMarca = idMarca;
    }

    public Concesionario_Has_Marca() {
    }

    public int getIdConsecionario() {
        return idConsecionario;
    }

    public void setIdConsecionario(int idConsecionario) {
        this.idConsecionario = idConsecionario;
    }

    public int getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(int idMarca) {
        this.idMarca = idMarca;
    }

    @Override
    public String toString() {
        return "Consecionario_Has_Marca{" + "idConsecionario=" + idConsecionario + ", idMarca=" + idMarca + '}';
    }

}
