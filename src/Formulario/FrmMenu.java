package Formulario;

public class FrmMenu extends javax.swing.JFrame {

    public FrmMenu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Escritorio = new javax.swing.JDesktopPane();
        BarraMenu = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        OpcAutor = new javax.swing.JMenuItem();
        OpcSocio = new javax.swing.JMenuItem();
        OpcArticulo = new javax.swing.JMenuItem();
        OpcPrestamo = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        OpcMostrarSoc = new javax.swing.JMenuItem();
        OpcMostrarArticulo = new javax.swing.JMenuItem();
        OpcMostrarPrestamo = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        OpcBuscarPorDni = new javax.swing.JMenuItem();
        OpcBuscarPorTelef = new javax.swing.JMenuItem();
        OpcBuscarPorDirec = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        OpcAPartirDeCantPag = new javax.swing.JMenuItem();
        OpcAPartirDeCantCancio = new javax.swing.JMenuItem();
        OpcCantPorArt = new javax.swing.JMenuItem();
        OpcCantCopYTpArt = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        OpcBuscarEntreFechaFin = new javax.swing.JMenuItem();
        OpcPrestamosHastafecha = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Escritorio.setBackground(new java.awt.Color(0, 0, 0));

        fileMenu.setMnemonic('f');
        fileMenu.setText("CARGA");

