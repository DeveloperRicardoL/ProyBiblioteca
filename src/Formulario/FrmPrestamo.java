package Formulario;
import Desarrollo.Prestamo;
import Desarrollo.Articulos;
import Desarrollo.Validacion;
import java.time.LocalDate;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
public class FrmPrestamo extends javax.swing.JInternalFrame {
Articulos art = new Articulos();
Prestamo pr;
private int idSocio = 0;
private char Boton;
private int consultEleg;

    public FrmPrestamo() {
        initComponents();
        this.setTitle("PRESTAMO");
        pr = new Prestamo();
        this.Tabla.setModel(pr.MostrarTitulosCarga());
        this.Tabla.setModel(pr.MostrarContenido());
        this.CbCondicion.setModel(this.LlenarCb());
        this.CbArticulo.setModel(art.LlenarComboArt());
        java.time.LocalDate hoy = LocalDate.now();
        java.util.Date FechaHoy = java.sql.Date.valueOf(hoy);
        this.FechaInicio.setDate(FechaHoy);
        java.time.LocalDate hoyMas7 = hoy.plusDays(7);
        java.util.Date FechaHoyMas7 = java.sql.Date.valueOf(hoyMas7);
        this.FechaFin.setDate(FechaHoyMas7);
        this.BtnConfirmar.setVisible(false);
        this.BtnAnular.setVisible(false);
        this.PanelElimModif.setVisible(false);
        this.PanelTablaBuscar.setVisible(false);
        this.TablaBuscar.setVisible(false);
        this.TxtNroTicket.setVisible(false);
        this.TxtNomArt.setVisible(false);
        this.BtnBuscarNomArt.setVisible(false);
    }
    private DefaultComboBoxModel LlenarCb(){
        DefaultComboBoxModel llenado = new DefaultComboBoxModel();
        llenado.addElement("NUEVO");
        llenado.addElement("EN CONDICIONES");
        llenado.addElement("DETERIORADO");
        llenado.addElement("FRÁGIL");
        llenado.addElement("EN MAL ESTADO");
        return llenado;
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
        PanelTabla = new javax.swing.JTabbedPane();
        PanelFechas = new javax.swing.JPanel();
        LblFechaInicio = new org.edisoncor.gui.label.LabelRound();
        FechaInicio = new com.toedter.calendar.JDateChooser();
        LblFechaFin = new org.edisoncor.gui.label.LabelRound();
        FechaFin = new com.toedter.calendar.JDateChooser();
        PanelArticulos = new javax.swing.JPanel();
        LblCondicion = new org.edisoncor.gui.label.LabelRound();
        CbCondicion = new org.edisoncor.gui.comboBox.ComboBoxRound();
        LblArticulo = new org.edisoncor.gui.label.LabelRound();
        CbArticulo = new org.edisoncor.gui.comboBox.ComboBoxRound();
        PanelSocio = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        LblNroSocio = new org.edisoncor.gui.label.LabelRound();
        PanelDevolucion = new javax.swing.JPanel();
        LblComentario = new org.edisoncor.gui.label.LabelRound();
        jScrollPane1 = new javax.swing.JScrollPane();
        TxaComentario = new javax.swing.JTextArea();
        LblFechaDevolucion = new org.edisoncor.gui.label.LabelRound();
        FechaDevolucion = new com.toedter.calendar.JDateChooser();
        BtnConfirmar = new javax.swing.JButton();
        BtnAnular = new javax.swing.JButton();
        PanelElimModif = new javax.swing.JPanel();
        RbNomArt = new javax.swing.JRadioButton();
        RbNroTicket = new javax.swing.JRadioButton();
        RbNomyApe = new javax.swing.JRadioButton();
        PanelTablaBuscar = new javax.swing.JScrollPane();
        TablaBuscar = new javax.swing.JTable();
        TxtNroTicket = new javax.swing.JTextField();
        BtnAceptar = new javax.swing.JButton();
        BtnCancelar = new javax.swing.JButton();
        TxtNomArt = new javax.swing.JTextField();
        BtnBuscarNomArt = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 54, 204));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        PanelBotones.setBackground(new java.awt.Color(0, 54, 204));
        PanelBotones.setLayout(new java.awt.GridLayout(4, 1));

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

        PanelCarga.setBackground(new java.awt.Color(0, 54, 204));

        PanelTabla.setBackground(new java.awt.Color(0, 54, 204));
        PanelTabla.setForeground(new java.awt.Color(255, 255, 255));

        PanelFechas.setBackground(new java.awt.Color(0, 54, 204));

        LblFechaInicio.setBackground(new java.awt.Color(0, 0, 135));
        LblFechaInicio.setText("Fecha Inicio de Prestamo");

        FechaInicio.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N

        LblFechaFin.setBackground(new java.awt.Color(0, 0, 135));
        LblFechaFin.setText("Fecha Fin de Prestamo");

        FechaFin.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N

        javax.swing.GroupLayout PanelFechasLayout = new javax.swing.GroupLayout(PanelFechas);
        PanelFechas.setLayout(PanelFechasLayout);
        PanelFechasLayout.setHorizontalGroup(
            PanelFechasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFechasLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(PanelFechasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LblFechaFin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LblFechaInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(PanelFechasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(FechaFin, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addComponent(FechaInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        PanelFechasLayout.setVerticalGroup(
            PanelFechasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFechasLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(PanelFechasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(FechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelFechasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(FechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(144, Short.MAX_VALUE))
        );

        PanelTabla.addTab("Fecha", PanelFechas);

        PanelArticulos.setBackground(new java.awt.Color(0, 54, 204));

        LblCondicion.setBackground(new java.awt.Color(0, 0, 135));
        LblCondicion.setText("Condicion");

        CbCondicion.setBackground(new java.awt.Color(0, 0, 135));
        CbCondicion.setForeground(new java.awt.Color(255, 255, 255));
        CbCondicion.setColorDeBorde(new java.awt.Color(255, 255, 255));

        LblArticulo.setBackground(new java.awt.Color(0, 0, 135));
        LblArticulo.setText("Articulo");

        CbArticulo.setBackground(new java.awt.Color(0, 0, 135));
        CbArticulo.setForeground(new java.awt.Color(255, 255, 255));
        CbArticulo.setAnchoDeBorde(1.5F);
        CbArticulo.setColorDeBorde(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout PanelArticulosLayout = new javax.swing.GroupLayout(PanelArticulos);
        PanelArticulos.setLayout(PanelArticulosLayout);
        PanelArticulosLayout.setHorizontalGroup(
            PanelArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelArticulosLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(PanelArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelArticulosLayout.createSequentialGroup()
                        .addComponent(LblArticulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(CbArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelArticulosLayout.createSequentialGroup()
                        .addComponent(LblCondicion, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(CbCondicion, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(80, 80, 80))
        );
        PanelArticulosLayout.setVerticalGroup(
            PanelArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelArticulosLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(PanelArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblCondicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CbCondicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(PanelArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CbArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(130, Short.MAX_VALUE))
        );

        PanelTabla.addTab("Articulo", PanelArticulos);

        PanelSocio.setBackground(new java.awt.Color(0, 54, 204));

        Tabla.setBackground(new java.awt.Color(0, 0, 0));
        Tabla.setForeground(new java.awt.Color(255, 255, 255));
        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
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
        jScrollPane2.setViewportView(Tabla);

        LblNroSocio.setBackground(new java.awt.Color(0, 0, 135));
        LblNroSocio.setText("Socio");

        javax.swing.GroupLayout PanelSocioLayout = new javax.swing.GroupLayout(PanelSocio);
        PanelSocio.setLayout(PanelSocioLayout);
        PanelSocioLayout.setHorizontalGroup(
            PanelSocioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelSocioLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(PanelSocioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelSocioLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LblNroSocio, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        PanelSocioLayout.setVerticalGroup(
            PanelSocioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelSocioLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(LblNroSocio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        PanelTabla.addTab("Socio", PanelSocio);

        PanelDevolucion.setBackground(new java.awt.Color(0, 54, 204));
        PanelDevolucion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LblComentario.setBackground(new java.awt.Color(0, 0, 135));
        LblComentario.setText("Comentario");
        PanelDevolucion.add(LblComentario, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 16, 193, -1));

        TxaComentario.setBackground(new java.awt.Color(0, 54, 204));
        TxaComentario.setColumns(20);
        TxaComentario.setForeground(new java.awt.Color(255, 255, 255));
        TxaComentario.setRows(5);
        TxaComentario.setCaretColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(TxaComentario);

        PanelDevolucion.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 51, 235, 69));

        LblFechaDevolucion.setBackground(new java.awt.Color(0, 0, 135));
        LblFechaDevolucion.setText("Fecha de Devolucion");
        PanelDevolucion.add(LblFechaDevolucion, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 150, 193, -1));

        FechaDevolucion.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        PanelDevolucion.add(FechaDevolucion, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 192, 130, -1));

        BtnConfirmar.setBackground(new java.awt.Color(0, 0, 0));
        BtnConfirmar.setForeground(new java.awt.Color(255, 255, 255));
        BtnConfirmar.setText("Confirmar");
        BtnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnConfirmarActionPerformed(evt);
            }
        });
        PanelDevolucion.add(BtnConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, -1, -1));

        BtnAnular.setBackground(new java.awt.Color(0, 0, 0));
        BtnAnular.setForeground(new java.awt.Color(255, 255, 255));
        BtnAnular.setText("Anular");
        BtnAnular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAnularActionPerformed(evt);
            }
        });
        PanelDevolucion.add(BtnAnular, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 90, -1));

        PanelTabla.addTab("Devolucion", PanelDevolucion);

        javax.swing.GroupLayout PanelCargaLayout = new javax.swing.GroupLayout(PanelCarga);
        PanelCarga.setLayout(PanelCargaLayout);
        PanelCargaLayout.setHorizontalGroup(
            PanelCargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        PanelCargaLayout.setVerticalGroup(
            PanelCargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCargaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelElimModif.setBackground(new java.awt.Color(0, 54, 204));
        PanelElimModif.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscar por :", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 3, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        PanelElimModif.setForeground(new java.awt.Color(255, 255, 255));
        PanelElimModif.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RbNomArt.setBackground(new java.awt.Color(0, 0, 135));
        buttonGroup1.add(RbNomArt);
        RbNomArt.setForeground(new java.awt.Color(255, 255, 255));
        RbNomArt.setText("Nombre de Articulo");
        RbNomArt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbNomArtActionPerformed(evt);
            }
        });
        PanelElimModif.add(RbNomArt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        RbNroTicket.setBackground(new java.awt.Color(0, 0, 135));
        buttonGroup1.add(RbNroTicket);
        RbNroTicket.setForeground(new java.awt.Color(255, 255, 255));
        RbNroTicket.setText("Nro de Ticket");
        RbNroTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbNroTicketActionPerformed(evt);
            }
        });
        PanelElimModif.add(RbNroTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 140, -1));

        RbNomyApe.setBackground(new java.awt.Color(0, 0, 135));
        buttonGroup1.add(RbNomyApe);
        RbNomyApe.setForeground(new java.awt.Color(255, 255, 255));
        RbNomyApe.setText("Dni");
        RbNomyApe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbNomyApeActionPerformed(evt);
            }
        });
        PanelElimModif.add(RbNomyApe, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 80, -1));

        PanelTablaBuscar.setBackground(new java.awt.Color(0, 0, 0));
        PanelTablaBuscar.setForeground(new java.awt.Color(255, 255, 255));

        TablaBuscar.setBackground(new java.awt.Color(0, 0, 0));
        TablaBuscar.setForeground(new java.awt.Color(255, 255, 255));
        TablaBuscar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1"
            }
        ));
        TablaBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaBuscarMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TablaBuscarMousePressed(evt);
            }
        });
        PanelTablaBuscar.setViewportView(TablaBuscar);

        PanelElimModif.add(PanelTablaBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 360, 160));

        TxtNroTicket.setBackground(new java.awt.Color(0, 54, 204));
        TxtNroTicket.setForeground(new java.awt.Color(255, 255, 255));
        TxtNroTicket.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtNroTicket.setCaretColor(new java.awt.Color(255, 255, 255));
        PanelElimModif.add(TxtNroTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 101, -1));

        BtnAceptar.setBackground(new java.awt.Color(0, 0, 0));
        BtnAceptar.setForeground(new java.awt.Color(255, 255, 255));
        BtnAceptar.setText("Aceptar");
        BtnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAceptarActionPerformed(evt);
            }
        });
        PanelElimModif.add(BtnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 81, -1));

        BtnCancelar.setBackground(new java.awt.Color(0, 0, 0));
        BtnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        BtnCancelar.setText("Cancelar");
        PanelElimModif.add(BtnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, -1, -1));

        TxtNomArt.setBackground(new java.awt.Color(0, 54, 204));
        TxtNomArt.setForeground(new java.awt.Color(255, 255, 255));
        TxtNomArt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtNomArt.setCaretColor(new java.awt.Color(255, 255, 255));
        PanelElimModif.add(TxtNomArt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 100, -1));

        BtnBuscarNomArt.setBackground(new java.awt.Color(0, 0, 0));
        BtnBuscarNomArt.setForeground(new java.awt.Color(255, 255, 255));
        BtnBuscarNomArt.setText("Buscar");
        BtnBuscarNomArt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarNomArtActionPerformed(evt);
            }
        });
        PanelElimModif.add(BtnBuscarNomArt, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(PanelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(PanelCarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelElimModif, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelCarga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(PanelElimModif, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(PanelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 4, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void BtnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCargarActionPerformed
        AceptarDatos();
        Boton = 'A';
    }//GEN-LAST:event_BtnCargarActionPerformed

    private void TablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMouseClicked
        int col = 0;
        int fila = this.Tabla.getSelectedRow();
        enviarCodigo(Integer.parseInt(this.Tabla.getValueAt(fila, col).toString()));
    }//GEN-LAST:event_TablaMouseClicked

    private void BtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificarActionPerformed
        Boton = 'M';
        HabilitarPanelBuscar();
    }//GEN-LAST:event_BtnModificarActionPerformed

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
        Boton ='E';
        HabilitarPanelBuscar();
    }//GEN-LAST:event_BtnEliminarActionPerformed

    private void BtnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConfirmarActionPerformed
        AceptarDatos();
    }//GEN-LAST:event_BtnConfirmarActionPerformed

    private void BtnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAceptarActionPerformed
        switch (Boton) {
            case 'E':
                try {
                    int confirmar = JOptionPane.showConfirmDialog(null, "Esta seguro que desea eliminar el prestamo: " + this.TxtNroTicket.getText());
                    if (confirmar == 0) {
                        int TicketAEliminar = Integer.parseInt(this.TxtNroTicket.getText());
                        pr = new Prestamo();
                        pr.Baja(TicketAEliminar);
                    }
                    this.TxtNroTicket.setText(null);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error al cancelar");
                }                
                break;
            case 'M':
                DeshabilitarPanelBuscar();
                BuscaryEnviarALasCajas();
                this.BtnConfirmar.setVisible(true);
                this.BtnAnular.setVisible(true);
                break;
        }
        this.PanelTablaBuscar.setVisible(false);
    }//GEN-LAST:event_BtnAceptarActionPerformed

    private void RbNroTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbNroTicketActionPerformed
        this.TxtNroTicket.setText(null);
        this.TxtNroTicket.setVisible(true);
        this.TxtNroTicket.requestFocus();
        this.PanelTablaBuscar.setVisible(false);
        this.TablaBuscar.setVisible(false);
        this.TxtNomArt.setVisible(false);
        this.BtnAceptar.setVisible(true);
        this.BtnCancelar.setVisible(true);
        this.BtnBuscarNomArt.setVisible(false);
    }//GEN-LAST:event_RbNroTicketActionPerformed

    private void RbNomyApeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbNomyApeActionPerformed
        try {
            this.PanelTablaBuscar.setVisible(false);
            this.TablaBuscar.setVisible(false);
            this.TxtNroTicket.setVisible(false);
            this.TxtNomArt.setVisible(false);
            this.BtnAceptar.setVisible(false);
            this.BtnCancelar.setVisible(false);
            this.BtnBuscarNomArt.setVisible(false);
            String NroDni = JOptionPane.showInputDialog("Ingrese el Dni a Buscar: ");
            if (!NroDni.isEmpty()) {
                boolean SoloNro = true;
                for (int i = 0; i < NroDni.length(); i++) {
                    if (NroDni.charAt(i) =='0' ||
                            NroDni.charAt(i) =='1' ||
                            NroDni.charAt(i) =='2' ||
                            NroDni.charAt(i) =='3' ||
                            NroDni.charAt(i) =='4' ||
                            NroDni.charAt(i) =='5' ||
                            NroDni.charAt(i) =='6' ||
                            NroDni.charAt(i) =='7' ||
                            NroDni.charAt(i) =='8' ||
                            NroDni.charAt(i) =='9') {
                       continue;
                    }else{
                        SoloNro = false;
                        break;
                    }
                }
                if (SoloNro == true) {
                    consultEleg = 1;
                    pr = new Prestamo();
                    this.TablaBuscar.setModel(pr.MostrarTitulosBuscar(consultEleg));
                    this.TablaBuscar.setModel(pr.MostrarContenidoBuscar(consultEleg, NroDni));
                    this.PanelTablaBuscar.setVisible(true);
                    this.TablaBuscar.setVisible(true);
                    this.TxtNroTicket.setVisible(false);
                    this.TxtNomArt.setVisible(false);
                    this.BtnAceptar.setVisible(true);
                    this.BtnCancelar.setVisible(true);
                    this.BtnBuscarNomArt.setVisible(false);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Es obligatorio ingresar el Dni.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Al no ingresar Dni, no se muestra ningún socio");
        }
        
    }//GEN-LAST:event_RbNomyApeActionPerformed

    private void RbNomArtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbNomArtActionPerformed
        consultEleg = 2;
        this.TxtNomArt.setVisible(true);
        this.TxtNomArt.requestFocus();
        this.TxtNroTicket.setVisible(false);
        this.PanelTablaBuscar.setVisible(false);
        this.TablaBuscar.setVisible(false);
        this.BtnAceptar.setVisible(false);
        this.BtnCancelar.setVisible(false);
        this.BtnBuscarNomArt.setVisible(true);
    }//GEN-LAST:event_RbNomArtActionPerformed

    private void TablaBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaBuscarMouseClicked
        int col = 0;
        int fila = this.TablaBuscar.getSelectedRow();
        this.TxtNroTicket.setText(this.TablaBuscar.getValueAt(fila, col).toString());        
    }//GEN-LAST:event_TablaBuscarMouseClicked

    private void TablaBuscarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaBuscarMousePressed
        int col = 0;
        int fila = this.TablaBuscar.getSelectedRow();
        this.TxtNroTicket.setText(this.TablaBuscar.getValueAt(fila, col).toString());
    }//GEN-LAST:event_TablaBuscarMousePressed

    private void TablaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMousePressed
        int col = 0;
        int fila = this.Tabla.getSelectedRow();
        enviarCodigo(Integer.parseInt(this.Tabla.getValueAt(fila, col).toString()));
    }//GEN-LAST:event_TablaMousePressed

    private void BtnBuscarNomArtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarNomArtActionPerformed
            String NomArt = this.TxtNomArt.getText();
            pr = new Prestamo();
                if (!this.TxtNomArt.getText().isEmpty()) {
                    this.TablaBuscar.setModel(pr.MostrarTitulosBuscar(consultEleg));
                    this.TablaBuscar.setModel(pr.MostrarContenidoBuscar(consultEleg, NomArt));
                    this.PanelTablaBuscar.setVisible(true);
                    this.TablaBuscar.setVisible(true);
                    this.TxtNroTicket.setVisible(false);
                    this.BtnAceptar.setVisible(true);
                    this.BtnCancelar.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontro el articulo");
                }
        this.TxtNomArt.setVisible(false);
        this.TxtNomArt.setText(null);
        this.BtnBuscarNomArt.setVisible(false);
    }//GEN-LAST:event_BtnBuscarNomArtActionPerformed

    private void BtnAnularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAnularActionPerformed
        this.BtnConfirmar.setVisible(false);
        this.BtnAnular.setVisible(false);
    }//GEN-LAST:event_BtnAnularActionPerformed
    private void AceptarDatos(){
        java.util.Date FechaIniForm, FechaFinForm, FechaDevoForm;
        java.sql.Date FechaIniSql, FechaFinSql, FechaDevoSql;
        
        FechaIniForm = this.FechaInicio.getDate();
        FechaIniSql = Validacion.ConvertirFecha(FechaIniForm);
        FechaFinForm = this.FechaFin.getDate();
        FechaFinSql = Validacion.ConvertirFecha(FechaFinForm);
        int Condi = this.SwCondicion();
        
        if (Boton == 'M') {
            enviarCodigo(Integer.parseInt(this.Tabla.getValueAt(0, 0).toString()));
        }
        
        if (DameCodigo() > 0) {
            int NroSocio = DameCodigo();
            String CodArtForm = this.CbArticulo.getSelectedItem().toString();
            int CodArtSql = art.RetornarIdArticulo(CodArtForm);
            switch (Boton) {
                case 'A':
                    pr = new Prestamo(FechaIniSql, FechaFinSql,Condi, NroSocio, CodArtSql);
                    pr.Alta();
                    Boton = 'L';
                    break;
                case 'M':
                    String Comentario = this.TxaComentario.getText();
                    FechaDevoForm = this.FechaDevolucion.getDate();
                    FechaDevoSql = Validacion.ConvertirFecha(FechaDevoForm);
                    pr = new Prestamo(FechaIniSql, FechaFinSql, Condi, Comentario, FechaDevoSql, NroSocio, CodArtSql);
                    pr.Modificar(Integer.parseInt(this.TxtNroTicket.getText()));
                    this.TxtNroTicket.setText(null);
                    Boton = 'L';
                    break;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Error tiene que seleccionar un socio");
        }
    }
    private void enviarCodigo(int x){
        idSocio = x;
    }
    private int DameCodigo(){
        return idSocio;
    }
    private int SwCondicion(){
        String eleccion = String.valueOf(this.CbCondicion.getSelectedItem());
        int condiEleg = 0;
        switch (eleccion) {
            case "NUEVO":
                condiEleg = 1;
                break;
            case "EN CONDICIONES":
                condiEleg = 2;
                break;
            case "DETERIORADO":
                condiEleg = 3;
                break;
            case "FRÁGIL":
                condiEleg = 4;
                break;
            case "EN MAL ESTADO":
                condiEleg = 5;
                break;
        }
        return condiEleg;
    }
    private void HabilitarPanelBuscar(){
        this.PanelElimModif.setVisible(true);
        this.TxtNroTicket.setVisible(false);
        this.PanelTablaBuscar.setVisible(false);
        this.BtnAceptar.setVisible(false);
        this.BtnCancelar.setVisible(false);
        
        this.PanelTabla.setEnabled(false);
        this.FechaInicio.setEnabled(false);
        this.FechaFin.setEnabled(false);
        this.CbCondicion.setEnabled(false);
        this.CbArticulo.setEnabled(false);
        this.Tabla.setEnabled(false);
        this.TxaComentario.setEnabled(false);
        this.FechaDevolucion.setEnabled(false);
    }
    private void DeshabilitarPanelBuscar(){
        this.PanelElimModif.setVisible(true);
        this.TxtNroTicket.setVisible(false);
        this.PanelTablaBuscar.setVisible(false);
        this.TxtNomArt.setVisible(false);
        this.BtnAceptar.setVisible(false);
        this.BtnCancelar.setVisible(false);
        
        this.PanelTabla.setEnabled(true);
        this.FechaInicio.setEnabled(true);
        this.FechaFin.setEnabled(true);
        this.CbCondicion.setEnabled(true);
        this.CbArticulo.setEnabled(true);
        this.Tabla.setEnabled(false);
        this.TxaComentario.setEnabled(true);
        this.FechaDevolucion.setEnabled(true);
    }
    private void BuscaryEnviarALasCajas(){
        pr = new Prestamo();
        pr.BuscarPorCod(Integer.parseInt(this.TxtNroTicket.getText()));
        java.util.Date FechaIniPres = pr.getFechaInicioPrest();
        java.util.Date FechaFinPres = pr.getFechaFinPrest();
        java.util.Date FechaDevoPres = pr.getFechaDevolu();
        
        this.Tabla.setModel(pr.MostrarTitulosCargaSocioAsignado());
        this.Tabla.setModel(pr.MostrarContenidoSocioAsignado(Integer.parseInt(this.TxtNroTicket.getText())));
        this.FechaInicio.setDate(FechaIniPres);
        this.FechaFin.setDate(FechaFinPres);
        String Condi = SwComboRetornar(pr.getCondicion());
        this.CbCondicion.setSelectedItem(Condi);
        this.CbArticulo.setSelectedItem(pr.getNomArt());
        //this.Tabla.setSelectionMode();
        this.TxaComentario.setText(pr.getComentario());
        this.FechaDevolucion.setDate(FechaDevoPres);
    }
    private String SwComboRetornar(int Condi){
        String eleg= null;
        switch (Condi) {
            case 1:
                eleg = "NUEVO";
                break;
            case 2:
                eleg = "EN CONDICIONES";
                break;
            case 3:
                eleg = "DETERIORADO";
                break;
            case 4:
                eleg = "FRÁGIL";
                break;
            case 5:
                eleg = "EN MAL ESTADO";
                break;
        }
        return eleg;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAceptar;
    private javax.swing.JButton BtnAnular;
    private javax.swing.JButton BtnBuscarNomArt;
    private javax.swing.JButton BtnCancelar;
    private org.edisoncor.gui.button.ButtonRound BtnCargar;
    private javax.swing.JButton BtnConfirmar;
    private org.edisoncor.gui.button.ButtonRound BtnEliminar;
    private org.edisoncor.gui.button.ButtonRound BtnModificar;
    private org.edisoncor.gui.button.ButtonRound BtnSalir;
    private org.edisoncor.gui.comboBox.ComboBoxRound CbArticulo;
    private org.edisoncor.gui.comboBox.ComboBoxRound CbCondicion;
    private com.toedter.calendar.JDateChooser FechaDevolucion;
    private com.toedter.calendar.JDateChooser FechaFin;
    private com.toedter.calendar.JDateChooser FechaInicio;
    private org.edisoncor.gui.label.LabelRound LblArticulo;
    private org.edisoncor.gui.label.LabelRound LblComentario;
    private org.edisoncor.gui.label.LabelRound LblCondicion;
    private org.edisoncor.gui.label.LabelRound LblFechaDevolucion;
    private org.edisoncor.gui.label.LabelRound LblFechaFin;
    private org.edisoncor.gui.label.LabelRound LblFechaInicio;
    private org.edisoncor.gui.label.LabelRound LblNroSocio;
    private javax.swing.JPanel PanelArticulos;
    private javax.swing.JPanel PanelBotones;
    private javax.swing.JPanel PanelCarga;
    private javax.swing.JPanel PanelDevolucion;
    private javax.swing.JPanel PanelElimModif;
    private javax.swing.JPanel PanelFechas;
    private javax.swing.JPanel PanelSocio;
    private javax.swing.JTabbedPane PanelTabla;
    private javax.swing.JScrollPane PanelTablaBuscar;
    private javax.swing.JRadioButton RbNomArt;
    private javax.swing.JRadioButton RbNomyApe;
    private javax.swing.JRadioButton RbNroTicket;
    private javax.swing.JTable Tabla;
    private javax.swing.JTable TablaBuscar;
    private javax.swing.JTextArea TxaComentario;
    private javax.swing.JTextField TxtNomArt;
    private javax.swing.JTextField TxtNroTicket;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
