package Bdd;
import Utilerias.Propiedades;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;
import javax.swing.JOptionPane;
public class Conexion {
    
    private String url;
    private String username;
    private String password;
    
    private final String obj = "com.mysql.jdbc.Driver"; //creo un objeto para almacenar la ruta del Driver de la conexion
    
    Connection con = null; //llamo a la clase Connection y creo un objeto
    
    public Conexion(){
        try {
            Properties prop = Propiedades.getProperties();
            if (prop != null) {
                url = prop.getProperty("conex.url");
                username = prop.getProperty("conex.username");
                password = prop.getProperty("conex.password");
                Class.forName(obj);
                con = DriverManager.getConnection(url, username, password);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error, no se encontro el driver para la conexión o datos nulos. " + e + JOptionPane.ERROR_MESSAGE);
        }
    }
    public Connection conectar(){
        return con;
    }
    public void desconectar(){
        if (con != null) {
            try {
                con.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error al cerrar la conexión" + e);
            }
        }else{
            JOptionPane.showMessageDialog(null, "No se cerro la conexión o conexión nula");
        }
    }
}
