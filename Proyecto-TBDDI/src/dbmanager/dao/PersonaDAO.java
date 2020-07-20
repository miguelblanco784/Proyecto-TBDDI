/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbmanager.dao;

import Concesionario.Persona;
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
public class PersonaDAO {

    String mensaje = "";

    public String agregarPERSONA(Connection con, Persona conce) {
        PreparedStatement pst = null;
        String x = "(select idPERSONA from PERSONA ORDER BY idPERSONA DESC LIMIT 1)";

        String sql = "INSERT INTO PERSONA "
                + "VALUES(?,?,?)";

        try {
            pst = con.prepareStatement(sql);

            pst.setString(1, "" + conce.getSexo());
            pst.setDouble(2, conce.getIngreso());
            pst.setInt(3, conce.getId_cliente());

            pst.execute();
            pst.close();

            mensaje = "Success!";
        } catch (Exception e) {
            System.out.println("Ocurrio un error" + e);
        }
        return mensaje;
    }

    public String modificarPERSONA(Connection con, Persona conce) {
        PreparedStatement pst = null;
        String x = "(select idPERSONA from PERSONA ORDER BY idPERSONA DESC LIMIT 1)";

        String sql = "UPDATE PERSONA SET SEXO = ?, INGRESO = ?"
                + "WHERE idClientes = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, "" + conce.getSexo());
            pst.setDouble(2, conce.getIngreso());
            pst.setInt(3, conce.getId_cliente());

            pst.execute();
            pst.close();

            mensaje = "Success!";
        } catch (Exception e) {
            System.out.println("Ocurrio un error" + e);
        }
        return mensaje;
    }

    public String eliminarPERSONA(Connection con, int id) {
        return mensaje;
    }

    public void listarPERSONA(Connection con, JTable tabla) {
        DefaultTableModel model;
        String[] columnas = {"Sexo", "Ingreso", "ID Cliente"};
        model = new DefaultTableModel(null, columnas);

        String sql = "select * from PERSONA";

        String[] filas = new String[3];
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
