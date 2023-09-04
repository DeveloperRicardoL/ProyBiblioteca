package Formulario;
import javax.swing.DefaultComboBoxModel;
import Desarrollo.Autor;
import Desarrollo.Validacion;
import Desarrollo.Articulos;
import java.sql.Time;
import javax.swing.JOptionPane;
import java.time.LocalTime;
public class FrmArticulos extends javax.swing.JInternalFrame {
Autor a = new Autor();
Articulos art;
private char Boton;
    public FrmArticulos() {
        initComponents();
        this.setTitle("ARTICULOS");
        this.CbTipoDeArticulo.setModel(this.CargaCb());
        this.CbAutor.setModel(a.LlenarCombo());
        this.PanelElimModi.setVisible(false);
        this.PanelConfirAnular.setVisible(false);
    }
    private DefaultComboBoxModel CargaCb(){
        DefaultComboBoxModel llenado = new DefaultComboBoxModel();
        llenado.addElement("LIBRO");
        llenado.addElement("CD");
        llenado.addElement("PELICULA");
        return llenado;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        PanelCarga = new javax.swing.JPanel();
        LblTipoDeArticulo = new org.edisoncor.gui.label.LabelRect();
        LblNom = new org.edisoncor.gui.label.LabelRect();
        LblAnio = new org.edisoncor.gui.label.LabelRect();
        LblDescripcion = new org.edisoncor.gui.label.LabelRect();
        LblCantPag = new org.edisoncor.gui.label.LabelRect();
        LblCantCancio = new org.edisoncor.gui.label.LabelRect();
        LblDuracion = new org.edisoncor.gui.label.LabelRect();
        LblCantCopias = new org.edisoncor.gui.label.LabelRect();
        TxtCantPag = new org.edisoncor.gui.textField.TextFieldRound();
        TxtCantCancio = new org.edisoncor.gui.textField.TextFieldRound();
        FechaCalendario = new com.toedter.calendar.JDateChooser();
        TxtCantCopias = new org.edisoncor.gui.textField.TextFieldRound();
        TxtNom = new org.edisoncor.gui.textField.TextFieldRound();
        jScrollPane1 = new javax.swing.JScrollPane();
        TxAreaDescripcion = new javax.swing.JTextArea();
        CbTipoDeArticulo = new org.edisoncor.gui.comboBox.ComboBoxRound();
        LblCodArticulo = new org.edisoncor.gui.label.LabelRect();
        TxtCodArticulo = new org.edisoncor.gui.textField.TextFieldRound();
        LblAutor = new org.edisoncor.gui.label.LabelRect();
        CbAutor = new org.edisoncor.gui.comboBox.ComboBoxRound();
        SpMinutos = new javax.swing.JSpinner();
        SpHora = new javax.swing.JSpinner();
        PanelBotones = new javax.swing.JPanel();
        BtnCarga = new org.edisoncor.gui.button.ButtonRound();
        BtnModificar = new org.edisoncor.gui.button.ButtonRound();
        BtnEliminar = new org.edisoncor.gui.button.ButtonRound();
        BtnSalir = new org.edisoncor.gui.button.ButtonRound();
        PanelElimModi = new javax.swing.JPanel();
        RbCodigo = new javax.swing.JRadioButton();
        RbNom = new javax.swing.JRadioButton();
        TxtCodEliModi = new org.edisoncor.gui.textField.TextFieldRound();
        PanelTabla = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        BtnAceptar = new javax.swing.JButton();
        BtnCancelar = new javax.swing.JButton();
        PanelConfirAnular = new javax.swing.JPanel();
        BtnConfirmar = new javax.swing.JButton();
        BtnAnular = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 54, 204));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelCarga.setBackground(new java.awt.Color(0, 54, 204));

        LblTipoDeArticulo.setBackground(new java.awt.Color(0, 0, 135));
        LblTipoDeArticulo.setText("TIPO DE ARTICULO (*)");

        LblNom.setBackground(new java.awt.Color(0, 0, 135));
        LblNom.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LblNom.setText("NOMBRE (*)");

        LblAnio.setBackground(new java.awt.Color(0, 0, 135));
        LblAnio.setText("AÑO (*)");

        LblDescripcion.setBackground(new java.awt.Color(0, 0, 135));
        LblDescripcion.setText("DESCRIPCION (*)");

        LblCantPag.setBackground(new java.awt.Color(0, 0, 135));
        LblCantPag.setText("CANTIDAD DE PAGINAS");

        LblCantCancio.setBackground(new java.awt.Color(0, 0, 135));
        LblCantCancio.setText("CANTIDAD DE CANCIONES");

        LblDuracion.setBackground(new java.awt.Color(0, 0, 135));
        LblDuracion.setText("TIEMPO DE DURACION");

        LblCantCopias.setBackground(new java.awt.Color(0, 0, 135));
        LblCantCopias.setText("CANTIDAD DE COPIAS (*)");

        TxtCantPag.setBackground(new java.awt.Color(0, 54, 204));
        TxtCantPag.setForeground(new java.awt.Color(255, 255, 255));
        TxtCantPag.setCaretColor(new java.awt.Color(255, 255, 255));
        TxtCantPag.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtCantPagKeyTyped(evt);
            }
        });

        TxtCantCancio.setBackground(new java.awt.Color(0, 54, 204));
        TxtCantCancio.setForeground(new java.awt.Color(255, 255, 255));
        TxtCantCancio.setCaretColor(new java.awt.Color(255, 255, 255));
        TxtCantCancio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtCantCancioKeyTyped(evt);
            }
        });

        FechaCalendario.setForeground(new java.awt.Color(255, 255, 255));
        FechaCalendario.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N

        TxtCantCopias.setBackground(new java.awt.Color(0, 54, 204));
        TxtCantCopias.setForeground(new java.awt.Color(255, 255, 255));
        TxtCantCopias.setCaretColor(new java.awt.Color(255, 255, 255));
        TxtCantCopias.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtCantCopiasKeyTyped(evt);
            }
        });

        TxtNom.setBackground(new java.awt.Color(0, 54, 204));
        TxtNom.setForeground(new java.awt.Color(255, 255, 255));
        TxtNom.setCaretColor(new java.awt.Color(255, 255, 255));
        TxtNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNomActionPerformed(evt);
            }
        });
        TxtNom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtNomKeyTyped(evt);
            }
        });

        TxAreaDescripcion.setBackground(new java.awt.Color(0, 54, 204));
        TxAreaDescripcion.setColumns(20);
        TxAreaDescripcion.setForeground(new java.awt.Color(255, 255, 255));
        TxAreaDescripcion.setRows(5);
        TxAreaDescripcion.setCaretColor(new java.awt.Color(255, 255, 255));
        TxAreaDescripcion.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(TxAreaDescripcion);

        CbTipoDeArticulo.setBackground(new java.awt.Color(0, 0, 135));
        CbTipoDeArticulo.setForeground(new java.awt.Color(255, 255, 255));
        CbTipoDeArticulo.setAnchoDeBorde(1.5F);
        CbTipoDeArticulo.setColorDeBorde(new java.awt.Color(255, 255, 255));

        LblCodArticulo.setBackground(new java.awt.Color(0, 0, 135));
        LblCodArticulo.setText("CODIGO DEL ARTICULO (*)");

        TxtCodArticulo.setBackground(new java.awt.Color(0, 54, 204));
        TxtCodArticulo.setForeground(new java.awt.Color(255, 255, 255));
        TxtCodArticulo.setCaretColor(new java.awt.Color(255, 255, 255));
        TxtCodArticulo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtCodArticuloKeyTyped(evt);
            }
        });

        LblAutor.setBackground(new java.awt.Color(0, 0, 135));
        LblAutor.setText("AUTOR (*)");

        CbAutor.setBackground(new java.awt.Color(0, 0, 135));
        CbAutor.setForeground(new java.awt.Color(255, 255, 255));
        CbAutor.setColorDeBorde(new java.awt.Color(255, 255, 255));

        SpMinutos.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        SpMinutos.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));

        SpHora.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        SpHora.setModel(new javax.swing.SpinnerNumberModel(0, 0, 23, 1));

        javax.swing.GroupLayout PanelCargaLayout = new javax.swing.GroupLayout(PanelCarga);
        PanelCarga.setLayout(PanelCargaLayout);
        PanelCargaLayout.setHorizontalGroup(
            PanelCargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCargaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelCargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(LblAutor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LblCodArticulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LblCantCancio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(LblCantPag, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LblDuracion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LblCantCopias, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LblDescripcion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LblAnio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LblNom, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LblTipoDeArticulo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(PanelCargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelCargaLayout.createSequentialGroup()
                        .addGroup(PanelCargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FechaCalendario, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtNom, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CbTipoDeArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(12, Short.MAX_VALUE))
                    .addGroup(PanelCargaLayout.createSequentialGroup()
                        .addGroup(PanelCargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelCargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(TxtCantCancio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TxtCantCopias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(CbAutor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelCargaLayout.createSequentialGroup()
                                    .addComponent(SpHora, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(SpMinutos, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(TxtCantPag, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(TxtCodArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        PanelCargaLayout.setVerticalGroup(
            PanelCargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCargaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelCargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblCodArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtCodArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelCargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelCargaLayout.createSequentialGroup()
                        .addComponent(CbTipoDeArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelCargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LblNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FechaCalendario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelCargaLayout.createSequentialGroup()
                        .addComponent(LblTipoDeArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(LblAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(LblDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(PanelCargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblCantPag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtCantPag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelCargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblCantCancio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtCantCancio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelCargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelCargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(SpMinutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(SpHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(PanelCargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblCantCopias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtCantCopias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelCargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CbAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        getContentPane().add(PanelCarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        PanelBotones.setBackground(new java.awt.Color(0, 54, 204));
        PanelBotones.setLayout(new java.awt.GridLayout(1, 0));

        BtnCarga.setBackground(new java.awt.Color(0, 0, 0));
        BtnCarga.setText("CARGAR");
        BtnCarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCargaActionPerformed(evt);
            }
        });
        PanelBotones.add(BtnCarga);

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

        getContentPane().add(PanelBotones, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 474, -1, -1));

        PanelElimModi.setBackground(new java.awt.Color(0, 54, 204));
        PanelElimModi.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscar por:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Schoolbook", 3, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        PanelElimModi.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RbCodigo.setBackground(new java.awt.Color(0, 0, 135));
        buttonGroup1.add(RbCodigo);
        RbCodigo.setForeground(new java.awt.Color(255, 255, 255));
        RbCodigo.setText("Código");
        RbCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbCodigoActionPerformed(evt);
            }
        });
        PanelElimModi.add(RbCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 30, 83, -1));

        RbNom.setBackground(new java.awt.Color(0, 0, 135));
        buttonGroup1.add(RbNom);
        RbNom.setForeground(new java.awt.Color(255, 255, 255));
        RbNom.setText("Nombre");
        RbNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbNomActionPerformed(evt);
            }
        });
        PanelElimModi.add(RbNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 66, 83, -1));

        TxtCodEliModi.setBackground(new java.awt.Color(0, 54, 204));
        TxtCodEliModi.setForeground(new java.awt.Color(255, 255, 255));
        TxtCodEliModi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtCodEliModiKeyTyped(evt);
            }
        });
        PanelElimModi.add(TxtCodEliModi, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 33, 78, -1));

        Tabla.setBackground(new java.awt.Color(0, 0, 0));
        Tabla.setForeground(new java.awt.Color(255, 255, 255));
        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
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

        PanelElimModi.add(PanelTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 108, 308, 194));

        BtnAceptar.setBackground(new java.awt.Color(0, 0, 0));
        BtnAceptar.setForeground(new java.awt.Color(255, 255, 255));
        BtnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Aceptar.png"))); // NOI18N
        BtnAceptar.setText("Aceptar");
        BtnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAceptarActionPerformed(evt);
            }
        });
        PanelElimModi.add(BtnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 24, 117, 32));

        BtnCancelar.setBackground(new java.awt.Color(0, 0, 0));
        BtnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        BtnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Cancelar.png"))); // NOI18N
        BtnCancelar.setText("Cancelar");
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });
        PanelElimModi.add(BtnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 64, -1, 32));

        getContentPane().add(PanelElimModi, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, 330, 320));

        PanelConfirAnular.setBackground(new java.awt.Color(0, 54, 204));
        PanelConfirAnular.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnConfirmar.setBackground(new java.awt.Color(0, 0, 0));
        BtnConfirmar.setForeground(new java.awt.Color(255, 255, 255));
        BtnConfirmar.setText("Confirmar");
        BtnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnConfirmarActionPerformed(evt);
            }
        });
        PanelConfirAnular.add(BtnConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        BtnAnular.setBackground(new java.awt.Color(0, 0, 0));
        BtnAnular.setForeground(new java.awt.Color(255, 255, 255));
        BtnAnular.setText("Anular");
        BtnAnular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAnularActionPerformed(evt);
            }
        });
        PanelConfirAnular.add(BtnAnular, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 6, 76, -1));

        getContentPane().add(PanelConfirAnular, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 344, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void BtnCargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCargaActionPerformed
        AltaModif();
    }//GEN-LAST:event_BtnCargaActionPerformed

    private void TxtCodArticuloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtCodArticuloKeyTyped
        Validacion.SoloNros(evt);
        if (this.TxtCodArticulo.getText().length() > 7) {
            evt.consume();//esta funcion sirve para que no pueda seguir tipiando y no se exceda de la longitud que le permitimos
            JOptionPane.showMessageDialog(null, "excede la longitud de caracteres del Código de Articulo");
        }
    }//GEN-LAST:event_TxtCodArticuloKeyTyped

    private void TxtNomKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNomKeyTyped
        Validacion.SoloLetrasyNros(evt);
        if (this.TxtNom.getText().length() > 44) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "excede la longitud de caracteres del Nombre");
        }
    }//GEN-LAST:event_TxtNomKeyTyped

    private void TxtCantPagKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtCantPagKeyTyped
        Validacion.SoloNros(evt);
        if (this.TxtCantPag.getText().length() > 3) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "excede la longitud de caracteres de la cantidad de páginas");
        }
    }//GEN-LAST:event_TxtCantPagKeyTyped

    private void TxtCantCancioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtCantCancioKeyTyped
        Validacion.SoloNros(evt);
        if (this.TxtCantCancio.getText().length() > 3) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "excede la longitud de caracteres de la cantidad de canciones");
        }
    }//GEN-LAST:event_TxtCantCancioKeyTyped

    private void TxtCantCopiasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtCantCopiasKeyTyped
        Validacion.SoloNros(evt);
        if (this.TxtCantCopias.getText().length() > 3) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "excede la longitud de caracteres de la cantidad de copias");
        }
    }//GEN-LAST:event_TxtCantCopiasKeyTyped

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
        HabilitarPanelBuscar();
        Boton = 'E';
        this.BtnCarga.setEnabled(false);
        this.BtnModificar.setEnabled(false);
    }//GEN-LAST:event_BtnEliminarActionPerformed

    private void BtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificarActionPerformed
        HabilitarPanelBuscar();
        Boton = 'M';
        this.BtnCarga.setEnabled(false);
        this.BtnEliminar.setEnabled(false);
    }//GEN-LAST:event_BtnModificarActionPerformed

    private void RbCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbCodigoActionPerformed
        this.TxtCodEliModi.setText(null);
        this.PanelTabla.setVisible(false);
        this.TxtCodEliModi.setVisible(true);
        this.TxtCodEliModi.requestFocus();
        this.BtnAceptar.setVisible(true);
        this.BtnCancelar.setVisible(true);
    }//GEN-LAST:event_RbCodigoActionPerformed

    private void RbNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbNomActionPerformed
        this.PanelTabla.setVisible(true);
        art = new Articulos();
        this.Tabla.setModel(art.TitulosElimModif());
        this.Tabla.setModel(art.MostrarContenidoElimModif());
        this.TxtCodEliModi.setVisible(false);
        this.BtnAceptar.setVisible(false);
        this.BtnCancelar.setVisible(false);
    }//GEN-LAST:event_RbNomActionPerformed

    private void BtnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAceptarActionPerformed
        switch (Boton) {
            case 'E':
                try {
                    if (this.TxtCodEliModi.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Campo vacío, ingresar código del Articulo a eliminar");
                    } else {
                        int confirmar = JOptionPane.showConfirmDialog(null, "Esta seguro que desea eliminar el código: " + this.TxtCodEliModi.getText());
                        if (confirmar == 0) {
                            int CodigoAEliminar = Integer.parseInt(this.TxtCodEliModi.getText());
                            art = new Articulos();
                            art.Baja(CodigoAEliminar);
                            DeshabilitarPanelBuscar();
                            this.BtnCarga.setEnabled(true);
                            this.BtnModificar.setEnabled(true);
                        }
                    }
                    this.TxtCodEliModi.setText(null);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error " + e);
                }                
                break;
            case 'M':
                DeshabilitarPanelBuscar();
                if (this.TxtCodEliModi.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Campo vacío, ingresar el código a buscar");
                    this.BtnCarga.setEnabled(true);
                    this.BtnEliminar.setEnabled(true);
                } else {
                    boolean existe = BuscaryEnviarALasCajas();
                    if (existe == true) {
                        this.BtnModificar.setEnabled(false);
                        this.PanelConfirAnular.setVisible(true);
                    }
                }
                break;
        }
        //this.PanelElimModi.setVisible(false);
    }//GEN-LAST:event_BtnAceptarActionPerformed

    private void TxtCodEliModiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtCodEliModiKeyTyped
        Validacion.SoloNros(evt);
        if (this.TxtCodArticulo.getText().length() > 7) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "excede la longitud de caracteres del Código de Articulo");
        }
    }//GEN-LAST:event_TxtCodEliModiKeyTyped

    private void TablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMouseClicked
