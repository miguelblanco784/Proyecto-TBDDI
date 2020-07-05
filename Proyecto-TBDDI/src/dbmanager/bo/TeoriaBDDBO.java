/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbmanager.bo;

import Consecionario.*;
import Consecionario.Concesionario;
import dbmanager.Conexion;
import dbmanager.dao.*;
import dbmanager.dao.ConcesionarioDAO;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;

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
}
