package gui;

import aplicacion.Vivo;

public class VDios extends javax.swing.JFrame {
    
     aplicacion.FachadaAplicacion fa;
    
    public VDios( aplicacion.FachadaAplicacion fa) {
        this.fa=fa;
        initComponents();
        this.setLocationRelativeTo(null); //Coloca la ventana en el centro de la pantalla
        ModeloTablaJuiciosPendientes mjp;
        mjp=(ModeloTablaJuiciosPendientes) tablaJuiciosPendientes.getModel();
        mjp.setFilas(fa.juiciosPendientes());
        //Se selecciona el primer elemento de la tabla
        if(mjp.getRowCount()!=0) tablaJuiciosPendientes.setRowSelectionInterval(0, 0); 
        this.actualizarDatos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        tabbedPanel = new javax.swing.JTabbedPane();
        panelJuicios = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaJuiciosPendientes = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textoNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        textoID = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        textoLocalidad = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        textoFechaNacimiento = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        textoFechaMuerte = new javax.swing.JTextField();
        btnJuzgar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        panelCielo = new javax.swing.JPanel();
        panelInfierno = new javax.swing.JPanel();
        panelLimbo = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ventana Dios");

        tablaJuiciosPendientes.setModel(new ModeloTablaJuiciosPendientes());
        tablaJuiciosPendientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaJuiciosPendientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaJuiciosPendientes);

        jLabel1.setFont(new java.awt.Font("Noto Serif", 1, 12)); // NOI18N
        jLabel1.setText("Juicios Pendientes");

        jLabel2.setText("Nombre:");

        textoNombre.setEditable(false);

        jLabel3.setText("ID:");

        textoID.setEditable(false);

        jLabel4.setText("Localidad:");

        textoLocalidad.setEditable(false);

        jLabel5.setText("Fecha Nacimiento:");

        textoFechaNacimiento.setEditable(false);

        jLabel6.setText("Fecha Muerte:");

        textoFechaMuerte.setEditable(false);

        btnJuzgar.setText("Juzgar");

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        jButton1.setText("Consultar Estadísticas");

        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelJuiciosLayout = new javax.swing.GroupLayout(panelJuicios);
        panelJuicios.setLayout(panelJuiciosLayout);
        panelJuiciosLayout.setHorizontalGroup(
            panelJuiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelJuiciosLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(panelJuiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelJuiciosLayout.createSequentialGroup()
                        .addComponent(btnJuzgar)
                        .addGap(18, 18, 18)
                        .addComponent(btnRegistrar)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelJuiciosLayout.createSequentialGroup()
                        .addGroup(panelJuiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelJuiciosLayout.createSequentialGroup()
                                .addGroup(panelJuiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelJuiciosLayout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(textoFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelJuiciosLayout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textoID, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel4)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelJuiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textoFechaMuerte, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textoLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 99, Short.MAX_VALUE)))
                .addGap(21, 21, 21))
        );
        panelJuiciosLayout.setVerticalGroup(
            panelJuiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelJuiciosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(panelJuiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(textoID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(panelJuiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelJuiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(textoFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textoFechaMuerte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(46, 46, 46)
                .addGroup(panelJuiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnJuzgar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        tabbedPanel.addTab("Juicios", panelJuicios);

        javax.swing.GroupLayout panelCieloLayout = new javax.swing.GroupLayout(panelCielo);
        panelCielo.setLayout(panelCieloLayout);
        panelCieloLayout.setHorizontalGroup(
            panelCieloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 553, Short.MAX_VALUE)
        );
        panelCieloLayout.setVerticalGroup(
            panelCieloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );

        tabbedPanel.addTab("Cielo", panelCielo);

        javax.swing.GroupLayout panelInfiernoLayout = new javax.swing.GroupLayout(panelInfierno);
        panelInfierno.setLayout(panelInfiernoLayout);
        panelInfiernoLayout.setHorizontalGroup(
            panelInfiernoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 553, Short.MAX_VALUE)
        );
        panelInfiernoLayout.setVerticalGroup(
            panelInfiernoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );

        tabbedPanel.addTab("Infierno", panelInfierno);

        javax.swing.GroupLayout panelLimboLayout = new javax.swing.GroupLayout(panelLimbo);
        panelLimbo.setLayout(panelLimboLayout);
        panelLimboLayout.setHorizontalGroup(
            panelLimboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 553, Short.MAX_VALUE)
        );
        panelLimboLayout.setVerticalGroup(
            panelLimboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );

        tabbedPanel.addTab("Limbo", panelLimbo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedPanel)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedPanel)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tablaJuiciosPendientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaJuiciosPendientesMouseClicked
       actualizarDatos();
    }//GEN-LAST:event_tablaJuiciosPendientesMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnJuzgar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelCielo;
    private javax.swing.JPanel panelInfierno;
    private javax.swing.JPanel panelJuicios;
    private javax.swing.JPanel panelLimbo;
    private javax.swing.JTabbedPane tabbedPanel;
    private javax.swing.JTable tablaJuiciosPendientes;
    private javax.swing.JTextField textoFechaMuerte;
    private javax.swing.JTextField textoFechaNacimiento;
    private javax.swing.JTextField textoID;
    private javax.swing.JTextField textoLocalidad;
    private javax.swing.JTextField textoNombre;
    // End of variables declaration//GEN-END:variables
    
    public void actualizarDatos(){
        ModeloTablaJuiciosPendientes mjp;
        mjp=(ModeloTablaJuiciosPendientes) tablaJuiciosPendientes.getModel();
        if(tablaJuiciosPendientes.getSelectedRow()!=-1){
            Vivo user=mjp.getRow(tablaJuiciosPendientes.getSelectedRow());
        textoNombre.setText(user.getNombre());
        textoID.setText(user.getNombreUsuario());
        textoLocalidad.setText(user.getLocalidad());
        textoFechaNacimiento.setText(String.valueOf(user.getFechaNacimiento()));
        textoFechaMuerte.setText(String.valueOf(user.getFechaMuerte()));
        }else{
            
        }
    }

}
