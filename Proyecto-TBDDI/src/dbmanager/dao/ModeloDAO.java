/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbmanager.dao;

import Concesionario.Modelo;
import java.sql.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author migue
 */
public class ModeloDAO {

    String mensaje = "";

    public String agregarModelo(Connection con, Modelo conce) {
        PreparedStatement pst = null;
        String x = "(select idModelo from Modelo ORDER BY idModelo DESC LIMIT 1)";

        String sql = "INSERT INTO Modelo (idModelo,Nombre,Tipo_Motor,Transmision,Marca_idMarca)"
                + "VALUES(?,?,?,?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, conce.getIdModelo());
            pst.setString(2, conce.getNombre());
            pst.setString(3, "" + conce.getTipo_motor());
            pst.setString(4, conce.getTranmission());
            pst.setInt(5, conce.getIdMarca());
            pst.execute();
            pst.close();

            mensaje = "Success!";
        } catch (Exception e) {
            System.out.println("Ocurrio un error" + e);
        }
        return mensaje;
    }

    public String modificarModelo(Connection con, Modelo conce) {
        PreparedStatement pst = null;
        String x = "(select idModelo from Modelo ORDER BY idModelo DESC LIMIT 1)";

        String sql = "UPDATE MODELO SET Nombre = ?, Tipo_Motor = ?, Transmision = ?, idMarca = ?"
                + "WHERE idModelo = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(5, conce.getIdModelo());
            pst.setString(1, conce.getNombre());
            pst.setString(2, "" + conce.getTipo_motor());
            pst.setString(3, conce.getTranmission());
            pst.setInt(4, conce.getIdMarca());
            pst.execute();
            pst.close();

            mensaje = "Success!";
        } catch (Exception e) {
            System.out.println("Ocurrio un error" + e);
        }
        return mensaje;
    }

    public String eliminarModelo(Connection con, int id) {
        return mensaje;
    }

    public void listarModelo(Connection con, JTable tabla) {
        DefaultTableModel model;
        String[] columnas = {"idModelo", "Nombre", "Tipo_Motor", "Transmision", "idMarca"};
        model = new DefaultTableModel(null, columnas);

        String sql = "select * from Modelo";

        String[] filas = new String[5];
        Statement st = null;
        ResultSet rs = null;

        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                for (int i = 0; i < 5; i++) {
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
