package Desarrollo;
import Bdd.Conexion;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class Prestamo {
    private Date FechaInicioPrest;
    private Date FechaFinPrest;
    private int Condicion;
    private String Comentario;
    private Date FechaDevolu;
    private int NroSocio;
    private int CodArt;
    
    private String NomArt;
    
    private final Conexion con = new Conexion();
    private PreparedStatement Ps;
    private ResultSet Rs;
    private DefaultTableModel contenido;

    public Prestamo(Date FechaInicioPrest, Date FechaFinPrest, int Condicion, String Comentario, Date FechaDevolu, int NroSocio, int CodArt) {
        this.FechaInicioPrest = FechaInicioPrest;
        this.FechaFinPrest = FechaFinPrest;
        this.Condicion = Condicion;
        this.Comentario = Comentario;
        this.FechaDevolu = FechaDevolu;
        this.NroSocio = NroSocio;
        this.CodArt = CodArt;
    }
    public Prestamo(Date FechaInicioPrest, Date FechaFinPrest, int Condicion, int NroSocio, int CodArt) {
        this.FechaInicioPrest = FechaInicioPrest;
        this.FechaFinPrest = FechaFinPrest;
        this.Condicion = Condicion;
        this.NroSocio = NroSocio;
        this.CodArt = CodArt;
    }
    public Prestamo(){
        
    }

    public Date getFechaInicioPrest() {
        return FechaInicioPrest;
    }

    public void setFechaInicioPrest(Date FechaInicioPrest) {
        this.FechaInicioPrest = FechaInicioPrest;
    }

    public Date getFechaFinPrest() {
        return FechaFinPrest;
    }

    public void setFechaFinPrest(Date FechaFinPrest) {
        this.FechaFinPrest = FechaFinPrest;
    }

    public int getCondicion() {
        return Condicion;
    }

    public void setCondicion(int Condicion) {
        this.Condicion = Condicion;
    }

    public String getComentario() {
        return Comentario;
    }

    public void setComentario(String Comentario) {
        this.Comentario = Comentario;
    }

    public Date getFechaDevolu() {
        return FechaDevolu;
    }

    public void setFechaDevolu(Date FechaDevolu) {
        this.FechaDevolu = FechaDevolu;
    }

    public int getNroSocio() {
        return NroSocio;
    }

    public void setNroSocio(int NroSocio) {
        this.NroSocio = NroSocio;
    }

    public int getCodArt() {
        return CodArt;
    }

    public void setCodArt(int CodArt) {
        this.CodArt = CodArt;
    }
    public String getNomArt(){
        return NomArt;
    }
    public void setNomArt(String NomArt){
        this.NomArt = NomArt;
    }
    
    public void Alta(){
        String carga = "INSERT INTO prestamo(FechaInicioPrestamo,FechaFinPrestamo,Condicion,Comentario,Devolucion,Socio_NroSocio,Articulos_CodArticulo)VALUES(?,?,?,?,?,?,?)";
        try {
            Ps = con.conectar().prepareStatement(carga);
            Ps.setDate(1, this.FechaInicioPrest);
            Ps.setDate(2, this.FechaFinPrest);
            Ps.setInt(3, this.Condicion);
            Ps.setString(4, this.Comentario);
            Ps.setDate(5, this.FechaDevolu);
            Ps.setInt(6, this.NroSocio);
            Ps.setInt(7, this.CodArt);
            int rayo = Ps.executeUpdate();
            if (rayo > 0) {
                JOptionPane.showMessageDialog(null, "cargado");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR !!, no pudo ingresar el Prestamo" + "\n" + e);
        }
    }
    public void Baja(int TicketAEliminar){
        String Borrar = "DELETE FROM prestamo WHERE NroTicket ='"+ TicketAEliminar +"';";
        try {
            Ps = con.conectar().prepareStatement(Borrar);
            int ejecutar = Ps.executeUpdate();
            if (ejecutar > 0) {
                JOptionPane.showMessageDialog(null, "PRESTAMO ELIMINADO");
            }else{
                JOptionPane.showMessageDialog(null, "Error, Prestamo inexistente");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR !!, no pudo encontrar el Prestamo" + "\n" + e);
        }
    }
    public void Modificar(int NroTicket){
        String buscar = "UPDATE prestamo SET FechaInicioPrestamo = '"+ this.getFechaInicioPrest() +"', FechaFinPrestamo = '"+ this.getFechaFinPrest() +"', Condicion = '"+ this.getCondicion() +"', Comentario = '"+ this.getComentario() +"', Devolucion = '"+ this.getFechaDevolu() +"', Socio_NroSocio = '"+ this.getNroSocio() +"', Articulos_CodArticulo = '"+ this.getCodArt() +"' WHERE NroTicket = '"+ NroTicket +"';"; //como retorno el NroTicket si es autoincrementable
        try {
            Ps = con.conectar().prepareStatement(buscar);
            int rayo = Ps.executeUpdate();
            if (rayo > 0) {
                JOptionPane.showMessageDialog(null, "Registro modificado");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
        }
    }
    public DefaultTableModel MostrarTitu(){
        String [] titulos = {"N° de Ticket", "Fecha Inicio de Prestamo", "Fecha Fin de Prestamo", "Condición", "Comentario", "Devolucion", "N° de Socio", "Código de Articulo"};
        String [][] registros ={};
        contenido = new DefaultTableModel(registros, titulos);
        return contenido;
    }
    public DefaultTableModel MostrarDatos(){
        String datos = "SELECT NroTicket, FechaInicioPrestamo, FechaFinPrestamo, Condicion, Comentario, Devolucion, Socio_NroSocio, Articulos_CodArticulo FROM prestamo";
        try {
            Ps = con.conectar().prepareStatement(datos);
            Rs = Ps.executeQuery();
            if (contenido.getRowCount() > 0) {
                MostrarTitu();
            }
            while (Rs.next()) {
                Object [] vector = {Rs.getInt(1), Rs.getDate(2), Rs.getDate(3), Rs.getInt(4), Rs.getString(5), Rs.getDate(6), Rs.getInt(7), Rs.getInt(8)};
                contenido.addRow(vector);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en la consulta de Prestamo" + "\n" + e);
        }
        return contenido;
    }
    
    public DefaultTableModel MostrarTitulosCarga(){
        String [] titulos = {"N° de Socio", "Nombre", "Apellido"};
        String [][] registros ={};
        contenido = new DefaultTableModel(registros, titulos);
        return contenido;
    }
    public DefaultTableModel MostrarContenido(){
        String datos = "select NroSocio, Nombre, PrimerApellido from socio";
        try {
            Ps = con.conectar().prepareStatement(datos);
            Rs = Ps.executeQuery();
            if (contenido.getRowCount() > 0) {
                MostrarTitulosCarga();
            }
            while (Rs.next()) {
                Object [] vector = {Rs.getInt(1), Rs.getString(2), Rs.getString(3)};
                contenido.addRow(vector);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en la consulta de Socio" + "\n" + e);
        }
        return contenido;
    }
    public void BuscarPorCod(int NroTicket){
        String buscar = "select pr.FechaInicioPrestamo, pr.FechaFinPrestamo, pr.Condicion, pr.Comentario, pr.Devolucion, pr.Socio_NroSocio, art.Nombre from prestamo as pr inner join articulos as art on pr.Articulos_CodArticulo = art.CodArticulo where pr.NroTicket = '"+ NroTicket +"';";
        try {
            Ps = con.conectar().prepareStatement(buscar);
            Rs = Ps.executeQuery();
            if (Rs.next()) {
                this.setFechaInicioPrest(Rs.getDate(1));
                this.setFechaFinPrest(Rs.getDate(2));
                this.setCondicion(Rs.getInt(3));
                this.setComentario(Rs.getString(4));
                this.setFechaDevolu(Rs.getDate(5));
                this.setNroSocio(Rs.getInt(6));
                this.setNomArt(Rs.getString(7));
                
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error, no se encontro el Articulo" + "\n" + e);
        }
    }
    public DefaultTableModel MostrarTitulosBuscar(int consultEleg){
        String [] titulos = {};
        switch (consultEleg) {
            case 1:
                String [] titulos1 = {"Nro de Ticket", "Nombre/s", "Apellido"};
                titulos = Arrays.copyOf(titulos1, titulos1.length);
                break;
            case 2:
                String [] titulos2 = {"Nro de Ticket", "Dni", "Nombre de Articulo", "Tipo de Articulo"};
                titulos = Arrays.copyOf(titulos2, titulos2.length);
                break;
        }
        String [][] registros ={};
        contenido = new DefaultTableModel(registros, titulos);
        return contenido;
    }
    public DefaultTableModel MostrarContenidoBuscar(int consultEleg, String DatoABuscar){
        String consultaSql = "";
        switch (consultEleg) {
            case 1:
                String consul1 = "select pr.NroTicket, s.Nombre, s.PrimerApellido from prestamo as pr inner join socio as s on pr.Socio_NroSocio = s.NroSocio where s.Dni = '"+ DatoABuscar +"';";
                consultaSql = consul1;
                break;
            case 2:
                String consul2 = "select pr.NroTicket, s.Dni, art.Nombre, art.TipoDeArticulo from prestamo as pr inner join socio as s on pr.Socio_NroSocio = s.NroSocio inner join articulos as art on pr.Articulos_CodArticulo = art.CodArticulo where art.Nombre = '"+ DatoABuscar +"';";
                consultaSql = consul2;
                break;
        }
        try {
            Ps = con.conectar().prepareStatement(consultaSql );
            Rs = Ps.executeQuery();
            if (contenido.getRowCount() > 0) {
                MostrarTitulosBuscar(consultEleg);
            }
            Object [] vector  = {};
            while (Rs.next()) {
                switch (consultEleg) {
                    case 1:
                        Object [] vector1 = {Rs.getInt(1),Rs.getString(2), Rs.getString(3)};
                        vector = Arrays.copyOf(vector1, vector1.length);
                        break;
                    case 2:
                        String tpArt = null;
                        switch (Rs.getInt(4)) {
                            case 1:
                                tpArt = "LIBRO";
                                break;
                            case 2:
                                tpArt = "CD";
                                break;
                            case 3:
                                tpArt = "PELICULA";
                                break;
                        }
                        Object [] vector2  = {Rs.getInt(1), Rs.getString(2), Rs.getString(3), tpArt};
                        vector = Arrays.copyOf(vector2, vector2.length);
                        break;
                }
                contenido.addRow(vector);
            }
            if (vector.length < 1) {
                JOptionPane.showMessageDialog(null, "Dni no encontrado");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en la consulta de Prestamo" + "\n" + e);
        }
        return contenido;
    }
    
    public DefaultTableModel MostrarTitulosCargaSocioAsignado(){
        String [] titulos = {"N° de Socio", "Nombre", "Apellido"};
        String [][] registros ={};
        contenido = new DefaultTableModel(registros, titulos);
        return contenido;
    }
    public DefaultTableModel MostrarContenidoSocioAsignado(int NroTicket){
        String datos = "select s.NroSocio, s.Nombre, s.PrimerApellido from socio as s inner join prestamo as pr on pr.Socio_NroSocio = s.NroSocio where pr.NroTicket = '"+ NroTicket +"';";
        try {
            Ps = con.conectar().prepareStatement(datos);
            Rs = Ps.executeQuery();
            if (contenido.getRowCount() > 0) {
                MostrarTitulosCarga();
            }
            while (Rs.next()) {
                Object [] vector = {Rs.getInt(1), Rs.getString(2), Rs.getString(3)};
                contenido.addRow(vector);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en la consulta de Socio" + "\n" + e);
        }
        return contenido;
    }
}
