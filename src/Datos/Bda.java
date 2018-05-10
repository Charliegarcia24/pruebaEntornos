/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author chipi
 */
public class Bda {
    private Connection conn;

    public void setConn(Connection conn) {
        this.conn = conn;
    }

    public boolean conectar(String usuario, String pwd, String bda) {
        String url = "jdbc:mysql://localhost:3306/" + bda;
        boolean respuesta = false;
        try {
            conn = DriverManager.getConnection(url, usuario, pwd);
            //en este caso cerraria la conexion de forma automatica
            //CONECTADOS CON LA BDA REFERENCIADA POR URL, CON EL USUARIO LOGIN Y SU PASSWORD
            if (conn != null) {
                respuesta = true;
            }
        } catch (SQLException ex) {
            respuesta = false;
        } catch (Exception e) {
            System.out.println(e);
            respuesta = false;
        }
        return respuesta;
    }

    public boolean desconectar() throws SQLException {
        boolean respuesta = false;
        if (this.conn != null){
           this.conn.close();
        respuesta = true; 
        }
        
        return respuesta;
    }
}
