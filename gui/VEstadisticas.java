package gui;

public class VEstadisticas extends javax.swing.JDialog {

    aplicacion.FachadaAplicacion fa;
    java.awt.Frame parent;
    
    public VEstadisticas(java.awt.Frame parent, boolean modal,aplicacion.FachadaAplicacion fa) {
        super(parent, modal);
        this.fa=fa;
        this.parent=parent;
        initComponents();
        this.setLocationRelativeTo(null); //Coloca la ventana en el centro de la pantalla
        actualizarDatosLocalidad();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        rbtnLocalidad = new javax.swing.JRadioButton();
        rbtnEdad = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaLocalidades = new javax.swing.JTable();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Estadísticas");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Estadísticas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Noto Serif", 1, 14))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Noto Serif", 1, 14)); // NOI18N
        jLabel1.setText("Agrupar por: ");

        rbtnLocalidad.setFont(new java.awt.Font("Noto Serif", 1, 12)); // NOI18N
        rbtnLocalidad.setSelected(true);
        rbtnLocalidad.setText("Localidad");
        rbtnLocalidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtnLocalidadMouseClicked(evt);
            }
        });

        rbtnEdad.setFont(new java.awt.Font("Noto Serif", 1, 12)); // NOI18N
        rbtnEdad.setText("Edad");
        rbtnEdad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtnEdadMouseClicked(evt);
            }
        });

        tablaLocalidades.setModel(new ModeloTablaLocalidades());
        jScrollPane1.setViewportView(tablaLocalidades);

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(rbtnLocalidad)
                .addGap(41, 41, 41)
                .addComponent(rbtnEdad)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(rbtnLocalidad)
                    .addComponent(rbtnEdad))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbtnEdadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtnEdadMouseClicked
       rbtnEdad.setSelected(true);
       rbtnLocalidad.setSelected(false);
       tablaLocalidades.setVisible(false);
      // tablaEdades.setVisible(false);
    }//GEN-LAST:event_rbtnEdadMouseClicked

    private void rbtnLocalidadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtnLocalidadMouseClicked
       rbtnEdad.setSelected(false);
       rbtnLocalidad.setSelected(true);
       tablaLocalidades.setVisible(true);
      // tablaEdades.setVisible(false);
      actualizarDatosLocalidad();
    }//GEN-LAST:event_rbtnLocalidadMouseClicked

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbtnEdad;
    private javax.swing.JRadioButton rbtnLocalidad;
    private javax.swing.JTable tablaLocalidades;
    // End of variables declaration//GEN-END:variables

    
    public void actualizarDatosLocalidad(){
       rbtnEdad.setSelected(false);
       rbtnLocalidad.setSelected(true);
       ModeloTablaLocalidades mtl;
       mtl=(ModeloTablaLocalidades) tablaLocalidades.getModel();
       java.util.List<String> localidades=new java.util.ArrayList<>();
       localidades=fa.localidades();
       java.util.List<Integer> habitantes=new java.util.ArrayList<>();
       for(String l:localidades){
           habitantes.add(fa.habitantesLocalidad(l));
       }
       java.util.List<Float> puntuaciones=new java.util.ArrayList<>();
        for(String l:localidades){
           puntuaciones.add(fa.puntuacionLocalidad(l));
       }
       mtl.setFilas(localidades, habitantes, puntuaciones);
    }
}
