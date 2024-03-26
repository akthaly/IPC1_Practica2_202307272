/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package practica;

import java.awt.PopupMenu;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aleja
 */
public class GenerarViaje extends javax.swing.JFrame {

    public static String vehiculo1;
    public static int distancia1;
    public static String inicio1;
    public static String fin1;
    public static String vehiculo2;
    public static int distancia2;
    public static String inicio2;
    public static String fin2;
    public static String vehiculo3;
    public static int distancia3;
    public static String inicio3;
    public static String fin3;
    public static int contador = 1;

    public static int ID = 1;
    public String vehiculo;
    public int distancia;
    public int gasolina = 0;
    public String creacion;

    static Calendar Hora = Calendar.getInstance();
    static Calendar Fecha = Calendar.getInstance();

    /**
     * Creates new form GenerarViaje
     */
    public GenerarViaje() {
        initComponents();
        inicioComboBox();
        tipoTransporteComboBox();
        EliminarVehiculos();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        puntoInicial = new javax.swing.JComboBox<>();
        tipoTransporte = new javax.swing.JComboBox<>();
        puntoFinal = new javax.swing.JComboBox<>();
        botonGenerarViaje = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();

        jPanel2.setBackground(new java.awt.Color(209, 242, 255));

        jLabel1.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabel1.setText("Seleccionar punto inicial:");

        jLabel2.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabel2.setText("Seleccionar tipo de transporte:");

        jLabel3.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabel3.setText("Seleccionar punto final:");

        puntoInicial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar..." }));
        puntoInicial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                puntoInicialMouseClicked(evt);
            }
        });
        puntoInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puntoInicialActionPerformed(evt);
            }
        });

        tipoTransporte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tipoTransporteMouseClicked(evt);
            }
        });
        tipoTransporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoTransporteActionPerformed(evt);
            }
        });

        puntoFinal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar..." }));
        puntoFinal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                puntoFinalMouseClicked(evt);
            }
        });
        puntoFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puntoFinalActionPerformed(evt);
            }
        });

        botonGenerarViaje.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        botonGenerarViaje.setText("Generar viaje");
        botonGenerarViaje.setAlignmentY(0.0F);
        botonGenerarViaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGenerarViajeActionPerformed(evt);
            }
        });

        botonSalir.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        botonSalir.setText("Regresar");
        botonSalir.setAlignmentY(0.0F);
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(puntoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(puntoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(tipoTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonGenerarViaje, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87)
                .addComponent(botonSalir)
                .addGap(14, 14, 14))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(puntoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tipoTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(puntoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonGenerarViaje)
                    .addComponent(botonSalir))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonGenerarViajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGenerarViajeActionPerformed
        RellenoLabels();
        
        String inicio = puntoInicial.getSelectedItem().toString();
        ObtenerDistancia(inicio);

        if (puntoInicial.getSelectedIndex() != -1 && puntoFinal.getSelectedIndex() != -1 && tipoTransporte.getSelectedIndex() != -1) {
            InterfazRecorrido recorridos = new InterfazRecorrido();
            recorridos.setVisible(true);
            this.dispose();
        } else {

            JOptionPane.showMessageDialog(null, "Selecciona todos los datos", "Error", JOptionPane.ERROR_MESSAGE);
        }

        int hora, minutos, segundos, dia, mes, anno;
        String FechaActual, HoraActual;
        hora = Hora.get(Calendar.HOUR_OF_DAY);
        minutos = Hora.get(Calendar.MINUTE);
        segundos = Hora.get(Calendar.SECOND);
        dia = Fecha.get(Calendar.DATE);
        mes = Fecha.get(Calendar.MONTH);
        anno = Fecha.get(Calendar.YEAR);
        HoraActual = hora + ":" + minutos + ":" + segundos;
        FechaActual = dia + "/" + (mes + 1) + "/" + anno;

        creacion = FechaActual + " - " + HoraActual;
        distancia = ObtenerDistancia(inicio);
        vehiculo = tipoTransporte.getSelectedItem().toString();

        Historial nuevoHistorial = new Historial(ID, creacion, distancia, vehiculo, gasolina);
        int contadorHistoriales = HistorialDeViajes.contadorHistoriales;
        HistorialDeViajes.historiales[contadorHistoriales] = nuevoHistorial;
        HistorialDeViajes.contadorHistoriales++;
        
        ID++;
        


    }//GEN-LAST:event_botonGenerarViajeActionPerformed

    private void puntoInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puntoInicialActionPerformed
        String seleccionado = puntoInicial.getSelectedItem().toString();
        finComboBox(seleccionado);
    }//GEN-LAST:event_puntoInicialActionPerformed

    private void tipoTransporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoTransporteActionPerformed

    }//GEN-LAST:event_tipoTransporteActionPerformed

    private void puntoInicialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_puntoInicialMouseClicked


    }//GEN-LAST:event_puntoInicialMouseClicked

    private void puntoFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puntoFinalActionPerformed

    }//GEN-LAST:event_puntoFinalActionPerformed

    private void puntoFinalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_puntoFinalMouseClicked

    }//GEN-LAST:event_puntoFinalMouseClicked

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        Principal principal = new Principal();
        principal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonSalirActionPerformed

    private void tipoTransporteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tipoTransporteMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tipoTransporteMouseClicked

    /**
     * @param args the command line arguments
     */
    private void tipoTransporteComboBox() {
        tipoTransporte.addItem("Seleccionar...");
        tipoTransporte.addItem("Motocicleta 1");
        tipoTransporte.addItem("Motocicleta 2");
        tipoTransporte.addItem("Motocicleta 3");
        tipoTransporte.addItem("Carro Estándar 1");
        tipoTransporte.addItem("Carro Estándar 2");
        tipoTransporte.addItem("Carro Estándar 3");
        tipoTransporte.addItem("Carro Premium 1");
        tipoTransporte.addItem("Carro Premium 2");
        tipoTransporte.addItem("Carro Premium 3");
    }

    private int ObtenerDistancia(String inicio) {
        int distanciaParaHistorial = 0;
        for (DatosRutas ruta : Principal.listaRutas) {
            if (contador == 1) {
                if (inicio.equals(ruta.getInicio()) || inicio.equals(ruta.getFin())) {
                    distancia1 = ruta.getDistancia();
                    distanciaParaHistorial = distancia1;
                }
            } else if (contador == 2) {
                if (inicio.equals(ruta.getInicio()) || inicio.equals(ruta.getFin())) {
                    distancia2 = ruta.getDistancia();
                    distanciaParaHistorial = distancia2;
                }
            } else if (contador == 3) {
                if (inicio.equals(ruta.getInicio()) || inicio.equals(ruta.getFin())) {
                    distancia3 = ruta.getDistancia();
                    distanciaParaHistorial = distancia3;
                }
            }
        }
        return distanciaParaHistorial;
    }

    private void EliminarVehiculos() {
        if (vehiculo1 != null) {
            tipoTransporte.removeItem(vehiculo1);
        }
        if (vehiculo2 != null) {
            tipoTransporte.removeItem(vehiculo2);
        }
        if (vehiculo3 != null) {
            tipoTransporte.removeItem(vehiculo3);
        }
    }

    private void RellenoLabels() {
        if (contador == 1) {
            vehiculo1 = tipoTransporte.getSelectedItem().toString();
            ObtenerDistancia(puntoInicial.getSelectedItem().toString());
            inicio1 = puntoInicial.getSelectedItem().toString();
            fin1 = puntoFinal.getSelectedItem().toString();
            contador++;
        } else if (contador == 2) {
            vehiculo2 = tipoTransporte.getSelectedItem().toString();
            ObtenerDistancia(puntoInicial.getSelectedItem().toString());
            inicio2 = puntoInicial.getSelectedItem().toString();
            fin2 = puntoFinal.getSelectedItem().toString();
            contador++;
        } else if (contador == 3) {
            vehiculo3 = tipoTransporte.getSelectedItem().toString();
            ObtenerDistancia(puntoInicial.getSelectedItem().toString());
            inicio3 = puntoInicial.getSelectedItem().toString();
            fin3 = puntoFinal.getSelectedItem().toString();
        }
    }

    private void inicioComboBox() {
        for (DatosRutas ruta : Principal.listaRutas) {
            puntoInicial.addItem(ruta.getInicio());
            puntoInicial.addItem(ruta.getFin());
        }
    }

    private void finComboBox(String inicio) {
        puntoFinal.removeAllItems();
        for (DatosRutas ruta : Principal.listaRutas) {
            if (ruta.getInicio().equals(inicio)) {
                puntoFinal.addItem(ruta.getFin());
            } else if (ruta.getFin().equals(inicio)) {
                puntoFinal.addItem(ruta.getInicio());
            }
        }
    }

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
            java.util.logging.Logger.getLogger(GenerarViaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GenerarViaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GenerarViaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GenerarViaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CargarArchivos principal = new CargarArchivos();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonGenerarViaje;
    private javax.swing.JButton botonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<String> puntoFinal;
    private javax.swing.JComboBox<String> puntoInicial;
    public javax.swing.JComboBox<String> tipoTransporte;
    // End of variables declaration//GEN-END:variables
}
