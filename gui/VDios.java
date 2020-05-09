package gui;

import aplicacion.BuenaAccion;
import aplicacion.Pecado;
import aplicacion.Vivo;

public class VDios extends javax.swing.JFrame {
    
     aplicacion.FachadaAplicacion fa;
     
    public VDios( aplicacion.FachadaAplicacion fa) {
        this.fa=fa;
        initComponents();
        this.setLocationRelativeTo(null); //Coloca la ventana en el centro de la pantalla      
        this.inicializarDatos();
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
        btnEstadisticas = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        panelCielo = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaAngeles = new javax.swing.JList<>();
        jLabel7 = new javax.swing.JLabel();
        textoSeleccionadoCielo = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaBA = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        textoTotalBA = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        textoPuntuacionCielo = new javax.swing.JTextField();
        btnAngelizar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        listaUsuariosCielo = new javax.swing.JList<>();
        jLabel19 = new javax.swing.JLabel();
        panelInfierno = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        textoTotalPecados = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        textoPuntuacionInfierno = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        listaUsuariosInfierno = new javax.swing.JList<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablaPecados = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        textoSeleccionadoInfierno = new javax.swing.JTextField();
        btnDemonificar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        listaDemonios = new javax.swing.JList<>();
        panelLimbo = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        listaUsuariosLimbo = new javax.swing.JList<>();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        textoTotalPecadosLimbo = new javax.swing.JTextField();
        textoTotalBALimbo = new javax.swing.JTextField();
        textoPuntuacionLimbo = new javax.swing.JTextField();
        btnEnviarCielo = new javax.swing.JButton();
        btnEnviarInfierno = new javax.swing.JButton();
        btnSalir1 = new javax.swing.JButton();

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
        btnJuzgar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJuzgarActionPerformed(evt);
            }
        });

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnEstadisticas.setText("Consultar Estadísticas");
        btnEstadisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstadisticasActionPerformed(evt);
            }
        });

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
                .addComponent(btnJuzgar)
                .addGap(18, 18, 18)
                .addComponent(btnRegistrar)
                .addGap(18, 18, 18)
                .addComponent(btnEstadisticas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelJuiciosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelJuiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelJuiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panelJuiciosLayout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(textoFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(textoFechaMuerte, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelJuiciosLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textoID, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textoLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(158, 158, 158))
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
                    .addComponent(btnEstadisticas, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnJuzgar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        tabbedPanel.addTab("Juicios", panelJuicios);

        listaAngeles.setModel(new ModeloListaStrings());
        listaAngeles.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(listaAngeles);

        jLabel7.setFont(new java.awt.Font("Noto Serif", 1, 12)); // NOI18N
        jLabel7.setText("Buenas acciones de:");

        tablaBA.setModel(new gui.ModeloTablaBuenasAcciones());
        jScrollPane3.setViewportView(tablaBA);

        jLabel8.setFont(new java.awt.Font("Noto Serif", 1, 12)); // NOI18N
        jLabel8.setText("Total BA:");

        jLabel9.setFont(new java.awt.Font("Noto Serif", 1, 12)); // NOI18N
        jLabel9.setText("Puntuación:");

        textoPuntuacionCielo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoPuntuacionCieloActionPerformed(evt);
            }
        });

        btnAngelizar.setText("Angelizar");

        jButton3.setText("Salir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Noto Serif", 1, 12)); // NOI18N
        jLabel13.setText("Usuarios Vivos");

        listaUsuariosCielo.setModel(new ModeloListaStrings());
        listaUsuariosCielo.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listaUsuariosCielo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaUsuariosCieloMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                listaUsuariosCieloMousePressed(evt);
            }
        });
        jScrollPane7.setViewportView(listaUsuariosCielo);

        jLabel19.setFont(new java.awt.Font("Noto Serif", 1, 12)); // NOI18N
        jLabel19.setText("Ángeles");

        javax.swing.GroupLayout panelCieloLayout = new javax.swing.GroupLayout(panelCielo);
        panelCielo.setLayout(panelCieloLayout);
        panelCieloLayout.setHorizontalGroup(
            panelCieloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCieloLayout.createSequentialGroup()
                .addGroup(panelCieloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelCieloLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(btnAngelizar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 495, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCieloLayout.createSequentialGroup()
                        .addGroup(panelCieloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCieloLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelCieloLayout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(jLabel19)))
                        .addGroup(panelCieloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCieloLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panelCieloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCieloLayout.createSequentialGroup()
                                        .addGroup(panelCieloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel8))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(panelCieloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(textoPuntuacionCielo, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                                            .addComponent(textoTotalBA))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCieloLayout.createSequentialGroup()
                                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(42, 42, 42))))
                            .addGroup(panelCieloLayout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(panelCieloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCieloLayout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textoSeleccionadoCielo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(32, 32, 32))
        );
        panelCieloLayout.setVerticalGroup(
            panelCieloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCieloLayout.createSequentialGroup()
                .addGroup(panelCieloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelCieloLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(panelCieloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(textoSeleccionadoCielo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelCieloLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(panelCieloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelCieloLayout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane7))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelCieloLayout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(8, 8, 8)
                .addGroup(panelCieloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(textoTotalBA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelCieloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(textoPuntuacionCielo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(panelCieloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAngelizar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        tabbedPanel.addTab("Cielo", panelCielo);

        jLabel10.setFont(new java.awt.Font("Noto Serif", 1, 12)); // NOI18N
        jLabel10.setText("Total Pecados:");

        jLabel11.setFont(new java.awt.Font("Noto Serif", 1, 12)); // NOI18N
        jLabel11.setText("Puntuación:");

        textoPuntuacionInfierno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoPuntuacionInfiernoActionPerformed(evt);
            }
        });

        listaUsuariosInfierno.setModel(new ModeloListaStrings());
        listaUsuariosInfierno.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listaUsuariosInfierno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaUsuariosInfiernoMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                listaUsuariosInfiernoMousePressed(evt);
            }
        });
        jScrollPane4.setViewportView(listaUsuariosInfierno);

        tablaPecados.setModel(new gui.ModeloTablaPecados());
        jScrollPane5.setViewportView(tablaPecados);

        jLabel12.setFont(new java.awt.Font("Noto Serif", 1, 12)); // NOI18N
        jLabel12.setText("Pecados de:");

        btnDemonificar.setText("Demonificar");

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Noto Serif", 1, 12)); // NOI18N
        jLabel14.setText("Usuarios Vivos");

        jLabel20.setFont(new java.awt.Font("Noto Serif", 1, 12)); // NOI18N
        jLabel20.setText("Demonios");

        listaDemonios.setModel(new ModeloListaStrings());
        listaDemonios.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane8.setViewportView(listaDemonios);

        javax.swing.GroupLayout panelInfiernoLayout = new javax.swing.GroupLayout(panelInfierno);
        panelInfierno.setLayout(panelInfiernoLayout);
        panelInfiernoLayout.setHorizontalGroup(
            panelInfiernoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInfiernoLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(btnDemonificar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
            .addGroup(panelInfiernoLayout.createSequentialGroup()
                .addGroup(panelInfiernoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelInfiernoLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel20)
                        .addGroup(panelInfiernoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelInfiernoLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                                .addGroup(panelInfiernoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelInfiernoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(textoPuntuacionInfierno)
                                    .addComponent(textoTotalPecados, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28))
                            .addGroup(panelInfiernoLayout.createSequentialGroup()
                                .addGap(139, 139, 139)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInfiernoLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(panelInfiernoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelInfiernoLayout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textoSeleccionadoInfierno, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );
        panelInfiernoLayout.setVerticalGroup(
            panelInfiernoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInfiernoLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(panelInfiernoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelInfiernoLayout.createSequentialGroup()
                        .addGroup(panelInfiernoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panelInfiernoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel12)
                                .addComponent(textoSeleccionadoInfierno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(panelInfiernoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelInfiernoLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelInfiernoLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(panelInfiernoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(29, 29, 29))
                    .addGroup(panelInfiernoLayout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(panelInfiernoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoTotalPecados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelInfiernoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(textoPuntuacionInfierno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(panelInfiernoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDemonificar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        tabbedPanel.addTab("Infierno", panelInfierno);

        listaUsuariosLimbo.setModel(new ModeloListaStrings());
        listaUsuariosLimbo.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listaUsuariosLimbo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaUsuariosLimboMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                listaUsuariosLimboMousePressed(evt);
            }
        });
        jScrollPane6.setViewportView(listaUsuariosLimbo);

        jLabel15.setFont(new java.awt.Font("Noto Serif", 1, 12)); // NOI18N
        jLabel15.setText("Usuarios");

        jLabel16.setFont(new java.awt.Font("Noto Serif", 1, 12)); // NOI18N
        jLabel16.setText("Total Pecados:");

        jLabel17.setFont(new java.awt.Font("Noto Serif", 1, 12)); // NOI18N
        jLabel17.setText("Total Buenas Acciones:");

        jLabel18.setFont(new java.awt.Font("Noto Serif", 1, 12)); // NOI18N
        jLabel18.setText("Puntuación:");

        btnEnviarCielo.setText("Enviar al Cielo");
        btnEnviarCielo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarCieloActionPerformed(evt);
            }
        });

        btnEnviarInfierno.setText("Enviar al Infierno");
        btnEnviarInfierno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarInfiernoActionPerformed(evt);
            }
        });

        btnSalir1.setText("Salir");
        btnSalir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalir1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLimboLayout = new javax.swing.GroupLayout(panelLimbo);
        panelLimbo.setLayout(panelLimboLayout);
        panelLimboLayout.setHorizontalGroup(
            panelLimboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLimboLayout.createSequentialGroup()
                .addGroup(panelLimboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLimboLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(panelLimboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLimboLayout.createSequentialGroup()
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(77, 77, 77)
                                .addGroup(panelLimboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel18))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelLimboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textoTotalPecadosLimbo)
                                    .addComponent(textoTotalBALimbo)
                                    .addComponent(textoPuntuacionLimbo, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)))
                            .addGroup(panelLimboLayout.createSequentialGroup()
                                .addComponent(btnEnviarCielo, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(btnEnviarInfierno, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSalir1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelLimboLayout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jLabel15)))
                .addGap(22, 22, 22))
        );
        panelLimboLayout.setVerticalGroup(
            panelLimboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLimboLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                .addGap(77, 77, 77)
                .addGroup(panelLimboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEnviarCielo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEnviarInfierno, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53))
            .addGroup(panelLimboLayout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(panelLimboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelLimboLayout.createSequentialGroup()
                        .addGroup(panelLimboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(textoTotalPecadosLimbo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addComponent(jLabel17))
                    .addComponent(textoTotalBALimbo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(panelLimboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(textoPuntuacionLimbo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            .addComponent(tabbedPanel, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        fa.muestraVRegistrar(this, true);
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tablaJuiciosPendientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaJuiciosPendientesMouseClicked
       actualizarDatosJuiciosPendientes();
    }//GEN-LAST:event_tablaJuiciosPendientesMouseClicked

    private void textoPuntuacionCieloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoPuntuacionCieloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoPuntuacionCieloActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void textoPuntuacionInfiernoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoPuntuacionInfiernoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoPuntuacionInfiernoActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnEnviarInfiernoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarInfiernoActionPerformed
        ModeloListaStrings mlstUsuariosLimbo;
        mlstUsuariosLimbo=(ModeloListaStrings) listaUsuariosLimbo.getModel();
        mlstUsuariosLimbo.setElementos(fa.listaStringVivosLimbo());
        if(mlstUsuariosLimbo.getSize()>0){
            java.util.List<Vivo> vivosLimbo;
            vivosLimbo=fa.listaVivosLimbo();
           // fa.enviarAlInfierno(vivosLimbo.get(listaUsuariosLimbo.getSelectedIndex()).getIdUsuario());
        }
    }//GEN-LAST:event_btnEnviarInfiernoActionPerformed

    private void btnSalir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalir1ActionPerformed
         System.exit(0);
    }//GEN-LAST:event_btnSalir1ActionPerformed

    private void btnJuzgarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJuzgarActionPerformed
        ModeloTablaJuiciosPendientes mjp;
        mjp=(ModeloTablaJuiciosPendientes) tablaJuiciosPendientes.getModel();
        if(mjp.getRowCount()>0){ //Si hemos seleccionado un usuario para juzgar, se abre la ventana de Juicio Final
            fa.muestraVJuzgar(this,true,mjp.getRow(tablaJuiciosPendientes.getSelectedRow()));
        }
    }//GEN-LAST:event_btnJuzgarActionPerformed

    private void listaUsuariosCieloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaUsuariosCieloMouseClicked
        actualizarDatosCielo();
    }//GEN-LAST:event_listaUsuariosCieloMouseClicked

    private void listaUsuariosCieloMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaUsuariosCieloMousePressed
        actualizarDatosCielo();
    }//GEN-LAST:event_listaUsuariosCieloMousePressed

    private void btnEstadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstadisticasActionPerformed
        fa.muestraVEstadisticas(this,true);
    }//GEN-LAST:event_btnEstadisticasActionPerformed

    private void listaUsuariosInfiernoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaUsuariosInfiernoMouseClicked
       actualizarDatosInfierno();
    }//GEN-LAST:event_listaUsuariosInfiernoMouseClicked

    private void listaUsuariosInfiernoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaUsuariosInfiernoMousePressed
        actualizarDatosInfierno();
    }//GEN-LAST:event_listaUsuariosInfiernoMousePressed

    private void listaUsuariosLimboMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaUsuariosLimboMouseClicked
       actualizarDatosLimbo();
    }//GEN-LAST:event_listaUsuariosLimboMouseClicked

    private void listaUsuariosLimboMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaUsuariosLimboMousePressed
         actualizarDatosLimbo();
    }//GEN-LAST:event_listaUsuariosLimboMousePressed

    private void btnEnviarCieloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarCieloActionPerformed
        ModeloListaStrings mlstUsuariosLimbo;
        mlstUsuariosLimbo=(ModeloListaStrings) listaUsuariosLimbo.getModel();
        mlstUsuariosLimbo.setElementos(fa.listaStringVivosLimbo());
        if(mlstUsuariosLimbo.getSize()>0){
        java.util.List<Vivo> vivosLimbo;
        vivosLimbo=fa.listaVivosLimbo();
       // fa.enviarAlCielo(vivosLimbo.get(listaUsuariosLimbo.getSelectedIndex()).getIdUsuario());
        }
    }//GEN-LAST:event_btnEnviarCieloActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAngelizar;
    private javax.swing.JButton btnDemonificar;
    private javax.swing.JButton btnEnviarCielo;
    private javax.swing.JButton btnEnviarInfierno;
    private javax.swing.JButton btnEstadisticas;
    private javax.swing.JButton btnJuzgar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSalir1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JList<String> listaAngeles;
    private javax.swing.JList<String> listaDemonios;
    private javax.swing.JList<String> listaUsuariosCielo;
    private javax.swing.JList<String> listaUsuariosInfierno;
    private javax.swing.JList<String> listaUsuariosLimbo;
    private javax.swing.JPanel panelCielo;
    private javax.swing.JPanel panelInfierno;
    private javax.swing.JPanel panelJuicios;
    private javax.swing.JPanel panelLimbo;
    private javax.swing.JTabbedPane tabbedPanel;
    private javax.swing.JTable tablaBA;
    private javax.swing.JTable tablaJuiciosPendientes;
    private javax.swing.JTable tablaPecados;
    private javax.swing.JTextField textoFechaMuerte;
    private javax.swing.JTextField textoFechaNacimiento;
    private javax.swing.JTextField textoID;
    private javax.swing.JTextField textoLocalidad;
    private javax.swing.JTextField textoNombre;
    private javax.swing.JTextField textoPuntuacionCielo;
    private javax.swing.JTextField textoPuntuacionInfierno;
    private javax.swing.JTextField textoPuntuacionLimbo;
    private javax.swing.JTextField textoSeleccionadoCielo;
    private javax.swing.JTextField textoSeleccionadoInfierno;
    private javax.swing.JTextField textoTotalBA;
    private javax.swing.JTextField textoTotalBALimbo;
    private javax.swing.JTextField textoTotalPecados;
    private javax.swing.JTextField textoTotalPecadosLimbo;
    // End of variables declaration//GEN-END:variables
    
    public void inicializarDatos(){
        //PESTAÑA JUICIOS
        ModeloTablaJuiciosPendientes mjp;
        mjp=(ModeloTablaJuiciosPendientes) tablaJuiciosPendientes.getModel();
        mjp.setFilas(fa.juiciosPendientes());
        //Se selecciona el primer elemento de la tabla
        if(mjp.getRowCount()!=0) tablaJuiciosPendientes.setRowSelectionInterval(0, 0); 
        if(tablaJuiciosPendientes.getSelectedRow()!=-1){
            Vivo user=mjp.getRow(tablaJuiciosPendientes.getSelectedRow());
        textoNombre.setText(user.getNombre());
        textoID.setText(user.getNombreUsuario());
        textoLocalidad.setText(user.getLocalidad());
        textoFechaNacimiento.setText(String.valueOf(user.getFechaNacimiento()));
        textoFechaMuerte.setText(String.valueOf(user.getFechaMuerte()));
        }else{
            textoNombre.setText(" ");
            textoID.setText(" ");
            textoLocalidad.setText(" ");
            textoFechaNacimiento.setText(" ");
            textoFechaMuerte.setText(" ");
        }
        
        //PESTAÑA CIELO
        ModeloListaStrings mlstAngeles;
        ModeloTablaBuenasAcciones mtBA;
        mlstAngeles=(ModeloListaStrings) listaAngeles.getModel();
        mtBA=(ModeloTablaBuenasAcciones) tablaBA.getModel();
        mlstAngeles.setElementos(fa.listaStringAngelesCielo());
        ModeloListaStrings mlstUsuariosCielo;
        mlstUsuariosCielo=(ModeloListaStrings) listaUsuariosCielo.getModel();
        mlstUsuariosCielo.setElementos(fa.listaStringVivosCielo());
        if(mlstUsuariosCielo.getElementos().size()>0){
            listaUsuariosCielo.setSelectedIndex(0);
        }
        if(listaUsuariosCielo.getSelectedIndex()!=-1){
            textoSeleccionadoCielo.setText(listaUsuariosCielo.getModel().getElementAt(0));
            java.util.List<Vivo> vivosCielo;
            vivosCielo=fa.listaVivosCielo();
            java.util.List<BuenaAccion> listaBA=fa.listaBuenasAcciones(vivosCielo.get(0).getIdUsuario());
            if(listaBA.size()>0){
                mtBA=(ModeloTablaBuenasAcciones) tablaBA.getModel();
                mtBA.setFilas(listaBA);
            }
            if(mtBA.getRowCount()>0){ //Comprobamos que tenga buenas acciones
                textoTotalBA.setText(String.valueOf(mtBA.getRowCount()));
                textoPuntuacionCielo.setText(String.valueOf(vivosCielo.get(listaUsuariosCielo.getSelectedIndex()).getPuntuacion()));
            }else{
                textoTotalBA.setText(String.valueOf(0));
                textoPuntuacionCielo.setText(String.valueOf(0));
            }
        }
        
        //PESTAÑA INFIERNO
        ModeloListaStrings mlstDemonios;
        ModeloTablaPecados mtp;
        mlstDemonios=(ModeloListaStrings) listaDemonios.getModel();
        mlstDemonios.setElementos(fa.listaStringDemoniosInfierno());
        ModeloListaStrings mlstUsuariosInfierno;
        mlstUsuariosInfierno=(ModeloListaStrings) listaUsuariosInfierno.getModel();
        mlstUsuariosInfierno.setElementos(fa.listaStringVivosInfierno());
        if(mlstUsuariosInfierno.getElementos().size()>0){
            listaUsuariosInfierno.setSelectedIndex(0);
        }
        if(listaUsuariosInfierno.getSelectedIndex()!=-1){
            textoSeleccionadoInfierno.setText(listaUsuariosInfierno.getSelectedValue());
            mtp=(ModeloTablaPecados) tablaPecados.getModel();
            mtp.setFilas(fa.listaVivosInfierno().get(listaUsuariosInfierno.getSelectedIndex()).getPecados());
            
            java.util.List<Vivo> vivosInfierno;
            vivosInfierno=fa.listaVivosInfierno();
            java.util.List<Pecado> listaPecados=fa.listaPecados(vivosInfierno.get(0).getIdUsuario());
            if(listaPecados.size()>0){
                mtp=(ModeloTablaPecados) tablaPecados.getModel();
                mtp.setFilas(listaPecados);
             mtp=(ModeloTablaPecados) tablaPecados.getModel();
             mtp.setFilas(vivosInfierno.get(0).getPecados());
            }
            if(mtp.getRowCount()>0){ //Comprobamos que tenga buenas acciones
                textoTotalPecados.setText(String.valueOf(mtp.getRowCount()));
                textoPuntuacionInfierno.setText(String.valueOf(vivosInfierno.get(listaUsuariosInfierno.getSelectedIndex()).getPuntuacion()));
            }else{
                textoTotalPecados.setText(String.valueOf(0));
                textoPuntuacionInfierno.setText(String.valueOf(0));
            }
        }
        
        //PESTAÑA LIMBO
        ModeloListaStrings mlstUsuariosLimbo;
        mlstUsuariosLimbo=(ModeloListaStrings) listaUsuariosLimbo.getModel();
        mlstUsuariosLimbo.setElementos(fa.listaStringVivosLimbo());
        if(mlstUsuariosLimbo.getSize()>0){
            listaUsuariosLimbo.setSelectedIndex(0);
        }
        if(listaUsuariosLimbo.getSelectedIndex()!=-1){
        java.util.List<Vivo> vivosLimbo;
        vivosLimbo=fa.listaVivosLimbo();
        textoTotalPecadosLimbo.setText(String.valueOf(
                fa.listaPecados(vivosLimbo.get(listaUsuariosLimbo.getSelectedIndex()).getIdUsuario()).size()));
        textoTotalBALimbo.setText(String.valueOf(
                fa.listaBuenasAcciones(vivosLimbo.get(listaUsuariosLimbo.getSelectedIndex()).getIdUsuario()).size()));
        textoPuntuacionLimbo.setText(String.valueOf(vivosLimbo.get(listaUsuariosLimbo.getSelectedIndex()).getPuntuacion()));
        }else{
            textoTotalPecadosLimbo.setText(String.valueOf(0));
            textoTotalBALimbo.setText(String.valueOf(0));
            textoPuntuacionLimbo.setText(String.valueOf(0));
        }
        
    }
    
    public void actualizarDatosJuiciosPendientes(){
        //PESTAÑA JUICIOS
        ModeloTablaJuiciosPendientes mjp;
        mjp=(ModeloTablaJuiciosPendientes) tablaJuiciosPendientes.getModel();
        //Se selecciona el primer elemento de la tabla
        if(tablaJuiciosPendientes.getSelectedRow()!=-1){
            Vivo user=mjp.getRow(tablaJuiciosPendientes.getSelectedRow());
        textoNombre.setText(user.getNombre());
        textoID.setText(user.getNombreUsuario());
        textoLocalidad.setText(user.getLocalidad());
        textoFechaNacimiento.setText(String.valueOf(user.getFechaNacimiento()));
        textoFechaMuerte.setText(String.valueOf(user.getFechaMuerte()));
        }else{
            textoNombre.setText(" ");
            textoID.setText(" ");
            textoLocalidad.setText(" ");
            textoFechaNacimiento.setText(" ");
            textoFechaMuerte.setText(" ");
        }
    }
    
    public void actualizarDatosCielo(){
        //PESTAÑA CIELO
        ModeloListaStrings mlstUsuariosCielo;
        mlstUsuariosCielo=(ModeloListaStrings) listaUsuariosCielo.getModel();
        if(listaUsuariosCielo.getSelectedIndex()!=-1){
            textoSeleccionadoCielo.setText(mlstUsuariosCielo.getElementAt(listaUsuariosCielo.getSelectedIndex()));
            ModeloTablaBuenasAcciones mtBA;
            mtBA=(ModeloTablaBuenasAcciones) tablaBA.getModel();
            java.util.List<Vivo> vivosCielo;
            vivosCielo=fa.listaVivosCielo();
            java.util.List<BuenaAccion> listaBA=fa.listaBuenasAcciones(vivosCielo.get(0).getIdUsuario());
            if(listaBA.size()>0){
                mtBA=(ModeloTablaBuenasAcciones) tablaBA.getModel();
                mtBA.setFilas(listaBA);
            }
            if(mtBA.getRowCount()>0){ //Comprobamos que tenga buenas acciones
                textoTotalBA.setText(String.valueOf(mtBA.getRowCount()));
                textoPuntuacionCielo.setText(String.valueOf(vivosCielo.get(listaUsuariosCielo.getSelectedIndex()).getPuntuacion()));
            }else{
                textoTotalBA.setText(String.valueOf(0));
                textoPuntuacionCielo.setText(String.valueOf(0));
            }
        }
    }
    
    public void actualizarDatosInfierno(){
        //PESTAÑA Infierno
        ModeloListaStrings mlstUsuariosInfierno;
        mlstUsuariosInfierno=(ModeloListaStrings) listaUsuariosInfierno.getModel();
        if(listaUsuariosInfierno.getSelectedIndex()!=-1){
            textoSeleccionadoInfierno.setText(mlstUsuariosInfierno.getElementAt(listaUsuariosInfierno.getSelectedIndex()));
            ModeloTablaPecados mtp;
            mtp=(ModeloTablaPecados) tablaPecados.getModel();
            java.util.List<Vivo> vivosInfierno;
            vivosInfierno=fa.listaVivosInfierno();
            java.util.List<Pecado> listap=fa.listaPecados(vivosInfierno.get(listaUsuariosInfierno.getSelectedIndex()).getIdUsuario());
            if(listap.size()>0){
                mtp=(ModeloTablaPecados) tablaPecados.getModel();
                mtp.setFilas(listap);
            }
            if(mtp.getRowCount()>0){ //Comprobamos que tenga Pecados
                textoTotalPecados.setText(String.valueOf(mtp.getRowCount()));
                textoPuntuacionInfierno.setText(String.valueOf(vivosInfierno.get(listaUsuariosInfierno.getSelectedIndex()).getPuntuacion()));
            }else{
                textoTotalPecados.setText(String.valueOf(0));
                textoPuntuacionInfierno.setText(String.valueOf(0));
            }
        }
    }
    
    
    public void actualizarDatosLimbo(){
    ModeloListaStrings mlstUsuariosLimbo;
        mlstUsuariosLimbo=(ModeloListaStrings) listaUsuariosLimbo.getModel();
        mlstUsuariosLimbo.setElementos(fa.listaStringVivosLimbo());
        if(listaUsuariosLimbo.getSelectedIndex()!=-1){
        java.util.List<Vivo> vivosLimbo;
        vivosLimbo=fa.listaVivosLimbo();
        textoTotalPecadosLimbo.setText(String.valueOf(
                fa.listaPecados(vivosLimbo.get(listaUsuariosLimbo.getSelectedIndex()).getIdUsuario()).size()));
        textoTotalBALimbo.setText(String.valueOf(
                fa.listaBuenasAcciones(vivosLimbo.get(listaUsuariosLimbo.getSelectedIndex()).getIdUsuario()).size()));
        textoPuntuacionLimbo.setText(String.valueOf(vivosLimbo.get(listaUsuariosLimbo.getSelectedIndex()).getPuntuacion()));
        }else{
            textoTotalPecadosLimbo.setText(String.valueOf(0));
            textoTotalBALimbo.setText(String.valueOf(0));
            textoPuntuacionLimbo.setText(String.valueOf(0));
        }
        
    }
    
    
}