        OpcAutor.setMnemonic('o');
        OpcAutor.setText("Autor");
        OpcAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpcAutorActionPerformed(evt);
            }
        });
        fileMenu.add(OpcAutor);

        OpcSocio.setMnemonic('a');
        OpcSocio.setText("Socio");
        OpcSocio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpcSocioActionPerformed(evt);
            }
        });
        fileMenu.add(OpcSocio);

        OpcArticulo.setText("Articulo");
        OpcArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpcArticuloActionPerformed(evt);
            }
        });
        fileMenu.add(OpcArticulo);

        OpcPrestamo.setText("Prestamo");
        OpcPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpcPrestamoActionPerformed(evt);
            }
        });
        fileMenu.add(OpcPrestamo);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        BarraMenu.add(fileMenu);

        editMenu.setMnemonic('e');
        editMenu.setText("CONSULTAS");

        OpcMostrarSoc.setMnemonic('t');
        OpcMostrarSoc.setText("Mostrar Socios");
        OpcMostrarSoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpcMostrarSocActionPerformed(evt);
            }
        });
        editMenu.add(OpcMostrarSoc);

        OpcMostrarArticulo.setMnemonic('y');
        OpcMostrarArticulo.setText("Mostrar Articulo");
        OpcMostrarArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpcMostrarArticuloActionPerformed(evt);
            }
        });
        editMenu.add(OpcMostrarArticulo);

        OpcMostrarPrestamo.setMnemonic('p');
        OpcMostrarPrestamo.setText("Mostrar Prestamo");
        OpcMostrarPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpcMostrarPrestamoActionPerformed(evt);
            }
        });
        editMenu.add(OpcMostrarPrestamo);

        jMenu1.setText("Más Consultas de Socios");

        OpcBuscarPorDni.setText("Buscar por Dni");
        OpcBuscarPorDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpcBuscarPorDniActionPerformed(evt);
            }
        });
        jMenu1.add(OpcBuscarPorDni);

        OpcBuscarPorTelef.setText("Buscar por Nro de Telefono");
        OpcBuscarPorTelef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpcBuscarPorTelefActionPerformed(evt);
            }
        });
        jMenu1.add(OpcBuscarPorTelef);

        OpcBuscarPorDirec.setText("Buscar por Dirección");
        OpcBuscarPorDirec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpcBuscarPorDirecActionPerformed(evt);
            }
        });
        jMenu1.add(OpcBuscarPorDirec);

        editMenu.add(jMenu1);

        jMenu2.setText("Más Consultas de Articulos");

        OpcAPartirDeCantPag.setText("Buscar a partir de ' x ' cantidad de Páginas");
        OpcAPartirDeCantPag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpcAPartirDeCantPagActionPerformed(evt);
            }
        });
        jMenu2.add(OpcAPartirDeCantPag);

        OpcAPartirDeCantCancio.setText("Buscar a partir de ' x ' cantidad de Canciones");
        OpcAPartirDeCantCancio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpcAPartirDeCantCancioActionPerformed(evt);
            }
        });
        jMenu2.add(OpcAPartirDeCantCancio);

        OpcCantPorArt.setText("Cantidad Total por Artículo");
        OpcCantPorArt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpcCantPorArtActionPerformed(evt);
            }
        });
        jMenu2.add(OpcCantPorArt);

        OpcCantCopYTpArt.setText("Cantidad de Copias Menores a ' x ' y Tipo de Artículo");
        OpcCantCopYTpArt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpcCantCopYTpArtActionPerformed(evt);
            }
        });
        jMenu2.add(OpcCantCopYTpArt);

        editMenu.add(jMenu2);

        jMenu3.setText("Más Consulta de Prestamo");

        OpcBuscarEntreFechaFin.setText("Buscar entre Fechas Fin de Prestamo");
        OpcBuscarEntreFechaFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpcBuscarEntreFechaFinActionPerformed(evt);
            }
        });
        jMenu3.add(OpcBuscarEntreFechaFin);

        OpcPrestamosHastafecha.setText("Buscar Prestamos hasta la Fecha");
        OpcPrestamosHastafecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpcPrestamosHastafechaActionPerformed(evt);
            }
        });
        jMenu3.add(OpcPrestamosHastafecha);

        editMenu.add(jMenu3);

        BarraMenu.add(editMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Help");

        contentMenuItem.setMnemonic('c');
        contentMenuItem.setText("Contents");
        helpMenu.add(contentMenuItem);

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        helpMenu.add(aboutMenuItem);

        BarraMenu.add(helpMenu);

        setJMenuBar(BarraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 1040, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 577, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void OpcSocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpcSocioActionPerformed
        FrmSocio s = new FrmSocio();
        Escritorio.add(s);
        s.show();
    }//GEN-LAST:event_OpcSocioActionPerformed

    private void OpcAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpcAutorActionPerformed
        FrmAutor au = new FrmAutor();
        Escritorio.add(au);
        au.show();
    }//GEN-LAST:event_OpcAutorActionPerformed

    private void OpcArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpcArticuloActionPerformed
        FrmArticulos a = new FrmArticulos();
        Escritorio.add(a);
        a.show();
    }//GEN-LAST:event_OpcArticuloActionPerformed

    private void OpcMostrarSocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpcMostrarSocActionPerformed
        FrmMostrarSocio ms = new FrmMostrarSocio();
        Escritorio.add(ms);
        ms.show();
    }//GEN-LAST:event_OpcMostrarSocActionPerformed

    private void OpcMostrarArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpcMostrarArticuloActionPerformed
        FrmMostrarArticulo ma = new FrmMostrarArticulo();
        Escritorio.add(ma);
        ma.show();
    }//GEN-LAST:event_OpcMostrarArticuloActionPerformed

    private void OpcPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpcPrestamoActionPerformed
        FrmPrestamo pr = new FrmPrestamo();
        Escritorio.add(pr);
        pr.show();
    }//GEN-LAST:event_OpcPrestamoActionPerformed

    private void OpcMostrarPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpcMostrarPrestamoActionPerformed
        FrmMostrarPrestamo p = new FrmMostrarPrestamo();
        Escritorio.add(p);
        p.show();
    }//GEN-LAST:event_OpcMostrarPrestamoActionPerformed

    private void OpcBuscarPorDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpcBuscarPorDniActionPerformed
        FrmVariasConsultas v = new FrmVariasConsultas(1);
        Escritorio.add(v);
        v.show();
    }//GEN-LAST:event_OpcBuscarPorDniActionPerformed

    private void OpcBuscarPorTelefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpcBuscarPorTelefActionPerformed
        FrmVariasConsultas v = new FrmVariasConsultas(2);
        Escritorio.add(v);
        v.show();
    }//GEN-LAST:event_OpcBuscarPorTelefActionPerformed

    private void OpcBuscarPorDirecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpcBuscarPorDirecActionPerformed
        FrmVariasConsultas v = new FrmVariasConsultas(3);
        Escritorio.add(v);
        v.show();
    }//GEN-LAST:event_OpcBuscarPorDirecActionPerformed

    private void OpcAPartirDeCantPagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpcAPartirDeCantPagActionPerformed
        FrmVariasConsultas v = new FrmVariasConsultas(4);
        Escritorio.add(v);
        v.show();
    }//GEN-LAST:event_OpcAPartirDeCantPagActionPerformed

    private void OpcAPartirDeCantCancioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpcAPartirDeCantCancioActionPerformed
        FrmVariasConsultas v = new FrmVariasConsultas(5);
        Escritorio.add(v);
        v.show();
    }//GEN-LAST:event_OpcAPartirDeCantCancioActionPerformed

    private void OpcCantPorArtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpcCantPorArtActionPerformed
        FrmVariasConsultas v = new FrmVariasConsultas(6);
        Escritorio.add(v);
        v.show();
    }//GEN-LAST:event_OpcCantPorArtActionPerformed

    private void OpcCantCopYTpArtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpcCantCopYTpArtActionPerformed
        FrmVariasConsultas v = new FrmVariasConsultas(7);
        Escritorio.add(v);
        v.show();
    }//GEN-LAST:event_OpcCantCopYTpArtActionPerformed

    private void OpcBuscarEntreFechaFinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpcBuscarEntreFechaFinActionPerformed
        FrmVariasConsultas v = new FrmVariasConsultas(8);
        Escritorio.add(v);
        v.show();
    }//GEN-LAST:event_OpcBuscarEntreFechaFinActionPerformed

    private void OpcPrestamosHastafechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpcPrestamosHastafechaActionPerformed
        FrmVariasConsultas v = new FrmVariasConsultas(9);
        Escritorio.add(v);
        v.show();
    }//GEN-LAST:event_OpcPrestamosHastafechaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar BarraMenu;
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JMenuItem OpcAPartirDeCantCancio;
    private javax.swing.JMenuItem OpcAPartirDeCantPag;
    private javax.swing.JMenuItem OpcArticulo;
    private javax.swing.JMenuItem OpcAutor;
    private javax.swing.JMenuItem OpcBuscarEntreFechaFin;
    private javax.swing.JMenuItem OpcBuscarPorDirec;
    private javax.swing.JMenuItem OpcBuscarPorDni;
    private javax.swing.JMenuItem OpcBuscarPorTelef;
    private javax.swing.JMenuItem OpcCantCopYTpArt;
    private javax.swing.JMenuItem OpcCantPorArt;
    private javax.swing.JMenuItem OpcMostrarArticulo;
    private javax.swing.JMenuItem OpcMostrarPrestamo;
    private javax.swing.JMenuItem OpcMostrarSoc;
    private javax.swing.JMenuItem OpcPrestamo;
    private javax.swing.JMenuItem OpcPrestamosHastafecha;
    private javax.swing.JMenuItem OpcSocio;
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem contentMenuItem;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    // End of variables declaration//GEN-END:variables

}
