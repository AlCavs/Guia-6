/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

import java.util.Scanner;

public class Menu {
   
    
    
    public void menue(Cafetera x) {
        Scanner sc = new Scanner(System.in);
     boolean bandera = true;
        
        do{
            System.out.println("Ingrese una opcion:\n1-Llenar Cafetar\n2-Servir taza\n3-Vaciar Cafetera\n4-Agregar cafe\n5-mostrar cantidad actual cafetera\n6-Salir");
            int opc = sc.nextInt();
            switch (opc) {
                case 1:
                    x.llenarCafetera();
                    System.out.println("Cafetera llena");
                    break;
                case 2:
                    System.out.println("Ingrese el tamaño de la taza");
                    x.servirTaza(sc.nextDouble());
                    break;
                case 3:
                    x.vaciarCafetera();
                    System.out.println("Cafetera Vacia");
                case 4:
                    System.out.println("ingrese la cantidad a agregar");
                    x.agregarCafe(sc.nextInt());
                    System.out.println("Cargada la cafetera tiene: "+ x.getCantidadActual());
                    break;
                case 5:
                    System.out.println("La cantidad actual de la cafetera es: "+ x.getCantidadActual()+"\n su capacidad maxima es: "+ x.getCapacidadMaxima());
                    break;
                case 6:
                    System.out.println("Gracias por usar la cafetera");
                    bandera = false;
                    break;
                           
                default:
                    System.out.println("Error de opcion");
            }
        }while(bandera);
    }

    
    
    
}
