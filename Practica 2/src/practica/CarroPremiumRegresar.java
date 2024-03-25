package practica;

/**
 *
 * @author Aleja
 */
import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class CarroPremiumRegresar extends Thread {

    InterfazRecorrido recorrido;
    Rectangle rec_muroFin;
    JLabel lblCarroPremium;
    int posicionXCarroPremium;

    public CarroPremiumRegresar(InterfazRecorrido recorrido,JLabel lblCarroPremium, int posicionX) {
        this.recorrido = recorrido;
        this.lblCarroPremium = lblCarroPremium;
        this.posicionXCarroPremium = posicionX;
        this.rec_muroFin = this.recorrido.lblPararRegreso.getBounds();
    }
    private volatile boolean running = true;

   public void run() {
        try {
            while (running) {
                sleep(250);
                if (this.rec_muroFin.intersects(this.lblCarroPremium.getBounds())) {
                    JOptionPane.showMessageDialog(null, "VIAJE DE REGRESO COMPLETADO");
                    pararThread();
                } else {
                    this.posicionXCarroPremium -= 20;
                    this.lblCarroPremium.setLocation(this.posicionXCarroPremium, this.lblCarroPremium.getY());
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
