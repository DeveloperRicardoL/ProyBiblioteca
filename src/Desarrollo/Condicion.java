package Desarrollo;
import Bdd.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.DefaultListModel;
public class Condicion {
    
    private int Condicion;
    private String Comentario;
    
    private final Conexion con = new Conexion();
    private PreparedStatement Ps;
    
    public Condicion(){
        
    }
    
    public void setCondicion(int Condicion){
        this.Condicion = Condicion;
    }
    public void setComentario(String Comentario){
        this.Comentario = Comentario;
    }
    
    public void Alta(){
        String carga = "INSERT INTO condiciones(Condicion,Comentario)VALUES(?,?)";
        try {
            Ps = con.conectar().prepareStatement(carga);
            Ps.setInt(1, this.Condicion);
            Ps.setString(2, this.Comentario);
            int rayo = Ps.executeUpdate();
            if (rayo > 0) {
                JOptionPane.showMessageDialog(null, "Cargado");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR !!, no pudo ingresar el comentario" + "\n" + e);
        }
    }
    public void Modificar(String Comentario, String NuevoComentario){
        String modif = "UPDATE condiciones SET Comentario = '"+ NuevoComentario +"' WHERE Comentario = '"+ Comentario +"'";
        try {
            Ps = con.conectar().prepareStatement(modif);
            int rayo = Ps.executeUpdate();
            if (rayo > 0) {
                JOptionPane.showMessageDialog(null, "Comentario modificado");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error!!, el comentario no pudo ser modificado" + "\n" + e);
        }
    }
    public DefaultListModel Mostrar(){
        DefaultListModel mostrarLst = new DefaultListModel();
        String Lista = "SELECT Comentario FROM condiciones";
        ResultSet Rs;
        try {
            Ps = con.conectar().prepareStatement(Lista);
            Rs = Ps.executeQuery();
            while (Rs.next()) {
                mostrarLst.addElement(Rs.getString(1));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en la muestra de los comentarios" + "\n" + e);
        }
        return mostrarLst;
    }
    public void Baja(){
        
    }
}
