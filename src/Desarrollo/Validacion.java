package Desarrollo;
import javax.swing.JOptionPane;
public class Validacion {

    public static void SoloLetras(java.awt.event.KeyEvent obj){
        char letra = obj.getKeyChar();
        int posicion = (int)obj.getKeyChar();
        if (!Character.isLetter(letra) && posicion !=8 && posicion !=32) {
            JOptionPane.showMessageDialog(null, "Error !!, debe escribir solamente letras");
        }
    }
    
    public static void SoloNros(java.awt.event.KeyEvent obj){
        char nro = obj.getKeyChar();
        int posicion = (int)obj.getKeyChar();
        if (!Character.isDigit(nro) && posicion !=8) {
            JOptionPane.showMessageDialog(null, "Error !!, debe escribir solamente numeros");
        }
    }
    
    public static void SoloLetrasyNros(java.awt.event.KeyEvent obj){
        char letNro = obj.getKeyChar();
        int posicion = (int)obj.getKeyChar();
        if (!Character.isDigit(letNro) && posicion !=8 && !Character.isLetter(letNro) && posicion !=32) {
            JOptionPane.showMessageDialog(null, "Error !!, debe escribir solamente letras y numeros");
        }
    }
    
    public static java.sql.Date ConvertirFecha(java.util.Date FechaForm){//dd-mm-yyyy
        java.sql.Date FechaSql = new java.sql.Date(FechaForm.getTime());
        return FechaSql;//yyyy-mm-dd
    }
}
