package dbmanager.dao;

import proyecto.tbddi.Usuarios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class UsuariosDAO {

    String mensaje = "";

    public String agregarUSUARIOS(Connection con, Usuarios conce) {
        PreparedStatement pst = null;
        String x = "(select idUSUARIOS from USUARIOS ORDER BY idUSUARIOS DESC LIMIT 1)";

        String sql = "INSERT INTO USUARIOS "
                + "VALUES(?,?,?)";

        try {
            pst = con.prepareStatement(sql);

            pst.setInt(1, conce.getTipo());
            pst.setString(2, conce.getUsuario());
            pst.setString(3, "" + conce.getContrasena());

            pst.execute();
            pst.close();

            mensaje = "Success!";
        } catch (Exception e) {
            System.out.println("Ocurrio un error" + e);
        }
        return mensaje;
    }

    public String modificarUSUARIOS(Connection con, Usuarios conce) {
        PreparedStatement pst = null;
        String x = "(select idUSUARIOS from USUARIOS ORDER BY idUSUARIOS DESC LIMIT 1)";

        String sql = "UPDATE USUARIOS SET Tipo = ?, Contrasena = ?"
                + "WHERE Usuario = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, conce.getTipo());
            pst.setString(2, conce.getContrasena());
            pst.setString(3, conce.getUsuario());

            pst.execute();
            pst.close();

            mensaje = "Success!";
        } catch (Exception e) {
            System.out.println("Ocurrio un error" + e);
        }
        return mensaje;
    }

    public String eliminarUSUARIOS(Connection con, int id) {
        return mensaje;
    }

    public void listarUSUARIOS(Connection con, JTable tabla) {
        DefaultTableModel model;
        String[] columnas = {"Tipo", "Usuario", "Contrasena"};
        model = new DefaultTableModel(null, columnas);

        String sql = "select * from USUARIOS";

        String[] filas = new String[4];
        Statement st = null;
        ResultSet rs = null;

        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                for (int i = 0; i < 3; i++) {
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
