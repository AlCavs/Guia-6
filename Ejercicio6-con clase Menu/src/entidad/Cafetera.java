
package entidad;

/**
 *
 * @author Chuky
 */
public class Cafetera {
    private double capacidadMaxima;
    private double cantidadActual;

    public Cafetera() {
    }

    public Cafetera(double capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = 0;
    }

    public double getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(double capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public double getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(double cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
    
    public void llenarCafetera(){
        cantidadActual = capacidadMaxima;
    }
    
    public void servirTaza(double tamanio){
        if(cantidadActual>=tamanio){
            cantidadActual -= tamanio;
            System.out.println("Taza llena");
        }else{
            System.out.println("No tiene tanto cafe, se lleno con: "+ cantidadActual);
            setCantidadActual(0);
        }
    }
    
    public void vaciarCafetera(){
        setCantidadActual(0);
    }
    
    public void agregarCafe(int cantidad){
        if(cantidad+getCantidadActual()<getCapacidadMaxima()){
            setCantidadActual(cantidadActual+cantidad);
        }else{
            System.out.println("no podes cargar tanto");
        }
    }
    
    
}
