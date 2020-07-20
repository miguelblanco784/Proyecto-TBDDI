/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbmanager.dao;

import Concesionario.Inventario_Concesionario;
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
public class Inventario_ConcesionarioDAO {

    String mensaje = "";

    public String agregarInventario_Concesionario(Connection con, Inventario_Concesionario conce) {
        PreparedStatement pst = null;
        String x = "(select idInventario_Concesionario from Inventario_Concesionario ORDER BY idInventario_Concesionario DESC LIMIT 1)";

        String sql = "INSERT INTO Inventario_Concesionario (IDINVENTARIO_CONCESIONARIO,STATUS,CONCESIONARIO_IDCONCESIONARIO,VEHICULO_VIN)"
                + "VALUES(?,?,?,?)";
        try {
            pst = con.prepareStatement(sql);

            pst.setInt(1, conce.getIdInventario_Concesionario());
            pst.setString(2, conce.getStatus());
            pst.setString(3, "" + conce.getIdConcesionario());
            pst.setString(4, "" + conce.getVIN());

            pst.execute();
            pst.close();

            mensaje = "Success!";
        } catch (Exception e) {
            System.out.println("Ocurrio un error" + e);
        }
        return mensaje;
    }

    public String modificarInventario_Concesionario(Connection con, Inventario_Concesionario conce) {
        PreparedStatement pst = null;
        String x = "(select idInventario_Concesionario from Inventario_Concesionario ORDER BY idInventario_Concesionario DESC LIMIT 1)";

        String sql = "UPDATE Inventario_Concesionario SET Status = ?, CONCESIONARIO_IDCONCESIONARIO = ?, VEHICULO_VIN = ?"
                + "WHERE idInventario_Concesionario = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, conce.getStatus());
            pst.setString(2, "" + conce.getIdConcesionario());
            pst.setString(3, "" + conce.getVIN());
            pst.setInt(4, conce.getIdInventario_Concesionario());
            pst.execute();
            pst.close();

            mensaje = "Success!";
        } catch (Exception e) {
            System.out.println("Ocurrio un error" + e);
        }
        return mensaje;
    }

    public String eliminarInventario_Concesionario(Connection con, int id) {
        return mensaje;
    }

    public void listarInventario_Concesionario(Connection con, JTable tabla) {
        DefaultTableModel model;
        String[] columnas = {"Id Inventario_Concesionario", "Status", "ID Concesionario", "VIN"};
        model = new DefaultTableModel(null, columnas);

        String sql = "select * from Inventario_Concesionario";

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
