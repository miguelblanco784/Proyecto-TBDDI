/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbmanager.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import proyecto.tbddi.Bitacora;

/**
 *
 * @author migue
 */
public class BitacoraDAO {

    String mensaje = "";

    public String agregarBitacora(Connection con, Bitacora conce) {
        PreparedStatement pst = null;
        String x = "(select idBitacora from Bitacora ORDER BY idBitacora DESC LIMIT 1)";

        String sql = "INSERT INTO Bitacora "
                + "VALUES(?,?)";

        try {
            pst = con.prepareStatement(sql);

            DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
            pst.setString(1, dateFormat.format(conce.getFecha()));
            pst.setString(2, conce.getAccion());

            pst.execute();
            pst.close();

            mensaje = "Success!";
        } catch (Exception e) {
            System.out.println("Ocurrio un error" + e);
        }
        return mensaje;
    }

    public String modificarBitacora(Connection con, Bitacora conce) {
        PreparedStatement pst = null;
        String x = "(select idBitacora from Bitacora ORDER BY idBitacora DESC LIMIT 1)";

        String sql = "UPDATE Bitacora SET Accion = ?"
                + "WHERE Fecha = ?";
        try {
            pst = con.prepareStatement(sql);
            DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
            pst.setString(2, dateFormat.format(conce.getFecha()));
            pst.setString(1, conce.getAccion());

            pst.execute();
            pst.close();

            mensaje = "Success!";
        } catch (Exception e) {
            System.out.println("Ocurrio un error" + e);
        }
        return mensaje;
    }

    public String eliminarBitacora(Connection con, int id) {
        return mensaje;
    }

    public void listarBitacora(Connection con, JTable tabla) {
        DefaultTableModel model;
        String[] columnas = {"Fecha", "Accion"};
        model = new DefaultTableModel(null, columnas);

        String sql = "select * from Bitacora";

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
