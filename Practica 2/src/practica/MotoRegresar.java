package practica;

/**
 *
 * @author Aleja
 */
import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class MotoRegresar extends Thread {

    InterfazRecorrido recorrido;
    Rectangle rec_muroFin;
    JLabel lblMoto;
    int posicionXMoto;

    public MotoRegresar(InterfazRecorrido recorrido,JLabel lblMoto, int posicionX) {
        this.recorrido = recorrido;
        this.lblMoto = lblMoto;
        this.posicionXMoto = posicionX;
        this.rec_muroFin = this.recorrido.lblPararRegreso.getBounds();

    }
    private volatile boolean running = true;

     public void run() {
        try {
            while (running) {
                sleep(250);
                if (this.rec_muroFin.intersects(this.lblMoto.getBounds())) {
                    JOptionPane.showMessageDialog(null, "VIAJE DE REGRESO COMPLETADO");
                    pararThread();
                } else {
                    this.posicionXMoto -= 20;
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
