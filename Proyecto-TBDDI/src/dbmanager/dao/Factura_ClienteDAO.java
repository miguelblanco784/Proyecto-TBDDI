/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbmanager.dao;

import Consecionario.Factura_Clientes;
import java.sql.Connection;
import java.sql.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author migue
 */
public class Factura_ClienteDAO {

    String mensaje = "";

    public String agregarFactura_Clientes(Connection con, Factura_Clientes conce) {
        PreparedStatement pst = null;
        String x = "(select idFactura_Clientes from Factura_Clientes ORDER BY idFactura_Clientes DESC LIMIT 1)";

        String sql = "INSERT INTO Factura_Clientes"
                + "VALUES(?,?,?,?,?,?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, conce.getIdFactura_Clientes());
            pst.setDate(2, conce.getFecha());
            pst.setString(3, "" + conce.getTotal());
            pst.setString(4, conce.getImpuesto());
            pst.setString(5, conce.getSubtotal());
            pst.setInt(6, conce.getIdConcesionario());
            pst.setInt(7, conce.getIdClientes());
            pst.execute();
            pst.close();

            mensaje = "Success!";
        } catch (Exception e) {
            System.out.println("Ocurrio un error" + e);
        }
        return mensaje;
    }

    public String modificarFactura_Clientes(Connection con, Factura_Clientes conce) {
        PreparedStatement pst = null;
        String x = "(select idFactura_Clientes from Factura_Clientes ORDER BY idFactura_Clientes DESC LIMIT 1)";

        String sql = "UPDATE CONSECIONARIO SET Total = ?, SubTotal = ?"
                + "WHERE idFactura_Clientes = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(3, conce.getIdFactura_Clientes());
            pst.setString(1, conce.getTotal());
            pst.setString(2, "" + conce.getSubtotal());
            pst.execute();
            pst.close();

            mensaje = "Success!";
        } catch (Exception e) {
            System.out.println("Ocurrio un error" + e);
        }
        return mensaje;
    }

    public String eliminarFactura_Clientes(Connection con, int id) {
        return mensaje;
    }

    public void listarFactura_Clientes(Connection con, JTable tabla) {
        DefaultTableModel model;
        String[] columnas = {"ID Factura_Clientes", "Fecha", "Total", "Impuesto", "Subtotal", "ID Concesionario", "ID Clientes"};
        model = new DefaultTableModel(null, columnas);

        String sql = "select * from Factura_Clientes";

        String[] filas = new String[8];
        Statement st = null;
        ResultSet rs = null;

        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                for (int i = 0; i < 7; i++) {
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
