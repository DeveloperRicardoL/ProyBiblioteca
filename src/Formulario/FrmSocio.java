package Formulario;
import Desarrollo.Socio;
import Desarrollo.Validacion;
import javax.swing.JOptionPane;

public class FrmSocio extends javax.swing.JInternalFrame {
Socio s;
private char Boton;
    public FrmSocio() {
        initComponents();
        this.setTitle("FORMULARIO SOCIO");
        this.PanelBajaModif.setVisible(false);
        this.BtnAceptar.setVisible(false);
        this.BtnCancelar.setVisible(false);
        this.PanelConfirAnular.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        PanelBotones = new javax.swing.JPanel();
        BtnCargar = new org.edisoncor.gui.button.ButtonRound();
        BtnModificar = new org.edisoncor.gui.button.ButtonRound();
        BtnEliminar = new org.edisoncor.gui.button.ButtonRound();
        BtnSalir = new org.edisoncor.gui.button.ButtonRound();
        PanelCarga = new javax.swing.JPanel();
        LblNombre = new org.edisoncor.gui.label.LabelRound();
        LblApellido = new org.edisoncor.gui.label.LabelRound();
        LblDni = new org.edisoncor.gui.label.LabelRound();
        LblDireccion = new org.edisoncor.gui.label.LabelRound();
        LblTelefono = new org.edisoncor.gui.label.LabelRound();
        TxtNombre = new org.edisoncor.gui.textField.TextFieldRound();
        TxtApellido = new org.edisoncor.gui.textField.TextFieldRound();
        TxtDni = new org.edisoncor.gui.textField.TextFieldRound();
        TxtDireccion = new org.edisoncor.gui.textField.TextFieldRound();
        TxtTelefono = new org.edisoncor.gui.textField.TextFieldRound();
        PanelBajaModif = new javax.swing.JPanel();
        RbApeyNom = new javax.swing.JRadioButton();
        RbDni = new javax.swing.JRadioButton();
        TxtBuscaXDni = new org.edisoncor.gui.textField.TextFieldRound();
        BtnCancelar = new org.edisoncor.gui.button.ButtonAero();
        BtnAceptar = new org.edisoncor.gui.button.ButtonAero();
        PanelTabla = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        PanelConfirAnular = new javax.swing.JPanel();
        BtnConfirmar = new javax.swing.JButton();
        BtnAnular = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 54, 204));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelBotones.setBackground(new java.awt.Color(0, 54, 204));
        PanelBotones.setLayout(new java.awt.GridLayout(4, 1, 0, 3));

        BtnCargar.setBackground(new java.awt.Color(0, 0, 0));
        BtnCargar.setText("CARGAR");
        BtnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCargarActionPerformed(evt);
            }
        });
        PanelBotones.add(BtnCargar);

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

        getContentPane().add(PanelBotones, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, 118, 184));

        PanelCarga.setBackground(new java.awt.Color(0, 54, 204));

        LblNombre.setBackground(new java.awt.Color(0, 0, 135));
        LblNombre.setText("NOMBRE (*)");

        LblApellido.setBackground(new java.awt.Color(0, 0, 135));
        LblApellido.setText("PRIMER APELLIDO (*)");

        LblDni.setBackground(new java.awt.Color(0, 0, 135));
        LblDni.setText("DNI (*)");

        LblDireccion.setBackground(new java.awt.Color(0, 0, 135));
        LblDireccion.setText("DIRECCION (*)");

        LblTelefono.setBackground(new java.awt.Color(0, 0, 135));
        LblTelefono.setText("TELEFONO (*)");

        TxtNombre.setBackground(new java.awt.Color(0, 54, 204));
        TxtNombre.setForeground(new java.awt.Color(255, 255, 255));
        TxtNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtNombre.setCaretColor(new java.awt.Color(255, 255, 255));
        TxtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtNombreKeyTyped(evt);
            }
        });

        TxtApellido.setBackground(new java.awt.Color(0, 54, 204));
        TxtApellido.setForeground(new java.awt.Color(255, 255, 255));
        TxtApellido.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtApellido.setCaretColor(new java.awt.Color(255, 255, 255));
        TxtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtApellidoKeyTyped(evt);
            }
        });

        TxtDni.setBackground(new java.awt.Color(0, 54, 204));
        TxtDni.setForeground(new java.awt.Color(255, 255, 255));
        TxtDni.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtDni.setCaretColor(new java.awt.Color(255, 255, 255));
        TxtDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtDniKeyTyped(evt);
            }
        });

        TxtDireccion.setBackground(new java.awt.Color(0, 54, 204));
        TxtDireccion.setForeground(new java.awt.Color(255, 255, 255));
        TxtDireccion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtDireccion.setCaretColor(new java.awt.Color(255, 255, 255));
        TxtDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtDireccionKeyTyped(evt);
            }
        });

        TxtTelefono.setBackground(new java.awt.Color(0, 54, 204));
        TxtTelefono.setForeground(new java.awt.Color(255, 255, 255));
        TxtTelefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtTelefono.setCaretColor(new java.awt.Color(255, 255, 255));
        TxtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtTelefonoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout PanelCargaLayout = new javax.swing.GroupLayout(PanelCarga);
        PanelCarga.setLayout(PanelCargaLayout);
        PanelCargaLayout.setHorizontalGroup(
            PanelCargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCargaLayout.createSequentialGroup()
                .addGroup(PanelCargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LblDireccion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LblApellido, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                    .addComponent(LblNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LblDni, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LblTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(PanelCargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TxtTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TxtDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TxtDni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TxtNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtApellido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        PanelCargaLayout.setVerticalGroup(
            PanelCargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCargaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelCargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelCargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelCargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelCargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelCargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(PanelCarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, -1, -1));

        PanelBajaModif.setBackground(new java.awt.Color(0, 54, 204));
        PanelBajaModif.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Eliminar por", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        PanelBajaModif.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RbApeyNom.setBackground(new java.awt.Color(0, 0, 135));
        buttonGroup1.add(RbApeyNom);
        RbApeyNom.setForeground(new java.awt.Color(255, 255, 255));
        RbApeyNom.setText("Apellido y Nombre");
        RbApeyNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbApeyNomActionPerformed(evt);
            }
        });
        PanelBajaModif.add(RbApeyNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 58, -1, -1));

        RbDni.setBackground(new java.awt.Color(0, 0, 135));
        buttonGroup1.add(RbDni);
        RbDni.setForeground(new java.awt.Color(255, 255, 255));
        RbDni.setText("Dni");
        RbDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbDniActionPerformed(evt);
            }
        });
        PanelBajaModif.add(RbDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 24, 134, -1));

        TxtBuscaXDni.setBackground(new java.awt.Color(0, 54, 204));
        TxtBuscaXDni.setForeground(new java.awt.Color(255, 255, 255));
        TxtBuscaXDni.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtBuscaXDni.setCaretColor(new java.awt.Color(255, 255, 255));
        TxtBuscaXDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtBuscaXDniKeyTyped(evt);
            }
        });
        PanelBajaModif.add(TxtBuscaXDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 27, 90, -1));

        BtnCancelar.setBackground(new java.awt.Color(0, 0, 0));
        BtnCancelar.setText("Cancelar");
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });
        PanelBajaModif.add(BtnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(314, 60, 76, 25));

        BtnAceptar.setBackground(new java.awt.Color(0, 0, 0));
        BtnAceptar.setText("Aceptar");
        BtnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAceptarActionPerformed(evt);
            }
        });
        PanelBajaModif.add(BtnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(314, 26, 76, 25));

        Tabla.setBackground(new java.awt.Color(0, 0, 0));
        Tabla.setForeground(new java.awt.Color(255, 255, 255));
        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        Tabla.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaMouseClicked(evt);
            }
        });
        PanelTabla.setViewportView(Tabla);

        PanelBajaModif.add(PanelTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 92, 379, 105));

        getContentPane().add(PanelBajaModif, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 413, 213));

        PanelConfirAnular.setBackground(new java.awt.Color(0, 54, 204));

        BtnConfirmar.setBackground(new java.awt.Color(0, 0, 0));
        BtnConfirmar.setForeground(new java.awt.Color(255, 255, 255));
        BtnConfirmar.setText("Confirmar");
        BtnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnConfirmarActionPerformed(evt);
            }
        });

        BtnAnular.setBackground(new java.awt.Color(0, 0, 0));
        BtnAnular.setForeground(new java.awt.Color(255, 255, 255));
        BtnAnular.setText("Anular");
        BtnAnular.setPreferredSize(new java.awt.Dimension(87, 32));
        BtnAnular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAnularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelConfirAnularLayout = new javax.swing.GroupLayout(PanelConfirAnular);
        PanelConfirAnular.setLayout(PanelConfirAnularLayout);
        PanelConfirAnularLayout.setHorizontalGroup(
            PanelConfirAnularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelConfirAnularLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(BtnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(BtnAnular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        PanelConfirAnularLayout.setVerticalGroup(
            PanelConfirAnularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelConfirAnularLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(BtnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(BtnAnular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getContentPane().add(PanelConfirAnular, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 181, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCargarActionPerformed
        CargaModif();
    }//GEN-LAST:event_BtnCargarActionPerformed

    private void TxtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNombreKeyTyped
        Validacion.SoloLetras(evt);
        if (this.TxtNombre.getText().length() > 24) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "excede la longitud de caracteres del nombre");
        }
    }//GEN-LAST:event_TxtNombreKeyTyped

    private void TxtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtApellidoKeyTyped
        Validacion.SoloLetras(evt);
        if (this.TxtApellido.getText().length() > 24) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "excede la longitud de caracteres del apellido");
        }
    }//GEN-LAST:event_TxtApellidoKeyTyped

    private void TxtDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtDniKeyTyped
        Validacion.SoloNros(evt);
        if (this.TxtDni.getText().length() > 8) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "excede la longitud de caracteres del dni");
        }
    }//GEN-LAST:event_TxtDniKeyTyped

    private void TxtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtTelefonoKeyTyped
        Validacion.SoloNros(evt);
        if (this.TxtTelefono.getText().length() > 14) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "excede la longitud de caracteres del N° de telefono");
        }
    }//GEN-LAST:event_TxtTelefonoKeyTyped

    private void TxtDireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtDireccionKeyTyped
        Validacion.SoloLetrasyNros(evt);
        if (this.TxtDireccion.getText().length() > 29) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "excede la longitud de caracteres de la dirección");
        }
    }//GEN-LAST:event_TxtDireccionKeyTyped

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
        this.ActivarPanelBuscar();
        this.BtnModificar.setEnabled(false);
        Boton = 'E';
    }//GEN-LAST:event_BtnEliminarActionPerformed

    private void BtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificarActionPerformed
        this.ActivarPanelBuscar();
        this.BtnEliminar.setEnabled(false);
        Boton = 'M';
    }//GEN-LAST:event_BtnModificarActionPerformed

    private void TablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMouseClicked
        int col = 2;
        int fila = this.Tabla.getSelectedRow();
        this.TxtBuscaXDni.setText(this.Tabla.getValueAt(fila, col).toString());
        this.BtnAceptar.setVisible(true);
        this.BtnCancelar.setVisible(true);
    }//GEN-LAST:event_TablaMouseClicked

    private void BtnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAceptarActionPerformed
        s = new Socio();
        switch (Boton) {
            case 'E':
                DesactivarPanelBuscar();
                try {if (this.TxtBuscaXDni.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Error, El campo esta vacio");
                        ActivarBotones();
                    } else {
                        int respuesta = JOptionPane.showConfirmDialog(null, "Esta seguro que desea Eliminar el Dni: " + this.TxtBuscaXDni.getText());
                        if (respuesta == 0) {
                            String DniElim = this.TxtBuscaXDni.getText();
                            s.Baja(DniElim);
                        }
                        ActivarBotones();
                    }
                    this.TxtBuscaXDni.setText(null);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error al cancelar");
                }
            break;
            case 'M':
                DesactivarPanelBuscar();
                if (this.TxtBuscaXDni.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Campo vacio");
                    ActivarBotones();
                } else {
                    boolean consulta = s.ConsultaDni(this.TxtBuscaXDni.getText());
                    if (consulta == true) {
                        RetornarDatosALasCajas();
                        this.TxtDni.setEditable(false);
                        this.TxtNombre.requestFocus();
                        this.PanelConfirAnular.setVisible(true);
                        DesactivarBotones();
                    } else {
                        this.TxtBuscaXDni.setText(null);
                        ActivarBotones();
                    }
                }
            break;
        }
    }//GEN-LAST:event_BtnAceptarActionPerformed

    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
        DesactivarPanelBuscar();
        ActivarBotones();
        this.TxtBuscaXDni.setText(null);
        this.PanelConfirAnular.setVisible(false);
    }//GEN-LAST:event_BtnCancelarActionPerformed

    private void TxtBuscaXDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtBuscaXDniKeyTyped
        Validacion.SoloNros(evt);
        if (this.TxtBuscaXDni.getText().length() > 8) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "excede la longitud de caracteres del dni");
        }
    }//GEN-LAST:event_TxtBuscaXDniKeyTyped

    private void RbDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbDniActionPerformed
        this.TxtBuscaXDni.setText(null);
        this.TxtBuscaXDni.setVisible(true);
        this.PanelTabla.setVisible(false);
        this.BtnAceptar.setVisible(true);
        this.BtnCancelar.setVisible(true);
        this.TxtBuscaXDni.requestFocus();
    }//GEN-LAST:event_RbDniActionPerformed

    private void RbApeyNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbApeyNomActionPerformed
        this.TxtBuscaXDni.setVisible(false);
        this.PanelTabla.setVisible(true);
        this.BtnAceptar.setVisible(false);
        this.BtnCancelar.setVisible(false);
        s = new Socio();
        this.Tabla.setModel(s.TitulosDeElimiModi());
        this.Tabla.setModel(s.MostrarDeElimiModi());
    }//GEN-LAST:event_RbApeyNomActionPerformed

    private void BtnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConfirmarActionPerformed
        CargaModif();
        Limpiar();
        ActivarBotones();
        this.PanelConfirAnular.setVisible(false);
        this.TxtBuscaXDni.setText(null);
        this.TxtDni.setEditable(true);
    }//GEN-LAST:event_BtnConfirmarActionPerformed

    private void BtnAnularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAnularActionPerformed
        this.PanelConfirAnular.setVisible(false);
        this.BtnAceptar.setVisible(false);
        this.BtnCancelar.setVisible(false);
        this.TxtBuscaXDni.setText(null);
        this.TxtDni.setEditable(true);
        Limpiar();
        ActivarBotones();
    }//GEN-LAST:event_BtnAnularActionPerformed

    private void CargaModif(){
        if (this.TxtNombre.getText().isEmpty() || this.TxtApellido.getText().isEmpty() || this.TxtDni.getText().isEmpty() || this.TxtDireccion.getText().isEmpty() || this.TxtTelefono.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe completar los datos!!", "Error", JOptionPane.WARNING_MESSAGE);
        } else {
            String Nom = this.TxtNombre.getText().toUpperCase();
            String Ape = this.TxtApellido.getText().toUpperCase();
            String Dni = this.TxtDni.getText().toUpperCase();
            String Direc = this.TxtDireccion.getText().toUpperCase();
            String Tel = this.TxtTelefono.getText().toUpperCase();
            s = new Socio(Nom,Ape,Dni,Direc,Tel);
            if (Boton == 'M') {
                s.Modificar();
                Boton = 'L';
            } else {
                s.Alta();
            }
        Limpiar();
        }
    }
    private void Limpiar(){
        this.TxtNombre.setText(null);
        this.TxtApellido.setText(null);
        this.TxtDni.setText(null);
        this.TxtDireccion.setText(null);
        this.TxtTelefono.setText(null);
    }
    private void ActivarPanelBuscar(){
        this.PanelBajaModif.setVisible(true);
        this.TxtBuscaXDni.setVisible(false);
        this.PanelTabla.setVisible(false);
        this.PanelCarga.setEnabled(false);
        this.TxtNombre.setEnabled(false);
        this.TxtApellido.setEnabled(false);
        this.TxtDni.setEnabled(false);
        this.TxtDireccion.setEnabled(false);
        this.TxtTelefono.setEnabled(false);
        this.BtnCargar.setEnabled(false);
        this.BtnAceptar.setVisible(false);
        this.BtnCancelar.setVisible(false);
    }
    private void DesactivarPanelBuscar(){
        this.PanelBajaModif.setVisible(false);
        this.TxtBuscaXDni.setVisible(false);
        this.PanelTabla.setVisible(false);
        this.PanelCarga.setEnabled(true);
        this.TxtNombre.setEnabled(true);
        this.TxtApellido.setEnabled(true);
        this.TxtDni.setEnabled(true);
        this.TxtDireccion.setEnabled(true);
        this.TxtTelefono.setEnabled(true);
        this.BtnCargar.setEnabled(true);
        this.BtnAceptar.setVisible(false);
        this.BtnCancelar.setVisible(false);
    }
    private void RetornarDatosALasCajas(){
        s = new Socio();
        s.BuscarPorDni(this.TxtBuscaXDni.getText());
        
        this.TxtNombre.setText(s.getNom());
        this.TxtApellido.setText(s.getPrimerApe());
        this.TxtDni.setText(s.getDni());
        this.TxtDireccion.setText(s.getDirec());
        this.TxtTelefono.setText(s.getTel());
    }
    private void DesactivarBotones(){
        this.BtnCargar.setEnabled(false);
        this.BtnModificar.setEnabled(false);
        this.BtnEliminar.setEnabled(false);
    }
    private void ActivarBotones(){
        this.BtnCargar.setEnabled(true);
        this.BtnModificar.setEnabled(true);
        this.BtnEliminar.setEnabled(true);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonAero BtnAceptar;
    private javax.swing.JButton BtnAnular;
    private org.edisoncor.gui.button.ButtonAero BtnCancelar;
    private org.edisoncor.gui.button.ButtonRound BtnCargar;
    private javax.swing.JButton BtnConfirmar;
    private org.edisoncor.gui.button.ButtonRound BtnEliminar;
    private org.edisoncor.gui.button.ButtonRound BtnModificar;
    private org.edisoncor.gui.button.ButtonRound BtnSalir;
    private org.edisoncor.gui.label.LabelRound LblApellido;
    private org.edisoncor.gui.label.LabelRound LblDireccion;
    private org.edisoncor.gui.label.LabelRound LblDni;
    private org.edisoncor.gui.label.LabelRound LblNombre;
    private org.edisoncor.gui.label.LabelRound LblTelefono;
    private javax.swing.JPanel PanelBajaModif;
    private javax.swing.JPanel PanelBotones;
    private javax.swing.JPanel PanelCarga;
    private javax.swing.JPanel PanelConfirAnular;
    private javax.swing.JScrollPane PanelTabla;
    private javax.swing.JRadioButton RbApeyNom;
    private javax.swing.JRadioButton RbDni;
    private javax.swing.JTable Tabla;
    private org.edisoncor.gui.textField.TextFieldRound TxtApellido;
    private org.edisoncor.gui.textField.TextFieldRound TxtBuscaXDni;
    private org.edisoncor.gui.textField.TextFieldRound TxtDireccion;
    private org.edisoncor.gui.textField.TextFieldRound TxtDni;
    private org.edisoncor.gui.textField.TextFieldRound TxtNombre;
    private org.edisoncor.gui.textField.TextFieldRound TxtTelefono;
    private javax.swing.ButtonGroup buttonGroup1;
    // End of variables declaration//GEN-END:variables
}
