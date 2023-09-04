package Desarrollo;
import Bdd.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class Autor {
    private String Nom;
    private int Pais;
    private int TipoDeAutor;
    
    private final Conexion con = new Conexion();
    private PreparedStatement Ps;
    private ResultSet Rs;
    private DefaultTableModel contenido;
    
    public Autor(String Nom, int Pais, int TipoDeAutor) {
        this.Nom = Nom;
        this.Pais = Pais;
        this.TipoDeAutor = TipoDeAutor;
    }
    public Autor(){        
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public int getPais() {
        return Pais;
    }

    public void setPais(int Pais) {
        this.Pais = Pais;
    }

    public int getTipoDeAutor() {
        return TipoDeAutor;
    }

    public void setTipoDeAutor(int TipoDeAutor) {
        this.TipoDeAutor = TipoDeAutor;
    }
    
    public void Alta(){
        String carga = "INSERT INTO autor(Nombre,Pais,TipoDeAutor)VALUES(?,?,?)";
        try {
            Ps = con.conectar().prepareStatement(carga);
            Ps.setString(1, this.Nom);
            Ps.setInt(2, this.Pais);
            Ps.setInt(3, this.TipoDeAutor);
            int rayito = Ps.executeUpdate();
            if (rayito > 0) {
                JOptionPane.showMessageDialog(null, "cargado");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR !!, no pudo ingresar el autor" + "\n" + e);
        } finally{
            con.desconectar();
        }
    }
    public void Modificar(int idAutor, String NuevoNombre){
        String cambio = "UPDATE autor SET Nombre = ? WHERE idAutor = ?";
        try {
            Ps = con.conectar().prepareStatement(cambio);
            Ps.setString(1, NuevoNombre);
            Ps.setInt(2, idAutor);
            int rayo = Ps.executeUpdate();
            if (rayo > 0) {
                JOptionPane.showMessageDialog(null, "Registro Modificado");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error!!, el registro no pudo ser modificado" + e);
        } finally{
            con.desconectar();
        }
    }
    public void Baja(int autorAEliminar){
        String Borrar = "DELETE FROM autor WHERE idAutor = ?";
        try {
            Ps = con.conectar().prepareStatement(Borrar);
            Ps.setInt(1, autorAEliminar);
            int rayo = Ps.executeUpdate();
            if (rayo > 0) {
                JOptionPane.showMessageDialog(null, "Dato eliminado");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error, no pudo borrarlo, error en la sentencia, no tiene permiso para borrar" + "\n" + e);
        } finally{
            con.desconectar();
        }
    }    
    public void BuscarPorIdAutor(int AutorEleg){
        String AutorABuscar = "select Nombre, Pais, TipoDeAutor from autor where idAutor = ?";
        try {
            Ps = con.conectar().prepareStatement(AutorABuscar);
            Ps.setInt(1, AutorEleg);
            Rs = Ps.executeQuery();
            if (Rs.next()) {
                this.setNom(Rs.getString(1));
                this.setPais(Rs.getInt(2));
                this.setTipoDeAutor(Rs.getInt(3));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR!!, no pudo encontrar el autor" + "\n" + e);
        } finally{
            con.desconectar();
        }
    }
    
    public DefaultTableModel MostrarTitulos(){
        String [] titulos = {"Id de Autor", "Nombre"};
        String [][] registros ={};
        contenido = new DefaultTableModel(registros, titulos);
        return contenido;
    }
    public DefaultTableModel MostrarContenido(){
        String mostrarSql= "select IdAutor, Nombre from autor order by Nombre";
        try {
            Ps = con.conectar().prepareStatement(mostrarSql);
            Rs = Ps.executeQuery();
            if (contenido.getRowCount() > 0) {
                MostrarTitulos();
            }
            while (Rs.next()) {
                Object[] vector = {Rs.getInt(1), Rs.getString(2)};
                contenido.addRow(vector);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en la consulta de Autor" + "\n" + e);
        } finally{
            con.desconectar();
        }
        return contenido;
    }
    public DefaultComboBoxModel LlenarCombo(){
        DefaultComboBoxModel conten = new DefaultComboBoxModel();
        String muestro = "select idAutor from autor";
        try {
            Ps = con.conectar().prepareStatement(muestro);
            Rs = Ps.executeQuery();
            while (Rs.next()) {
                conten.addElement(Rs.getInt(1));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "no puede mostrar los autores" + "\n" + e);
        } finally{
            con.desconectar();
        }
        return conten;
    }
    
    public DefaultTableModel TitulosAutores(){
        String [] titulos = {"Id de Autor", "Nombre", "País", "Tipo de Autor"};
        String [][] registros = {};
        contenido = new DefaultTableModel(registros, titulos);
        return contenido;
    }
    public DefaultTableModel AutoresRegistrados(){
        String consulta = "select idAutor, Nombre, Pais, TipoDeAutor from autor order by Nombre";
        try {
            Ps = con.conectar().prepareStatement(consulta);
            Rs = Ps.executeQuery();
            if (contenido.getRowCount() > 0) {
                TitulosAutores();
            }
            while(Rs.next()){
                String NombrePais = SwPais(Rs.getInt(3)); 
                String TipoAutor = SwTpAutores(Rs.getInt(4));
                Object[] vector = {Rs.getInt(1), Rs.getString(2), NombrePais, TipoAutor};
                contenido.addRow(vector);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en la consulta de Autores" + "\n" + e);
        }
        return contenido;
    }
    private String SwPais(int NroPais){
        String NomPais = null;
        switch (NroPais) {
            case 1:
                NomPais ="ARGENTINA";
                break;
            case 2:
                NomPais ="FRANCIA";
                break;
            case 3:
                NomPais ="BRASIL";
                break;
            case 4:
                NomPais ="URUGUAY";
                break;
            case 5:
                NomPais ="PARAGUAY";
                break;
            case 6:
                NomPais ="BOLIVIA";
                break;
            case 7:
                NomPais ="ESPAÑA";
                break;
            case 8:
                NomPais ="VENEZUELA";
                break;
            case 9:
                NomPais ="DINAMARCA";
                break;
            case 10:
                NomPais ="INGLATERRA";
                break;
        }
        return NomPais;
    }
    private String SwTpAutores(int TipoAut){
        String Autor=null;
        switch (TipoAut) {
            case 1:
                Autor = "DIRECTOR";
                break;
            case 2:
                Autor = "INTERPRETE";
                break;
            case 3:
                Autor = "ESCRITOR";
                break;
        }
        return Autor;
    }
}
