package cl.uchile.dcc.vuelos.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {

    static private Connection conn = null;
    static final private String URL = "jdbc:sqlserver://localhost:1433; databasename=vuelos; integratedSecurity=true";

    static public Connection obtenerConexion() throws SQLException {
        if (conn==null){
            conn = DriverManager.getConnection(URL);
        }
        return conn;
    }

    static public void cerrarConexion() throws SQLException {
        conn.close();
        conn = null;
    }

}
