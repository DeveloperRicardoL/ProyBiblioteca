package Formulario;

import Desarrollo.Socio;
import Desarrollo.Validacion;
import java.time.LocalDate;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class FrmVariasConsultas extends javax.swing.JInternalFrame {
Socio s = new Socio();
int NroConsul, CantCopias;

    public FrmVariasConsultas(int consultEleg) {
        initComponents();
        this.Tabla.setModel(s.MostrarTitulosBuscar(consultEleg));
        NroConsul = consultEleg;
        this.CbTpArtic.setModel(this.CargaCb());
        java.time.LocalDate hoy = LocalDate.now();
        java.util.Date FechaHoy = java.sql.Date.valueOf(hoy);
        this.FechaHasta.setDate(FechaHoy);
        java.time.LocalDate hoyMenos7 = hoy.minusDays(7);
        java.util.Date FechaHoyMenos7 = java.sql.Date.valueOf(hoyMenos7);
        this.FechaDesde.setDate(FechaHoyMenos7);
        
        switch (consultEleg) {
            case 1:
                this.TxtMensaje.setText("Dni completo o incompleto:");
                this.CbTpArtic.setVisible(false);
                this.LblTpArt.setVisible(false);
                this.FechaDesde.setVisible(false);
                this.FechaHasta.setVisible(false);
                this.LblFechaDesde.setVisible(false);
                this.LblFechaHasta.setVisible(false);
                break;
            case 2:
                this.TxtMensaje.setText("Los últimos Números del telefono:");
                this.CbTpArtic.setVisible(false);
                this.LblTpArt.setVisible(false);
                this.FechaDesde.setVisible(false);
                this.FechaHasta.setVisible(false);
                this.LblFechaDesde.setVisible(false);
                this.LblFechaHasta.setVisible(false);
                break;
            case 3:
                this.TxtMensaje.setText("Dirección completa/Incompleta:");
                this.CbTpArtic.setVisible(false);
                this.LblTpArt.setVisible(false);
                this.FechaDesde.setVisible(false);
                this.FechaHasta.setVisible(false);
                this.LblFechaDesde.setVisible(false);
                this.LblFechaHasta.setVisible(false);
                break;
            case 4:
                this.TxtMensaje.setText("A partir de que cantidad de pág:");
                this.CbTpArtic.setVisible(false);
                this.LblTpArt.setVisible(false);
                this.FechaDesde.setVisible(false);
                this.FechaHasta.setVisible(false);
                this.LblFechaDesde.setVisible(false);
                this.LblFechaHasta.setVisible(false);
                break;
            case 5:
                this.TxtMensaje.setText("A partir de que cantidad de Canciones:");
                this.CbTpArtic.setVisible(false);
                this.LblTpArt.setVisible(false);
                this.FechaDesde.setVisible(false);
                this.FechaHasta.setVisible(false);
                this.LblFechaDesde.setVisible(false);
                this.LblFechaHasta.setVisible(false);
                break;
            case 6:
                this.LblDatoABuscar.setVisible(false);
                this.TxtMensaje.setText("Elija un tipo de Artículo:");
                this.TxtDatoABuscar.setVisible(false);
                this.CbTpArtic.setVisible(true);
                this.FechaDesde.setVisible(false);
                this.FechaHasta.setVisible(false);
                this.LblFechaDesde.setVisible(false);
                this.LblFechaHasta.setVisible(false);
                break;
            case 7:
                this.TxtMensaje.setText("Cantidad de copias menores a:");
                this.FechaDesde.setVisible(false);
                this.FechaHasta.setVisible(false);
                this.LblFechaDesde.setVisible(false);
                this.LblFechaHasta.setVisible(false);
                break;
            case 8:
                this.LblTpArt.setVisible(false);
                this.LblDatoABuscar.setVisible(false);
                this.TxtMensaje.setVisible(false);
                this.TxtDatoABuscar.setVisible(false);
                this.CbTpArtic.setVisible(false);
                this.FechaDesde.setVisible(true);
                this.FechaHasta.setVisible(true);
                this.LblFechaDesde.setVisible(true);
                this.LblFechaHasta.setVisible(true);
                break;
            case 9:
                this.LblTpArt.setVisible(false);
                this.LblDatoABuscar.setVisible(false);
                this.TxtMensaje.setVisible(false);
                this.TxtDatoABuscar.setVisible(false);
                this.CbTpArtic.setVisible(false);
                this.FechaDesde.setVisible(true);
                this.FechaHasta.setEnabled(false);
                this.LblFechaDesde.setVisible(true);
                this.LblFechaHasta.setVisible(true);
                break;
        }
    }
    private DefaultComboBoxModel CargaCb(){
            DefaultComboBoxModel llenado = new DefaultComboBoxModel();
            llenado.addElement("LIBRO");
            llenado.addElement("CD");
            llenado.addElement("PELICULA");
            return llenado;
    }
    private int SwCombo(){
        String eleccion = this.CbTpArtic.getSelectedItem().toString();
        int eleg = 0;
        switch (eleccion) {
            case "LIBRO":
                eleg = 1;
                break;
            case "CD":
                eleg = 2;
                break;
            case "PELICULA":
                eleg = 3;
                break;
        }
        return eleg;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelTabla = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        PanelBuscar = new javax.swing.JPanel();
        LblDatoABuscar = new javax.swing.JLabel();
        TxtDatoABuscar = new javax.swing.JTextField();
        BtnBuscar = new javax.swing.JButton();
        CbTpArtic = new javax.swing.JComboBox<>();
        TxtMensaje = new javax.swing.JTextField();
        LblTpArt = new javax.swing.JLabel();
        FechaDesde = new com.toedter.calendar.JDateChooser();
        FechaHasta = new com.toedter.calendar.JDateChooser();
        BtnSalir = new javax.swing.JButton();
        LblFechaDesde = new javax.swing.JLabel();
        LblFechaHasta = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1"
            }
        ));
        PanelTabla.setViewportView(Tabla);

        getContentPane().add(PanelTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 590, 392));

        PanelBuscar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LblDatoABuscar.setText("Ingrese Dato a Buscar: ");
        PanelBuscar.add(LblDatoABuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 14, 140, -1));
        PanelBuscar.add(TxtDatoABuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 64, 134, -1));

        BtnBuscar.setText("Buscar");
        BtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarActionPerformed(evt);
            }
        });
        PanelBuscar.add(BtnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        PanelBuscar.add(CbTpArtic, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 108, -1));

        TxtMensaje.setEditable(false);
        TxtMensaje.setBorder(null);
        PanelBuscar.add(TxtMensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 220, 20));

        LblTpArt.setText("Tipo de Artículo:");
        PanelBuscar.add(LblTpArt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 110, -1));
        PanelBuscar.add(FechaDesde, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 130, -1));
        PanelBuscar.add(FechaHasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 130, -1));

        BtnSalir.setText("Salir");
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });
        PanelBuscar.add(BtnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 70, -1));

        LblFechaDesde.setText("Fecha desde:");
        PanelBuscar.add(LblFechaDesde, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 90, -1));

        LblFechaHasta.setText("Fecha hasta:");
        PanelBuscar.add(LblFechaHasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 90, -1));

        getContentPane().add(PanelBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(604, 6, 240, 392));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarActionPerformed
        String DatoABuscar;
        int DatoABuscarNro;
        boolean Valida;
        java.util.Date FechaIniForm, FechaFinForm, FechaDevoForm;
        java.sql.Date FechaIniSql, FechaFinSql, FechaDevoSql;
        
        switch (NroConsul) {
            case 1:
                DatoABuscarNro = 0;
                FechaIniSql = null;
                FechaFinSql = null;
                DatoABuscar = this.TxtDatoABuscar.getText();
                this.Tabla.setModel(s.MostrarContenidoBuscar(NroConsul, DatoABuscar, DatoABuscarNro, CantCopias, FechaIniSql, FechaFinSql));
                break;
            case 2:
                DatoABuscarNro = 0;
                FechaIniSql = null;
                FechaFinSql = null;
                DatoABuscar = this.TxtDatoABuscar.getText();
                this.Tabla.setModel(s.MostrarContenidoBuscar(NroConsul, DatoABuscar, DatoABuscarNro, CantCopias, FechaIniSql, FechaFinSql));
                break;
            case 3:
                DatoABuscarNro = 0;
                FechaIniSql = null;
                FechaFinSql = null;
                DatoABuscar = this.TxtDatoABuscar.getText();
                this.Tabla.setModel(s.MostrarContenidoBuscar(NroConsul, DatoABuscar, DatoABuscarNro, CantCopias, FechaIniSql, FechaFinSql));
                break;
            case 4:
                DatoABuscar = null;
                FechaIniSql = null;
                FechaFinSql = null;
                Valida = this.TxtDatoABuscar.getText().isEmpty();
                if (Valida == false) {
                    DatoABuscarNro = Integer.parseInt(this.TxtDatoABuscar.getText());
                    this.Tabla.setModel(s.MostrarContenidoBuscar(NroConsul, DatoABuscar, DatoABuscarNro, CantCopias, FechaIniSql, FechaFinSql));
                } else {
                    JOptionPane.showMessageDialog(null, "Debe ingresar un Número");
                }
                break;
            case 5:
                DatoABuscar = null;
                FechaIniSql = null;
                FechaFinSql = null;
                Valida = this.TxtDatoABuscar.getText().isEmpty();
                if (Valida == false) {
                    DatoABuscarNro = Integer.parseInt(this.TxtDatoABuscar.getText());
                    this.Tabla.setModel(s.MostrarContenidoBuscar(NroConsul, DatoABuscar, DatoABuscarNro, CantCopias, FechaIniSql, FechaFinSql));
                } else {
                    JOptionPane.showMessageDialog(null, "Debe ingresar un Número");
                }
                break;
            case 6:
                DatoABuscar = null;
                FechaIniSql = null;
                FechaFinSql = null;
                DatoABuscarNro = SwCombo();
                this.Tabla.setModel(s.MostrarContenidoBuscar(NroConsul, DatoABuscar, DatoABuscarNro, CantCopias, FechaIniSql, FechaFinSql));
                break;
            case 7:
                DatoABuscar = null;
                FechaIniSql = null;
                FechaFinSql = null;
                Valida = this.TxtDatoABuscar.getText().isEmpty();
                if (Valida == false) {
                    DatoABuscarNro = SwCombo();
                    CantCopias = Integer.parseInt(this.TxtDatoABuscar.getText());
                    this.Tabla.setModel(s.MostrarContenidoBuscar(NroConsul, DatoABuscar, DatoABuscarNro, CantCopias, FechaIniSql, FechaFinSql));
                } else {
                    JOptionPane.showMessageDialog(null, "Debe ingresar un Número");
                }
                break;
            case 8:
                DatoABuscar = null;
                DatoABuscarNro = 0;
                FechaIniForm = this.FechaDesde.getDate();
                FechaIniSql = Validacion.ConvertirFecha(FechaIniForm);
                FechaFinForm = this.FechaHasta.getDate();
                FechaFinSql = Validacion.ConvertirFecha(FechaFinForm);
                this.Tabla.setModel(s.MostrarContenidoBuscar(NroConsul, DatoABuscar, DatoABuscarNro, CantCopias, FechaIniSql, FechaFinSql));
                break;
            case 9:
                DatoABuscar = null;
                DatoABuscarNro = 0;
                FechaIniForm = this.FechaDesde.getDate();
                FechaIniSql = Validacion.ConvertirFecha(FechaIniForm);
                FechaFinForm = this.FechaHasta.getDate();
                FechaFinSql = Validacion.ConvertirFecha(FechaFinForm);
                this.Tabla.setModel(s.MostrarContenidoBuscar(NroConsul, DatoABuscar, DatoABuscarNro, CantCopias, FechaIniSql, FechaFinSql));
                break;
        }
        this.TxtDatoABuscar.setText(null);
    }//GEN-LAST:event_BtnBuscarActionPerformed

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_BtnSalirActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JComboBox<String> CbTpArtic;
    private com.toedter.calendar.JDateChooser FechaDesde;
    private com.toedter.calendar.JDateChooser FechaHasta;
    private javax.swing.JLabel LblDatoABuscar;
    private javax.swing.JLabel LblFechaDesde;
    private javax.swing.JLabel LblFechaHasta;
    private javax.swing.JLabel LblTpArt;
    private javax.swing.JPanel PanelBuscar;
    private javax.swing.JScrollPane PanelTabla;
    private javax.swing.JTable Tabla;
    private javax.swing.JTextField TxtDatoABuscar;
    private javax.swing.JTextField TxtMensaje;
    // End of variables declaration//GEN-END:variables
}
