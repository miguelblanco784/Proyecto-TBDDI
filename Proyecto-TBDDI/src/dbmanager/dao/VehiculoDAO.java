/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbmanager.dao;

import Concesionario.Vehiculo;
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
public class VehiculoDAO {
        String mensaje = "";

    public String agregarVehiculo(Connection con, Vehiculo conce) {
        PreparedStatement pst = null;
        String x = "(select idVehiculo from Vehiculo ORDER BY idVehiculo DESC LIMIT 1)";

        String sql = "INSERT INTO Vehiculo(VIN,PRECIO,STATUS,MODELO_IDMODELO,PLANTA_IDPLANTA)"
                + "VALUES(?,?,?,?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, conce.getVIN());
            pst.setInt(2, conce.getPrecio());
            pst.setInt(3, conce.getStatus());
            pst.setInt(4, conce.getIdModelo());
            pst.setInt(5, conce.getIdPlanta());
            pst.execute();
            pst.close();

            mensaje = "Success!";
        } catch (Exception e) {
            System.out.println("Ocurrio un error" + e);
        }
        return mensaje;
    }

    public String modificarVehiculo(Connection con, Vehiculo conce) {
        PreparedStatement pst = null;
        String x = "(select idVehiculo from Vehiculo ORDER BY idVehiculo DESC LIMIT 1)";

        String sql = "UPDATE Vehiculo SET Precio = ?, Status = ?, idModelo = ?, idPlanta = ?"
                + "WHERE VIN = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(5, conce.getVIN());
            pst.setInt(1, conce.getPrecio());
            pst.setInt(2, conce.getStatus());
            pst.setInt(3, conce.getIdModelo());
            pst.setInt(4, conce.getIdPlanta());
            pst.execute();
            pst.close();

            mensaje = "Success!";
        } catch (Exception e) {
            System.out.println("Ocurrio un error" + e);
        }
        return mensaje;
    }

    public String eliminarVehiculo(Connection con, int id) {
        return mensaje;
    }

    public void listarVehiculo(Connection con, JTable tabla) {
        DefaultTableModel model;
        String[] columnas = {"VIN", "Precio", "Status", "IdModelo", "IdPlanta"};
        model = new DefaultTableModel(null, columnas);

        String sql = "select * from Vehiculo";

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
