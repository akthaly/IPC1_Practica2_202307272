package practica;

public class DatosRutas {

    private int ID;
    private String inicio;
    private String fin;
    private int distancia;

    public DatosRutas(int ID, String inicio, String fin, int distancia) {
        this.ID = ID;
        this.inicio = inicio;
        this.fin = fin;
        this.distancia = distancia;
    }
    

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getInicio() {
        return inicio;
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    public String getFin() {
        return fin;
    }

    public void setFin(String fin) {
        this.fin = fin;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

}
