package Desarrollo;
import Bdd.Conexion;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Articulos {
    
    private int CodArt;
    private int TipoDeArt;
    private String Nombre;
    private Date Anio;
    private String Descripcion;
    private int CantPag;
    private int CantCancio;
    private Time Duracion;
    private int CantCopias;
    private int idAutor;

    private String NomAutor;
    
    private final Conexion con = new Conexion();
    private PreparedStatement Ps;
    private DefaultTableModel contenido;
    private ResultSet Rs;

    public Articulos(int CodArt, int TipoDeArt, String Nombre, Date Anio, String Descripcion, int CantPag, int CantCancio, Time Duracion, int CantCopias, int idAutor) {
        this.CodArt = CodArt;
        this.TipoDeArt = TipoDeArt;
        this.Nombre = Nombre;
        this.Anio = Anio;
        this.Descripcion = Descripcion;
        this.CantPag = CantPag;
        this.CantCancio = CantCancio;
        this.Duracion = Duracion;
        this.CantCopias = CantCopias;
        this.idAutor = idAutor;
    }
    public Articulos(){
    }

    public void setCodArt(int CodArt) {
        this.CodArt = CodArt;
    }

    public void setTipoDeArt(int TipoDeArt) {
        this.TipoDeArt = TipoDeArt;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setAnio(Date Anio) {
        this.Anio = Anio;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public void setCantPag(int CantPag) {
        this.CantPag = CantPag;
    }

    public void setCantCancio(int CantCancio) {
        this.CantCancio = CantCancio;
    }

    public void setDuracion(Time Duracion) {
        this.Duracion = Duracion;
    }

    public void setCantCopias(int CantCopias) {
        this.CantCopias = CantCopias;
    }

    public void setIdAutor(int idAutor) {
        this.idAutor = idAutor;
    }
    public void setNomAutor( String NomAutor){
        this.NomAutor = NomAutor;
    }
    
    public int getCodArt() {
        return CodArt;
    }

    public int getTipoDeArt() {
        return TipoDeArt;
    }

    public String getNombre() {
        return Nombre;
    }

    public Date getAnio() {
        return Anio;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public int getCantPag() {
        return CantPag;
    }

    public int getCantCancio() {
        return CantCancio;
    }

    public Time getDuracion() {
        return Duracion;
    }

    public int getCantCopias() {
        return CantCopias;
    }

    public int getIdAutor() {
        return idAutor;
    }
    public String getNomAutor(){
        return NomAutor;
    }
    
    public void Alta(){
        String enviar = "INSERT INTO articulos(CodArticulo,TipoDeArticulo,Nombre,Anio,Descripcion,CantPaginas,CantCanciones,Duracion,CantCopias,Autor_idAutor)VALUES(?,?,?,?,?,?,?,?,?,?)";
        try {
            Ps = con.conectar().prepareStatement(enviar);
            Ps.setInt(1, this.CodArt);
            Ps.setInt(2, this.TipoDeArt);
            Ps.setString(3, this.Nombre);
            Ps.setDate(4, this.Anio);
            Ps.setString(5, this.Descripcion);
            Ps.setInt(6, this.CantPag);
            Ps.setInt(7, this.CantCancio);
            Ps.setTime(8, this.Duracion);
            Ps.setInt(9, this.CantCopias);
            Ps.setInt(10, this.idAutor);
            int rayo = Ps.executeUpdate();
            if (rayo > 0) {
                JOptionPane.showMessageDialog(null, "cargado");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR !!, no pudo ingresar el autor" + "\n" + e);
        }
    }
    public void Baja(int CodigoArt){
        String Borrar = "delete from articulos where CodArticulo = ?";
        try {
            Ps = con.conectar().prepareStatement(Borrar);
            Ps.setInt(1, CodigoArt);
            int ejecutar = Ps.executeUpdate();
            if (ejecutar > 0) {
                JOptionPane.showMessageDialog(null, "PRODUCTO ELIMINADO");
            }else{
                JOptionPane.showMessageDialog(null, "Error, Código inexistente");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR !!, no pudo encontrar al Articulo" + "\n" + e);
        }
    }
    public void Modificar(){
        String buscar = "UPDATE articulos SET TipoDeArticulo = '"+ this.getTipoDeArt() +"', Nombre = '"+ this.getNombre()+"', Anio = '"+ this.getAnio()+"', Descripcion = '"+ this.getDescripcion()+"', CantPaginas = '"+ this.getCantPag()+"', CantCanciones = '"+ this.getCantCancio()+"', Duracion = '"+ this.getDuracion()+"', CantCopias = '"+ this.getCantCopias()+"', Autor_idAutor = '"+ this.getIdAutor()+"' WHERE CodArticulo = '"+ this.getCodArt()+"';";
        try {
            Ps = con.conectar().prepareStatement(buscar);
            int rayo = Ps.executeUpdate();
            if (rayo > 0) {
                JOptionPane.showMessageDialog(null, "Registro modificado");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error " + e);
        }
    }
    public boolean BuscarPorCod(int Cod){
        boolean resp = false;
        String buscar = "select art.CodArticulo, art.TipoDeArticulo, art.Nombre, art.Anio, art.Descripcion, art.CantPaginas, art.CantCanciones, art.Duracion, art.CantCopias, a.idAutor from articulos as art inner join autor as a on art.Autor_idAutor = a.idAutor where CodArticulo = ?";
        try {
            Ps = con.conectar().prepareStatement(buscar);
            Ps.setInt(1, Cod);
            Rs = Ps.executeQuery();
            if (Rs.next()) {
                resp = true;
                this.setCodArt(Rs.getInt(1));
                this.setTipoDeArt(Rs.getInt(2));
                this.setNombre(Rs.getString(3));
                this.setAnio(Rs.getDate(4));
                this.setDescripcion(Rs.getString(5));
                this.setCantPag(Rs.getInt(6));
                this.setCantCancio(Rs.getInt(7));
                this.setDuracion(Rs.getTime(8));
                this.setCantCopias(Rs.getInt(9));
                this.setIdAutor(Rs.getInt(10));
            }else{
                JOptionPane.showMessageDialog(null, "No se encontró el código ingresado");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error!!" + "\n" + e);
        }
        return resp;
    }
    
    public DefaultTableModel MostrarTitulos(){
        String [] titulos = {"Código de Articulo", "Tipo de Articulo", "Nombre", "Año", "Descripción", "Cantidad de Páginas", "Cantidad de Canciones", "Duración", "Cantidad de Copias", "Autor"};
        String [][] registros ={};
        contenido = new DefaultTableModel(registros, titulos);
        return contenido;
    }
    public DefaultTableModel MostrarContenido(){
        String consultaSql = "SELECT CodArticulo, TipoDeArticulo, Nombre, Anio, Descripcion, CantPaginas, CantCanciones, Duracion, CantCopias, Autor_idAutor FROM articulos";
        try {
            Ps = con.conectar().prepareStatement(consultaSql);
            Rs = Ps.executeQuery();
            if (contenido.getRowCount() > 0) {
                MostrarTitulos();
            }
            while (Rs.next()) {
                Object [] consulta = {Rs.getInt(1), Rs.getInt(2), Rs.getString(3), Rs.getDate(4), Rs.getString(5), Rs.getInt(6), Rs.getInt(7), Rs.getTime(8), Rs.getInt(9), Rs.getInt(10)};//creo un vector de tipo Object y llamo a cada campo con su correspondiente tipo de dato 
                contenido.addRow(consulta);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en la consulta de Articulos" + "\n" + e);
        }
        return contenido;
    }
    public DefaultComboBoxModel LlenarComboArt(){
        DefaultComboBoxModel conten = new DefaultComboBoxModel();
        String muestro = "select Nombre from articulos order by Nombre";
        try {
            Ps = con.conectar().prepareStatement(muestro);
            Rs = Ps.executeQuery();
            while (Rs.next()) {
                conten.addElement(Rs.getString(1));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "no puede mostrar los articulos" + "\n" + e);
        }
        return conten;
    }
    public int RetornarIdArticulo(String ArticuloEleg){
        String ArticuloABuscar = "select CodArticulo from articulos where Nombre = ?";
        int IdADevolver = 0;
        try {
            Ps = con.conectar().prepareStatement(ArticuloABuscar);
            Ps.setString(1, ArticuloEleg);
            Rs = Ps.executeQuery();
            if (Rs.next()) {
                IdADevolver = Rs.getInt(1);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR!!, no pudo encontrar el articulo" + "\n" + e);
        }
        return IdADevolver;
    }
    public DefaultTableModel TitulosElimModif(){
        String [] titulos = {"Nombre", "Autor", "Tipo de Articulos", "Código de Articulo"};
        String [][] registros = {};
        contenido = new DefaultTableModel(registros, titulos);
        return contenido;
    }
    public DefaultTableModel MostrarContenidoElimModif() {
        String mostrarSql = "select art.Nombre, au.Nombre, art.TipoDeArticulo, art.CodArticulo from articulos as art inner join autor as au on art.Autor_idAutor = au.idAutor order by art.Nombre asc, au.Nombre asc";    
        try {
            Ps = con.conectar().prepareStatement(mostrarSql);
            Rs = Ps.executeQuery();
            if (contenido.getRowCount() > 0) {//cuenta la cantidad de filas con contenido y te imprime una sola vez
                TitulosElimModif();
            }
            while (Rs.next()) {
                Object [] vector = {Rs.getString(1), Rs.getString(2), Rs.getInt(3), Rs.getInt(4)};
                contenido.addRow(vector);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en la consulta de articulos" + "\n" + e);
        }
        return contenido;
    }
}
