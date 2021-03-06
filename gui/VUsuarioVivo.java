package gui;

import aplicacion.Vivo;
import javax.swing.JOptionPane;

public class VUsuarioVivo extends javax.swing.JFrame {

     aplicacion.FachadaAplicacion fa;
     Vivo usuario;
    
    public VUsuarioVivo( aplicacion.FachadaAplicacion fa, aplicacion.Usuario user) {
        this.fa=fa;
        initComponents();
        this.setLocationRelativeTo(null); //Coloca la ventana en el centro de la pantalla
        inicializarDatos(user);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelInformacion = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textoNombre = new javax.swing.JTextField();
        textoUsuario = new javax.swing.JTextField();
        textoContrasena = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        textoLocalidad = new javax.swing.JTextField();
        textoFechaNacimiento = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPecados = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaBA = new javax.swing.JTable();
        btnConfesar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jPanelVenganzas = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        textoNombreBusqueda = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaUsuarios = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        btnSolicitar = new javax.swing.JButton();
        btnSalirV = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaVenganzas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre");

        jLabel2.setText("Usuario");

        jLabel3.setText("Contraseña");

        jLabel4.setText("Localidad");

        jLabel5.setText("Fecha Nacimiento");

        textoFechaNacimiento.setEditable(false);

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabel7.setText("Pecados");

        jLabel8.setText("Buenas Acciones");

        tablaPecados.setModel(new ModeloTablaPecados());
        jScrollPane1.setViewportView(tablaPecados);

        tablaBA.setModel(new ModeloTablaBuenasAcciones());
        jScrollPane2.setViewportView(tablaBA);

        btnConfesar.setText("Confesar");
        btnConfesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfesarActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelInformacionLayout = new javax.swing.GroupLayout(jPanelInformacion);
        jPanelInformacion.setLayout(jPanelInformacionLayout);
        jPanelInformacionLayout.setHorizontalGroup(
            jPanelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInformacionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelInformacionLayout.createSequentialGroup()
                        .addGroup(jPanelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelInformacionLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelInformacionLayout.createSequentialGroup()
                        .addGroup(jPanelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanelInformacionLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textoLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textoFechaNacimiento))
                            .addGroup(jPanelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanelInformacionLayout.createSequentialGroup()
                                        .addGap(262, 262, 262)
                                        .addGroup(jPanelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btnGuardar)
                                            .addGroup(jPanelInformacionLayout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(textoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel3)
                                                .addGap(18, 18, 18)
                                                .addComponent(textoContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel8)
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanelInformacionLayout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(btnConfesar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnSalir)))
                                .addComponent(jLabel7)))
                        .addGap(0, 41, Short.MAX_VALUE))))
        );
        jPanelInformacionLayout.setVerticalGroup(
            jPanelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInformacionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(textoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(textoLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(textoFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardar)
                .addGap(8, 8, 8)
                .addGroup(jPanelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfesar)
                    .addComponent(btnSalir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Informacion", jPanelInformacion);

        jLabel6.setText("Nombre");

        jLabel9.setText("Usuarios:");

        tablaUsuarios.setModel(new ModeloTablaUsuarios());
        jScrollPane3.setViewportView(tablaUsuarios);

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel10.setText("Venganza");

        btnSolicitar.setText("Solicitar");
        btnSolicitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolicitarActionPerformed(evt);
            }
        });

        btnSalirV.setText("Salir");
        btnSalirV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirVActionPerformed(evt);
            }
        });

        tablaVenganzas.setModel(new ModeloTablaVenganzas());
        jScrollPane4.setViewportView(tablaVenganzas);

        javax.swing.GroupLayout jPanelVenganzasLayout = new javax.swing.GroupLayout(jPanelVenganzas);
        jPanelVenganzas.setLayout(jPanelVenganzasLayout);
        jPanelVenganzasLayout.setHorizontalGroup(
            jPanelVenganzasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVenganzasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelVenganzasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(jPanelVenganzasLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanelVenganzasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelVenganzasLayout.createSequentialGroup()
                                .addGap(149, 149, 149)
                                .addComponent(btnBuscar))
                            .addGroup(jPanelVenganzasLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10))
                            .addGroup(jPanelVenganzasLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanelVenganzasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanelVenganzasLayout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(28, 28, 28)
                                        .addComponent(textoNombreBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelVenganzasLayout.createSequentialGroup()
                                        .addComponent(btnSolicitar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnSalirV)
                                        .addGap(15, 15, 15))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelVenganzasLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanelVenganzasLayout.setVerticalGroup(
            jPanelVenganzasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVenganzasLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel9)
                .addGroup(jPanelVenganzasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelVenganzasLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelVenganzasLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanelVenganzasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(textoNombreBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar)
                        .addGap(15, 15, 15)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelVenganzasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSolicitar)
                    .addComponent(btnSalirV))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Venganzas", jPanelVenganzas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        fa.modificarUsuarioVivo(usuario.getIdUsuario(), textoNombre.getText(), textoContrasena.getText(), textoLocalidad.getText());
        inicializarDatos(usuario);
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnConfesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfesarActionPerformed
        // TODO add your handling code here:
        ModeloTablaPecados mp;
        mp = (ModeloTablaPecados) tablaPecados.getModel();
        fa.solicitarConfesion(usuario.getIdUsuario(), mp.getRow(tablaPecados.getSelectedRow()).getFecha(), mp.getRow(tablaPecados.getSelectedRow()).getTipoPecado());
        JOptionPane.showMessageDialog(this,"Confesion solicitada","INFORMATION",JOptionPane.INFORMATION_MESSAGE);
        inicializarDatos(usuario);
    }//GEN-LAST:event_btnConfesarActionPerformed

    private void btnSalirVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirVActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnSalirVActionPerformed

    private void btnSolicitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolicitarActionPerformed
        // TODO add your handling code here:
        ModeloTablaUsuarios mu;
        mu = (ModeloTablaUsuarios) tablaUsuarios.getModel();
        ModeloTablaVenganzas mv;
        mv= (ModeloTablaVenganzas) tablaVenganzas.getModel();
        if(tablaUsuarios.getSelectedRow()!=-1){
            if(tablaVenganzas.getSelectedRow()!=-1){
                fa.solicitarVenganza(usuario.getIdUsuario(),mu.getRow(tablaUsuarios.getSelectedRow()).getIdUsuario(), mv.getRow(tablaVenganzas.getSelectedRow()).getNivel());
                JOptionPane.showMessageDialog(this,"Venganza solicitada","INFORMATION",JOptionPane.INFORMATION_MESSAGE);
            }
        }
        inicializarDatos(usuario);
    }//GEN-LAST:event_btnSolicitarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        ModeloTablaUsuarios mtu;
        mtu=(ModeloTablaUsuarios) tablaUsuarios.getModel();
        if(!textoNombreBusqueda.getText().isEmpty()){
            mtu.setFilas(fa.consultarUsuariosMenos(usuario.getIdUsuario(), textoNombreBusqueda.getText()));
        }
        inicializarDatos(usuario);
    }//GEN-LAST:event_btnBuscarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnConfesar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSalirV;
    private javax.swing.JButton btnSolicitar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanelInformacion;
    private javax.swing.JPanel jPanelVenganzas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tablaBA;
    private javax.swing.JTable tablaPecados;
    private javax.swing.JTable tablaUsuarios;
    private javax.swing.JTable tablaVenganzas;
    private javax.swing.JTextField textoContrasena;
    private javax.swing.JTextField textoFechaNacimiento;
    private javax.swing.JTextField textoLocalidad;
    private javax.swing.JTextField textoNombre;
    private javax.swing.JTextField textoNombreBusqueda;
    private javax.swing.JTextField textoUsuario;
    // End of variables declaration//GEN-END:variables
    public void inicializarDatos(aplicacion.Usuario u){
        //Pestaña Informacion
        this.usuario=fa.obtenerUsuarioVivo(u.getIdUsuario());
        ModeloTablaBuenasAcciones mba;
        mba = (ModeloTablaBuenasAcciones) tablaBA.getModel();
        mba.setFilas(usuario.getBuenasAcciones());
        ModeloTablaPecados mp;
        mp = (ModeloTablaPecados) tablaPecados.getModel();
        mp.setFilas(usuario.getPecados());
        textoNombre.setText(usuario.getNombre());
        textoUsuario.setText(usuario.getNombreUsuario());
        textoContrasena.setText(usuario.getClave());
        textoLocalidad.setText(usuario.getLocalidad());
        textoFechaNacimiento.setText(String.valueOf(usuario.getFechaNacimiento()));
        //PestañaVenganzas
        ModeloTablaUsuarios mu;
        mu = (ModeloTablaUsuarios) tablaUsuarios.getModel();
        mu.setFilas(fa.consultarUsuariosMenos(usuario.getIdUsuario(), textoNombreBusqueda.getText()));
        ModeloTablaVenganzas mv;
        mv = (ModeloTablaVenganzas) tablaVenganzas.getModel();
        mv.setFilas(fa.listaVenganzas());
    }

}
