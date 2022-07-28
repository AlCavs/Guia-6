
package servicio;

import entidad.Cafetera;
import java.util.Scanner;


public class ServicioCafetera {
     public Cafetera crearCafetera(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese la capacidad de la cafetera");
        Cafetera c1 = new Cafetera(scan.nextDouble());
        return c1;
    }
}
