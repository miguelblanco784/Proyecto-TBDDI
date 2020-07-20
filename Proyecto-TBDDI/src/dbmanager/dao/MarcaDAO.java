/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbmanager.dao;

import Concesionario.Marca;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author migue
 */
public class MarcaDAO {

    String mensaje = "";

    public String agregarMARCA(Connection con, Marca conce) {
        PreparedStatement pst = null;
        String x = "(select idMARCA from MARCA ORDER BY idMARCA DESC LIMIT 1)";

        String sql = "INSERT INTO MARCA "
                + "VALUES(?,?,?)";

        try {
            pst = con.prepareStatement(sql);

            pst.setInt(1, conce.getIdMarca());
            pst.setString(2, conce.getNombre());
            pst.setString(3, "" + conce.getStatus());

            pst.execute();
            pst.close();

            mensaje = "Success!";
        } catch (Exception e) {
            System.out.println("Ocurrio un error" + e);
        }
        return mensaje;
    }

    public String modificarMARCA(Connection con, Marca conce) {
        PreparedStatement pst = null;
        String x = "(select idMARCA from MARCA ORDER BY idMARCA DESC LIMIT 1)";

        String sql = "UPDATE MARCA SET Nombre = ?, Status = ?"
                + "WHERE idMarca = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, "" + conce.getNombre());
            pst.setInt(2, conce.getStatus());
            pst.setInt(3, conce.getIdMarca());

            pst.execute();
            pst.close();

            mensaje = "Success!";
        } catch (Exception e) {
            System.out.println("Ocurrio un error" + e);
        }
        return mensaje;
    }

    public String eliminarMARCA(Connection con, int id) {
        return mensaje;
    }

    public void listarMARCA(Connection con, JTable tabla) {
        DefaultTableModel model;
        String[] columnas = {"Id Marca", "Nombre", "Status"};
        model = new DefaultTableModel(null, columnas);

        String sql = "select * from MARCA";

        String[] filas = new String[4];
        Statement st = null;
        ResultSet rs = null;

        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                for (int i = 0; i < 3; i++) {
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