//        int col = 3;
//        int fila = this.Tabla.getSelectedRow();
//        this.TxtCodEliModi.setText(this.Tabla.getValueAt(fila, col).toString());
//        this.BtnAceptar.setVisible(true);
//        this.BtnCancelar.setVisible(true);
    }//GEN-LAST:event_TablaMouseClicked

    private void BtnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConfirmarActionPerformed
        AltaModif();
        this.PanelConfirAnular.setVisible(false);
        this.BtnCarga.setEnabled(true);
        this.BtnModificar.setEnabled(true);
        this.BtnEliminar.setEnabled(true);
    }//GEN-LAST:event_BtnConfirmarActionPerformed

    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
        this.RbCodigo.setSelected(false);
        this.RbNom.setSelected(false);
        this.BtnCarga.setEnabled(true);
        this.BtnModificar.setEnabled(true);
        this.BtnEliminar.setEnabled(true);
        DeshabilitarPanelBuscar();
    }//GEN-LAST:event_BtnCancelarActionPerformed

    private void TablaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMousePressed
        int col = 3;
        int fila = this.Tabla.getSelectedRow();
        this.TxtCodEliModi.setText(this.Tabla.getValueAt(fila, col).toString());
        this.BtnAceptar.setVisible(true);
        this.BtnCancelar.setVisible(true);
    }//GEN-LAST:event_TablaMousePressed

    private void TxtNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNomActionPerformed

    private void BtnAnularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAnularActionPerformed
        this.PanelElimModi.setVisible(false);
        this.PanelConfirAnular.setVisible(false);
        this.BtnCarga.setEnabled(true);
        this.BtnModificar.setEnabled(true);
        this.BtnEliminar.setEnabled(true);
        Limpiar();
    }//GEN-LAST:event_BtnAnularActionPerformed

    private int SwCombo(){
        String eleccion = this.CbTipoDeArticulo.getSelectedItem().toString();
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
    private String SwComboRetornar(int tpArt){
        String eleg= null;
        switch (tpArt) {
            case 1:
                eleg = "LIBRO";
                break;
            case 2:
                eleg = "CD";
                break;
            case 3:
                eleg = "PELICULA";
                break;
        }
        return eleg;
    }
    private void Limpiar(){
        this.TxtCodArticulo.setText(null);
        this.TxtNom.setText(null);
        this.CbTipoDeArticulo.setSelectedIndex(0);
        this.FechaCalendario.setDate(null);
        this.TxAreaDescripcion.setText(null);
        this.TxtCantPag.setText(null);
        this.TxtCantCancio.setText(null);
        this.SpHora.setValue(0);
        this.SpMinutos.setValue(0);
        this.TxtCantCopias.setText(null);
        this.CbAutor.setSelectedIndex(0);
    }
    private java.sql.Time convertirTiempo(java.time.LocalTime TiempoForm){
        java.sql.Time TiempoSql = java.sql.Time.valueOf(TiempoForm);
        return TiempoSql;
    }
    private void HabilitarPanelBuscar(){
        this.PanelElimModi.setVisible(true);
        this.TxtCodEliModi.setVisible(false);
        this.PanelTabla.setVisible(false);
        this.TxtCodArticulo.setEnabled(false);
        this.CbTipoDeArticulo.setEnabled(false);
        this.TxtNom.setEnabled(false);
        this.FechaCalendario.setEnabled(false);
        this.TxAreaDescripcion.setEnabled(false);
        this.TxtCantPag.setEnabled(false);
        this.TxtCantCancio.setEnabled(false);
        this.SpHora.setEnabled(false);
        this.SpMinutos.setEnabled(false);
        this.TxtCantCopias.setEnabled(false);
        this.CbAutor.setEnabled(false);
        this.BtnAceptar.setVisible(false);
        this.BtnCancelar.setVisible(false);
    }
    private void DeshabilitarPanelBuscar(){
        this.PanelElimModi.setVisible(false);
        this.PanelConfirAnular.setVisible(false);
        //this.TxtCodEliModi.setVisible(false);
        //this.PanelTabla.setVisible(false);
        this.TxtCodArticulo.setEnabled(true);
        this.CbTipoDeArticulo.setEnabled(true);
        this.TxtNom.setEnabled(true);
        this.FechaCalendario.setEnabled(true);
        this.TxAreaDescripcion.setEnabled(true);
        this.TxtCantPag.setEnabled(true);
        this.TxtCantCancio.setEnabled(true);
        this.SpHora.setEnabled(true);
        this.SpMinutos.setEnabled(true);
        this.TxtCantCopias.setEnabled(true);
        this.CbAutor.setEnabled(true);
    }
    private void AltaModif(){
        boolean CodArticulo = this.TxtCodArticulo.getText().isEmpty();
        boolean Nombre = this.TxtNom.getText().isEmpty();
        boolean Descripcion = this.TxAreaDescripcion.getText().isEmpty();
        boolean CantCopias = this.TxtCantCopias.getText().isEmpty();
        if (CodArticulo || Nombre || Descripcion || CantCopias) {
            JOptionPane.showMessageDialog(null, "Debe completar los campos obligatorios");
        } else {
            int CodArt = Integer.parseInt(this.TxtCodArticulo.getText());
            int TipoArt = this.SwCombo();
            String Nom = this.TxtNom.getText().toUpperCase();
            java.util.Date anioForm = this.FechaCalendario.getDate();
            java.sql.Date anioSql = Validacion.ConvertirFecha(anioForm);
            String Desc = this.TxAreaDescripcion.getText().toUpperCase();
            int CantPag = 0;
            int CantCancio = 0;
            int hora=0, minuto=0;
            java.sql.Time Duracion = Time.valueOf(LocalTime.of(hora, minuto));
            switch (TipoArt) {
                case 1://Libro
                    //this.TxtCantPag.setEnabled(true);
                    CantPag = Integer.parseInt(this.TxtCantPag.getText());
                    break;
                case 2://CD
                    //this.TxtCantCancio.setEnabled(true);
                    CantCancio = Integer.parseInt(this.TxtCantCancio.getText());
                    break;
                case 3://Pelicula
                    //this.SpHora.setEnabled(true);
                    //this.SpMinutos.setEnabled(true);
                    hora = Integer.parseInt(this.SpHora.getValue().toString());
                    minuto = Integer.parseInt(this.SpMinutos.getValue().toString());
                    LocalTime TiempoForm = LocalTime.of(hora, minuto);
                    Duracion = convertirTiempo(TiempoForm);
                    break;
            }
            int CantCop = Integer.parseInt(this.TxtCantCopias.getText());
            //String AutorForm = this.CbAutor.getSelectedItem().toString();
            //int AutorSql = Integer.parseInt(AutorForm.replaceAll("[^0-9]", ""));
            int AutorSql = Integer.parseInt(this.CbAutor.getSelectedItem().toString());
            art = new Articulos(CodArt, TipoArt, Nom, anioSql, Desc, CantPag, CantCancio, Duracion, CantCop, AutorSql);
            if (Boton == 'M') {
                art.Modificar();
                Boton = 'L';
            } else {
                art.Alta();
            }
        }
        Limpiar();
    }
    private boolean BuscaryEnviarALasCajas(){
        art = new Articulos();
        boolean existe = art.BuscarPorCod(Integer.parseInt(this.TxtCodEliModi.getText()));
        if (existe == true) {
            java.util.Date Fecha =  art.getAnio();
            this.TxtCodArticulo.setText(String.valueOf(art.getCodArt()));
            String tpArt = SwComboRetornar(art.getTipoDeArt());
            this.CbTipoDeArticulo.setSelectedItem(tpArt);
            this.TxtNom.setText(art.getNombre());
            this.FechaCalendario.setDate(Fecha);
            this.TxAreaDescripcion.setText(art.getDescripcion());
            this.TxtCantPag.setText(String.valueOf(art.getCantPag()));
            this.TxtCantCancio.setText(String.valueOf(art.getCantCancio()));
            int h, m;
            java.time.LocalTime hora = art.getDuracion().toLocalTime();//sql 11:25:32:00 ==> 11:25:32:00 pero pueedo sacar hh, mm, ss por separados
            h = hora.getHour();//me separa la hora
            m = hora.getMinute();// me  separa los minutos
            //this.SpMinutos.setValue(hora.getMinute(); //otra forma
            this.SpHora.setValue(h);
            this.SpMinutos.setValue(m);
            this.TxtCantCopias.setText(String.valueOf(art.getCantCopias()));
            this.CbAutor.setSelectedItem(art.getIdAutor());
           // java.time.LocalTime Hora = new LocalTime();
          //  this.SpHora.setValue(art.getDuracion());
        } else {
            this.BtnCarga.setEnabled(true);
            this.BtnEliminar.setEnabled(true);
            JOptionPane.showMessageDialog(null, "Ocultar o visualizar");
        }
        return existe;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAceptar;
    private javax.swing.JButton BtnAnular;
    private javax.swing.JButton BtnCancelar;
    private org.edisoncor.gui.button.ButtonRound BtnCarga;
    private javax.swing.JButton BtnConfirmar;
    private org.edisoncor.gui.button.ButtonRound BtnEliminar;
    private org.edisoncor.gui.button.ButtonRound BtnModificar;
    private org.edisoncor.gui.button.ButtonRound BtnSalir;
    private org.edisoncor.gui.comboBox.ComboBoxRound CbAutor;
    private org.edisoncor.gui.comboBox.ComboBoxRound CbTipoDeArticulo;
    private com.toedter.calendar.JDateChooser FechaCalendario;
    private org.edisoncor.gui.label.LabelRect LblAnio;
    private org.edisoncor.gui.label.LabelRect LblAutor;
    private org.edisoncor.gui.label.LabelRect LblCantCancio;
    private org.edisoncor.gui.label.LabelRect LblCantCopias;
    private org.edisoncor.gui.label.LabelRect LblCantPag;
    private org.edisoncor.gui.label.LabelRect LblCodArticulo;
    private org.edisoncor.gui.label.LabelRect LblDescripcion;
    private org.edisoncor.gui.label.LabelRect LblDuracion;
    private org.edisoncor.gui.label.LabelRect LblNom;
    private org.edisoncor.gui.label.LabelRect LblTipoDeArticulo;
    private javax.swing.JPanel PanelBotones;
    private javax.swing.JPanel PanelCarga;
    private javax.swing.JPanel PanelConfirAnular;
    private javax.swing.JPanel PanelElimModi;
    private javax.swing.JScrollPane PanelTabla;
    private javax.swing.JRadioButton RbCodigo;
    private javax.swing.JRadioButton RbNom;
    private javax.swing.JSpinner SpHora;
    private javax.swing.JSpinner SpMinutos;
    private javax.swing.JTable Tabla;
    private javax.swing.JTextArea TxAreaDescripcion;
    private org.edisoncor.gui.textField.TextFieldRound TxtCantCancio;
    private org.edisoncor.gui.textField.TextFieldRound TxtCantCopias;
    private org.edisoncor.gui.textField.TextFieldRound TxtCantPag;
    private org.edisoncor.gui.textField.TextFieldRound TxtCodArticulo;
    private org.edisoncor.gui.textField.TextFieldRound TxtCodEliModi;
    private org.edisoncor.gui.textField.TextFieldRound TxtNom;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
