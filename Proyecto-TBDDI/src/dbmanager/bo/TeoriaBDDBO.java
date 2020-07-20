/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbmanager.bo;

import Concesionario.*;
import Concesionario.Vehiculo;
import Concesionario.Factura_Clientes;
import Concesionario.Planta;
import Concesionario.Persona;
import Concesionario.Modelo;
import Concesionario.Marca;
import Concesionario.Empresa;
import Concesionario.Concesionario_Has_Marca;
import proyecto.tbddi.Usuarios;
import Concesionario.Concesionario;
import Concesionario.Inventario_Concesionario;
import dbmanager.Conexion;
import dbmanager.dao.*;
import dbmanager.dao.ConcesionarioDAO;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import proyecto.tbddi.Bitacora;

/**
 *
 * @author migue
 */
public class TeoriaBDDBO {

    String mensaje = "";
    ConcesionarioDAO conceDA0 = new ConcesionarioDAO();
    ClientesDAO clienteDAO = new ClientesDAO();
    PersonaDAO personaDAO = new PersonaDAO();
    EmpresaDAO empresaDAO = new EmpresaDAO();
    MarcaDAO MarcaDAO = new MarcaDAO();
    Factura_ClienteDAO Factura_ClienteDAO = new Factura_ClienteDAO();
    Concesionario_Has_MarcaDAO Concesionario_Has_MarcaDAO = new Concesionario_Has_MarcaDAO();
    UsuariosDAO UsuariosDAO = new UsuariosDAO();
    BitacoraDAO BitacoraDAO = new BitacoraDAO();
    ModeloDAO ModeloDAO = new ModeloDAO();
    PlantaDAO PlantaDAO = new PlantaDAO();
    VehiculoDAO VehiculoDAO = new VehiculoDAO();
    Inventario_ConcesionarioDAO Inventario_ConcesionarioDAO = new Inventario_ConcesionarioDAO();

