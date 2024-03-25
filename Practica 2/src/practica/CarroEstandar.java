package practica;

/**
 *
 * @author Aleja
 */
import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class CarroEstandar extends Thread {

    InterfazRecorrido recorrido;
    Rectangle rec_muro;
    JLabel lblCarro;
    String dis;
    int posicionXCarro;

    public CarroEstandar(InterfazRecorrido recorrido,JLabel lblCarro, int posicionX, String dis) {
        this.recorrido = recorrido;
        this.lblCarro = lblCarro;
        this.posicionXCarro = posicionX;
        this.rec_muro = this.recorrido.lblParar.getBounds();
        this.dis = dis;

    }
   
     private volatile boolean running = true;

    public void run() {
        
        int distancia = Integer.parseInt(dis);
        
        try {
            while (running) {
                sleep(20*distancia);
                if (this.rec_muro.intersects(this.lblCarro.getBounds())) {
                    JOptionPane.showMessageDialog(null, "VIAJE COMPLETADO");
                    pararThread();
                } else {
                    this.posicionXCarro += 20;
                    this.lblCarro.setLocation(this.posicionXCarro, this.lblCarro.getY());
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
