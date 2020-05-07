package gui;

public class VDios extends javax.swing.JFrame {
    
     aplicacion.FachadaAplicacion fa;
    
    public VDios( aplicacion.FachadaAplicacion fa) {
        this.fa=fa;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        tabbedPanel = new javax.swing.JTabbedPane();
        panelJuicios = new javax.swing.JPanel();
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

        javax.swing.GroupLayout panelJuiciosLayout = new javax.swing.GroupLayout(panelJuicios);
        panelJuicios.setLayout(panelJuiciosLayout);
        panelJuiciosLayout.setHorizontalGroup(
            panelJuiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 698, Short.MAX_VALUE)
        );
        panelJuiciosLayout.setVerticalGroup(
            panelJuiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 476, Short.MAX_VALUE)
        );

        tabbedPanel.addTab("Juicios", panelJuicios);

        javax.swing.GroupLayout panelCieloLayout = new javax.swing.GroupLayout(panelCielo);
        panelCielo.setLayout(panelCieloLayout);
        panelCieloLayout.setHorizontalGroup(
            panelCieloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 698, Short.MAX_VALUE)
        );
        panelCieloLayout.setVerticalGroup(
            panelCieloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 476, Short.MAX_VALUE)
        );

        tabbedPanel.addTab("Cielo", panelCielo);

        javax.swing.GroupLayout panelInfiernoLayout = new javax.swing.GroupLayout(panelInfierno);
        panelInfierno.setLayout(panelInfiernoLayout);
        panelInfiernoLayout.setHorizontalGroup(
            panelInfiernoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 698, Short.MAX_VALUE)
        );
        panelInfiernoLayout.setVerticalGroup(
            panelInfiernoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 476, Short.MAX_VALUE)
        );

        tabbedPanel.addTab("Infierno", panelInfierno);

        javax.swing.GroupLayout panelLimboLayout = new javax.swing.GroupLayout(panelLimbo);
        panelLimbo.setLayout(panelLimboLayout);
        panelLimboLayout.setHorizontalGroup(
            panelLimboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 698, Short.MAX_VALUE)
        );
        panelLimboLayout.setVerticalGroup(
            panelLimboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 476, Short.MAX_VALUE)
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel panelCielo;
    private javax.swing.JPanel panelInfierno;
    private javax.swing.JPanel panelJuicios;
    private javax.swing.JPanel panelLimbo;
    private javax.swing.JTabbedPane tabbedPanel;
    // End of variables declaration//GEN-END:variables
}
