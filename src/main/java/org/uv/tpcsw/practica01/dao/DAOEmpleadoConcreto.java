package org.uv.tpcsw.practica01.dao;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.uv.tpcsw.practica01.dao.EmpleadoPojo;
import org.uv.tpcsw.practica01.dao.ConexionDB;

public class DAOEmpleadoConcreto implements IDAOGeneral<EmpleadoPojo,String>{

    @Override
    public boolean save(EmpleadoPojo pojo) {
        ConexionDB con = (ConexionDB) ConexionDB.getInstance();
        String sql = "INSERT INTO EMPLEADO (clave,nombre,telefono,direccion) VALUES('"+pojo.getClave()+"','"+pojo.getNombre()+"','"+pojo.getTelefono()+"','"+pojo.getDireccion()+"')";
        try {
            return con.execute(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DAOEmpleadoConcreto.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean delete(String pojo) {
        ConexionDB con = (ConexionDB) ConexionDB.getInstance();
        String sql = "DELETE FROM EMPLEADO WHERE clave='"+pojo+"'";
        try {
            return con.execute(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DAOEmpleadoConcreto.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean update(EmpleadoPojo pojo, String id) {
        ConexionDB con = (ConexionDB) ConexionDB.getInstance();
        String sql = "UPDATE EMPLEADO SET clave='"+pojo.getClave()+"',nombre='"+pojo.getNombre()+"',telefono='"+pojo.getTelefono()+"',direccion='"+pojo.getDireccion()+"' WHERE clave='"+id+"'";
        try {
            return con.execute(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DAOEmpleadoConcreto.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public EmpleadoPojo findById(String id) {
        ConexionDB con = (ConexionDB) ConexionDB.getInstance();
        String sql = "";
        return null;
    }

    @Override
    public List<EmpleadoPojo> findAll() {
        ConexionDB con = (ConexionDB) ConexionDB.getInstance();
        String sql = "SELECT * FROM EMPLEADO";
        return null;
    }

    
    
}
