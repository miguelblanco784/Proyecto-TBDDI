/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbmanager.dao;

import Consecionario.Concesionario;
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
public class ConcesionarioDAO {
    
    String mensaje = "";
    
    public String agregarConcesionario(Connection con, Concesionario conce) {
        PreparedStatement pst = null;
        String x = "(select idConcesionario from concesionario ORDER BY idConcesionario DESC LIMIT 1)";
        
        String sql = "INSERT INTO CONCESIONARIO (idConcesionario, Nombre, Status, Correo, Telefono)"
                + "VALUES(?,?,?,?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, conce.getIdConsecionario());
            pst.setString(2, conce.getNombre());
            pst.setString(3, "" + conce.getStatus());
            pst.setString(4, conce.getCorreo());
            pst.setString(5, conce.getTelefono());
            pst.execute();
            pst.close();
            
            mensaje = "Success!";
        } catch (Exception e) {
            System.out.println("Ocurrio un error" + e);
        }
        return mensaje;
    }
    
    public String modificarConcesionario(Connection con, Concesionario conce) {
        PreparedStatement pst = null;
        String x = "(select idConcesionario from concesionario ORDER BY idConcesionario DESC LIMIT 1)";
        
        String sql = "UPDATE CONSECIONARIO SET Nombre = ?, Status = ?, Correo = ?, Telefono = ?"
                + "WHERE idConcesionario = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(5, conce.getIdConsecionario());
            pst.setString(1, conce.getNombre());
            pst.setString(2, "" + conce.getStatus());
            pst.setString(3, conce.getCorreo());
            pst.setString(4, conce.getTelefono());
            pst.execute();
            pst.close();
            
            mensaje = "Success!";
        } catch (Exception e) {
            System.out.println("Ocurrio un error" + e);
        }
        return mensaje;
    }
    
    public String eliminarConcesionario(Connection con, int id) {
        return mensaje;
    }
    
    public void listarConcesionario(Connection con, JTable tabla) {
        DefaultTableModel model;
        String[] columnas = {"idConcesionario", "Nombre", "Status", "Correo", "Telefono"};
        model = new DefaultTableModel(null, columnas);
        
        String sql = "select * from concesionario";
        
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
