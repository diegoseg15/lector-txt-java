/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lectorcuadrotxt;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class connectionDataBase {
    Connection con = null;

    String usuario = "sa";
    String contrasenia = "Sistemas@2019*P";
    String db = "GPPRB";
    String ip = "18.224.232.68";
    String puerto = "1433";

    public Connection getConexion() {
        try {
            String cadena = "jdbc:sqlserver://" + ip + ":" + puerto + ";" + "databaseName=" + db+";"+"TrustServerCertificate=True;";
            con = DriverManager.getConnection(cadena,usuario,contrasenia);
            
        } catch (Exception e)  {
            JOptionPane.showMessageDialog(null, "Conexión Fallida a la Base de Datos");
            System.err.println(e.toString());
        }
        return con;
    }
}
