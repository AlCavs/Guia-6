/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg6.ej6;

import pkg6.ej6.Services.CafeteraService;

/**
 *
 * @author Usuario
 */
public class Ej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CafeteraService cs1 = new CafeteraService();
        Cafetera c1 = cs1.crearCafetera();
        System.out.println(c1.getCapacidadMaxima());
         System.out.println(c1.getCantidadActual());
         System.out.println("--------------------------");
        c1.llenarCafetera();
         System.out.println(c1.getCantidadActual());
          System.out.println("--------------------------");
        c1.servirTaza(50);
         System.out.println(c1.getCantidadActual());
          System.out.println("--------------------------");
        c1.agregarCafe(200);
         
         System.out.println(c1.getCantidadActual());
          System.out.println("--------------------------");
        c1.vaciarCafetera();
         System.out.println(c1.getCantidadActual());
    }
    
}
