package Utilerias;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import javax.swing.JOptionPane;

public class Propiedades {
    
    public static Properties getProperties(){
        
        Properties prop = new Properties();
        InputStream entrada = null;
        try {
            entrada =  new FileInputStream("resources/config.properties");
            System.out.println("entrada: " + entrada);
            if (entrada == null) {
                System.out.println("No se encontró el archivo config.properties");
            }else{
                prop.load(entrada);
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error " + e);
        }
        return prop;
    }
}
