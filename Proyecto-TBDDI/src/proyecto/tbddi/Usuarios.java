/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.tbddi;

/**
 *
 * @author migue
 */
public class Usuarios {
    int tipo;
    String usuario;
    String contrasena;

    public Usuarios() {
    }

    public Usuarios(int tipo, String usuario, String contrasena) {
        this.tipo = tipo;
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
    
}
