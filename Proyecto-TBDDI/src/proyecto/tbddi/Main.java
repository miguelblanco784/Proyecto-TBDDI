package proyecto.tbddi;

import Concesionario.Clientes;
import Concesionario.Vehiculo;
import Concesionario.Factura_Clientes;
import Concesionario.Planta;
import Concesionario.Persona;
import Concesionario.Modelo;
import Concesionario.Marca;
import Concesionario.Empresa;
import Concesionario.Concesionario;
import Concesionario.Concesionario_Has_Marca;
import Concesionario.Inventario_Concesionario;
import dbmanager.Conexion;
import dbmanager.bo.*;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        listar();
    }

    public void listar() {
        conbo.listarConcesionario(tb_concesionario);
        conbo.listarClientes(tb_clientes);
        conbo.listarPersona(tb_persona);
        conbo.listarEmpresa(jt_empresa);
        conbo.listarMarca(jt_marca);
        conbo.listarConcesionario_Has_Marca(jt_concehasmarca);
        conbo.listarFACTURA_CLIENTES(jt_facturasclientes);
        conbo.listarModelo(jt_modelo);
        conbo.listarPlanta(jt_planta);
        conbo.listarVehiculo(jt_vehiculo);
        conbo.listarInventario_Concesionario(jt_inventarioconcesionario);
    }

    TeoriaBDDBO conbo = new TeoriaBDDBO();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_CRUD = new javax.swing.JDialog();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_concesionario = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_clientes = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tb_persona = new javax.swing.JTable();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jt_empresa = new javax.swing.JTable();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jt_marca = new javax.swing.JTable();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jt_concehasmarca = new javax.swing.JTable();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jt_facturasclientes = new javax.swing.JTable();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jt_modelo = new javax.swing.JTable();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jt_planta = new javax.swing.JTable();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jt_vehiculo = new javax.swing.JTable();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jt_inventarioconcesionario = new javax.swing.JTable();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane12 = new javax.swing.JScrollPane();
        jt_marca7 = new javax.swing.JTable();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane13 = new javax.swing.JScrollPane();
        jt_marca8 = new javax.swing.JTable();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jScrollPane14 = new javax.swing.JScrollPane();
        jt_marca9 = new javax.swing.JTable();
        jButton32 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jScrollPane15 = new javax.swing.JScrollPane();
        jt_marca10 = new javax.swing.JTable();
        jButton34 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jScrollPane16 = new javax.swing.JScrollPane();
        jt_marca11 = new javax.swing.JTable();
        jButton36 = new javax.swing.JButton();
        jButton37 = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jScrollPane17 = new javax.swing.JScrollPane();
        jt_marca12 = new javax.swing.JTable();
        jButton38 = new javax.swing.JButton();
        jButton39 = new javax.swing.JButton();
        jPanel18 = new javax.swing.JPanel();
        jScrollPane18 = new javax.swing.JScrollPane();
        jt_marca13 = new javax.swing.JTable();
        jButton40 = new javax.swing.JButton();
        jButton41 = new javax.swing.JButton();
        jPanel19 = new javax.swing.JPanel();
        jScrollPane19 = new javax.swing.JScrollPane();
        jt_marca14 = new javax.swing.JTable();
        jButton42 = new javax.swing.JButton();
        jButton43 = new javax.swing.JButton();
        jd_crearconcesionario = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jl_nombrecon = new javax.swing.JLabel();
        tf_correocon = new javax.swing.JTextField();
        jl_correocon = new javax.swing.JLabel();
        jl_telefonocon = new javax.swing.JLabel();
        tf_telefonocon = new javax.swing.JTextField();
        tf_nombrecon = new javax.swing.JTextField();
        jb_crearcon = new javax.swing.JButton();
        jd_crearclientes = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tf_nombrecliente = new javax.swing.JTextField();
        tf_telefonocliente = new javax.swing.JTextField();
        tf_concesionariocliente = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jd_crearpersona = new javax.swing.JDialog();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tf_ingresopersona = new javax.swing.JTextField();
        tf_idclientepersona = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        PersonaMF = new javax.swing.ButtonGroup();
        jd_crearempresa = new javax.swing.JDialog();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        tf_tipoempresaempresa = new javax.swing.JTextField();
        tf_idclientesempresa = new javax.swing.JTextField();
        jd_crearmarca = new javax.swing.JDialog();
        tf_nombremarca = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        tf_statusmarca = new javax.swing.JTextField();
        jButton15 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jd_crearconcehasmarca = new javax.swing.JDialog();
        jLabel17 = new javax.swing.JLabel();
        jButton44 = new javax.swing.JButton();
        tf_idmarcaconcehasmarca = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        tf_idconcesionarioconcehasmarca = new javax.swing.JTextField();
        jd_crearfacturacliente = new javax.swing.JDialog();
        jLabel19 = new javax.swing.JLabel();
        jl_nombrecon1 = new javax.swing.JLabel();
        tf_idclientefactura = new javax.swing.JTextField();
        jl_correocon1 = new javax.swing.JLabel();
        tf_totalfacturacliente = new javax.swing.JTextField();
        jb_crearcon1 = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        tf_impuestofacturacliente1 = new javax.swing.JTextField();
        tf_idconsecionariofactura = new javax.swing.JTextField();
        Admin = new javax.swing.JDialog();
        jLabel22 = new javax.swing.JLabel();
        jButton47 = new javax.swing.JButton();
        jButton48 = new javax.swing.JButton();
        jButton49 = new javax.swing.JButton();
        jButton50 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        adminusuarios = new javax.swing.JDialog();
        jScrollPane20 = new javax.swing.JScrollPane();
        jt_adminusuarios = new javax.swing.JTable();
        jButton46 = new javax.swing.JButton();
        jButton51 = new javax.swing.JButton();
        jButton52 = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        administrarbitacora = new javax.swing.JDialog();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane21 = new javax.swing.JScrollPane();
        ta_accionbitacora = new javax.swing.JTextArea();
        jButton53 = new javax.swing.JButton();
        listarbitacora = new javax.swing.JDialog();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane22 = new javax.swing.JScrollPane();
        jt_listarbitacora = new javax.swing.JTable();
        jButton54 = new javax.swing.JButton();
        jButton55 = new javax.swing.JButton();
        jButton56 = new javax.swing.JButton();
        jd_crearmodelo = new javax.swing.JDialog();
        jLabel28 = new javax.swing.JLabel();
        jl_nombrecon2 = new javax.swing.JLabel();
        tf_tipomotormodelo = new javax.swing.JTextField();
        jl_correocon2 = new javax.swing.JLabel();
        jl_telefonocon1 = new javax.swing.JLabel();
        tf_transmisionmodelo = new javax.swing.JTextField();
        tf_nombremodelo = new javax.swing.JTextField();
        jb_crearcon2 = new javax.swing.JButton();
        jl_telefonocon2 = new javax.swing.JLabel();
        tf_idmarcamodelo = new javax.swing.JTextField();
        jd_crearplanta = new javax.swing.JDialog();
        jLabel29 = new javax.swing.JLabel();
        jl_nombrecon3 = new javax.swing.JLabel();
        tf_tipoplantaplanta = new javax.swing.JTextField();
        jl_correocon3 = new javax.swing.JLabel();
        jl_telefonocon3 = new javax.swing.JLabel();
        tf_direccionplanta = new javax.swing.JTextField();
        tf_nombreplanta = new javax.swing.JTextField();
        jb_crearcon3 = new javax.swing.JButton();
        jd_crearvehiculo = new javax.swing.JDialog();
        jLabel30 = new javax.swing.JLabel();
        jl_nombrecon4 = new javax.swing.JLabel();
        tf_preciovehiculo = new javax.swing.JTextField();
        jl_correocon4 = new javax.swing.JLabel();
        jl_telefonocon4 = new javax.swing.JLabel();
        tf_idplantavehiculo = new javax.swing.JTextField();
        tf_vinvehiculo = new javax.swing.JTextField();
        jb_crearcon4 = new javax.swing.JButton();
        jl_telefonocon5 = new javax.swing.JLabel();
        tf_idmodelovehiculo = new javax.swing.JTextField();
        jd_crearinventarioconcesionario = new javax.swing.JDialog();
        tf_vininveconce = new javax.swing.JTextField();
        jb_crearcon5 = new javax.swing.JButton();
        tf_statusinvenconce = new javax.swing.JTextField();
        jl_telefonocon7 = new javax.swing.JLabel();
        jl_correocon5 = new javax.swing.JLabel();
        tf_idconceinvenconce = new javax.swing.JTextField();
        jl_nombrecon5 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        Vendedor = new javax.swing.JDialog();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        cb_busqueda = new javax.swing.JComboBox<>();
        tf_busquedacarros = new javax.swing.JTextField();
        jButton57 = new javax.swing.JButton();
        jScrollPane23 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jd_views = new javax.swing.JDialog();
        jLabel34 = new javax.swing.JLabel();
        jScrollPane24 = new javax.swing.JScrollPane();
        jt_views = new javax.swing.JTable();
        cb_views = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        Cliente = new javax.swing.JDialog();
        jLabel35 = new javax.swing.JLabel();
        cb_concesionariolistavehiculos = new javax.swing.JComboBox<>();
        jScrollPane25 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel36 = new javax.swing.JLabel();
        jButton58 = new javax.swing.JButton();
        jd_agregarusuario = new javax.swing.JDialog();
        tf_contrasenausuario = new javax.swing.JTextField();
        jButton59 = new javax.swing.JButton();
        tf_nombreusuario = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        tf_tipousuario = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jButton45 = new javax.swing.JButton();
        tf_usuariologin = new javax.swing.JTextField();
        pf_contralogin = new javax.swing.JPasswordField();

        jd_CRUD.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tb_concesionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tb_concesionario);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, 986, 450));

        jButton2.setText("Modificar");
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 510, 150, 80));

        jButton3.setText("Crear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 150, 80));

        jTabbedPane1.addTab("Concesionario", jPanel1);

        tb_clientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tb_clientes);

        jButton4.setText("Crear");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Modificar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 986, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Clientes", jPanel2);

        tb_persona.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tb_persona);

        jButton7.setText("Modificar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Crear");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 991, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(22, 22, 22)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(843, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(504, Short.MAX_VALUE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(21, 21, 21)))
        );

        jTabbedPane1.addTab("Persona", jPanel3);

        jt_empresa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(jt_empresa);

        jButton11.setText("Crear");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setText("Modificar");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 991, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton11, jButton12});

        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                    .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton11, jButton12});

        jTabbedPane1.addTab("Empresa", jPanel4);

        jt_marca.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane5.setViewportView(jt_marca);

        jButton13.setText("Crear");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setText("Modificar");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 991, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel5Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton13, jButton14});

        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton14))
                .addContainerGap())
        );

        jPanel5Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton13, jButton14});

        jTabbedPane1.addTab("Marca", jPanel5);

        jt_concehasmarca.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane6.setViewportView(jt_concehasmarca);

        jButton16.setText("Crear");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton17.setText("Modificar");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 991, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel6Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton16, jButton17});

        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton17))
                .addContainerGap())
        );

        jPanel6Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton16, jButton17});

        jTabbedPane1.addTab("Conce has Marca", jPanel6);

        jt_facturasclientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane7.setViewportView(jt_facturasclientes);

        jButton18.setText("Crear");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton19.setText("Modificar");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 991, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel7Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton18, jButton19});

        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton19))
                .addContainerGap())
        );

        jPanel7Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton18, jButton19});

        jTabbedPane1.addTab("Facturas Clientes", jPanel7);

        jt_modelo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane8.setViewportView(jt_modelo);

        jButton20.setText("Crear");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jButton21.setText("Modificar");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 991, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel8Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton20, jButton21});

        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton21))
                .addContainerGap())
        );

        jPanel8Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton20, jButton21});

        jTabbedPane1.addTab("Modelo", jPanel8);

        jt_planta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane9.setViewportView(jt_planta);

        jButton22.setText("Crear");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jButton23.setText("Modificar");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 991, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel9Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton22, jButton23});

        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton23))
                .addContainerGap())
        );

        jPanel9Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton22, jButton23});

        jTabbedPane1.addTab("Planta", jPanel9);

        jt_vehiculo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane10.setViewportView(jt_vehiculo);

        jButton24.setText("Crear");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        jButton25.setText("Modificar");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 991, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel10Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton24, jButton25});

        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton25))
                .addContainerGap())
        );

        jPanel10Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton24, jButton25});

        jTabbedPane1.addTab("Vehiculo", jPanel10);

        jt_inventarioconcesionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane11.setViewportView(jt_inventarioconcesionario);

        jButton26.setText("Crear");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        jButton27.setText("Modificar");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 991, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel11Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton26, jButton27});

        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton27))
                .addContainerGap())
        );

        jPanel11Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton26, jButton27});

        jTabbedPane1.addTab("Inventario Concesionario", jPanel11);

        jt_marca7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane12.setViewportView(jt_marca7);

        jButton28.setText("Crear");
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        jButton29.setText("Modificar");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 991, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel12Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton28, jButton29});

        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton29))
                .addContainerGap())
        );

        jPanel12Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton28, jButton29});

        jTabbedPane1.addTab("Parte", jPanel12);

        jt_marca8.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane13.setViewportView(jt_marca8);

        jButton30.setText("Crear");
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });

        jButton31.setText("Modificar");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.DEFAULT_SIZE, 991, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel13Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton30, jButton31});

        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton31))
                .addContainerGap())
        );

        jPanel13Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton30, jButton31});

        jTabbedPane1.addTab("Pieza Modelo", jPanel13);

        jt_marca9.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane14.setViewportView(jt_marca9);

        jButton32.setText("Crear");
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });

        jButton33.setText("Modificar");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane14, javax.swing.GroupLayout.DEFAULT_SIZE, 991, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel14Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton32, jButton33});

        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton33))
                .addContainerGap())
        );

        jPanel14Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton32, jButton33});

        jTabbedPane1.addTab("Pieza", jPanel14);

        jt_marca10.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane15.setViewportView(jt_marca10);

        jButton34.setText("Crear");
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });

        jButton35.setText("Modificar");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane15, javax.swing.GroupLayout.DEFAULT_SIZE, 991, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel15Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton34, jButton35});

        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton35))
                .addContainerGap())
        );

        jPanel15Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton34, jButton35});

        jTabbedPane1.addTab("Proveedor has Pieza", jPanel15);

        jt_marca11.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane16.setViewportView(jt_marca11);

        jButton36.setText("Crear");
        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton36ActionPerformed(evt);
            }
        });

        jButton37.setText("Modificar");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jButton36, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton37, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane16, javax.swing.GroupLayout.DEFAULT_SIZE, 991, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel16Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton36, jButton37});

        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton36, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton37))
                .addContainerGap())
        );

        jPanel16Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton36, jButton37});

        jTabbedPane1.addTab("Proveedor", jPanel16);

        jt_marca12.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane17.setViewportView(jt_marca12);

        jButton38.setText("Crear");
        jButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton38ActionPerformed(evt);
            }
        });

        jButton39.setText("Modificar");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(jButton38, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton39, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane17, javax.swing.GroupLayout.DEFAULT_SIZE, 991, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel17Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton38, jButton39});

        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton38, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton39))
                .addContainerGap())
        );

        jPanel17Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton38, jButton39});

        jTabbedPane1.addTab("Carroceria", jPanel17);

        jt_marca13.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane18.setViewportView(jt_marca13);

        jButton40.setText("Crear");
        jButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton40ActionPerformed(evt);
            }
        });

        jButton41.setText("Modificar");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(jButton40, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton41, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane18, javax.swing.GroupLayout.DEFAULT_SIZE, 991, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel18Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton40, jButton41});

        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton40, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton41))
                .addContainerGap())
        );

        jPanel18Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton40, jButton41});

        jTabbedPane1.addTab("Color", jPanel18);

        jt_marca14.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane19.setViewportView(jt_marca14);

        jButton42.setText("Crear");
        jButton42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton42ActionPerformed(evt);
            }
        });

        jButton43.setText("Modificar");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(jButton42, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton43, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane19, javax.swing.GroupLayout.DEFAULT_SIZE, 991, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel19Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton42, jButton43});

        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton42, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton43))
                .addContainerGap())
        );

        jPanel19Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton42, jButton43});

        jTabbedPane1.addTab("Detalle Factura Clientes", jPanel19);

        jd_CRUD.getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 7, 1020, 650));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Concesionario");

        jl_nombrecon.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jl_nombrecon.setText("Nombre");

        tf_correocon.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jl_correocon.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jl_correocon.setText("Correo");

        jl_telefonocon.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jl_telefonocon.setText("Telefono");

        tf_telefonocon.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        tf_nombrecon.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jb_crearcon.setText("Crear");
        jb_crearcon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_crearconActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_crearconcesionarioLayout = new javax.swing.GroupLayout(jd_crearconcesionario.getContentPane());
        jd_crearconcesionario.getContentPane().setLayout(jd_crearconcesionarioLayout);
        jd_crearconcesionarioLayout.setHorizontalGroup(
            jd_crearconcesionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_crearconcesionarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jd_crearconcesionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jd_crearconcesionarioLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jb_crearcon, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jd_crearconcesionarioLayout.createSequentialGroup()
                        .addComponent(jl_correocon)
                        .addGap(23, 23, 23)
                        .addComponent(tf_correocon))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jd_crearconcesionarioLayout.createSequentialGroup()
                        .addComponent(jl_telefonocon)
                        .addGap(11, 11, 11)
                        .addComponent(tf_telefonocon))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jd_crearconcesionarioLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 181, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jd_crearconcesionarioLayout.createSequentialGroup()
                        .addComponent(jl_nombrecon)
                        .addGap(18, 18, 18)
                        .addComponent(tf_nombrecon)))
                .addContainerGap())
        );
        jd_crearconcesionarioLayout.setVerticalGroup(
            jd_crearconcesionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_crearconcesionarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addGroup(jd_crearconcesionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_nombrecon)
                    .addComponent(tf_nombrecon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_crearconcesionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_correocon)
                    .addComponent(tf_correocon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_crearconcesionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_telefonocon)
                    .addComponent(tf_telefonocon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(jb_crearcon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setText("Clientes");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setText("Telefono");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setText("Nombre");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setText("Concesionario");

        tf_nombrecliente.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        tf_telefonocliente.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tf_telefonocliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_telefonoclienteActionPerformed(evt);
            }
        });

        tf_concesionariocliente.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jButton6.setText("Crear");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_crearclientesLayout = new javax.swing.GroupLayout(jd_crearclientes.getContentPane());
        jd_crearclientes.getContentPane().setLayout(jd_crearclientesLayout);
        jd_crearclientesLayout.setHorizontalGroup(
            jd_crearclientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_crearclientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jd_crearclientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jd_crearclientesLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jd_crearclientesLayout.createSequentialGroup()
                        .addGroup(jd_crearclientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addGap(71, 71, 71)
                        .addGroup(jd_crearclientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_nombrecliente, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                            .addComponent(tf_telefonocliente)
                            .addComponent(tf_concesionariocliente))))
                .addContainerGap())
        );
        jd_crearclientesLayout.setVerticalGroup(
            jd_crearclientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_crearclientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jd_crearclientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tf_nombrecliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_crearclientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tf_telefonocliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_crearclientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tf_concesionariocliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel6.setText("Persona");

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel7.setText("Ingreso");

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel8.setText("Sexo");

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel9.setText("Cliente ID");

        tf_ingresopersona.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        tf_idclientepersona.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jButton9.setText("Guardar");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        PersonaMF.add(jRadioButton1);
        jRadioButton1.setText("M");

        PersonaMF.add(jRadioButton2);
        jRadioButton2.setSelected(true);
        jRadioButton2.setText("F");

        javax.swing.GroupLayout jd_crearpersonaLayout = new javax.swing.GroupLayout(jd_crearpersona.getContentPane());
        jd_crearpersona.getContentPane().setLayout(jd_crearpersonaLayout);
        jd_crearpersonaLayout.setHorizontalGroup(
            jd_crearpersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_crearpersonaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jd_crearpersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jd_crearpersonaLayout.createSequentialGroup()
                        .addGroup(jd_crearpersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9))
                        .addGap(64, 64, 64)
                        .addGroup(jd_crearpersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_ingresopersona, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_idclientepersona, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jd_crearpersonaLayout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jRadioButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton2)))))
                .addContainerGap(42, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_crearpersonaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jd_crearpersonaLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {tf_idclientepersona, tf_ingresopersona});

        jd_crearpersonaLayout.setVerticalGroup(
            jd_crearpersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_crearpersonaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(jd_crearpersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 16, Short.MAX_VALUE)
                .addGroup(jd_crearpersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(jd_crearpersonaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tf_ingresopersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jd_crearpersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tf_idclientepersona, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        jd_crearpersonaLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {tf_idclientepersona, tf_ingresopersona});

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel10.setText("Empresa");

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel11.setText("Tipo Empresa");

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel12.setText("ID Clientes");

        jButton10.setText("Crear");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        tf_tipoempresaempresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_tipoempresaempresaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_crearempresaLayout = new javax.swing.GroupLayout(jd_crearempresa.getContentPane());
        jd_crearempresa.getContentPane().setLayout(jd_crearempresaLayout);
        jd_crearempresaLayout.setHorizontalGroup(
            jd_crearempresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_crearempresaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jd_crearempresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_crearempresaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_crearempresaLayout.createSequentialGroup()
                        .addGroup(jd_crearempresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)
                            .addComponent(jLabel12))
                        .addGap(28, 28, 28)
                        .addGroup(jd_crearempresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_tipoempresaempresa, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_idclientesempresa, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        jd_crearempresaLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {tf_idclientesempresa, tf_tipoempresaempresa});

        jd_crearempresaLayout.setVerticalGroup(
            jd_crearempresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_crearempresaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addGroup(jd_crearempresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(tf_tipoempresaempresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_crearempresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(tf_idclientesempresa, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jd_crearempresaLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {tf_idclientesempresa, tf_tipoempresaempresa});

        tf_nombremarca.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel13.setText("Status");

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel14.setText("Marca");

        tf_statusmarca.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tf_statusmarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_statusmarcaActionPerformed(evt);
            }
        });

        jButton15.setText("Crear");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel16.setText("Nombre");

        javax.swing.GroupLayout jd_crearmarcaLayout = new javax.swing.GroupLayout(jd_crearmarca.getContentPane());
        jd_crearmarca.getContentPane().setLayout(jd_crearmarcaLayout);
        jd_crearmarcaLayout.setHorizontalGroup(
            jd_crearmarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_crearmarcaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jd_crearmarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jd_crearmarcaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jd_crearmarcaLayout.createSequentialGroup()
                        .addGroup(jd_crearmarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel13))
                        .addGap(113, 113, 113)
                        .addGroup(jd_crearmarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_nombremarca, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                            .addComponent(tf_statusmarca))))
                .addContainerGap())
        );
        jd_crearmarcaLayout.setVerticalGroup(
            jd_crearmarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_crearmarcaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addGroup(jd_crearmarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(tf_nombremarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_crearmarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(tf_statusmarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel17.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel17.setText("Id Concesionario");

        jButton44.setText("Crear");
        jButton44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton44ActionPerformed(evt);
            }
        });

        tf_idmarcaconcehasmarca.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tf_idmarcaconcehasmarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_idmarcaconcehasmarcaActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel15.setText("Concesionario Has Marca");

        jLabel18.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel18.setText("Id Marca");

        tf_idconcesionarioconcehasmarca.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        javax.swing.GroupLayout jd_crearconcehasmarcaLayout = new javax.swing.GroupLayout(jd_crearconcehasmarca.getContentPane());
        jd_crearconcehasmarca.getContentPane().setLayout(jd_crearconcehasmarcaLayout);
        jd_crearconcehasmarcaLayout.setHorizontalGroup(
            jd_crearconcehasmarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_crearconcehasmarcaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jd_crearconcehasmarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jd_crearconcehasmarcaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton44, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jd_crearconcehasmarcaLayout.createSequentialGroup()
                        .addGroup(jd_crearconcehasmarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18))
                        .addGap(113, 113, 113)
                        .addGroup(jd_crearconcehasmarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_idconcesionarioconcehasmarca, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                            .addComponent(tf_idmarcaconcehasmarca))))
                .addContainerGap())
        );
        jd_crearconcehasmarcaLayout.setVerticalGroup(
            jd_crearconcehasmarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_crearconcehasmarcaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addGroup(jd_crearconcehasmarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(tf_idconcesionarioconcehasmarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_crearconcehasmarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(tf_idmarcaconcehasmarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addComponent(jButton44, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel19.setText("Factura Cliente");

        jl_nombrecon1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jl_nombrecon1.setText("Total");

        tf_idclientefactura.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jl_correocon1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jl_correocon1.setText("Impuesto");

        tf_totalfacturacliente.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jb_crearcon1.setText("Crear");
        jb_crearcon1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_crearcon1ActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel26.setText("Id Concesionario");

        jLabel27.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel27.setText("Id Cliente");

        tf_impuestofacturacliente1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        tf_idconsecionariofactura.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        javax.swing.GroupLayout jd_crearfacturaclienteLayout = new javax.swing.GroupLayout(jd_crearfacturacliente.getContentPane());
        jd_crearfacturacliente.getContentPane().setLayout(jd_crearfacturaclienteLayout);
        jd_crearfacturaclienteLayout.setHorizontalGroup(
            jd_crearfacturaclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_crearfacturaclienteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jd_crearfacturaclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jl_nombrecon1)
                    .addComponent(jLabel27)
                    .addComponent(jLabel26)
                    .addComponent(jl_correocon1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jd_crearfacturaclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_totalfacturacliente, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_impuestofacturacliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_idconsecionariofactura, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_idclientefactura, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_crearfacturaclienteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jb_crearcon1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
            .addGroup(jd_crearfacturaclienteLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel19)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jd_crearfacturaclienteLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {tf_idclientefactura, tf_idconsecionariofactura, tf_impuestofacturacliente1, tf_totalfacturacliente});

        jd_crearfacturaclienteLayout.setVerticalGroup(
            jd_crearfacturaclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_crearfacturaclienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addGap(38, 38, 38)
                .addGroup(jd_crearfacturaclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_nombrecon1)
                    .addComponent(tf_totalfacturacliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_crearfacturaclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_correocon1)
                    .addComponent(tf_impuestofacturacliente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_crearfacturaclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(tf_idconsecionariofactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_crearfacturaclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(tf_idclientefactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jb_crearcon1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jd_crearfacturaclienteLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {tf_idclientefactura, tf_idconsecionariofactura, tf_impuestofacturacliente1, tf_totalfacturacliente});

        jLabel22.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel22.setText("Administrador");

        jButton47.setText("Administrar Usuarios");
        jButton47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton47ActionPerformed(evt);
            }
        });

        jButton48.setText("Administrar Tablas");
        jButton48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton48ActionPerformed(evt);
            }
        });

        jButton49.setText("Administrar Bitacora");
        jButton49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton49ActionPerformed(evt);
            }
        });

        jButton50.setText("Admiistrar Vistas");
        jButton50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton50ActionPerformed(evt);
            }
        });

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Webp.net-resizeimage.png"))); // NOI18N

        javax.swing.GroupLayout AdminLayout = new javax.swing.GroupLayout(Admin.getContentPane());
        Admin.getContentPane().setLayout(AdminLayout);
        AdminLayout.setHorizontalGroup(
            AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdminLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel22)
                .addGap(212, 212, 212)
                .addComponent(jLabel21)
                .addContainerGap())
            .addGroup(AdminLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton47, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton48)
                .addGap(18, 18, 18)
                .addComponent(jButton49)
                .addGap(18, 18, 18)
                .addComponent(jButton50)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        AdminLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton47, jButton48, jButton49, jButton50});

        AdminLayout.setVerticalGroup(
            AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdminLayout.createSequentialGroup()
                .addGroup(AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AdminLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel21))
                    .addGroup(AdminLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel22)))
                .addGap(64, 64, 64)
                .addGroup(AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jButton48)
                    .addComponent(jButton47, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton49)
                    .addComponent(jButton50))
                .addContainerGap(109, Short.MAX_VALUE))
        );

        AdminLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton47, jButton48, jButton49, jButton50});

        jt_adminusuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane20.setViewportView(jt_adminusuarios);

        jButton46.setText("Agregar");
        jButton46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton46ActionPerformed(evt);
            }
        });

        jButton51.setText("Modificar");

        jButton52.setText("Eliminar");

        jLabel23.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel23.setText("Usuarios");

        javax.swing.GroupLayout adminusuariosLayout = new javax.swing.GroupLayout(adminusuarios.getContentPane());
        adminusuarios.getContentPane().setLayout(adminusuariosLayout);
        adminusuariosLayout.setHorizontalGroup(
            adminusuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane20, javax.swing.GroupLayout.DEFAULT_SIZE, 577, Short.MAX_VALUE)
            .addGroup(adminusuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(adminusuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(adminusuariosLayout.createSequentialGroup()
                        .addComponent(jButton46)
                        .addGap(18, 18, 18)
                        .addComponent(jButton51)
                        .addGap(18, 18, 18)
                        .addComponent(jButton52, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel23))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        adminusuariosLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton46, jButton51, jButton52});

        adminusuariosLayout.setVerticalGroup(
            adminusuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminusuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(adminusuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(adminusuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton46)
                        .addComponent(jButton51))
                    .addComponent(jButton52, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        adminusuariosLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton46, jButton51, jButton52});

        jLabel24.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel24.setText("Bitacora");

        ta_accionbitacora.setColumns(20);
        ta_accionbitacora.setRows(5);
        jScrollPane21.setViewportView(ta_accionbitacora);

        jButton53.setText("Guardar");
        jButton53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton53ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout administrarbitacoraLayout = new javax.swing.GroupLayout(administrarbitacora.getContentPane());
        administrarbitacora.getContentPane().setLayout(administrarbitacoraLayout);
        administrarbitacoraLayout.setHorizontalGroup(
            administrarbitacoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, administrarbitacoraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(administrarbitacoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(administrarbitacoraLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton53, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane21, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, administrarbitacoraLayout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        administrarbitacoraLayout.setVerticalGroup(
            administrarbitacoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(administrarbitacoraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane21, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton53, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel25.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel25.setText("Bitacora");

        jt_listarbitacora.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane22.setViewportView(jt_listarbitacora);

        jButton54.setText("Agregar");
        jButton54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton54ActionPerformed(evt);
            }
        });

        jButton55.setText("Modificar");

        jButton56.setText("Eliminar");

        javax.swing.GroupLayout listarbitacoraLayout = new javax.swing.GroupLayout(listarbitacora.getContentPane());
        listarbitacora.getContentPane().setLayout(listarbitacoraLayout);
        listarbitacoraLayout.setHorizontalGroup(
            listarbitacoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane22, javax.swing.GroupLayout.DEFAULT_SIZE, 1024, Short.MAX_VALUE)
            .addGroup(listarbitacoraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(listarbitacoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25)
                    .addGroup(listarbitacoraLayout.createSequentialGroup()
                        .addComponent(jButton54)
                        .addGap(18, 18, 18)
                        .addComponent(jButton55)
                        .addGap(18, 18, 18)
                        .addComponent(jButton56, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        listarbitacoraLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton54, jButton55, jButton56});

        listarbitacoraLayout.setVerticalGroup(
            listarbitacoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listarbitacoraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane22, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(listarbitacoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton54)
                    .addComponent(jButton55)
                    .addComponent(jButton56, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        listarbitacoraLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton54, jButton55, jButton56});

        jLabel28.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel28.setText("Modelo");

        jl_nombrecon2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jl_nombrecon2.setText("Nombre");

        tf_tipomotormodelo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jl_correocon2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jl_correocon2.setText("Tipo Motor");

        jl_telefonocon1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jl_telefonocon1.setText("Transmision");

        tf_transmisionmodelo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        tf_nombremodelo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jb_crearcon2.setText("Crear");
        jb_crearcon2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_crearcon2ActionPerformed(evt);
            }
        });

        jl_telefonocon2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jl_telefonocon2.setText("Id Marca");

        tf_idmarcamodelo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        javax.swing.GroupLayout jd_crearmodeloLayout = new javax.swing.GroupLayout(jd_crearmodelo.getContentPane());
        jd_crearmodelo.getContentPane().setLayout(jd_crearmodeloLayout);
        jd_crearmodeloLayout.setHorizontalGroup(
            jd_crearmodeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_crearmodeloLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jd_crearmodeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jd_crearmodeloLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jb_crearcon2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jd_crearmodeloLayout.createSequentialGroup()
                        .addComponent(jl_nombrecon2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tf_nombremodelo, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jd_crearmodeloLayout.createSequentialGroup()
                        .addComponent(jl_telefonocon2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tf_idmarcamodelo, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jd_crearmodeloLayout.createSequentialGroup()
                        .addComponent(jl_telefonocon1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(tf_transmisionmodelo, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jd_crearmodeloLayout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jd_crearmodeloLayout.createSequentialGroup()
                        .addComponent(jl_correocon2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tf_tipomotormodelo, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jd_crearmodeloLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {tf_idmarcamodelo, tf_nombremodelo, tf_tipomotormodelo, tf_transmisionmodelo});

        jd_crearmodeloLayout.setVerticalGroup(
            jd_crearmodeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_crearmodeloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel28)
                .addGap(38, 38, 38)
                .addGroup(jd_crearmodeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_nombrecon2)
                    .addComponent(tf_nombremodelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_crearmodeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_correocon2)
                    .addComponent(tf_tipomotormodelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_crearmodeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_telefonocon1)
                    .addComponent(tf_transmisionmodelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_crearmodeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_telefonocon2)
                    .addComponent(tf_idmarcamodelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(jb_crearcon2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jd_crearmodeloLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {tf_idmarcamodelo, tf_nombremodelo, tf_tipomotormodelo, tf_transmisionmodelo});

        jLabel29.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel29.setText("Planta");

        jl_nombrecon3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jl_nombrecon3.setText("Nombre");

        tf_tipoplantaplanta.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jl_correocon3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jl_correocon3.setText("Tipo Planta");

        jl_telefonocon3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jl_telefonocon3.setText("Direccion");

        tf_direccionplanta.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        tf_nombreplanta.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jb_crearcon3.setText("Crear");
        jb_crearcon3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_crearcon3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_crearplantaLayout = new javax.swing.GroupLayout(jd_crearplanta.getContentPane());
        jd_crearplanta.getContentPane().setLayout(jd_crearplantaLayout);
        jd_crearplantaLayout.setHorizontalGroup(
            jd_crearplantaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_crearplantaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jd_crearplantaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jb_crearcon3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jd_crearplantaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jd_crearplantaLayout.createSequentialGroup()
                            .addComponent(jl_telefonocon3)
                            .addGap(25, 25, 25)
                            .addComponent(tf_direccionplanta, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jd_crearplantaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jd_crearplantaLayout.createSequentialGroup()
                                .addComponent(jl_correocon3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_tipoplantaplanta, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jd_crearplantaLayout.createSequentialGroup()
                            .addComponent(jl_nombrecon3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tf_nombreplanta, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jd_crearplantaLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {tf_direccionplanta, tf_nombreplanta, tf_tipoplantaplanta});

        jd_crearplantaLayout.setVerticalGroup(
            jd_crearplantaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_crearplantaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel29)
                .addGap(38, 38, 38)
                .addGroup(jd_crearplantaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_nombrecon3)
                    .addComponent(tf_nombreplanta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_crearplantaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_correocon3)
                    .addComponent(tf_tipoplantaplanta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_crearplantaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_telefonocon3)
                    .addComponent(tf_direccionplanta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(jb_crearcon3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jd_crearplantaLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {tf_direccionplanta, tf_nombreplanta, tf_tipoplantaplanta});

        jLabel30.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel30.setText("Vehiculo");

        jl_nombrecon4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jl_nombrecon4.setText("Vin");

        tf_preciovehiculo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jl_correocon4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jl_correocon4.setText("Precio");

        jl_telefonocon4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jl_telefonocon4.setText("Id Modelo");

        tf_idplantavehiculo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        tf_vinvehiculo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jb_crearcon4.setText("Crear");
        jb_crearcon4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_crearcon4ActionPerformed(evt);
            }
        });

        jl_telefonocon5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jl_telefonocon5.setText("Id Planta");

        tf_idmodelovehiculo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        javax.swing.GroupLayout jd_crearvehiculoLayout = new javax.swing.GroupLayout(jd_crearvehiculo.getContentPane());
        jd_crearvehiculo.getContentPane().setLayout(jd_crearvehiculoLayout);
        jd_crearvehiculoLayout.setHorizontalGroup(
            jd_crearvehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_crearvehiculoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel30)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_crearvehiculoLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jd_crearvehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jl_nombrecon4)
                    .addComponent(jl_correocon4)
                    .addComponent(jl_telefonocon4)
                    .addComponent(jl_telefonocon5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jd_crearvehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_preciovehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_idmodelovehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_vinvehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_idplantavehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(87, 87, 87))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_crearvehiculoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jb_crearcon4, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jd_crearvehiculoLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {tf_idmodelovehiculo, tf_idplantavehiculo, tf_preciovehiculo, tf_vinvehiculo});

        jd_crearvehiculoLayout.setVerticalGroup(
            jd_crearvehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_crearvehiculoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel30)
                .addGap(36, 36, 36)
                .addGroup(jd_crearvehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_vinvehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_nombrecon4))
                .addGap(18, 18, 18)
                .addGroup(jd_crearvehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_preciovehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_correocon4))
                .addGap(22, 22, 22)
                .addGroup(jd_crearvehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_idmodelovehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_telefonocon4))
                .addGap(18, 18, 18)
                .addGroup(jd_crearvehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_telefonocon5)
                    .addComponent(tf_idplantavehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addComponent(jb_crearcon4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jd_crearvehiculoLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {tf_idmodelovehiculo, tf_idplantavehiculo, tf_preciovehiculo, tf_vinvehiculo});

        tf_vininveconce.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jb_crearcon5.setText("Crear");
        jb_crearcon5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_crearcon5ActionPerformed(evt);
            }
        });

        tf_statusinvenconce.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jl_telefonocon7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jl_telefonocon7.setText("VIN");

        jl_correocon5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jl_correocon5.setText("Id Concesionario");

        tf_idconceinvenconce.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jl_nombrecon5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jl_nombrecon5.setText("Status");

        jLabel31.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel31.setText("Inventario Concesionario");

        javax.swing.GroupLayout jd_crearinventarioconcesionarioLayout = new javax.swing.GroupLayout(jd_crearinventarioconcesionario.getContentPane());
        jd_crearinventarioconcesionario.getContentPane().setLayout(jd_crearinventarioconcesionarioLayout);
        jd_crearinventarioconcesionarioLayout.setHorizontalGroup(
            jd_crearinventarioconcesionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_crearinventarioconcesionarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel31)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_crearinventarioconcesionarioLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jd_crearinventarioconcesionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jl_nombrecon5)
                    .addComponent(jl_correocon5)
                    .addComponent(jl_telefonocon7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jd_crearinventarioconcesionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_idconceinvenconce, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_statusinvenconce, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jd_crearinventarioconcesionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jb_crearcon5, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_vininveconce, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(87, 87, 87))
        );

        jd_crearinventarioconcesionarioLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {tf_idconceinvenconce, tf_statusinvenconce, tf_vininveconce});

        jd_crearinventarioconcesionarioLayout.setVerticalGroup(
            jd_crearinventarioconcesionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_crearinventarioconcesionarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel31)
                .addGap(36, 36, 36)
                .addGroup(jd_crearinventarioconcesionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_statusinvenconce, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_nombrecon5))
                .addGap(18, 18, 18)
                .addGroup(jd_crearinventarioconcesionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_idconceinvenconce, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_correocon5))
                .addGap(22, 22, 22)
                .addGroup(jd_crearinventarioconcesionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_vininveconce, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_telefonocon7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 154, Short.MAX_VALUE)
                .addComponent(jb_crearcon5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jd_crearinventarioconcesionarioLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {tf_idconceinvenconce, tf_statusinvenconce, tf_vininveconce});

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/seller (1).png"))); // NOI18N

        jLabel33.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel33.setText("Buscar Por:");

        cb_busqueda.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cb_busqueda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Precio", "Concesionario", "VIN ", "Ubicacion" }));

        tf_busquedacarros.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jButton57.setText("Buscar");
        jButton57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton57ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane23.setViewportView(jTable1);

        javax.swing.GroupLayout VendedorLayout = new javax.swing.GroupLayout(Vendedor.getContentPane());
        Vendedor.getContentPane().setLayout(VendedorLayout);
        VendedorLayout.setHorizontalGroup(
            VendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VendedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(VendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane23, javax.swing.GroupLayout.PREFERRED_SIZE, 792, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(VendedorLayout.createSequentialGroup()
                        .addGroup(VendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton57, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(VendedorLayout.createSequentialGroup()
                                .addComponent(jLabel33)
                                .addGap(4, 4, 4)
                                .addComponent(cb_busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_busquedacarros, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel32)))
                .addGap(0, 12, Short.MAX_VALUE))
        );
        VendedorLayout.setVerticalGroup(
            VendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VendedorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane23, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(VendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(VendedorLayout.createSequentialGroup()
                        .addGroup(VendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel33)
                            .addComponent(cb_busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_busquedacarros, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton57, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel32))
                .addContainerGap())
        );

        jLabel34.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel34.setText("Views");

        jt_views.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane24.setViewportView(jt_views);

        cb_views.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cb_views.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Conteo Unidades", "Max Min", "Suma Montos", "Tendencia Año", "Tendencia Año Genero", "Tendencia Año Ingreseo", "Tendencia Mes", "Tendencia Mes Genero", "Tendencia Mes Ingreso", "Tendencia Semana", "Tendencia Semana Genero", "Tendencia Semana Ingresos", "Transmisiones", "Ventas SUV" }));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/refresh.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_viewsLayout = new javax.swing.GroupLayout(jd_views.getContentPane());
        jd_views.getContentPane().setLayout(jd_viewsLayout);
        jd_viewsLayout.setHorizontalGroup(
            jd_viewsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_viewsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jd_viewsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane24, javax.swing.GroupLayout.DEFAULT_SIZE, 1174, Short.MAX_VALUE)
                    .addGroup(jd_viewsLayout.createSequentialGroup()
                        .addComponent(jLabel34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cb_views, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        jd_viewsLayout.setVerticalGroup(
            jd_viewsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_viewsLayout.createSequentialGroup()
                .addGroup(jd_viewsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_viewsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jd_viewsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel34)
                            .addComponent(cb_views, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane24, javax.swing.GroupLayout.DEFAULT_SIZE, 608, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cliente.png"))); // NOI18N

        cb_concesionariolistavehiculos.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cb_concesionariolistavehiculos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Concesionarios", "Inventario" }));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane25.setViewportView(jTable2);

        jLabel36.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel36.setText("Clientes");

        jButton58.setText("OK");
        jButton58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton58ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ClienteLayout = new javax.swing.GroupLayout(Cliente.getContentPane());
        Cliente.getContentPane().setLayout(ClienteLayout);
        ClienteLayout.setHorizontalGroup(
            ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane25, javax.swing.GroupLayout.DEFAULT_SIZE, 732, Short.MAX_VALUE)
                    .addGroup(ClienteLayout.createSequentialGroup()
                        .addGroup(ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel36)
                            .addGroup(ClienteLayout.createSequentialGroup()
                                .addComponent(cb_concesionariolistavehiculos, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton58)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel35)))
                .addContainerGap())
        );
        ClienteLayout.setVerticalGroup(
            ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel35)
                    .addGroup(ClienteLayout.createSequentialGroup()
                        .addComponent(jLabel36)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cb_concesionariolistavehiculos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton58))))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tf_contrasenausuario.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jButton59.setText("Crear");
        jButton59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton59ActionPerformed(evt);
            }
        });

        tf_nombreusuario.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tf_nombreusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_nombreusuarioActionPerformed(evt);
            }
        });

        jLabel37.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel37.setText("Contrasena");

        tf_tipousuario.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel38.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel38.setText("Tipo");

        jLabel39.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel39.setText("Nombre");

        jLabel40.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel40.setText("Usuario");

        javax.swing.GroupLayout jd_agregarusuarioLayout = new javax.swing.GroupLayout(jd_agregarusuario.getContentPane());
        jd_agregarusuario.getContentPane().setLayout(jd_agregarusuarioLayout);
        jd_agregarusuarioLayout.setHorizontalGroup(
            jd_agregarusuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_agregarusuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jd_agregarusuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jd_agregarusuarioLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton59, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel40, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jd_agregarusuarioLayout.createSequentialGroup()
                        .addGroup(jd_agregarusuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel38)
                            .addComponent(jLabel39)
                            .addComponent(jLabel37))
                        .addGap(71, 71, 71)
                        .addGroup(jd_agregarusuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_tipousuario, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                            .addComponent(tf_nombreusuario)
                            .addComponent(tf_contrasenausuario))))
                .addContainerGap())
        );
        jd_agregarusuarioLayout.setVerticalGroup(
            jd_agregarusuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_agregarusuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel40)
                .addGap(18, 18, 18)
                .addGroup(jd_agregarusuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(tf_tipousuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_agregarusuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(tf_nombreusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_agregarusuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(tf_contrasenausuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addComponent(jButton59, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel20.setForeground(new java.awt.Color(153, 153, 153));
        jPanel20.setLayout(null);

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cropped-BMW_Grey-Colour_RGB.png"))); // NOI18N
        jPanel20.add(jLabel20);
        jLabel20.setBounds(330, 10, 530, 520);

        jButton45.setText("Login");
        jButton45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton45ActionPerformed(evt);
            }
        });
        jPanel20.add(jButton45);
        jButton45.setBounds(980, 660, 160, 50);
        jPanel20.add(tf_usuariologin);
        tf_usuariologin.setBounds(20, 640, 370, 30);
        jPanel20.add(pf_contralogin);
        pf_contralogin.setBounds(20, 680, 370, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1161, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 727, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jb_crearconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_crearconActionPerformed
        Conexion cnd = new Conexion();
        Connection con = cnd.getCon();

        String sql = "(select idConcesionario from concesionario ORDER BY idConcesionario DESC LIMIT 1)";

        Statement st = null;
        ResultSet rs = null;

        int x = 1;
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            rs.next();
            x += Integer.parseInt(rs.getString(1));
            con.close();
        } catch (Exception e) {
            System.out.println("Cagadal se te armo" + e);
        }

        Concesionario conce = new Concesionario(x, tf_nombrecon.getText(), '0', tf_correocon.getText(), tf_telefonocon.getText());
        tf_nombrecon.setText("");
        tf_correocon.setText("");
        tf_telefonocon.setText("");
        conbo.agregarConcesionario(conce);

        jd_crearconcesionario.setVisible(false);
        listar();

        // TODO add your handling code here:
    }//GEN-LAST:event_jb_crearconActionPerformed

    private void tf_telefonoclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_telefonoclienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_telefonoclienteActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        Conexion cnd = new Conexion();
        Connection con = cnd.getCon();

        String sql = "(select idClientes from CLIENTES ORDER BY idClientes DESC LIMIT 1)";

        Statement st = null;
        ResultSet rs = null;

        int x = 1;
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            rs.next();
            x += Integer.parseInt(rs.getString(1));
            con.close();
        } catch (Exception e) {
            System.out.println("Cagadal se te armo" + e);
        }

        Clientes cliente = new Clientes(x, tf_nombrecliente.getText(), tf_telefonocliente.getText(), Integer.parseInt(tf_concesionariocliente.getText()));
        tf_nombrecliente.setText("");
        tf_telefonocliente.setText("");
        tf_concesionariocliente.setText("");
        conbo.agregarClientes(cliente);

        jd_crearclientes.setVisible(false);
        listar();

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        //Guardar
        char sexo;
        if (jRadioButton1.isSelected()) {
            sexo = 'm';
        } else {
            sexo = 'f';
        }
        Persona persona = new Persona(sexo, new Double(Integer.parseInt(tf_ingresopersona.getText())), Integer.parseInt(tf_idclientepersona.getText()));
        conbo.agregarPersona(persona);
        jd_crearpersona.setVisible(false);
        listar();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed

        Empresa empresa = new Empresa(tf_tipoempresaempresa.getText(), Integer.parseInt(tf_idclientesempresa.getText()));
        conbo.agregarEmpresa(empresa);
        jd_crearempresa.setVisible(false);
        listar();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void tf_tipoempresaempresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_tipoempresaempresaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_tipoempresaempresaActionPerformed

    private void tf_statusmarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_statusmarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_statusmarcaActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        Conexion cnd = new Conexion();
        Connection con = cnd.getCon();

        String sql = "(select idMarca from MARCA ORDER BY idMarca DESC LIMIT 1)";

        Statement st = null;
        ResultSet rs = null;

        int x = 1;
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            rs.next();
            x += Integer.parseInt(rs.getString(1));
            con.close();
        } catch (Exception e) {
            System.out.println("Cagadal se te armo" + e);
        }

        Marca marca = new Marca(x, tf_nombremarca.getText(), Integer.parseInt(tf_statusmarca.getText()));
        conbo.agregarMarca(marca);

        jd_crearmarca.setVisible(false);
        listar();

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton44ActionPerformed
        Concesionario_Has_Marca conce = new Concesionario_Has_Marca(Integer.parseInt(tf_idconcesionarioconcehasmarca.getText()), Integer.parseInt(tf_idmarcaconcehasmarca.getText()));
        conbo.agregarConcesionario_Has_Marca(conce);

        jd_crearconcehasmarca.setVisible(false);
        listar();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton44ActionPerformed

    private void tf_idmarcaconcehasmarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_idmarcaconcehasmarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_idmarcaconcehasmarcaActionPerformed

    private void jb_crearcon1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_crearcon1ActionPerformed
        Conexion cnd = new Conexion();
        Connection con = cnd.getCon();

        String sql = "(select idFactura_Clientes from factura_clientes ORDER BY idFactura_Clientes DESC LIMIT 1)";

        Statement st = null;
        ResultSet rs = null;

        int x = 1;
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            rs.next();
            x += Integer.parseInt(rs.getString(1));
            con.close();
        } catch (Exception e) {
            System.out.println("Cagadal se te armo" + e);
        }

        Factura_Clientes cliente = new Factura_Clientes(x, Double.parseDouble(tf_totalfacturacliente.getText()), Double.parseDouble(tf_impuestofacturacliente1.getText()), Integer.parseInt(tf_idconsecionariofactura.getText()), Integer.parseInt(tf_idclientefactura.getText()));
        conbo.agregarFACTURA_CLIENTES(cliente);
        jd_crearfacturacliente.setVisible(false);
        listar();

        // TODO add your handling code here:
    }//GEN-LAST:event_jb_crearcon1ActionPerformed

    private void jButton45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton45ActionPerformed
        String usuario;
        String contrasena;

        usuario = tf_usuariologin.getText();
        contrasena = pf_contralogin.getText();

        Conexion cnd = new Conexion();
        Connection con = cnd.getCon();
        PreparedStatement pst = null;

        String sql = "SELECT TIPO FROM USUARIOS WHERE Usuario = '" + usuario + "' and Contrasena = '" + contrasena + "'";
        Statement st = null;
        ResultSet rs = null;

        int x = 0;
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            rs.next();
            x += Integer.parseInt(rs.getString(1));
            con.close();
        } catch (Exception e) {
            System.out.println("Cagadal se te armo" + e);
        }

        switch (x) {
            case 1:
                this.setVisible(false);
                Admin.setModal(true);
                Admin.pack();
                Admin.setLocationRelativeTo(this);
                Admin.setVisible(true);

                break;
            case 2:
                this.setVisible(false);
                Vendedor.setModal(true);
                Vendedor.pack();
                Vendedor.setLocationRelativeTo(this);
                Vendedor.setVisible(true);
                break;
            case 3:
                this.setVisible(false);
                Cliente.setModal(true);
                Cliente.pack();
                Cliente.setLocationRelativeTo(this);
                Cliente.setVisible(true);
                break;
            case 4:
                this.setVisible(false);
                jd_views.setModal(true);
                jd_views.pack();
                jd_views.setLocationRelativeTo(this);
                jd_views.setVisible(true);
                break;
            default:
                JOptionPane optionPane = new JOptionPane("Usuario o Contrasena Incorrecto!", JOptionPane.ERROR_MESSAGE);
                JDialog dialog = optionPane.createDialog("Error");
                dialog.setAlwaysOnTop(true);
                dialog.setVisible(true);
                break;
        }


    }//GEN-LAST:event_jButton45ActionPerformed

    private void jButton47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton47ActionPerformed
        conbo.listarUsuarios(jt_adminusuarios);
        adminusuarios.setModal(true);
        adminusuarios.pack();
        adminusuarios.setLocationRelativeTo(this);
        adminusuarios.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton47ActionPerformed

    private void jButton48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton48ActionPerformed
        jd_CRUD.setModal(true);
        jd_CRUD.pack();
        jd_CRUD.setLocationRelativeTo(this);
        jd_CRUD.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton48ActionPerformed

    private void jButton49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton49ActionPerformed
        conbo.listarBitacora(jt_listarbitacora);

        listarbitacora.setModal(true);
        listarbitacora.pack();
        listarbitacora.setLocationRelativeTo(this);
        listarbitacora.setVisible(true);
    }//GEN-LAST:event_jButton49ActionPerformed

    private void jButton54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton54ActionPerformed
        administrarbitacora.setModal(true);
        administrarbitacora.pack();
        administrarbitacora.setLocationRelativeTo(this);
        administrarbitacora.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton54ActionPerformed

    private void jButton53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton53ActionPerformed
        Bitacora bita = new Bitacora(new Date(), ta_accionbitacora.getText());
        conbo.agregarBitacora(bita);
        ta_accionbitacora.setText("");
        administrarbitacora.setVisible(false);
        conbo.listarBitacora(jt_listarbitacora);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton53ActionPerformed

    private void jb_crearcon2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_crearcon2ActionPerformed
        Conexion cnd = new Conexion();
        Connection con = cnd.getCon();

        String sql = "(select idModelo from Modelo ORDER BY idModelo DESC LIMIT 1)";

        Statement st = null;
        ResultSet rs = null;

        int x = 1;
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            rs.next();
            x += Integer.parseInt(rs.getString(1));
            con.close();
        } catch (Exception e) {
            System.out.println("Cagadal se te armo" + e);
        }
        Modelo model = new Modelo(x, tf_nombremodelo.getText(), tf_tipomotormodelo.getText(), tf_transmisionmodelo.getText(), Integer.parseInt(tf_idmarcamodelo.getText()));
        conbo.agregarModelo(model);
        listar();
        jd_crearmodelo.setVisible(false);
