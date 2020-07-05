/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbmanager.dao;

import java.sql.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import Consecionario.Concesionario_Has_Marca;

/**
 *
 * @author migue
 */
public class Concesionario_Has_MarcaDAO {

    String mensaje = "";

    public String agregarCONCESIONARIO_HAS_MARCA(Connection con, Concesionario_Has_Marca conce) {
        PreparedStatement pst = null;
        String x = "(select idCONCESIONARIO_HAS_MARCA from CONCESIONARIO_HAS_MARCA ORDER BY idCONCESIONARIO_HAS_MARCA DESC LIMIT 1)";

        String sql = "INSERT INTO CONCESIONARIO_HAS_MARCA "
                + "VALUES(?,?)";

        try {
            pst = con.prepareStatement(sql);
            
            pst.setInt(1, conce.getIdConsecionario());
            pst.setInt(2, conce.getIdMarca());

            pst.execute();
            pst.close();

            mensaje = "Success!";
        } catch (Exception e) {
            System.out.println("Ocurrio un error" + e);
        }
        return mensaje;
    }

    public String modificarCONCESIONARIO_HAS_MARCA(Connection con, Concesionario_Has_Marca conce) {
        PreparedStatement pst = null;
        String x = "(select idCONCESIONARIO_HAS_MARCA from CONCESIONARIO_HAS_MARCA ORDER BY idCONCESIONARIO_HAS_MARCA DESC LIMIT 1)";

        String sql = "UPDATE CONCESIONARIO_HAS_MARCA SET idMarca = ?"
                + "WHERE idConcesionario = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, conce.getIdMarca());
            pst.setInt(2, conce.getIdConsecionario());

            pst.execute();
            pst.close();

            mensaje = "Success!";
        } catch (Exception e) {
            System.out.println("Ocurrio un error" + e);
        }
        return mensaje;
    }

    public String eliminarCONCESIONARIO_HAS_MARCA(Connection con, int id) {
        return mensaje;
    }

    public void listarCONCESIONARIO_HAS_MARCA(Connection con, JTable tabla) {
        DefaultTableModel model;
        String[] columnas = {"ID Concesionario", "ID Marca"};
        model = new DefaultTableModel(null, columnas);

        String sql = "select * from CONCESIONARIO_HAS_MARCA";

        String[] filas = new String[3];
        Statement st = null;
        ResultSet rs = null;

        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                for (int i = 0; i < 2; i++) {
                    filas[i] = rs.getString(i + 1);
                }
                model.addRow(filas);
            }
            tabla.setModel(model);
        } catch (Exception e) {
            System.out.println("Ocurrio un error" + e);
        }
    }

}
