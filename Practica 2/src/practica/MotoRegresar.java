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
    String dis;
    int posicionXMoto;

    public MotoRegresar(InterfazRecorrido recorrido,JLabel lblMoto, int posicionX, String dis) {
        this.recorrido = recorrido;
        this.lblMoto = lblMoto;
        this.posicionXMoto = posicionX;
        this.dis = dis;
        this.rec_muroFin = this.recorrido.lblPararRegreso.getBounds();

    }
    private volatile boolean running = true;

     public void run() {
         
         int distancia = Integer.parseInt(dis);
         
        try {
            while (running) {
                sleep(20*distancia);
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
