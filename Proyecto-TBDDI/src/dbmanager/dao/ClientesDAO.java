package dbmanager.dao;

import Consecionario.Clientes;
import java.sql.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ClientesDAO {

    String mensaje = "";

    public String agregarCLIENTES(Connection con, Clientes conce) {
        PreparedStatement pst = null;
        String x = "(select idClientes from CLIENTES ORDER BY idClientes DESC LIMIT 1)";

        String sql = "INSERT INTO CLIENTES "
                + "VALUES(?,?,?,?)";
        try {
            pst = con.prepareStatement(sql);
            
            pst.setInt(1, conce.getIdClientes());
            pst.setString(2, conce.getNombre());
            pst.setString(3, "" + conce.getTelefono());
            pst.setInt(4, conce.getIdConsecionario());
            
            pst.execute();
            pst.close();

            mensaje = "Success!";
        } catch (Exception e) {
            System.out.println("Ocurrio un error" + e);
        }
        return mensaje;
    }

    public String modificarCLIENTES(Connection con, Clientes conce) {
        PreparedStatement pst = null;
        String x = "(select idClientes from CLIENTES ORDER BY idClientes DESC LIMIT 1)";

        String sql = "UPDATE CLIENTES SET Nombre = ?, Telefono = ?, idConcesionario = ?"
                + "WHERE idClientes = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, conce.getNombre());
            pst.setString(2, "" + conce.getTelefono());
            pst.setInt(3, conce.getIdConsecionario());
            pst.setInt(4, conce.getIdClientes());
            pst.execute();
            pst.close();

            mensaje = "Success!";
        } catch (Exception e) {
            System.out.println("Ocurrio un error" + e);
        }
        return mensaje;
    }

    public String eliminarCLIENTES(Connection con, int id) {
        return mensaje;
    }

    public void listarCLIENTES(Connection con, JTable tabla) {
        DefaultTableModel model;
        String[] columnas = {"idClientes", "Nombre", "Telefono", "idConcesionario"};
        model = new DefaultTableModel(null, columnas);

        String sql = "select * from CLIENTES";

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
