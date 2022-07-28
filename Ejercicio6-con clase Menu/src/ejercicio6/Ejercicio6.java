/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6;

import entidad.Cafetera;
import entidad.Menu;

import servicio.ServicioCafetera;

/**
 *
 * @author Chuky
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        ServicioCafetera cafe1 = new ServicioCafetera();
        Cafetera cafetera1 = cafe1.crearCafetera();
        Menu m = new Menu();
        m.menue(cafetera1);

    }
    
}