// TODO add your handling code here:
    }//GEN-LAST:event_jb_crearcon2ActionPerformed

    private void jb_crearcon3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_crearcon3ActionPerformed
        Conexion cnd = new Conexion();
        Connection con = cnd.getCon();

        String sql = "(select idPlanta from Planta ORDER BY idPlanta DESC LIMIT 1)";

        Statement st = null;
        ResultSet rs = null;

        int x = 1;
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            rs.next();
            x += Integer.parseInt(rs.getString(1));
            con.close();
        } catch (Exception e) {
            System.out.println("Cagadal se te armo" + e);
        }

        Planta plant = new Planta(x, tf_nombreplanta.getText(), tf_tipoplantaplanta.getText(), tf_direccionplanta.getText());
        conbo.agregarPlanta(plant);
        jd_crearplanta.setVisible(false);
        listar();
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_crearcon3ActionPerformed

    private void jb_crearcon4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_crearcon4ActionPerformed
        Vehiculo carro = new Vehiculo(Integer.parseInt(tf_vinvehiculo.getText()), Integer.parseInt(tf_preciovehiculo.getText()), 0, Integer.parseInt(tf_idmodelovehiculo.getText()), Integer.parseInt(tf_idplantavehiculo.getText()));
        conbo.agregarVehiculo(carro);
        listar();
        jd_crearvehiculo.setVisible(false);
    }//GEN-LAST:event_jb_crearcon4ActionPerformed

    private void jb_crearcon5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_crearcon5ActionPerformed
        Conexion cnd = new Conexion();
        Connection con = cnd.getCon();

        String sql = "(select idInventario_Concesionario from inventario_concesionario ORDER BY idInventario_Concesionario DESC LIMIT 1)";

        Statement st = null;
        ResultSet rs = null;

        int x = 1;
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            rs.next();
            x += Integer.parseInt(rs.getString(1));
            con.close();
        } catch (Exception e) {
            System.out.println("Cagadal se te armo" + e);
        }
        Inventario_Concesionario inve = new Inventario_Concesionario(x, tf_statusinvenconce.getText(), Integer.parseInt(tf_idconceinvenconce.getText()), Integer.parseInt(tf_vininveconce.getText()));
        conbo.agregarInventario_Concesionario(inve);
        listar();
        jd_crearinventarioconcesionario.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_crearcon5ActionPerformed

    private void jButton57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton57ActionPerformed
        int tipo_busqueda = cb_busqueda.getSelectedIndex();
        switch (tipo_busqueda) {
            case 0:

                break;
            case 1:

                break;
            case 2:

                break;
            case 3:

                break;
            default:
                throw new AssertionError();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton57ActionPerformed

    private void jButton50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton50ActionPerformed
        jd_views.setModal(true);
        jd_views.pack();
        jd_views.setLocationRelativeTo(this);
        jd_views.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton50ActionPerformed

    private void jButton42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton42ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton42ActionPerformed

    private void jButton40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton40ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton40ActionPerformed

    private void jButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton38ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton38ActionPerformed

    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton36ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton36ActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton34ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton32ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        jd_crearinventarioconcesionario.setModal(true);
        jd_crearinventarioconcesionario.pack();
        jd_crearinventarioconcesionario.setLocationRelativeTo(this);
        jd_crearinventarioconcesionario.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        jd_crearvehiculo.setModal(true);
        jd_crearvehiculo.pack();
        jd_crearvehiculo.setLocationRelativeTo(this);
        jd_crearvehiculo.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        jd_crearplanta.setModal(true);
        jd_crearplanta.pack();
        jd_crearplanta.setLocationRelativeTo(this);
        jd_crearplanta.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        conbo.listarUsuarios(jt_adminusuarios);
        jd_crearmodelo.setModal(true);
        jd_crearmodelo.pack();
        jd_crearmodelo.setLocationRelativeTo(this);
        jd_crearmodelo.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        jd_crearfacturacliente.setModal(true);
        jd_crearfacturacliente.pack();
        jd_crearfacturacliente.setLocationRelativeTo(this);
        jd_crearfacturacliente.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        jd_crearconcehasmarca.setModal(true);
        jd_crearconcehasmarca.pack();
        jd_crearconcehasmarca.setLocationRelativeTo(this);
        jd_crearconcehasmarca.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        jd_crearmarca.setModal(true);
        jd_crearmarca.pack();
        jd_crearmarca.setLocationRelativeTo(this);
        jd_crearmarca.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        jd_crearempresa.setModal(true);
        jd_crearempresa.pack();
        jd_crearempresa.setLocationRelativeTo(this);
        jd_crearempresa.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        jd_crearpersona.setModal(true);
        jd_crearpersona.pack();
        jd_crearpersona.setLocationRelativeTo(this);
        jd_crearpersona.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jd_crearclientes.setModal(true);
        jd_crearclientes.pack();
        jd_crearclientes.setLocationRelativeTo(this);
        jd_crearclientes.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jd_crearconcesionario.setModal(true);
        jd_crearconcesionario.pack();
        jd_crearconcesionario.setLocationRelativeTo(this);
        jd_crearconcesionario.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JTable tabla = jt_views;
        Conexion cnd = new Conexion();
        Connection con = cnd.getCon();
        DefaultTableModel model;
        String sql;
        String[] filas;
        Statement st = null;
        ResultSet rs = null;
        //String[] columnas = {};
        switch (cb_views.getSelectedIndex()) {
            case 0: {
                String[] columnas = {"Marca", "Concesionario", "Total"};
                model = new DefaultTableModel(null, columnas);

                sql = "select * From teoriabdd.conteo_unidades";

                filas = new String[4];
                st = null;
                rs = null;

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
                break;
            }
            case 1: {
                String[] columnas = {"Nombre", "Cantidad"};
                model = new DefaultTableModel(null, columnas);

                sql = "select * From teoriabdd.conteo_unidades";

                filas = new String[3];

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
            break;
            case 2: {
                String[] columnas = {"Marca", "Concesionario", "Total"};
                model = new DefaultTableModel(null, columnas);

                sql = "select * From teoriabdd.suma_montos";

                filas = new String[4];

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

            break;
            case 3: {
                String[] columnas = {"Año", "Nombre", "Venta"};
                model = new DefaultTableModel(null, columnas);

                sql = "select * From teoriabdd.tendencia_anho";

                filas = new String[4];

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

            break;
            case 4: {
                String[] columnas = {"Año", "Nombre", "Sexo", "Venta"};
                model = new DefaultTableModel(null, columnas);

                sql = "select * From teoriabdd.conteo_unidades";

                filas = new String[5];

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

            break;
            case 5: {
                String[] columnas = {"Año", "Nombre", "Rango", "Venta"};
                model = new DefaultTableModel(null, columnas);

                sql = "select * From teoriabdd.conteo_unidades";

                filas = new String[5];

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

            break;
            case 6: {
                String[] columnas = {"Año", "Nombre", "Rango", "Venta"};
                model = new DefaultTableModel(null, columnas);

                sql = "select * From teoriabdd.tendencia_mes";

                filas = new String[5];

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

            break;
            case 7: {
                String[] columnas = {"Año", "Mes", "Nombre", "Sexo", "Venta"};
                model = new DefaultTableModel(null, columnas);

                sql = "select * From teoriabdd.tendencia_mes_genero";

                filas = new String[6];

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

            break;
            case 8: {
                String[] columnas = {"Año", "Mes", "Nombre", "Rango", "Venta"};
                model = new DefaultTableModel(null, columnas);

                sql = "select * From teoriabdd.tendencia_mes_ingresos";

                filas = new String[6];

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

            break;
            case 9: {
                String[] columnas = {"Año", "Mes", "Semana", "Nombre", "Venta"};
                model = new DefaultTableModel(null, columnas);

                sql = "select * From teoriabdd.tendencia_semana";

                filas = new String[6];

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

            break;
            case 10: {
                String[] columnas = {"Año", "Mes", "Semana", "Nombre", "Sexo", "Venta"};
                model = new DefaultTableModel(null, columnas);

                sql = "select * From teoriabdd.tendencia_semana_genero";

                filas = new String[7];

                try {
                    st = con.createStatement();
                    rs = st.executeQuery(sql);
                    while (rs.next()) {
                        for (int i = 0; i < 6; i++) {
                            filas[i] = rs.getString(i + 1);
                        }
                        model.addRow(filas);
                    }
                    tabla.setModel(model);
                } catch (Exception e) {
                    System.out.println("Ocurrio un error" + e);
                }
            }

            break;
            case 11: {
                String[] columnas = {"Año", "Mes", "Semana", "Nombre", "Rango", "Venta"};
                model = new DefaultTableModel(null, columnas);

                sql = "select * From teoriabdd.tendencia_semana_ingresos";

                filas = new String[7];

                try {
                    st = con.createStatement();
                    rs = st.executeQuery(sql);
                    while (rs.next()) {
                        for (int i = 0; i < 6; i++) {
                            filas[i] = rs.getString(i + 1);
                        }
                        model.addRow(filas);
                    }
                    tabla.setModel(model);
                } catch (Exception e) {
                    System.out.println("Ocurrio un error" + e);
                }
            }

            break;
            case 12: {
                String[] columnas = {"Fecha", "Cliente", "VIN"};
                model = new DefaultTableModel(null, columnas);

                sql = "select * From teoriabdd.transmisiones";

                filas = new String[4];

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

            break;
            case 13: {
                String[] columnas = {"Año", "Mes", "Venta", "Cantidad"};
                model = new DefaultTableModel(null, columnas);

                sql = "select * From ventas_suv";

                filas = new String[5];

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

            break;

            default:
                throw new AssertionError();
            // TODO add your handling code here:
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton58ActionPerformed
        cb_concesionariolistavehiculos.getSelectedIndex();
        if (cb_concesionariolistavehiculos.getSelectedIndex() == 0) {
            conbo.listarConcesionario(jTable2);
        } else {
            JTable tabla = jTable2;
            Conexion cnd = new Conexion();
            Connection con = cnd.getCon();
            DefaultTableModel model;
            String[] columnas = {"VIN", "Nombre", "Precio", "Nombre"};
            model = new DefaultTableModel(null, columnas);

            String sql = "SELECT vh.VIN, m.Nombre, vh.Precio, c.Nombre\n"
                    + "FROM teoriabdd.vehiculo as vh, teoriabdd.modelo as m, teoriabdd.concesionario as c, teoriabdd.inventario_concesionario as i\n"
                    + "WHERE vh.modelo_idmodelo=m.idmodelo and\n"
                    + "      i.vehiculo_VIN=vh.VIN and\n"
                    + "      i.Concesionario_idconcesionario=c.idconcesionario";

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
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton58ActionPerformed

    private void jButton59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton59ActionPerformed
        Usuarios usu = new Usuarios(Integer.parseInt(tf_tipousuario.getText()), tf_nombreusuario.getText(), tf_contrasenausuario.getText());
        conbo.agregarUsuarios(usu);
        conbo.listarUsuarios(jt_adminusuarios);
        jd_agregarusuario.setVisible(false);

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton59ActionPerformed

    private void tf_nombreusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_nombreusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_nombreusuarioActionPerformed

    private void jButton46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton46ActionPerformed
        jd_agregarusuario.setModal(true);
        jd_agregarusuario.pack();
        jd_agregarusuario.setLocationRelativeTo(this);
        jd_agregarusuario.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton46ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog Admin;
    private javax.swing.JDialog Cliente;
    private javax.swing.ButtonGroup PersonaMF;
    private javax.swing.JDialog Vendedor;
    private javax.swing.JDialog administrarbitacora;
    private javax.swing.JDialog adminusuarios;
    private javax.swing.JComboBox<String> cb_busqueda;
    private javax.swing.JComboBox<String> cb_concesionariolistavehiculos;
    private javax.swing.JComboBox<String> cb_views;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton43;
    private javax.swing.JButton jButton44;
    private javax.swing.JButton jButton45;
    private javax.swing.JButton jButton46;
    private javax.swing.JButton jButton47;
    private javax.swing.JButton jButton48;
    private javax.swing.JButton jButton49;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton50;
    private javax.swing.JButton jButton51;
    private javax.swing.JButton jButton52;
    private javax.swing.JButton jButton53;
    private javax.swing.JButton jButton54;
    private javax.swing.JButton jButton55;
    private javax.swing.JButton jButton56;
    private javax.swing.JButton jButton57;
    private javax.swing.JButton jButton58;
    private javax.swing.JButton jButton59;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JScrollPane jScrollPane23;
    private javax.swing.JScrollPane jScrollPane24;
    private javax.swing.JScrollPane jScrollPane25;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton jb_crearcon;
    private javax.swing.JButton jb_crearcon1;
    private javax.swing.JButton jb_crearcon2;
    private javax.swing.JButton jb_crearcon3;
    private javax.swing.JButton jb_crearcon4;
    private javax.swing.JButton jb_crearcon5;
    private javax.swing.JDialog jd_CRUD;
    private javax.swing.JDialog jd_agregarusuario;
    private javax.swing.JDialog jd_crearclientes;
    private javax.swing.JDialog jd_crearconcehasmarca;
    private javax.swing.JDialog jd_crearconcesionario;
    private javax.swing.JDialog jd_crearempresa;
    private javax.swing.JDialog jd_crearfacturacliente;
    private javax.swing.JDialog jd_crearinventarioconcesionario;
    private javax.swing.JDialog jd_crearmarca;
    private javax.swing.JDialog jd_crearmodelo;
    private javax.swing.JDialog jd_crearpersona;
    private javax.swing.JDialog jd_crearplanta;
    private javax.swing.JDialog jd_crearvehiculo;
    private javax.swing.JDialog jd_views;
    private javax.swing.JLabel jl_correocon;
    private javax.swing.JLabel jl_correocon1;
    private javax.swing.JLabel jl_correocon2;
    private javax.swing.JLabel jl_correocon3;
    private javax.swing.JLabel jl_correocon4;
    private javax.swing.JLabel jl_correocon5;
    private javax.swing.JLabel jl_nombrecon;
    private javax.swing.JLabel jl_nombrecon1;
    private javax.swing.JLabel jl_nombrecon2;
    private javax.swing.JLabel jl_nombrecon3;
    private javax.swing.JLabel jl_nombrecon4;
    private javax.swing.JLabel jl_nombrecon5;
    private javax.swing.JLabel jl_telefonocon;
    private javax.swing.JLabel jl_telefonocon1;
    private javax.swing.JLabel jl_telefonocon2;
    private javax.swing.JLabel jl_telefonocon3;
    private javax.swing.JLabel jl_telefonocon4;
    private javax.swing.JLabel jl_telefonocon5;
    private javax.swing.JLabel jl_telefonocon7;
    private javax.swing.JTable jt_adminusuarios;
    private javax.swing.JTable jt_concehasmarca;
    private javax.swing.JTable jt_empresa;
    private javax.swing.JTable jt_facturasclientes;
    private javax.swing.JTable jt_inventarioconcesionario;
    private javax.swing.JTable jt_listarbitacora;
    private javax.swing.JTable jt_marca;
    private javax.swing.JTable jt_marca10;
    private javax.swing.JTable jt_marca11;
    private javax.swing.JTable jt_marca12;
    private javax.swing.JTable jt_marca13;
    private javax.swing.JTable jt_marca14;
    private javax.swing.JTable jt_marca7;
    private javax.swing.JTable jt_marca8;
    private javax.swing.JTable jt_marca9;
    private javax.swing.JTable jt_modelo;
    private javax.swing.JTable jt_planta;
    private javax.swing.JTable jt_vehiculo;
    private javax.swing.JTable jt_views;
    private javax.swing.JDialog listarbitacora;
    private javax.swing.JPasswordField pf_contralogin;
    private javax.swing.JTextArea ta_accionbitacora;
    private javax.swing.JTable tb_clientes;
    private javax.swing.JTable tb_concesionario;
    private javax.swing.JTable tb_persona;
    private javax.swing.JTextField tf_busquedacarros;
    private javax.swing.JTextField tf_concesionariocliente;
    private javax.swing.JTextField tf_contrasenausuario;
    private javax.swing.JTextField tf_correocon;
    private javax.swing.JTextField tf_direccionplanta;
    private javax.swing.JTextField tf_idclientefactura;
    private javax.swing.JTextField tf_idclientepersona;
    private javax.swing.JTextField tf_idclientesempresa;
    private javax.swing.JTextField tf_idconceinvenconce;
    private javax.swing.JTextField tf_idconcesionarioconcehasmarca;
    private javax.swing.JTextField tf_idconsecionariofactura;
    private javax.swing.JTextField tf_idmarcaconcehasmarca;
    private javax.swing.JTextField tf_idmarcamodelo;
    private javax.swing.JTextField tf_idmodelovehiculo;
    private javax.swing.JTextField tf_idplantavehiculo;
    private javax.swing.JTextField tf_impuestofacturacliente1;
    private javax.swing.JTextField tf_ingresopersona;
    private javax.swing.JTextField tf_nombrecliente;
    private javax.swing.JTextField tf_nombrecon;
    private javax.swing.JTextField tf_nombremarca;
    private javax.swing.JTextField tf_nombremodelo;
    private javax.swing.JTextField tf_nombreplanta;
    private javax.swing.JTextField tf_nombreusuario;
    private javax.swing.JTextField tf_preciovehiculo;
    private javax.swing.JTextField tf_statusinvenconce;
    private javax.swing.JTextField tf_statusmarca;
    private javax.swing.JTextField tf_telefonocliente;
    private javax.swing.JTextField tf_telefonocon;
    private javax.swing.JTextField tf_tipoempresaempresa;
    private javax.swing.JTextField tf_tipomotormodelo;
    private javax.swing.JTextField tf_tipoplantaplanta;
    private javax.swing.JTextField tf_tipousuario;
    private javax.swing.JTextField tf_totalfacturacliente;
    private javax.swing.JTextField tf_transmisionmodelo;
    private javax.swing.JTextField tf_usuariologin;
    private javax.swing.JTextField tf_vininveconce;
    private javax.swing.JTextField tf_vinvehiculo;
    // End of variables declaration//GEN-END:variables
}
