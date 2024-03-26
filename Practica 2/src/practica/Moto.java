package practica;

import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class Moto extends Thread {
    
    InterfazRecorrido recorrido;
    Rectangle rec_muro;
    JLabel lblMoto;
    String dis;
    int posicionXMoto;

    public Moto(InterfazRecorrido recorrido,JLabel lblMoto, int posicionX, String dis) {
        this.recorrido = recorrido;
        this.lblMoto = lblMoto;
        this.posicionXMoto = posicionX;
        this.rec_muro = this.recorrido.lblParar.getBounds();
        this.dis = dis;

    }
    private volatile boolean running = true;

     public void run() {
         
         int distancia = Integer.parseInt(dis);
         
        try {
            while (running) {
                sleep(20*distancia);
                if (this.rec_muro.intersects(this.lblMoto.getBounds())) {
                    JOptionPane.showMessageDialog(null, "VIAJE COMPLETADO");
                    pararThread();
                } else {
                    this.posicionXMoto += 20;
                    this.lblMoto.setLocation(this.posicionXMoto, this.lblMoto.getY());
                    this.recorrido.repaint();
                }
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(CarroEstandar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void pararThread() {
        this.running = false;
    }
}

