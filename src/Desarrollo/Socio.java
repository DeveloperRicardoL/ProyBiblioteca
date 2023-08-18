package Desarrollo;
import Bdd.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Socio {
    private String Nom;
    private String PrimerApe;
    private String Dni;
    private String Direc;
    private String Tel;

    private final Conexion con = new Conexion();
    private PreparedStatement Ps;
    private ResultSet Rs;
    private DefaultTableModel contenido;
    
    public Socio(String Nom, String PrimerApe, String Dni, String Direc, String Tel) {
        this.Nom = Nom;
        this.PrimerApe = PrimerApe;
        this.Dni = Dni;
        this.Direc = Direc;
        this.Tel = Tel;
    }
    public Socio() {
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public String getPrimerApe() {
        return PrimerApe;
    }

    public void setPrimerApe(String PrimerApe) {
        this.PrimerApe = PrimerApe;
    }

    public String getDni() {
        return Dni;
    }

    public void setDni(String Dni) {
        this.Dni = Dni;
    }

    public String getDirec() {
        return Direc;
    }

    public void setDirec(String Direc) {
        this.Direc = Direc;
    }

    public String getTel() {
        return Tel;
    }

    public void setTel(String Tel) {
        this.Tel = Tel;
    }
    
    public void Alta(){
        String carga = "INSERT INTO socio(Nombre,PrimerApellido,Dni,Direccion,Telefono)VALUES(?,?,?,?,?);";
        try {
            Ps = con.conectar().prepareStatement(carga);
            Ps.setString(1, this.Nom);
            Ps.setString(2, this.PrimerApe);
            Ps.setString(3, this.Dni);
            Ps.setString(4, this.Direc);
            Ps.setString(5, this.Tel);
            int rayo = Ps.executeUpdate();
            if (rayo > 0) {
                JOptionPane.showMessageDialog(null, "cargado");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR !!, no pudo ingresar el socio" + "\n" + e);
        }
    }
    
    public DefaultTableModel MostrarTitulos(){
        String [] titulos = {"N° de Socio","Nombre", "Apellido", "Dni", "Dirección", "Telefono"};
        String [][] registros ={};
        contenido = new DefaultTableModel(registros, titulos);
        return contenido;
    }
    public DefaultTableModel MostrarContenido(){
        String mostrarSql= "select NroSocio, Nombre, PrimerApellido, Dni, Direccion, Telefono from socio";
        ResultSet Rs;
        try {
            Ps = con.conectar().prepareStatement(mostrarSql);
            Rs = Ps.executeQuery();
            if (contenido.getRowCount() > 0) {
                MostrarTitulos();
            }
            while (Rs.next()) {
                Object[] vector = {Rs.getInt(1), Rs.getString(2), Rs.getString(3), Rs.getString(4), Rs.getString(5), Rs.getString(6)};
                contenido.addRow(vector);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en la consulta de Socio" + "\n" + e);
        }
        return contenido;
    }
    
    public void Modificar(){
        String modifica = "UPDATE socio SET Nombre = '"+ this.getNom() +"',PrimerApellido = '"+ this.getPrimerApe() +"',Dni = '"+ this.getDni() +"',Direccion = '"+ this.getDirec() +"',Telefono = '"+ this.getTel() +"' WHERE Dni = '"+ this.getDni() +"';";
        try {    
            Ps = con.conectar().prepareStatement(modifica);//use agroalimentaria
            int x = Ps.executeUpdate();// esto es el rayito
            if (x > 0) {
                JOptionPane.showMessageDialog(null, "SOCIO MODIFICADO");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR !!, no se pudo encontrar al socio" + "\n"+ e);
        }
    }
    public void Baja(String DniElim){
        String Elimi = "DELETE FROM socio WHERE Dni = ?";
        try {
            Ps = con.conectar().prepareStatement(Elimi);
            Ps.setString(1, DniElim);
            int rayo = Ps.executeUpdate();
            if (rayo > 0) {
                JOptionPane.showMessageDialog(null, "DNI ELIMINADO");
            } else {
                JOptionPane.showMessageDialog(null, "Error, DNI inexistente");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR !!, no se pudo encontrar el Dni" + "\n" + e);
        }
    }
    
    public DefaultTableModel TitulosDeElimiModi(){
        String [] titulos = {"Nombre", "Apellido", "Dni"};
        String [][] registros ={};
        contenido = new DefaultTableModel(registros, titulos);
        return contenido;
    }
    public DefaultTableModel MostrarDeElimiModi(){
        String mostrarSql= "select Nombre, PrimerApellido, Dni from socio";
        try {
            Ps = con.conectar().prepareStatement(mostrarSql);
            Rs = Ps.executeQuery();
            if (contenido.getRowCount() > 0) {
                TitulosDeElimiModi();
            }
            while (Rs.next()) {
                Object[] vector = {Rs.getString(1), Rs.getString(2), Rs.getString(3)};
                contenido.addRow(vector);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en la consulta de Socio" + "\n" + e);
        }
        return contenido;
    }
    public void BuscarPorDni(String Dni){
        String buscar = "select Nombre, PrimerApellido, Dni, Direccion, Telefono from socio where Dni = '"+ Dni +"';";
        try {
            Ps = con.conectar().prepareStatement(buscar);
            Rs = Ps.executeQuery();
            if (Rs.next()) {
                this.setNom(Rs.getString(1));
                this.setPrimerApe(Rs.getString(2));
                this.setDni(Rs.getString(3));
                this.setDirec(Rs.getString(4));
                this.setTel(Rs.getString(5));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error, no se encontro el dato" + "\n" + e);
        }
    }
    
    public DefaultTableModel MostrarTitulosBuscar(int consultEleg){
        String [] titulos = {};
        switch (consultEleg) {
            case 1:
                String [] titulos1 = {"Nro de Socio", "Nombre/s", "Apellido", "Dni"};
                titulos = Arrays.copyOf(titulos1, titulos1.length);
                break;
            case 2:
                String [] titulos2 = {"Nombre/s", "Apellido", "Dni", "Telefono"};
                titulos = Arrays.copyOf(titulos2, titulos2.length);
                break;
            case 3:
                String [] titulos3 = {"Nro de Socio", "Nombre/s", "Dni", "Dirección"};
                titulos = Arrays.copyOf(titulos3, titulos3.length);
                break;
            case 4:
                String [] titulos4 = {"Código de Artículo", "Nombre de Artículo", "Cantidad de Páginas"};
                titulos = Arrays.copyOf(titulos4, titulos4.length);
                break;
            case 5:
                String [] titulos5 = {"Código de Artículo", "Nombre de Artículo", "Cantidad de Canciones"};
                titulos = Arrays.copyOf(titulos5, titulos5.length);
                break;
            case 6:
                String [] titulos6 = {"Tipo de Artículo", "Cantidad Total"};
                titulos = Arrays.copyOf(titulos6, titulos6.length);
                break;
            case 7:
                String [] titulos7 = {"Código de Artículo", "Nombre de Artículo", "Cantidad de Copias"};
                titulos = Arrays.copyOf(titulos7, titulos7.length);
                break;
            case 8:
                String [] titulos8 = {"Nro de Ticket", "Fecha Inicio de Prestamo", "Fecha Fin de Prestamo", "Fecha de Devolución" , "Nro de Socio"};
                titulos = Arrays.copyOf(titulos8, titulos8.length);
                break;
            case 9:
                String [] titulos9 = {"Nro de Ticket", "Fecha Inicio de Prestamo", "Fecha Fin de Prestamo", "Fecha de Devolución" , "Nro de Socio", "Nombre de Artículo"};
                titulos = Arrays.copyOf(titulos9, titulos9.length);
                break;
        }
        String [][] registros ={};
        contenido = new DefaultTableModel(registros, titulos);
        return contenido;
    }
    public DefaultTableModel MostrarContenidoBuscar(int consultEleg, String DatoABuscar, int DatoABuscarNro, int CantCopias, java.sql.Date FechaIniSql, java.sql.Date FechaFinSql){
        String consultaSql = "";
        switch (consultEleg) {
            case 1:
                String consul1 = "select NroSocio, Nombre, PrimerApellido, Dni from socio where Dni like ('%"+ DatoABuscar + "%');";
                consultaSql = consul1;
                break;
            case 2:
                String consul2 = "select Nombre, PrimerApellido, Dni, Telefono from socio where Telefono like('%"+ DatoABuscar +"');";
                consultaSql = consul2;
                break;
            case 3:
                String consul3 = "select NroSocio, Nombre, Dni, Direccion from socio where Direccion like('"+ DatoABuscar +"%');";
                consultaSql = consul3;
                break;
            case 4:
                String consul4 = "select CodArticulo, Nombre, CantPaginas from articulos where CantPaginas >= '"+ DatoABuscarNro +"';";
                consultaSql = consul4;
                break;
            case 5:
                String consul5 = "select CodArticulo, Nombre, CantCanciones from articulos where CantCanciones >= '"+ DatoABuscarNro +"';";
                consultaSql = consul5;
                break;
            case 6:
                String consul6 = "select TipoDeArticulo, count(*) as 'cantidad de cd' from articulos where TipoDeArticulo = '"+ DatoABuscarNro +"';";
                consultaSql = consul6;
                break;
            case 7:
                String consul7 = "select CodArticulo, Nombre, CantCopias from articulos where CantCopias <= '"+ CantCopias +"' and TipoDeArticulo = '"+ DatoABuscarNro +"';";
                consultaSql = consul7;
                break;
            case 8:
                String consul8 = "select NroTicket, FechaInicioPrestamo, FechaFinPrestamo, Devolucion, Socio_NroSocio from prestamo where FechaFinPrestamo >= '"+ FechaIniSql +"' and FechaFinPrestamo <= '"+ FechaFinSql +"';";
                consultaSql = consul8;
                break;
            case 9:
                String consul9 = "select pr.NroTicket, pr.FechaInicioPrestamo, pr.FechaFinPrestamo, pr.Devolucion, pr.Socio_NroSocio, art.Nombre from prestamo as pr inner join articulos as art on pr.Articulos_CodArticulo = art.CodArticulo where pr.FechaInicioPrestamo between '"+ FechaIniSql +"' and now() order by pr.FechaInicioPrestamo desc;";
                consultaSql = consul9;
                break;
        }
        try {
            Ps = con.conectar().prepareStatement(consultaSql );
            Rs = Ps.executeQuery();
            if (contenido.getRowCount() > 0) {
                MostrarTitulosBuscar(consultEleg);
            }
            Object [] vector  = {};
            String tpArt;
            while (Rs.next()) {
                switch (consultEleg) {
                    case 1:
                        Object [] vector1 = {Rs.getInt(1),Rs.getString(2), Rs.getString(3), Rs.getString(4)};
                        vector = Arrays.copyOf(vector1, vector1.length);
                        break;
                    case 2:
                        Object [] vector2  = {Rs.getString(1), Rs.getString(2), Rs.getString(3), Rs.getString(4)};
                        vector = Arrays.copyOf(vector2, vector2.length);
                        break;
                    case 3:
                        Object [] vector3 = {Rs.getInt(1),Rs.getString(2), Rs.getString(3), Rs.getString(4)};
                        vector = Arrays.copyOf(vector3, vector3.length);
                        break;
                    case 4:
                        Object [] vector4 = {Rs.getInt(1),Rs.getString(2), Rs.getInt(3)};
                        vector = Arrays.copyOf(vector4, vector4.length);
                        break;
                    case 5:
                        Object [] vector5 = {Rs.getInt(1),Rs.getString(2), Rs.getInt(3)};
                        vector = Arrays.copyOf(vector5, vector5.length);
                        break;
                    case 6:
                        tpArt = null;
                        switch (Rs.getInt(1)) {
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
                        Object [] vector6 = {tpArt, Rs.getInt(2)};
                        vector = Arrays.copyOf(vector6, vector6.length);
                        break;
                    case 7:
                        Object [] vector7 = {Rs.getInt(1),Rs.getString(2), Rs.getInt(3)};
                        vector = Arrays.copyOf(vector7, vector7.length);
                        break;
                    case 8:
                        Object [] vector8 = {Rs.getInt(1),Rs.getDate(2), Rs.getDate(3), Rs.getDate(4), Rs.getInt(5)};
                        vector = Arrays.copyOf(vector8, vector8.length);
                        break;
                    case 9:
                        Object [] vector9 = {Rs.getInt(1),Rs.getDate(2), Rs.getDate(3), Rs.getDate(4), Rs.getInt(5), Rs.getString(6)};
                        vector = Arrays.copyOf(vector9, vector9.length);
                        break;
                }
                contenido.addRow(vector);
            }
            if (vector.length < 1) {
                JOptionPane.showMessageDialog(null, "Dato no encontrado");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en la consulta de Socio" + "\n" + e);
        }
        return contenido;
    }
    public boolean ConsultaDni(String Dni){
        boolean respuesta = false;
        String buscar = "select Dni from socio where Dni = ?";
        try {
            Ps = con.conectar().prepareStatement(buscar);
            Ps.setString(1, Dni);
            Rs = Ps.executeQuery();
            if (Rs.next()) {
                respuesta = true;
            }else{
                JOptionPane.showMessageDialog(null, "No se encontro el Dni ingresado");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error, no se encontro el dato" + "\n" + e);
        }
        return respuesta;
    }
}
