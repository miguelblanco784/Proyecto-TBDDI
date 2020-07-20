/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbmanager.dao;

import Concesionario.Planta;
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
public class PlantaDAO {

    String mensaje = "";

    public String agregarPLANTA(Connection con, Planta conce) {
        PreparedStatement pst = null;
        String x = "(select idPLANTA from PLANTA ORDER BY idPLANTA DESC LIMIT 1)";

        String sql = "INSERT INTO PLANTA "
                + "VALUES(?,?,?,?)";
        try {
            pst = con.prepareStatement(sql);

            pst.setInt(1, conce.getIdPlanta());
            pst.setString(2, conce.getNombre());
            pst.setString(3, "" + conce.getTipo_planta());
            pst.setString(4, conce.getDireccion());

            pst.execute();
            pst.close();

            mensaje = "Success!";
        } catch (Exception e) {
            System.out.println("Ocurrio un error" + e);
        }
        return mensaje;
    }

    public String modificarPLANTA(Connection con, Planta conce) {
        PreparedStatement pst = null;
        String x = "(select idPlanta from Planta ORDER BY idPlanta DESC LIMIT 1)";

        String sql = "UPDATE PLANTA SET Nombre = ?, Tipo_Planta = ?, Direccion = ?"
                + "WHERE idPlanta = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, conce.getNombre());
            pst.setString(2, "" + conce.getTipo_planta());
            pst.setString(3, conce.getDireccion());
            pst.setInt(4, conce.getIdPlanta());
            pst.execute();
            pst.close();

            mensaje = "Success!";
        } catch (Exception e) {
            System.out.println("Ocurrio un error" + e);
        }
        return mensaje;
    }

    public String eliminarPLANTA(Connection con, int id) {
        return mensaje;
    }

    public void listarPLANTA(Connection con, JTable tabla) {
        DefaultTableModel model;
        String[] columnas = {"Id Planta", "Nombre", "Tipo Planta", "Direccion"};
        model = new DefaultTableModel(null, columnas);

        String sql = "select * from PLANTA";

        String[] filas = new String[5];
        Statement st = null;
        ResultSet rs = null;

        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                for (int i = 0; i < 4; i++) {
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
