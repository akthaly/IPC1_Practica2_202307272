package practica;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Aleja
 */
public class InterfazRecorrido extends javax.swing.JFrame {

    /**
     * Creates new form InterfazRecorrido
     */
    public JLabel lblCarro = new JLabel();
    public JLabel lblCarro1 = new JLabel();
    public JLabel lblCarro2 = new JLabel();
    public JLabel lblMoto = new JLabel();
    public JLabel lblMoto1 = new JLabel();
    public JLabel lblMoto2 = new JLabel();
    public JLabel lblCarroPremium = new JLabel();
    public JLabel lblCarroPremium1 = new JLabel();
    public JLabel lblCarroPremium2 = new JLabel();

    public InterfazRecorrido() {
        initComponents();
        establecerTextos();
        establecerImagenes1();
        establecerImagenes2();
        establecerImagenes3();

    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botonEnviar1 = new javax.swing.JButton();
        botonEnviar2 = new javax.swing.JButton();
        botonEnviar3 = new javax.swing.JButton();
        botonEnviarTodos = new javax.swing.JButton();
        lblParar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        botonRegresar = new javax.swing.JButton();
        botonRegresar1 = new javax.swing.JButton();
        botonRegresar2 = new javax.swing.JButton();
        botonRegresar3 = new javax.swing.JButton();
        lblPararRegreso = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botonEnviar1.setText("Enviar");
        botonEnviar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEnviar1ActionPerformed(evt);
            }
        });

        botonEnviar2.setText("Enviar");
        botonEnviar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEnviar2ActionPerformed(evt);
            }
        });

        botonEnviar3.setText("Enviar");
        botonEnviar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEnviar3ActionPerformed(evt);
            }
        });

        botonEnviarTodos.setText("Enviar");
        botonEnviarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEnviarTodosActionPerformed(evt);
            }
        });

        lblParar.setOpaque(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 944, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        jPanel7.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 938, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        botonRegresar.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        botonRegresar.setText("Regresar");
        botonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresarActionPerformed(evt);
            }
        });

        botonRegresar1.setText("Regresar");
        botonRegresar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresar1ActionPerformed(evt);
            }
        });

        botonRegresar2.setText("Regresar");
        botonRegresar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresar2ActionPerformed(evt);
            }
        });

        botonRegresar3.setText("Regresar");
        botonRegresar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresar3ActionPerformed(evt);
            }
        });

        lblPararRegreso.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(botonEnviar1)
                    .addComponent(botonEnviar2)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9)
                    .addComponent(jLabel2)
                    .addComponent(botonEnviar3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPararRegreso, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(botonRegresar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(botonRegresar2)
                                        .addGap(60, 60, 60)
                                        .addComponent(jLabel11))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(botonRegresar3)
                                        .addGap(161, 161, 161))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonRegresar1)
                        .addGap(18, 18, 18)
                        .addComponent(botonEnviarTodos)
                        .addGap(67, 67, 67)))
                .addGap(27, 27, 27)
                .addComponent(lblParar, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(lblParar, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonEnviarTodos)
                    .addComponent(botonRegresar1))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botonEnviar1)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(botonRegresar2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(2, 2, 2)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonEnviar2)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(botonRegresar3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonEnviar3)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblPararRegreso, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarActionPerformed
        GenerarViaje volver = new GenerarViaje();
        volver.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonRegresarActionPerformed

    private void botonEnviarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEnviarTodosActionPerformed

        CarroEstandar carroEstandar1 = new CarroEstandar(this, lblCarro, lblCarro.getX(), String.valueOf(GenerarViaje.distancia1));
        Moto moto1 = new Moto(this, lblMoto, lblMoto.getX(), String.valueOf(GenerarViaje.distancia1));
        CarroPremium carroPremium1 = new CarroPremium(this, lblCarroPremium, lblCarroPremium.getX(), String.valueOf(GenerarViaje.distancia1));

        carroEstandar1.start();
        moto1.start();
        carroPremium1.start();

        CarroEstandar carroEstandar2 = new CarroEstandar(this, lblCarro1, lblCarro1.getX(), String.valueOf(GenerarViaje.distancia2));
        Moto moto2 = new Moto(this, lblMoto1, lblMoto1.getX(), String.valueOf(GenerarViaje.distancia2));
        CarroPremium carroPremium2 = new CarroPremium(this, lblCarroPremium1, lblCarroPremium1.getX(), String.valueOf(GenerarViaje.distancia2));

        carroEstandar2.start();
        moto2.start();
        carroPremium2.start();

        CarroEstandar carroEstandar3 = new CarroEstandar(this, lblCarro2, lblCarro2.getX(), String.valueOf(GenerarViaje.distancia3));
        Moto moto3 = new Moto(this, lblMoto2, lblMoto2.getX(), String.valueOf(GenerarViaje.distancia3));
        CarroPremium carroPremium3 = new CarroPremium(this, lblCarroPremium2, lblCarroPremium2.getX(), String.valueOf(GenerarViaje.distancia3));

        carroEstandar3.start();
        moto3.start();
        carroPremium3.start();
    }//GEN-LAST:event_botonEnviarTodosActionPerformed

    private void botonEnviar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEnviar3ActionPerformed
        if (jLabel7.getText().equals("Carro Estándar 1")) {
            CarroEstandar estandar1 = new CarroEstandar(this, lblCarro2, lblCarro2.getX(), String.valueOf(GenerarViaje.distancia3));
            estandar1.start();
        } else if (jLabel7.getText().equals("Carro Estándar 2")) {
            CarroEstandar estandar1 = new CarroEstandar(this, lblCarro2, lblCarro2.getX(), String.valueOf(GenerarViaje.distancia3));
            estandar1.start();
        } else if (jLabel7.getText().equals("Carro Estándar 3")) {
            CarroEstandar estandar1 = new CarroEstandar(this, lblCarro2, lblCarro2.getX(), String.valueOf(GenerarViaje.distancia3));
            estandar1.start();
        } else if (jLabel7.getText().equals("Motocicleta 1")) {
            Moto moto1 = new Moto(this, lblMoto2, lblMoto2.getX(), String.valueOf(GenerarViaje.distancia3));
            moto1.start();
        } else if (jLabel7.getText().equals("Motocicleta 2")) {
            Moto moto2 = new Moto(this, lblMoto2, lblMoto2.getX(), String.valueOf(GenerarViaje.distancia3));
            moto2.start();
        } else if (jLabel7.getText().equals("Motocicleta 3")) {
            Moto moto3 = new Moto(this, lblMoto2, lblMoto2.getX(), String.valueOf(GenerarViaje.distancia3));
            moto3.start();
        } else if (jLabel7.getText().equals("Carro Premium 1")) {
            CarroPremium premium1 = new CarroPremium(this, lblCarroPremium2, lblCarroPremium2.getX(), String.valueOf(GenerarViaje.distancia3));
            premium1.start();
        } else if (jLabel7.getText().equals("Carro Premium 2")) {
            CarroPremium premium2 = new CarroPremium(this, lblCarroPremium2, lblCarroPremium2.getX(), String.valueOf(GenerarViaje.distancia3));
            premium2.start();
        } else if (jLabel7.getText().equals("Carro Premium 3")) {
            CarroPremium premium3 = new CarroPremium(this, lblCarroPremium2, lblCarroPremium2.getX(), String.valueOf(GenerarViaje.distancia3));
            premium3.start();
        }
    }//GEN-LAST:event_botonEnviar3ActionPerformed

    private void botonEnviar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEnviar2ActionPerformed
        if (jLabel4.getText().equals("Carro Estándar 1")) {
            CarroEstandar estandar1 = new CarroEstandar(this, lblCarro1, lblCarro1.getX(), String.valueOf(GenerarViaje.distancia2));
            estandar1.start();
        } else if (jLabel4.getText().equals("Carro Estándar 2")) {
            CarroEstandar estandar1 = new CarroEstandar(this, lblCarro1, lblCarro1.getX(), String.valueOf(GenerarViaje.distancia2));
            estandar1.start();
        } else if (jLabel4.getText().equals("Carro Estándar 3")) {
            CarroEstandar estandar1 = new CarroEstandar(this, lblCarro1, lblCarro1.getX(), String.valueOf(GenerarViaje.distancia2));
            estandar1.start();
        } else if (jLabel4.getText().equals("Motocicleta 1")) {
            Moto moto1 = new Moto(this, lblMoto1, lblMoto1.getX(), String.valueOf(GenerarViaje.distancia2));
            moto1.start();
        } else if (jLabel4.getText().equals("Motocicleta 2")) {
            Moto moto2 = new Moto(this, lblMoto1, lblMoto1.getX(), String.valueOf(GenerarViaje.distancia2));
            moto2.start();
        } else if (jLabel4.getText().equals("Motocicleta 3")) {
            Moto moto3 = new Moto(this, lblMoto1, lblMoto1.getX(), String.valueOf(GenerarViaje.distancia2));
            moto3.start();
        } else if (jLabel4.getText().equals("Carro Premium 1")) {
            CarroPremium premium1 = new CarroPremium(this, lblCarroPremium1, lblCarroPremium1.getX(), String.valueOf(GenerarViaje.distancia2));
            premium1.start();
        } else if (jLabel4.getText().equals("Carro Premium 2")) {
            CarroPremium premium2 = new CarroPremium(this, lblCarroPremium1, lblCarroPremium1.getX(), String.valueOf(GenerarViaje.distancia2));
            premium2.start();
        } else if (jLabel4.getText().equals("Carro Premium 3")) {
            CarroPremium premium3 = new CarroPremium(this, lblCarroPremium1, lblCarroPremium1.getX(), String.valueOf(GenerarViaje.distancia2));
            premium3.start();
        }
    }//GEN-LAST:event_botonEnviar2ActionPerformed

    private void botonEnviar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEnviar1ActionPerformed
        if (jLabel1.getText().equals("Carro Estándar 1")) {
            CarroEstandar estandar1 = new CarroEstandar(this, lblCarro, lblCarro.getX(), String.valueOf(GenerarViaje.distancia1));
            estandar1.start();
        } else if (jLabel1.getText().equals("Carro Estándar 2")) {
            CarroEstandar estandar2 = new CarroEstandar(this, lblCarro, lblCarro.getX(), String.valueOf(GenerarViaje.distancia1));
            estandar2.start();
        } else if (jLabel1.getText().equals("Carro Estándar 3")) {
            CarroEstandar estandar3 = new CarroEstandar(this, lblCarro, lblCarro.getX(), String.valueOf(GenerarViaje.distancia1));
            estandar3.start();
        } else if (jLabel1.getText().equals("Motocicleta 1")) {
            Moto moto1 = new Moto(this, lblMoto, lblMoto.getX(), String.valueOf(GenerarViaje.distancia1));
            moto1.start();
        } else if (jLabel1.getText().equals("Motocicleta 2")) {
            Moto moto2 = new Moto(this, lblMoto, lblMoto.getX(), String.valueOf(GenerarViaje.distancia1));
            moto2.start();
        } else if (jLabel1.getText().equals("Motocicleta 3")) {
            Moto moto3 = new Moto(this, lblMoto, lblMoto.getX(), String.valueOf(GenerarViaje.distancia1));
            moto3.start();
        } else if (jLabel1.getText().equals("Carro Premium 1")) {
            CarroPremium premium1 = new CarroPremium(this, lblCarroPremium, lblCarroPremium.getX(), String.valueOf(GenerarViaje.distancia1));
            premium1.start();
        } else if (jLabel1.getText().equals("Carro Premium 2")) {
            CarroPremium premium2 = new CarroPremium(this, lblCarroPremium, lblCarroPremium.getX(), String.valueOf(GenerarViaje.distancia1));
            premium2.start();
        } else if (jLabel1.getText().equals("Carro Premium 3")) {
            CarroPremium premium3 = new CarroPremium(this, lblCarroPremium, lblCarroPremium.getX(), String.valueOf(GenerarViaje.distancia1));
            premium3.start();
        }
    }//GEN-LAST:event_botonEnviar1ActionPerformed

    private void botonRegresar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresar1ActionPerformed
        if (jLabel1.getText().equals("Carro Estándar 1")) {
            CarroEstandarRegresar estandar1 = new CarroEstandarRegresar(this, lblCarro, lblCarro.getX());
            estandar1.start();
        } else if (jLabel1.getText().equals("Carro Estándar 2")) {
            CarroEstandarRegresar estandar2 = new CarroEstandarRegresar(this, lblCarro, lblCarro.getX());
            estandar2.start();
        } else if (jLabel1.getText().equals("Carro Estándar 3")) {
            CarroEstandarRegresar estandar3 = new CarroEstandarRegresar(this, lblCarro, lblCarro.getX());
            estandar3.start();
        } else if (jLabel1.getText().equals("Motocicleta 1")) {
            MotoRegresar moto1 = new MotoRegresar(this, lblMoto, lblMoto.getX());
            moto1.start();
        } else if (jLabel1.getText().equals("Motocicleta 2")) {
            MotoRegresar moto2 = new MotoRegresar(this, lblMoto, lblMoto.getX());
            moto2.start();
        } else if (jLabel1.getText().equals("Motocicleta 3")) {
            MotoRegresar moto3 = new MotoRegresar(this, lblMoto, lblMoto.getX());
            moto3.start();
        } else if (jLabel1.getText().equals("Carro Premium 1")) {
            CarroPremiumRegresar premium1 = new CarroPremiumRegresar(this, lblCarroPremium, lblCarroPremium.getX());
            premium1.start();
        } else if (jLabel1.getText().equals("Carro Premium 2")) {
            CarroPremiumRegresar premium2 = new CarroPremiumRegresar(this, lblCarroPremium, lblCarroPremium.getX());
            premium2.start();
        } else if (jLabel1.getText().equals("Carro Premium 3")) {
            CarroPremiumRegresar premium3 = new CarroPremiumRegresar(this, lblCarroPremium, lblCarroPremium.getX());
            premium3.start();
        }
    }//GEN-LAST:event_botonRegresar1ActionPerformed

    private void botonRegresar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresar2ActionPerformed
        if (jLabel4.getText().equals("Carro Estándar 1")) {
            CarroEstandarRegresar estandar1 = new CarroEstandarRegresar(this, lblCarro1, lblCarro1.getX());
            estandar1.start();
        } else if (jLabel4.getText().equals("Carro Estándar 2")) {
            CarroEstandarRegresar estandar1 = new CarroEstandarRegresar(this, lblCarro1, lblCarro1.getX());
            estandar1.start();
        } else if (jLabel4.getText().equals("Carro Estándar 3")) {
            CarroEstandarRegresar estandar1 = new CarroEstandarRegresar(this, lblCarro1, lblCarro1.getX());
            estandar1.start();
        } else if (jLabel4.getText().equals("Motocicleta 1")) {
            MotoRegresar moto1 = new MotoRegresar(this, lblMoto1, lblMoto1.getX());
            moto1.start();
        } else if (jLabel4.getText().equals("Motocicleta 2")) {
            MotoRegresar moto2 = new MotoRegresar(this, lblMoto1, lblMoto1.getX());
            moto2.start();
        } else if (jLabel4.getText().equals("Motocicleta 3")) {
            MotoRegresar moto3 = new MotoRegresar(this, lblMoto1, lblMoto1.getX());
            moto3.start();
        } else if (jLabel4.getText().equals("Carro Premium 1")) {
            CarroPremiumRegresar premium1 = new CarroPremiumRegresar(this, lblCarroPremium1, lblCarroPremium1.getX());
            premium1.start();
        } else if (jLabel4.getText().equals("Carro Premium 2")) {
            CarroPremiumRegresar premium2 = new CarroPremiumRegresar(this, lblCarroPremium1, lblCarroPremium1.getX());
            premium2.start();
        } else if (jLabel4.getText().equals("Carro Premium 3")) {
            CarroPremiumRegresar premium3 = new CarroPremiumRegresar(this, lblCarroPremium1, lblCarroPremium1.getX());
            premium3.start();
        }
    }//GEN-LAST:event_botonRegresar2ActionPerformed

    private void botonRegresar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresar3ActionPerformed
        if (jLabel7.getText().equals("Carro Estándar 1")) {
            CarroEstandarRegresar estandar1 = new CarroEstandarRegresar(this, lblCarro2, lblCarro2.getX());
            estandar1.start();
        } else if (jLabel7.getText().equals("Carro Estándar 2")) {
            CarroEstandarRegresar estandar1 = new CarroEstandarRegresar(this, lblCarro2, lblCarro2.getX());
            estandar1.start();
        } else if (jLabel7.getText().equals("Carro Estándar 3")) {
            CarroEstandarRegresar estandar1 = new CarroEstandarRegresar(this, lblCarro2, lblCarro2.getX());
            estandar1.start();
        } else if (jLabel7.getText().equals("Motocicleta 1")) {
            MotoRegresar moto1 = new MotoRegresar(this, lblMoto2, lblMoto2.getX());
            moto1.start();
        } else if (jLabel7.getText().equals("Motocicleta 2")) {
            MotoRegresar moto2 = new MotoRegresar(this, lblMoto2, lblMoto2.getX());
            moto2.start();
        } else if (jLabel7.getText().equals("Motocicleta 3")) {
            MotoRegresar moto3 = new MotoRegresar(this, lblMoto2, lblMoto2.getX());
            moto3.start();
        } else if (jLabel7.getText().equals("Carro Premium 1")) {
            CarroPremiumRegresar premium1 = new CarroPremiumRegresar(this, lblCarroPremium2, lblCarroPremium2.getX());
            premium1.start();
        } else if (jLabel7.getText().equals("Carro Premium 2")) {
            CarroPremiumRegresar premium2 = new CarroPremiumRegresar(this, lblCarroPremium2, lblCarroPremium2.getX());
            premium2.start();
        } else if (jLabel7.getText().equals("Carro Premium 3")) {
            CarroPremiumRegresar premium3 = new CarroPremiumRegresar(this, lblCarroPremium2, lblCarroPremium2.getX());
            premium3.start();
        }
    }//GEN-LAST:event_botonRegresar3ActionPerformed

    public void establecerTextos() {
        jLabel1.setText(GenerarViaje.vehiculo1);
        jLabel2.setText("Distancia: " + String.valueOf(GenerarViaje.distancia1) + " KM");
        jLabel3.setText("Inicio: " + GenerarViaje.inicio1);
        jLabel10.setText("Destino: " + GenerarViaje.fin1);
        if (GenerarViaje.vehiculo2 != null && GenerarViaje.distancia2 > 0 && GenerarViaje.fin2 != null && GenerarViaje.inicio2 != null) {
            jLabel4.setText(GenerarViaje.vehiculo2);
            jLabel5.setText("Distancia: " + String.valueOf(GenerarViaje.distancia2 + " KM"));
            jLabel6.setText("Inicio: " + GenerarViaje.inicio2);
            jLabel11.setText("Destino: " + GenerarViaje.fin2);
        }
        if (GenerarViaje.vehiculo3 != null && GenerarViaje.distancia3 > 0 && GenerarViaje.fin3 != null && GenerarViaje.inicio3 != null) {
            jLabel7.setText(GenerarViaje.vehiculo3);
            jLabel8.setText("Distancia: " + String.valueOf(GenerarViaje.distancia3 + " KM"));
            jLabel9.setText("Inicio: " + GenerarViaje.inicio3);
            jLabel12.setText("Destino: " + GenerarViaje.fin3);
        }
    }

    private void establecerImagenes1() {
        if (jLabel1 != null) {
            if (jLabel1.getText().equals("Carro Estándar 1")) {
                lblCarro.setBounds(130, 50, 150, 100);

                ImageIcon imagen = new ImageIcon(getClass().getResource("/imagenes/carro_estandar1_ida.png"));
                Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(lblCarro.getWidth(), lblCarro.getHeight(), Image.SCALE_DEFAULT));
                lblCarro.setIcon(icono);
                jPanel1.add(lblCarro);
            } else if (jLabel1.getText().equals("Carro Estándar 2")) {
                lblCarro.setBounds(130, 50, 150, 100);

                ImageIcon imagen = new ImageIcon(getClass().getResource("/imagenes/carro_estandar2_ida.png"));
                Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(lblCarro.getWidth(), lblCarro.getHeight(), Image.SCALE_DEFAULT));
                lblCarro.setIcon(icono);
                jPanel1.add(lblCarro);
            } else if (jLabel1.getText().equals("Carro Estándar 3")) {
                lblCarro.setBounds(130, 50, 150, 100);

                ImageIcon imagen = new ImageIcon(getClass().getResource("/imagenes/carro_estandar3_ida.png"));
                Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(lblCarro.getWidth(), lblCarro.getHeight(), Image.SCALE_DEFAULT));
                lblCarro.setIcon(icono);
                jPanel1.add(lblCarro);
            } else if (jLabel1.getText().equals("Motocicleta 1")) {
                lblMoto.setBounds(130, 50, 150, 100);

                ImageIcon moto = new ImageIcon(getClass().getResource("/imagenes/motocicleta1_ida.png"));
                Icon icono2 = new ImageIcon(moto.getImage().getScaledInstance(lblMoto.getWidth(), lblMoto.getHeight(), Image.SCALE_DEFAULT));
                lblMoto.setIcon(icono2);
                jPanel1.add(lblMoto);
            } else if (jLabel1.getText().equals("Motocicleta 2")) {
                lblMoto.setBounds(130, 50, 150, 100);

                ImageIcon moto = new ImageIcon(getClass().getResource("/imagenes/motocicleta2_ida.png"));
                Icon icono2 = new ImageIcon(moto.getImage().getScaledInstance(lblMoto.getWidth(), lblMoto.getHeight(), Image.SCALE_DEFAULT));
                lblMoto.setIcon(icono2);
                jPanel1.add(lblMoto);
            } else if (jLabel1.getText().equals("Motocicleta 3")) {
                lblMoto.setBounds(130, 50, 150, 100);

                ImageIcon moto = new ImageIcon(getClass().getResource("/imagenes/motocicleta3_ida.png"));
                Icon icono2 = new ImageIcon(moto.getImage().getScaledInstance(lblMoto.getWidth(), lblMoto.getHeight(), Image.SCALE_DEFAULT));
                lblMoto.setIcon(icono2);
                jPanel1.add(lblMoto);
            } else if (jLabel1.getText().equals("Carro Premium 1")) {
                lblCarroPremium.setBounds(130, 50, 150, 100);

                ImageIcon carroPremium = new ImageIcon(getClass().getResource("/imagenes/carro_premium1_ida.png"));
                Icon icono3 = new ImageIcon(carroPremium.getImage().getScaledInstance(lblCarroPremium.getWidth(), lblCarroPremium.getHeight(), Image.SCALE_DEFAULT));
                lblCarroPremium.setIcon(icono3);
                jPanel1.add(lblCarroPremium);
            } else if (jLabel1.getText().equals("Carro Premium 2")) {
                lblCarroPremium.setBounds(130, 50, 150, 100);

                ImageIcon carroPremium = new ImageIcon(getClass().getResource("/imagenes/carro_premium2_ida.png"));
                Icon icono3 = new ImageIcon(carroPremium.getImage().getScaledInstance(lblCarroPremium.getWidth(), lblCarroPremium.getHeight(), Image.SCALE_DEFAULT));
                lblCarroPremium.setIcon(icono3);
                jPanel1.add(lblCarroPremium);
            } else if (jLabel1.getText().equals("Carro Premium 3")) {
                lblCarroPremium.setBounds(130, 50, 150, 100);

                ImageIcon carroPremium = new ImageIcon(getClass().getResource("/imagenes/carro_premium3_ida.png"));
                Icon icono3 = new ImageIcon(carroPremium.getImage().getScaledInstance(lblCarroPremium.getWidth(), lblCarroPremium.getHeight(), Image.SCALE_DEFAULT));
                lblCarroPremium.setIcon(icono3);
                jPanel1.add(lblCarroPremium);
            } else {
                System.out.println("ERROR");
            }
        }

    }

    private void establecerImagenes2() {
        if (jLabel4 != null) {
            if (jLabel4.getText().equals("Carro Estándar 1")) {
                lblCarro1.setBounds(130, 190, 150, 100);

                ImageIcon imagen = new ImageIcon(getClass().getResource("/imagenes/carro_estandar1_ida.png"));
                Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(lblCarro1.getWidth(), lblCarro1.getHeight(), Image.SCALE_DEFAULT));
                lblCarro1.setIcon(icono);
                jPanel1.add(lblCarro1);
            } else if (jLabel4.getText().equals("Carro Estándar 2")) {
                lblCarro1.setBounds(130, 190, 150, 100);

                ImageIcon imagen = new ImageIcon(getClass().getResource("/imagenes/carro_estandar2_ida.png"));
                Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(lblCarro1.getWidth(), lblCarro1.getHeight(), Image.SCALE_DEFAULT));
                lblCarro1.setIcon(icono);
                jPanel1.add(lblCarro1);
            } else if (jLabel4.getText().equals("Carro Estándar 3")) {
                lblCarro1.setBounds(130, 190, 150, 100);

                ImageIcon imagen = new ImageIcon(getClass().getResource("/imagenes/carro_estandar3_ida.png"));
                Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(lblCarro1.getWidth(), lblCarro1.getHeight(), Image.SCALE_DEFAULT));
                lblCarro1.setIcon(icono);
                jPanel1.add(lblCarro1);
            } else if (jLabel4.getText().equals("Motocicleta 1")) {
                lblMoto1.setBounds(130, 190, 150, 100);

                ImageIcon moto = new ImageIcon(getClass().getResource("/imagenes/motocicleta1_ida.png"));
                Icon icono2 = new ImageIcon(moto.getImage().getScaledInstance(lblMoto1.getWidth(), lblMoto1.getHeight(), Image.SCALE_DEFAULT));
                lblMoto1.setIcon(icono2);
                jPanel1.add(lblMoto1);
            } else if (jLabel4.getText().equals("Motocicleta 2")) {
                lblMoto1.setBounds(130, 190, 150, 100);

                ImageIcon moto = new ImageIcon(getClass().getResource("/imagenes/motocicleta2_ida.png"));
                Icon icono2 = new ImageIcon(moto.getImage().getScaledInstance(lblMoto1.getWidth(), lblMoto1.getHeight(), Image.SCALE_DEFAULT));
                lblMoto1.setIcon(icono2);
                jPanel1.add(lblMoto1);
            } else if (jLabel4.getText().equals("Motocicleta 3")) {
                lblMoto1.setBounds(130, 190, 150, 100);

                ImageIcon moto = new ImageIcon(getClass().getResource("/imagenes/motocicleta3_ida.png"));
                Icon icono2 = new ImageIcon(moto.getImage().getScaledInstance(lblMoto1.getWidth(), lblMoto1.getHeight(), Image.SCALE_DEFAULT));
                lblMoto1.setIcon(icono2);
                jPanel1.add(lblMoto1);
            } else if (jLabel4.getText().equals("Carro Premium 1")) {
                lblCarroPremium1.setBounds(130, 190, 150, 100);

                ImageIcon carroPremium = new ImageIcon(getClass().getResource("/imagenes/carro_premium1_ida.png"));
                Icon icono3 = new ImageIcon(carroPremium.getImage().getScaledInstance(lblCarroPremium1.getWidth(), lblCarroPremium1.getHeight(), Image.SCALE_DEFAULT));
                lblCarroPremium1.setIcon(icono3);
                jPanel1.add(lblCarroPremium1);
            } else if (jLabel4.getText().equals("Carro Premium 2")) {
                lblCarroPremium1.setBounds(130, 190, 150, 100);

                ImageIcon carroPremium = new ImageIcon(getClass().getResource("/imagenes/carro_premium2_ida.png"));
                Icon icono3 = new ImageIcon(carroPremium.getImage().getScaledInstance(lblCarroPremium1.getWidth(), lblCarroPremium1.getHeight(), Image.SCALE_DEFAULT));
                lblCarroPremium1.setIcon(icono3);
                jPanel1.add(lblCarroPremium1);
            } else if (jLabel4.getText().equals("Carro Premium 3")) {
                lblCarroPremium1.setBounds(130, 190, 150, 100);

                ImageIcon carroPremium = new ImageIcon(getClass().getResource("/imagenes/carro_premium3_ida.png"));
                Icon icono3 = new ImageIcon(carroPremium.getImage().getScaledInstance(lblCarroPremium1.getWidth(), lblCarroPremium1.getHeight(), Image.SCALE_DEFAULT));
                lblCarroPremium1.setIcon(icono3);
                jPanel1.add(lblCarroPremium1);
            }
        }
    }

    private void establecerImagenes3() {
        if (jLabel7 != null) {
            if (jLabel7.getText().equals("Carro Estándar 1")) {
                lblCarro2.setBounds(130, 330, 150, 100);

                ImageIcon imagen = new ImageIcon(getClass().getResource("/imagenes/carro_estandar1_ida.png"));
                Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(lblCarro2.getWidth(), lblCarro2.getHeight(), Image.SCALE_DEFAULT));
                lblCarro2.setIcon(icono);
                jPanel1.add(lblCarro2);
            } else if (jLabel7.getText().equals("Carro Estándar 2")) {
                lblCarro2.setBounds(130, 330, 150, 100);

                ImageIcon imagen = new ImageIcon(getClass().getResource("/imagenes/carro_estandar2_ida.png"));
                Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(lblCarro2.getWidth(), lblCarro2.getHeight(), Image.SCALE_DEFAULT));
                lblCarro2.setIcon(icono);
                jPanel1.add(lblCarro2);
            } else if (jLabel7.getText().equals("Carro Estándar 3")) {
                lblCarro2.setBounds(130, 330, 150, 100);

                ImageIcon imagen = new ImageIcon(getClass().getResource("/imagenes/carro_estandar3_ida.png"));
                Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(lblCarro2.getWidth(), lblCarro2.getHeight(), Image.SCALE_DEFAULT));
                lblCarro2.setIcon(icono);
                jPanel1.add(lblCarro2);
            } else if (jLabel7.getText().equals("Motocicleta 1")) {
                lblMoto2.setBounds(130, 330, 150, 100);

                ImageIcon moto = new ImageIcon(getClass().getResource("/imagenes/motocicleta1_ida.png"));
                Icon icono2 = new ImageIcon(moto.getImage().getScaledInstance(lblMoto2.getWidth(), lblMoto2.getHeight(), Image.SCALE_DEFAULT));
                lblMoto2.setIcon(icono2);
                jPanel1.add(lblMoto2);
            } else if (jLabel7.getText().equals("Motocicleta 2")) {
                lblMoto2.setBounds(130, 330, 150, 100);

                ImageIcon moto = new ImageIcon(getClass().getResource("/imagenes/motocicleta2_ida.png"));
                Icon icono2 = new ImageIcon(moto.getImage().getScaledInstance(lblMoto2.getWidth(), lblMoto2.getHeight(), Image.SCALE_DEFAULT));
                lblMoto2.setIcon(icono2);
                jPanel1.add(lblMoto2);
            } else if (jLabel7.getText().equals("Motocicleta 3")) {
                lblMoto2.setBounds(130, 330, 150, 100);

                ImageIcon moto = new ImageIcon(getClass().getResource("/imagenes/motocicleta3_ida.png"));
                Icon icono2 = new ImageIcon(moto.getImage().getScaledInstance(lblMoto2.getWidth(), lblMoto2.getHeight(), Image.SCALE_DEFAULT));
                lblMoto2.setIcon(icono2);
                jPanel1.add(lblMoto2);
            } else if (jLabel7.getText().equals("Carro Premium 1")) {
                lblCarroPremium2.setBounds(130, 330, 150, 100);

                ImageIcon carroPremium = new ImageIcon(getClass().getResource("/imagenes/carro_premium1_ida.png"));
                Icon icono3 = new ImageIcon(carroPremium.getImage().getScaledInstance(lblCarroPremium2.getWidth(), lblCarroPremium2.getHeight(), Image.SCALE_DEFAULT));
                lblCarroPremium2.setIcon(icono3);
                jPanel1.add(lblCarroPremium2);
            } else if (jLabel7.getText().equals("Carro Premium 2")) {
                lblCarroPremium2.setBounds(130, 330, 150, 100);

                ImageIcon carroPremium = new ImageIcon(getClass().getResource("/imagenes/carro_premium2_ida.png"));
                Icon icono3 = new ImageIcon(carroPremium.getImage().getScaledInstance(lblCarroPremium2.getWidth(), lblCarroPremium2.getHeight(), Image.SCALE_DEFAULT));
                lblCarroPremium2.setIcon(icono3);
                jPanel1.add(lblCarroPremium2);
            } else if (jLabel7.getText().equals("Carro Premium 3")) {
                lblCarroPremium2.setBounds(130, 330, 150, 100);

                ImageIcon carroPremium = new ImageIcon(getClass().getResource("/imagenes/carro_premium3_ida.png"));
                Icon icono3 = new ImageIcon(carroPremium.getImage().getScaledInstance(lblCarroPremium2.getWidth(), lblCarroPremium2.getHeight(), Image.SCALE_DEFAULT));
                lblCarroPremium2.setIcon(icono3);
                jPanel1.add(lblCarroPremium2);
            }

        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfazRecorrido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazRecorrido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazRecorrido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazRecorrido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazRecorrido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonEnviar1;
    private javax.swing.JButton botonEnviar2;
    private javax.swing.JButton botonEnviar3;
    private javax.swing.JButton botonEnviarTodos;
    private javax.swing.JButton botonRegresar;
    private javax.swing.JButton botonRegresar1;
    private javax.swing.JButton botonRegresar2;
    private javax.swing.JButton botonRegresar3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    public javax.swing.JLabel lblParar;
    public javax.swing.JLabel lblPararRegreso;
    // End of variables declaration//GEN-END:variables
}
