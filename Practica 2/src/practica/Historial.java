package practica;

import java.io.Serializable;

public class Historial implements Serializable{
    
    public int ID;
    public String vehiculo;
    public int distancia;
    public int gasolina;
    public String creacion;

    public Historial(int ID, String creacion, int distancia, String vehiculo,  int gasolina) {
        this.ID = ID;
        this.creacion = creacion;
        this.distancia = distancia;
        this.vehiculo = vehiculo;
        this.gasolina = gasolina;
    }
    
    
}
