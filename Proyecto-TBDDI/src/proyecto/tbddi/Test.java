/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.tbddi;

import Consecionario.Concesionario;
import dbmanager.Conexion;
import dbmanager.bo.TeoriaBDDBO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author migue
 */
public class Test {

    Concesionario c = new Concesionario();
    TeoriaBDDBO ebo = new TeoriaBDDBO();

    void concesionario() {
        Conexion cnd = new Conexion();
        Connection con = cnd.getCon();

        String sql = "(select idConcesionario from concesionario ORDER BY idConcesionario DESC LIMIT 1)";

        Statement st = null;
        ResultSet rs = null;

        int x = 1;
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            rs.next();
            x += Integer.parseInt(rs.getString(1));
            con.close();
        } catch (Exception e) {
            System.out.println("Cagadal se te armo" + e);
        }

        c.setNombre("BMW TGU");
        c.setCorreo("bmw@tgu.com");
        c.setIdConsecionario(x);
        c.setStatus('0');
        c.setTelefono("502-502-502");

        String mensaje = ebo.agregarConcesionario(c);
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.concesionario();
    }

}
