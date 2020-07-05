/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbmanager.dao;

import Consecionario.Empresa;
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
public class EmpresaDAO {

    String mensaje = "";

    public String agregarEMPRESA(Connection con, Empresa conce) {
        PreparedStatement pst = null;
        String x = "(select idEMPRESA from EMPRESA ORDER BY idEMPRESA DESC LIMIT 1)";

        String sql = "INSERT INTO EMPRESA "
                + "VALUES(?,?)";

        try {
            pst = con.prepareStatement(sql);

            pst.setString(1, "" + conce.getTipo_empresa());
            pst.setInt(2, conce.getIdClientes());

            pst.execute();
            pst.close();

            mensaje = "Success!";
        } catch (Exception e) {
            System.out.println("Ocurrio un error" + e);
        }
        return mensaje;
    }

    public String modificarEMPRESA(Connection con, Empresa conce) {
        PreparedStatement pst = null;
        String x = "(select idEMPRESA from EMPRESA ORDER BY idEMPRESA DESC LIMIT 1)";

        String sql = "UPDATE EMPRESA SET TIPO_EMPRESA = ?"
                + "WHERE idClientes = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, "" + conce.getTipo_empresa());
            pst.setInt(2, conce.getIdClientes());

            pst.execute();
            pst.close();

            mensaje = "Success!";
        } catch (Exception e) {
            System.out.println("Ocurrio un error" + e);
        }
        return mensaje;
    }

    public String eliminarEMPRESA(Connection con, int id) {
        return mensaje;
    }

    public void listarEMPRESA(Connection con, JTable tabla) {
        DefaultTableModel model;
        String[] columnas = {"Tipo Empresa", "ID Cliente"};
        model = new DefaultTableModel(null, columnas);

        String sql = "select * from EMPRESA";

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
