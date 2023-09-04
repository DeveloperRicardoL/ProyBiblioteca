package Formulario;
import Desarrollo.Autor;
import Desarrollo.Validacion;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
public class FrmAutor extends javax.swing.JInternalFrame {
Autor a;
int idAutorEle = 0;
    public FrmAutor() {
        initComponents();
        this.CbTipoDeAutor.setModel(this.CargarComboBoxTipoAutor());
        this.CbPais.setModel(this.CargaComboBoxPais());
        this.PanelBuscar.setVisible(false);
        this.setTitle("CATALOGO DE AUTORES");
        this.BtnEliminar.setEnabled(false);
        this.BtnModificar.setEnabled(false);
    }

    private DefaultComboBoxModel CargarComboBoxTipoAutor(){
        DefaultComboBoxModel ModelCombo = new DefaultComboBoxModel();
        ModelCombo.addElement("DIRECTOR");
        ModelCombo.addElement("INTERPRETE");
        ModelCombo.addElement("ESCRITOR");
        return ModelCombo;
    }    
    private DefaultComboBoxModel CargaComboBoxPais(){
        DefaultComboBoxModel CBoxPais = new DefaultComboBoxModel();
        CBoxPais.addElement("ARGENTINA");
        CBoxPais.addElement("FRANCIA");
        CBoxPais.addElement("BRASIL");
        CBoxPais.addElement("URUGUAY");
        CBoxPais.addElement("PARAGUAY");
        CBoxPais.addElement("BOLIVIA");
        CBoxPais.addElement("ESPAÑA");
        CBoxPais.addElement("VENEZUELA");
        CBoxPais.addElement("DINAMARCA");
        CBoxPais.addElement("INGLATERRA");
        return CBoxPais;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelBackGround = new javax.swing.JPanel();
        PanelBotones = new javax.swing.JPanel();
        BtnCargar = new org.edisoncor.gui.button.ButtonRound();
        BtnMostrar = new org.edisoncor.gui.button.ButtonRound();
        BtnModificar = new org.edisoncor.gui.button.ButtonRound();
        BtnEliminar = new org.edisoncor.gui.button.ButtonRound();
        BtnSalir = new org.edisoncor.gui.button.ButtonRound();
        PanelCarga = new javax.swing.JPanel();
        LblNom = new org.edisoncor.gui.label.LabelRound();
        LblPais = new org.edisoncor.gui.label.LabelRound();
        LblTipoDeAutor = new org.edisoncor.gui.label.LabelRound();
        TxtNom = new org.edisoncor.gui.textField.TextFieldRound();
        CbTipoDeAutor = new org.edisoncor.gui.comboBox.ComboBoxRound();
        CbPais = new org.edisoncor.gui.comboBox.ComboBoxRound();
        PanelBuscar = new org.edisoncor.gui.panel.PanelShadow();
        BtnAceptar = new org.edisoncor.gui.button.ButtonAction();
        BtnCancelar = new org.edisoncor.gui.button.ButtonAction();
        PanelTabla = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();

        setBackground(new java.awt.Color(0, 54, 204));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        PanelBackGround.setBackground(new java.awt.Color(0, 54, 204));
        PanelBackGround.setLayout(new java.awt.BorderLayout());

        PanelBotones.setBackground(new java.awt.Color(0, 54, 204));
        PanelBotones.setLayout(new java.awt.GridLayout(5, 1));

        BtnCargar.setBackground(new java.awt.Color(0, 0, 0));
        BtnCargar.setText("CARGAR");
        BtnCargar.setColorDeSombra(new java.awt.Color(153, 153, 153));
        BtnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCargarActionPerformed(evt);
            }
        });
        PanelBotones.add(BtnCargar);

        BtnMostrar.setBackground(new java.awt.Color(0, 0, 0));
        BtnMostrar.setText("MOSTRAR");
        BtnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMostrarActionPerformed(evt);
            }
        });
        PanelBotones.add(BtnMostrar);

        BtnModificar.setBackground(new java.awt.Color(0, 0, 0));
        BtnModificar.setText("MODIFICAR");
        BtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModificarActionPerformed(evt);
            }
        });
        PanelBotones.add(BtnModificar);

        BtnEliminar.setBackground(new java.awt.Color(0, 0, 0));
        BtnEliminar.setText("ELIMINAR");
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });
        PanelBotones.add(BtnEliminar);

        BtnSalir.setBackground(new java.awt.Color(0, 0, 0));
        BtnSalir.setText("SALIR");
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });
        PanelBotones.add(BtnSalir);

        PanelBackGround.add(PanelBotones, java.awt.BorderLayout.LINE_START);

        PanelCarga.setBackground(new java.awt.Color(0, 54, 204));
        PanelCarga.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LblNom.setBackground(new java.awt.Color(0, 0, 135));
        LblNom.setText("NOMBRE (*)");
        PanelCarga.add(LblNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 140, 20));

        LblPais.setBackground(new java.awt.Color(0, 0, 135));
        LblPais.setText("PAIS (*)");
        PanelCarga.add(LblPais, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 140, 20));

        LblTipoDeAutor.setBackground(new java.awt.Color(0, 0, 135));
        LblTipoDeAutor.setText("TIPO DE AUTOR (*)");
        PanelCarga.add(LblTipoDeAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 140, 20));

        TxtNom.setBackground(new java.awt.Color(0, 54, 204));
        TxtNom.setBorder(null);
        TxtNom.setForeground(new java.awt.Color(255, 255, 255));
        TxtNom.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtNom.setCaretColor(new java.awt.Color(255, 255, 255));
        TxtNom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtNomKeyTyped(evt);
            }
        });
        PanelCarga.add(TxtNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 120, 30));

        CbTipoDeAutor.setBackground(new java.awt.Color(0, 0, 135));
        CbTipoDeAutor.setForeground(new java.awt.Color(255, 255, 255));
        CbTipoDeAutor.setAnchoDeBorde(1.5F);
        CbTipoDeAutor.setColorDeBorde(new java.awt.Color(255, 255, 255));
        PanelCarga.add(CbTipoDeAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 120, -1));

        CbPais.setBackground(new java.awt.Color(0, 0, 135));
        CbPais.setForeground(new java.awt.Color(255, 255, 255));
        CbPais.setAnchoDeBorde(1.5F);
        CbPais.setColorDeBorde(new java.awt.Color(255, 255, 255));
        PanelCarga.add(CbPais, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 120, 20));

        PanelBuscar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Busqueda por", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        PanelBuscar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnAceptar.setBackground(new java.awt.Color(0, 0, 0));
        BtnAceptar.setText("Aceptar");
        BtnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAceptarActionPerformed(evt);
            }
        });
        PanelBuscar.add(BtnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 51, 80, 25));

        BtnCancelar.setBackground(new java.awt.Color(0, 0, 0));
        BtnCancelar.setText("Cancelar");
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });
        PanelBuscar.add(BtnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 94, 80, 25));

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1"
            }
        ));
        Tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TablaMousePressed(evt);
            }
        });
        PanelTabla.setViewportView(Tabla);

        PanelBuscar.add(PanelTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 220, 150));

        PanelCarga.add(PanelBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, 330, 180));

        PanelBackGround.add(PanelCarga, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelBackGround, javax.swing.GroupLayout.DEFAULT_SIZE, 807, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelBackGround, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCargarActionPerformed
        if (this.TxtNom.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe completar los datos!!", "Error", JOptionPane.WARNING_MESSAGE);
        } else {
            String Nombre = this.TxtNom.getText().toUpperCase();
            int Pais = SWpais();
            int TipoAutor = SWtipoAutor();
            a = new Autor(Nombre, Pais, TipoAutor);
            a.Alta();
            Limpiar();
        }
    }//GEN-LAST:event_BtnCargarActionPerformed
    
    private void BtnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMostrarActionPerformed
        this.TxtNom.setText(null);
        this.PanelBuscar.setVisible(true);
        this.BtnCargar.setEnabled(false);
        this.BtnAceptar.setVisible(false);
        this.BtnCancelar.setVisible(false);
        this.CbPais.setEnabled(false);
        this.CbTipoDeAutor.setEnabled(false);
        a = new Autor();
        this.Tabla.setModel(a.MostrarTitulos());
        this.Tabla.setModel(a.MostrarContenido());
    }//GEN-LAST:event_BtnMostrarActionPerformed

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void TxtNomKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNomKeyTyped
        Validacion.SoloLetras(evt);
        if (this.TxtNom.getText().length() > 19) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Excede la longitud permitida");
        }
    }//GEN-LAST:event_TxtNomKeyTyped

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
        int confirmacion = JOptionPane.showConfirmDialog(null, "Esta seguro que desea eliminar el dato seleccionado?"); //el jOp.... me devuelve un int(0 = Si, 1= No y 2 = Cancelar), almaceno el int en una variable
        if(confirmacion == 0){
            if (idAutorEle == 0) {
                JOptionPane.showMessageDialog(null, "No selecciono ningún autor");
            } else {
                a = new Autor();
                a.Baja(idAutorEle);
                this.PanelBuscar.setVisible(false);
                this.CbPais.setEnabled(true);
                this.CbTipoDeAutor.setEnabled(true);
                this.BtnCargar.setEnabled(true);
                this.BtnEliminar.setEnabled(false);
                this.BtnMostrar.setEnabled(true);
            }
        }else{
            this.PanelBuscar.setVisible(false);
            this.CbPais.setEnabled(true);
            this.CbTipoDeAutor.setEnabled(true);
            this.BtnCargar.setEnabled(true);
            this.BtnEliminar.setEnabled(false);
            this.BtnMostrar.setEnabled(true);
        }
        this.BtnModificar.setEnabled(false);
        Limpiar();
    }//GEN-LAST:event_BtnEliminarActionPerformed

    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
        Cancelar();
        this.BtnModificar.setEnabled(false);
        this.CbPais.setEnabled(true);
        this.CbTipoDeAutor.setEnabled(true);
        this.BtnCargar.setEnabled(true);
        this.BtnMostrar.setEnabled(true);
    }//GEN-LAST:event_BtnCancelarActionPerformed

    private void BtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificarActionPerformed
        this.BtnAceptar.setVisible(true);
        this.BtnCancelar.setVisible(true);
        this.CbPais.setEnabled(false);
        this.CbTipoDeAutor.setEnabled(false);
        this.BtnEliminar.setEnabled(false);
        this.BtnMostrar.setEnabled(false);
    }//GEN-LAST:event_BtnModificarActionPerformed

    private void BtnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAceptarActionPerformed
        a = new Autor();
        if (this.TxtNom.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe completar el nombre a modificar");
        } else {
            String NuevoNombre = this.TxtNom.getText().toUpperCase();
            a.Modificar(idAutorEle, NuevoNombre);
        }
        Cancelar();
        this.CbPais.setEnabled(true);
        this.CbTipoDeAutor.setEnabled(true);
        this.BtnCargar.setEnabled(true);
        this.BtnMostrar.setEnabled(true);
        this.BtnEliminar.setEnabled(false);
        this.BtnModificar.setEnabled(false);
    }//GEN-LAST:event_BtnAceptarActionPerformed

    private void TablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMouseClicked
        int colu = 0;
        int fila = this.Tabla.getSelectedRow();
        int BuscarxId = Integer.parseInt(this.Tabla.getValueAt(fila, colu).toString());
        RetornarValores(BuscarxId);
    }//GEN-LAST:event_TablaMouseClicked

    private void TablaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMousePressed
        int colu = 0;
        int fila = this.Tabla.getSelectedRow();
        int BuscarxId = Integer.parseInt(this.Tabla.getValueAt(fila, colu).toString());
        idAutorEle = BuscarxId;
        RetornarValores(BuscarxId);
        this.BtnEliminar.setEnabled(true);
        this.BtnModificar.setEnabled(true);
    }//GEN-LAST:event_TablaMousePressed
    private void RetornarValores(int BuscarxId){
        a = new Autor();
        a.BuscarPorIdAutor(BuscarxId);
        this.TxtNom.setText(a.getNom());
        String pais = SWpais(a.getPais());
        this.CbPais.setSelectedItem(pais);
        String tipoAutor = SWtipoAutor(a.getTipoDeAutor());
        this.CbTipoDeAutor.setSelectedItem(tipoAutor);
    }
    
    private int SWtipoAutor(){
        String tpAutor = String.valueOf(this.CbTipoDeAutor.getSelectedItem());
        int autorEleg = 0;
        switch (tpAutor) {
            case "DIRECTOR":
                autorEleg = 1;
                break;
            case "INTERPRETE":
                autorEleg = 2;
                break;
            case "ESCRITOR":
                autorEleg = 3;
                break;
        }
        return autorEleg;
    }
    
    private int SWpais(){
        String ComboPais = String.valueOf(this.CbPais.getSelectedItem());
        int paisEleg = 0;
        switch (ComboPais) {
            case "ARGENTINA":
                paisEleg =1;
                break;
            case "FRANCIA":
                paisEleg =2;
                break;
            case "BRASIL":
                paisEleg =3;
                break;
            case "URUGUAY":
                paisEleg =4;
                break;
            case "PARAGUAY":
                paisEleg =5;
                break;
            case "BOLIVIA":
                paisEleg =6;
                break;
            case "ESPAÑA":
                paisEleg =7;
                break;
            case "VENEZUELA":
                paisEleg =8;
                break;
            case "DINAMARCA":
                paisEleg =9;
                break;
            case "INGLATERRA":
                paisEleg =10;
                break;
        }
        return paisEleg;
    }

    private void Limpiar(){
        this.TxtNom.setText(null);
        this.CbPais.setSelectedIndex(0);
        this.CbTipoDeAutor.setSelectedIndex(0);
        idAutorEle = 0;
    }
    
    private void Cancelar(){
        Limpiar();
        this.PanelBuscar.setVisible(false);
    }
    
    private String SWtipoAutor(int tpAutorEle){
        String eleg= null;
        switch (tpAutorEle) {
            case 1:
                eleg = "DIRECTOR";
                break;
            case 2:
                eleg = "INTERPRETE";
                break;
            case 3:
                eleg = "ESCRITOR";
                break;
        }
        return eleg;
    }
    private String SWpais(int paisEle){
        String paisEleg = null;
        switch (paisEle) {
            case 1:
                paisEleg ="ARGENTINA";
                break;
            case 2:
                paisEleg ="FRANCIA";
                break;
            case 3:
                paisEleg ="BRASIL";
                break;
            case 4:
                paisEleg ="URUGUAY";
                break;
            case 5:
                paisEleg ="PARAGUAY";
                break;
            case 6:
                paisEleg ="BOLIVIA";
                break;
            case 7:
                paisEleg ="ESPAÑA";
                break;
            case 8:
                paisEleg ="VENEZUELA";
                break;
            case 9:
                paisEleg ="DINAMARCA";
                break;
            case 10:
                paisEleg ="INGLATERRA";
                break;
        }
        return paisEleg;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonAction BtnAceptar;
    private org.edisoncor.gui.button.ButtonAction BtnCancelar;
    private org.edisoncor.gui.button.ButtonRound BtnCargar;
    private org.edisoncor.gui.button.ButtonRound BtnEliminar;
    private org.edisoncor.gui.button.ButtonRound BtnModificar;
    private org.edisoncor.gui.button.ButtonRound BtnMostrar;
    private org.edisoncor.gui.button.ButtonRound BtnSalir;
    private org.edisoncor.gui.comboBox.ComboBoxRound CbPais;
    private org.edisoncor.gui.comboBox.ComboBoxRound CbTipoDeAutor;
    private org.edisoncor.gui.label.LabelRound LblNom;
    private org.edisoncor.gui.label.LabelRound LblPais;
    private org.edisoncor.gui.label.LabelRound LblTipoDeAutor;
    private javax.swing.JPanel PanelBackGround;
    private javax.swing.JPanel PanelBotones;
    private org.edisoncor.gui.panel.PanelShadow PanelBuscar;
    private javax.swing.JPanel PanelCarga;
    private javax.swing.JScrollPane PanelTabla;
    private javax.swing.JTable Tabla;
    private org.edisoncor.gui.textField.TextFieldRound TxtNom;
    // End of variables declaration//GEN-END:variables
}