    public String agregarConcesionario(Concesionario conce) {
        Conexion cnd = new Conexion();
        Connection con = cnd.getCon();
        try {
            mensaje = conceDA0.agregarConcesionario(con, conce);
            //con.rollback();
        } catch (Exception e) {
            System.out.println("Hubo un error" + e);
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(TeoriaBDDBO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return mensaje;
    }

    public String modificarConcesionario(Concesionario conce) {
        Conexion cnd = new Conexion();
        Connection con = cnd.getCon();
        try {
            mensaje = conceDA0.modificarConcesionario(con, conce);
            //con.rollback();
        } catch (Exception e) {
            System.out.println("Hubo un error" + e);
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(TeoriaBDDBO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return mensaje;
    }

    public String eliminarConcesionario(int id) {
        Conexion cnd = new Conexion();
        Connection con = cnd.getCon();
        try {
            mensaje = conceDA0.eliminarConcesionario(con, id);
            //con.rollback();
        } catch (Exception e) {
            System.out.println("Hubo un error" + e);
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(TeoriaBDDBO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return mensaje;
    }

    public void listarConcesionario(JTable tabla) {
        Conexion cnd = new Conexion();
        Connection con = cnd.getCon();
        conceDA0.listarConcesionario(con, tabla);
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(TeoriaBDDBO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //---------------------CLIENTES------------------------------------------------
    public String agregarClientes(Clientes cliente) {
        Conexion cnd = new Conexion();
        Connection con = cnd.getCon();
        try {
            mensaje = clienteDAO.agregarCLIENTES(con, cliente);
            //con.rollback();
        } catch (Exception e) {
            System.out.println("Hubo un error" + e);
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(TeoriaBDDBO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return mensaje;
    }

    public String modificarClientes(Clientes cliente) {
        Conexion cnd = new Conexion();
        Connection con = cnd.getCon();
        try {
            mensaje = clienteDAO.modificarCLIENTES(con, cliente);
            //con.rollback();
        } catch (Exception e) {
            System.out.println("Hubo un error" + e);
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(TeoriaBDDBO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return mensaje;
    }

    public String eliminarClientes(int id) {
        Conexion cnd = new Conexion();
        Connection con = cnd.getCon();
        try {
            mensaje = clienteDAO.eliminarCLIENTES(con, id);
            //con.rollback();
        } catch (Exception e) {
            System.out.println("Hubo un error" + e);
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(TeoriaBDDBO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return mensaje;
    }

    public void listarClientes(JTable tabla) {
        Conexion cnd = new Conexion();
        Connection con = cnd.getCon();
        clienteDAO.listarCLIENTES(con, tabla);
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(TeoriaBDDBO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //--------------------------------PERSONA------------------------------------------------
    public String agregarPersona(Persona cliente) {
        Conexion cnd = new Conexion();
        Connection con = cnd.getCon();
        try {
            mensaje = personaDAO.agregarPERSONA(con, cliente);
            //con.rollback();
        } catch (Exception e) {
            System.out.println("Hubo un error" + e);
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(TeoriaBDDBO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return mensaje;
    }

    public String modificarPersona(Persona cliente) {
        Conexion cnd = new Conexion();
        Connection con = cnd.getCon();
        try {
            mensaje = personaDAO.modificarPERSONA(con, cliente);
            //con.rollback();
        } catch (Exception e) {
            System.out.println("Hubo un error" + e);
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(TeoriaBDDBO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return mensaje;
    }

    public String eliminarPersona(int id) {
        Conexion cnd = new Conexion();
        Connection con = cnd.getCon();
        try {
            mensaje = personaDAO.eliminarPERSONA(con, id);
            //con.rollback();
        } catch (Exception e) {
            System.out.println("Hubo un error" + e);
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(TeoriaBDDBO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return mensaje;
    }

    public void listarPersona(JTable tabla) {
        Conexion cnd = new Conexion();
        Connection con = cnd.getCon();
        personaDAO.listarPERSONA(con, tabla);
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(TeoriaBDDBO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //-----------------------------------------EMPRESA----------------------------------------------------
    public String agregarEmpresa(Empresa cliente) {
        Conexion cnd = new Conexion();
        Connection con = cnd.getCon();
        try {
            mensaje = empresaDAO.agregarEMPRESA(con, cliente);
            //con.rollback();
        } catch (Exception e) {
            System.out.println("Hubo un error" + e);
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(TeoriaBDDBO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return mensaje;
    }

    public String modificarEmpresa(Empresa cliente) {
        Conexion cnd = new Conexion();
        Connection con = cnd.getCon();
        try {
            mensaje = empresaDAO.modificarEMPRESA(con, cliente);
            //con.rollback();
        } catch (Exception e) {
            System.out.println("Hubo un error" + e);
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(TeoriaBDDBO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return mensaje;
    }

    public String eliminarEmpresa(int id) {
        Conexion cnd = new Conexion();
        Connection con = cnd.getCon();
        try {
            mensaje = empresaDAO.eliminarEMPRESA(con, id);
            //con.rollback();
        } catch (Exception e) {
            System.out.println("Hubo un error" + e);
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(TeoriaBDDBO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return mensaje;
    }

    public void listarEmpresa(JTable tabla) {
        Conexion cnd = new Conexion();
        Connection con = cnd.getCon();
        empresaDAO.listarEMPRESA(con, tabla);
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(TeoriaBDDBO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //--------------------------MARCA--------------------------------------------------
    public String agregarMarca(Marca cliente) {
        Conexion cnd = new Conexion();
        Connection con = cnd.getCon();
        try {
            mensaje = MarcaDAO.agregarMARCA(con, cliente);
            //con.rollback();
        } catch (Exception e) {
            System.out.println("Hubo un error" + e);
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(TeoriaBDDBO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return mensaje;
    }

    public String modificarMarca(Marca cliente) {
        Conexion cnd = new Conexion();
        Connection con = cnd.getCon();
        try {
            mensaje = MarcaDAO.modificarMARCA(con, cliente);
            //con.rollback();
        } catch (Exception e) {
            System.out.println("Hubo un error" + e);
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(TeoriaBDDBO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return mensaje;
    }

    public String eliminarMarca(int id) {
        Conexion cnd = new Conexion();
        Connection con = cnd.getCon();
        try {
            mensaje = MarcaDAO.eliminarMARCA(con, id);
            //con.rollback();
        } catch (Exception e) {
            System.out.println("Hubo un error" + e);
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(TeoriaBDDBO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return mensaje;
    }

    public void listarMarca(JTable tabla) {
        Conexion cnd = new Conexion();
        Connection con = cnd.getCon();
        MarcaDAO.listarMARCA(con, tabla);
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(TeoriaBDDBO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //---------------------------------CONCE-HAS-MARCA------------------------------
    public String agregarConcesionario_Has_Marca(Concesionario_Has_Marca cliente) {
        Conexion cnd = new Conexion();
        Connection con = cnd.getCon();
        try {
            mensaje = Concesionario_Has_MarcaDAO.agregarCONCESIONARIO_HAS_MARCA(con, cliente);
            //con.rollback();
        } catch (Exception e) {
            System.out.println("Hubo un error" + e);
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(TeoriaBDDBO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return mensaje;
    }

    public String modificarConcesionario_Has_Marca(Concesionario_Has_Marca cliente) {
        Conexion cnd = new Conexion();
        Connection con = cnd.getCon();
        try {
            mensaje = Concesionario_Has_MarcaDAO.modificarCONCESIONARIO_HAS_MARCA(con, cliente);
            //con.rollback();
        } catch (Exception e) {
            System.out.println("Hubo un error" + e);
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(TeoriaBDDBO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return mensaje;
    }

    public String eliminarConcesionario_Has_Marca(int id) {
        Conexion cnd = new Conexion();
        Connection con = cnd.getCon();
        try {
            mensaje = Concesionario_Has_MarcaDAO.eliminarCONCESIONARIO_HAS_MARCA(con, id);
            //con.rollback();
        } catch (Exception e) {
            System.out.println("Hubo un error" + e);
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(TeoriaBDDBO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return mensaje;
    }

    public void listarConcesionario_Has_Marca(JTable tabla) {
        Conexion cnd = new Conexion();
        Connection con = cnd.getCon();
        Concesionario_Has_MarcaDAO.listarCONCESIONARIO_HAS_MARCA(con, tabla);
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(TeoriaBDDBO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //---------------------------------Factura-Clientes--------------------------------------
    public String agregarFACTURA_CLIENTES(Factura_Clientes conce) {
        Conexion cnd = new Conexion();
        Connection con = cnd.getCon();
        try {
            mensaje = Factura_ClienteDAO.agregarFactura_Clientes(con, conce);
            //con.rollback();
        } catch (Exception e) {
            System.out.println("Hubo un error" + e);
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(TeoriaBDDBO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return mensaje;
    }

    public String modificarFACTURA_CLIENTES(Factura_Clientes conce) {
        Conexion cnd = new Conexion();
        Connection con = cnd.getCon();
        try {
            mensaje = Factura_ClienteDAO.modificarFactura_Clientes(con, conce);
            //con.rollback();
        } catch (Exception e) {
            System.out.println("Hubo un error" + e);
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(TeoriaBDDBO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return mensaje;
    }

    public String eliminarFACTURA_CLIENTES(int id) {
        Conexion cnd = new Conexion();
        Connection con = cnd.getCon();
        try {
            mensaje = Factura_ClienteDAO.eliminarFactura_Clientes(con, id);
            //con.rollback();
        } catch (Exception e) {
            System.out.println("Hubo un error" + e);
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(TeoriaBDDBO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return mensaje;
    }

    public void listarFACTURA_CLIENTES(JTable tabla) {
        Conexion cnd = new Conexion();
        Connection con = cnd.getCon();
        Factura_ClienteDAO.listarFactura_Clientes(con, tabla);
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(TeoriaBDDBO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //-----------------------------USUARIOS---------------------------------------------------
    public String agregarUsuarios(Usuarios cliente) {
        Conexion cnd = new Conexion();
        Connection con = cnd.getCon();
        try {
            mensaje = UsuariosDAO.agregarUSUARIOS(con, cliente);
            //con.rollback();
        } catch (Exception e) {
            System.out.println("Hubo un error" + e);
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(TeoriaBDDBO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return mensaje;
    }

    public String modificarUsuarios(Usuarios cliente) {
        Conexion cnd = new Conexion();
        Connection con = cnd.getCon();
        try {
            mensaje = UsuariosDAO.modificarUSUARIOS(con, cliente);
            //con.rollback();
        } catch (Exception e) {
            System.out.println("Hubo un error" + e);
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(TeoriaBDDBO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return mensaje;
    }

    public String eliminarUsuarios(int id) {
        Conexion cnd = new Conexion();
        Connection con = cnd.getCon();
        try {
            mensaje = UsuariosDAO.eliminarUSUARIOS(con, id);
            //con.rollback();
        } catch (Exception e) {
            System.out.println("Hubo un error" + e);
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(TeoriaBDDBO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return mensaje;
    }

    public void listarUsuarios(JTable tabla) {
        Conexion cnd = new Conexion();
        Connection con = cnd.getCon();
        UsuariosDAO.listarUSUARIOS(con, tabla);
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(TeoriaBDDBO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //-------------------------------BITACORA----------------------------------------------

    public String agregarBitacora(Bitacora cliente) {
        Conexion cnd = new Conexion();
        Connection con = cnd.getCon();
        try {
            mensaje = BitacoraDAO.agregarBitacora(con, cliente);
            //con.rollback();
        } catch (Exception e) {
            System.out.println("Hubo un error" + e);
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(TeoriaBDDBO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return mensaje;
    }

    public String modificarBitacora(Bitacora cliente) {
        Conexion cnd = new Conexion();
        Connection con = cnd.getCon();
        try {
            mensaje = BitacoraDAO.modificarBitacora(con, cliente);
            //con.rollback();
        } catch (Exception e) {
            System.out.println("Hubo un error" + e);
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(TeoriaBDDBO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return mensaje;
    }

    public String eliminarBitacora(int id) {
        Conexion cnd = new Conexion();
        Connection con = cnd.getCon();
        try {
            mensaje = BitacoraDAO.eliminarBitacora(con, id);
            //con.rollback();
        } catch (Exception e) {
            System.out.println("Hubo un error" + e);
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(TeoriaBDDBO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return mensaje;
    }

    public void listarBitacora(JTable tabla) {
        Conexion cnd = new Conexion();
        Connection con = cnd.getCon();
        BitacoraDAO.listarBitacora(con, tabla);
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(TeoriaBDDBO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //----------------------------------------------------Modelo--------------------------------
    public String agregarModelo(Modelo cliente) {
        Conexion cnd = new Conexion();
        Connection con = cnd.getCon();
        try {
            mensaje = ModeloDAO.agregarModelo(con, cliente);
            //con.rollback();
        } catch (Exception e) {
            System.out.println("Hubo un error" + e);
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(TeoriaBDDBO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return mensaje;
    }

    public String modificarModelo(Modelo cliente) {
        Conexion cnd = new Conexion();
        Connection con = cnd.getCon();
        try {
            mensaje = ModeloDAO.modificarModelo(con, cliente);
            //con.rollback();
        } catch (Exception e) {
            System.out.println("Hubo un error" + e);
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(TeoriaBDDBO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return mensaje;
    }

    public String eliminarModelo(int id) {
        Conexion cnd = new Conexion();
        Connection con = cnd.getCon();
        try {
            mensaje = ModeloDAO.eliminarModelo(con, id);
            //con.rollback();
        } catch (Exception e) {
            System.out.println("Hubo un error" + e);
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(TeoriaBDDBO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return mensaje;
    }

    public void listarModelo(JTable tabla) {
        Conexion cnd = new Conexion();
        Connection con = cnd.getCon();
        ModeloDAO.listarModelo(con, tabla);
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(TeoriaBDDBO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //-----------------------------------------Planta-------------------------------------
    public String agregarPlanta(Planta cliente) {
        Conexion cnd = new Conexion();
        Connection con = cnd.getCon();
        try {
            mensaje = PlantaDAO.agregarPLANTA(con, cliente);
            //con.rollback();
        } catch (Exception e) {
            System.out.println("Hubo un error" + e);
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(TeoriaBDDBO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return mensaje;
    }

    public String modificarPlanta(Planta cliente) {
        Conexion cnd = new Conexion();
        Connection con = cnd.getCon();
        try {
            mensaje = PlantaDAO.modificarPLANTA(con, cliente);
            //con.rollback();
        } catch (Exception e) {
            System.out.println("Hubo un error" + e);
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(TeoriaBDDBO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return mensaje;
    }

    public String eliminarPlanta(int id) {
        Conexion cnd = new Conexion();
        Connection con = cnd.getCon();
        try {
            mensaje = PlantaDAO.eliminarPLANTA(con, id);
            //con.rollback();
        } catch (Exception e) {
            System.out.println("Hubo un error" + e);
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(TeoriaBDDBO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return mensaje;
    }

    public void listarPlanta(JTable tabla) {
        Conexion cnd = new Conexion();
        Connection con = cnd.getCon();
        PlantaDAO.listarPLANTA(con, tabla);
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(TeoriaBDDBO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //---------------------------VEHICULO----------------------------------------------
    public String agregarVehiculo(Vehiculo cliente) {
        Conexion cnd = new Conexion();
        Connection con = cnd.getCon();
        try {
            mensaje = VehiculoDAO.agregarVehiculo(con, cliente);
            //con.rollback();
        } catch (Exception e) {
            System.out.println("Hubo un error" + e);
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(TeoriaBDDBO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return mensaje;
    }

    public String modificarVehiculo(Vehiculo cliente) {
        Conexion cnd = new Conexion();
        Connection con = cnd.getCon();
        try {
            mensaje = VehiculoDAO.modificarVehiculo(con, cliente);
            //con.rollback();
        } catch (Exception e) {
            System.out.println("Hubo un error" + e);
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(TeoriaBDDBO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return mensaje;
    }

    public String eliminarVehiculo(int id) {
        Conexion cnd = new Conexion();
        Connection con = cnd.getCon();
        try {
            mensaje = VehiculoDAO.eliminarVehiculo(con, id);
            //con.rollback();
        } catch (Exception e) {
            System.out.println("Hubo un error" + e);
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(TeoriaBDDBO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return mensaje;
    }

    public void listarVehiculo(JTable tabla) {
        Conexion cnd = new Conexion();
        Connection con = cnd.getCon();
        VehiculoDAO.listarVehiculo(con, tabla);
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(TeoriaBDDBO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //--------------------------------------INVENTARIO_CONCESIONARIO---------------------------------
    public String agregarInventario_Concesionario(Inventario_Concesionario cliente) {
        Conexion cnd = new Conexion();
        Connection con = cnd.getCon();
        try {
            mensaje = Inventario_ConcesionarioDAO.agregarInventario_Concesionario(con, cliente);
            //con.rollback();
        } catch (Exception e) {
            System.out.println("Hubo un error" + e);
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(TeoriaBDDBO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return mensaje;
    }

    public String modificarInventario_Concesionario(Inventario_Concesionario cliente) {
        Conexion cnd = new Conexion();
        Connection con = cnd.getCon();
        try {
            mensaje = Inventario_ConcesionarioDAO.modificarInventario_Concesionario(con, cliente);
            //con.rollback();
        } catch (Exception e) {
            System.out.println("Hubo un error" + e);
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(TeoriaBDDBO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return mensaje;
    }

    public String eliminarInventario_Concesionario(int id) {
        Conexion cnd = new Conexion();
        Connection con = cnd.getCon();
        try {
            mensaje = Inventario_ConcesionarioDAO.eliminarInventario_Concesionario(con, id);
            //con.rollback();
        } catch (Exception e) {
            System.out.println("Hubo un error" + e);
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(TeoriaBDDBO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return mensaje;
    }

    public void listarInventario_Concesionario(JTable tabla) {
        Conexion cnd = new Conexion();
        Connection con = cnd.getCon();
        Inventario_ConcesionarioDAO.listarInventario_Concesionario(con, tabla);
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(TeoriaBDDBO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
