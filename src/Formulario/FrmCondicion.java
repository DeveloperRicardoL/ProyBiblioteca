package Formulario;
import Desarrollo.Condicion;
import Desarrollo.Validacion;
import javax.swing.DefaultComboBoxModel;
public class FrmCondicion extends javax.swing.JInternalFrame {
Condicion c = new Condicion();
    public FrmCondicion() {
        initComponents();
        this.setTitle("CONDICIONES");
        this.CbCondicion.setModel(this.CargarCBCondicion());
        this.PanelLstComentario.setVisible(false);
        this.BtnModificar.setEnabled(false);
        this.BtnEliminar.setEnabled(false);
    }

    private DefaultComboBoxModel CargarCBCondicion(){
        DefaultComboBoxModel Cargado = new DefaultComboBoxModel();
        Cargado.addElement("NUEVO");
        Cargado.addElement("EN CONDICIONES");
        Cargado.addElement("DETERIORADO");
        Cargado.addElement("FRÁGIL");
        Cargado.addElement("EN MAL ESTADO");
        return Cargado;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelBotones = new javax.swing.JPanel();
        BtnCargar = new org.edisoncor.gui.button.ButtonRound();
        BtnMostrar = new org.edisoncor.gui.button.ButtonRound();
        BtnModificar = new org.edisoncor.gui.button.ButtonRound();
        BtnEliminar = new org.edisoncor.gui.button.ButtonRound();
        BtnSalir = new org.edisoncor.gui.button.ButtonRound();
        PanelCarga = new javax.swing.JPanel();
        LblCondicion = new org.edisoncor.gui.label.LabelRound();
        LblComentario = new org.edisoncor.gui.label.LabelRound();
        CbCondicion = new org.edisoncor.gui.comboBox.ComboBoxRound();
        TxtComentario = new org.edisoncor.gui.textField.TextFieldRound();
        PanelLstComentario = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        LstComentario = new javax.swing.JList<>();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        BtnCargar.setText("CARGAR");
        BtnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCargarActionPerformed(evt);
            }
        });

        BtnMostrar.setText("MOSTRAR");
        BtnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMostrarActionPerformed(evt);
            }
        });

        BtnModificar.setText("MODIFICAR");
        BtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModificarActionPerformed(evt);
            }
        });

        BtnEliminar.setText("ELIMINAR");

        BtnSalir.setText("SALIR");
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelBotonesLayout = new javax.swing.GroupLayout(PanelBotones);
        PanelBotones.setLayout(PanelBotonesLayout);
        PanelBotonesLayout.setHorizontalGroup(
            PanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBotonesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtnCargar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(BtnMostrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        PanelBotonesLayout.setVerticalGroup(
            PanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnCargar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(BtnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LblCondicion.setText("CONDICION");

        LblComentario.setText("COMENTARIO");

        TxtComentario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtComentarioKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout PanelCargaLayout = new javax.swing.GroupLayout(PanelCarga);
        PanelCarga.setLayout(PanelCargaLayout);
        PanelCargaLayout.setHorizontalGroup(
            PanelCargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCargaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelCargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LblComentario, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                    .addComponent(LblCondicion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(PanelCargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CbCondicion, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                    .addComponent(TxtComentario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        PanelCargaLayout.setVerticalGroup(
            PanelCargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCargaLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(PanelCargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblCondicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CbCondicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelCargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblComentario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtComentario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(LstComentario);

        javax.swing.GroupLayout PanelLstComentarioLayout = new javax.swing.GroupLayout(PanelLstComentario);
        PanelLstComentario.setLayout(PanelLstComentarioLayout);
        PanelLstComentarioLayout.setHorizontalGroup(
            PanelLstComentarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLstComentarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelLstComentarioLayout.setVerticalGroup(
            PanelLstComentarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLstComentarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelCarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelLstComentario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PanelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 50, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PanelCarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PanelLstComentario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void BtnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCargarActionPerformed
        int condi = SwCondicion();
        String coment = this.TxtComentario.getText().toUpperCase();
        c.setCondicion(condi);
        c.setComentario(coment);
        c.Alta();
        Limpiar();
    }//GEN-LAST:event_BtnCargarActionPerformed

    private void BtnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMostrarActionPerformed
        this.BtnModificar.setEnabled(true);
        this.BtnEliminar.setEnabled(true);
        this.PanelLstComentario.setVisible(true);
        this.LstComentario.setModel(c.Mostrar());
    }//GEN-LAST:event_BtnMostrarActionPerformed

    private void BtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificarActionPerformed
        String Comentario = this.CbCondicion.getSelectedItem().toString();
        String NuevoComentario = this.TxtComentario.getText().toUpperCase();
        c.Modificar(Comentario, NuevoComentario);
        this.PanelLstComentario.setVisible(false);
    }//GEN-LAST:event_BtnModificarActionPerformed

    private void TxtComentarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtComentarioKeyTyped
        Validacion.SoloLetras(evt);
    }//GEN-LAST:event_TxtComentarioKeyTyped

    private int SwCondicion(){
        String ComboCondicion = String.valueOf(this.CbCondicion.getSelectedItem());
        int condicionEleg = 0;
        switch (ComboCondicion) {
            case "NUEVO":
                condicionEleg =1;
                break;
            case "EN CONDICIONES":
                condicionEleg =2;
                break;
            case "DETERIORADO":
                condicionEleg =3;
                break;
            case "FRÁGIL":
                condicionEleg =4;
                break;
            case "EN MAL ESTADO":
                condicionEleg =5;
                break;
        }
        return condicionEleg;
    }
    private void Limpiar(){
        this.TxtComentario.setText(null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonRound BtnCargar;
    private org.edisoncor.gui.button.ButtonRound BtnEliminar;
    private org.edisoncor.gui.button.ButtonRound BtnModificar;
    private org.edisoncor.gui.button.ButtonRound BtnMostrar;
    private org.edisoncor.gui.button.ButtonRound BtnSalir;
    private org.edisoncor.gui.comboBox.ComboBoxRound CbCondicion;
    private org.edisoncor.gui.label.LabelRound LblComentario;
    private org.edisoncor.gui.label.LabelRound LblCondicion;
    private javax.swing.JList<String> LstComentario;
    private javax.swing.JPanel PanelBotones;
    private javax.swing.JPanel PanelCarga;
    private javax.swing.JPanel PanelLstComentario;
    private org.edisoncor.gui.textField.TextFieldRound TxtComentario;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
