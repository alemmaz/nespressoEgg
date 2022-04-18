
package nespresso;


public class Cafetera {
    private int cafe;
    private int capacidadMaxima=1000;
    private int capacidadActual;
    private int tazaS, tazaM, tazaL;
    private int movimiento;
    
    

    public Cafetera() {
    }

    public Cafetera(int capacidadMaxima, int capacidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.capacidadActual = capacidadActual;
    }

    public int getCafe() {
        return cafe;
    }

    public void setCafe(int cafe) {
        this.cafe = cafe;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCapacidadActual() {
        return capacidadActual;
    }

    public void setCapacidadActual(int capacidadActual) {
        this.capacidadActual = capacidadActual;
    }

    public int getTazaS() {
        return tazaS;
    }

    public void setTazaS(int tazaS) {
        this.tazaS = tazaS;
    }

    public int getTazaM() {
        return tazaM;
    }

    public void setTazaM(int tazaM) {
        this.tazaM = tazaM;
    }

    public int getTazaL() {
        return tazaL;
    }

    public void setTazaL(int tazaL) {
        this.tazaL = tazaL;
    }
    
    public void llenarCafetera(){
      
       if(capacidadActual<1000){
           System.out.println("llenar Cafetera");
       }
        
    }
}
