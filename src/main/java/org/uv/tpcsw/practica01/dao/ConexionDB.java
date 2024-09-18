package org.uv.tpcsw.practica01.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexionDB {

    private Connection con = null;
    private static ConexionDB cx = null;

    public static Connection getInstance() {
        if (cx == null) {
            cx = new ConexionDB();
        }
        return cx.con;
    }

    public ConexionDB() {
        String url = "jdbc:postgres://localhost:5432/tecnologias2";
        try {
            con = DriverManager.getConnection(url, "postgres", "postgres");
        } catch (SQLException e) {
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public boolean execute(String sql) throws SQLException {
        Statement stm = null;
        try {

            stm = con.createStatement();
            stm.execute(sql);
            return true;
        } catch (SQLException e) {
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, e);
            return false;
        } finally {
            if (stm != null) {
                try {
                    stm.close();
                } catch (SQLException e) {
                    Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, sql);
                }
            }
        }
    }
}
