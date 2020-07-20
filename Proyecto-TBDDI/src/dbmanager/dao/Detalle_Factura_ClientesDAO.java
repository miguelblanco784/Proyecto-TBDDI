/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbmanager.dao;

import Concesionario.Detalle_Factura_Clientes;
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
public class Detalle_Factura_ClientesDAO {

    String mensaje = "";

    public String agregarDetalle_Factura_Clientes(Connection con, Detalle_Factura_Clientes conce) {
        PreparedStatement pst = null;
        String x = "(select idDetalle_Factura_Clientes from Detalle_Factura_Clientes ORDER BY idDetalle_Factura_Clientes DESC LIMIT 1)";

        String sql = "INSERT INTO Detalle_Factura_Clientes"
                + "VALUES(?,?,?,?)";
        try {
            pst = con.prepareStatement(sql);

            pst.setInt(1, conce.getPrecio());
            pst.setInt(2, conce.getIdFactura_Clientes());
            pst.setInt(3, conce.getIdInventario_Concecionario());
            pst.setInt(4, conce.getVIN());

            pst.execute();
            pst.close();

            mensaje = "Success!";
        } catch (Exception e) {
            System.out.println("Ocurrio un error" + e);
        }
        return mensaje;
    }

    public String modificarDetalle_Factura_Clientes(Connection con, Detalle_Factura_Clientes conce) {
        PreparedStatement pst = null;
        String x = "(select idDetalle_Factura_Clientes from Detalle_Factura_Clientes ORDER BY idDetalle_Factura_Clientes DESC LIMIT 1)";

        String sql = "UPDATE Detalle_Factura_Clientes SET Status = ?, CONCESIONARIO_IDCONCESIONARIO = ?, VEHICULO_VIN = ?"
                + "WHERE idDetalle_Factura_Clientes = ?";
        try {
           /* pst = con.prepareStatement(sql);
            pst.setString(1, conce.getStatus());
            pst.setString(2, "" + conce.getIdConcesionario());
            pst.setString(3, "" + conce.getVIN());
            pst.setInt(4, conce.getIdDetalle_Factura_Clientes());
            pst.execute();
            pst.close();*/

            mensaje = "Success!";
        } catch (Exception e) {
            System.out.println("Ocurrio un error" + e);
        }
        return mensaje;
    }

    public String eliminarDetalle_Factura_Clientes(Connection con, int id) {
        return mensaje;
    }

    public void listarDetalle_Factura_Clientes(Connection con, JTable tabla) {
        DefaultTableModel model;
        String[] columnas = {"Precio", "Factura Clientes IdFactura Clientes", "Inventario Concesionario idInventario Concesionario", "VIN"};
        model = new DefaultTableModel(null, columnas);

        String sql = "select * from Detalle_Factura_Clientes";

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
