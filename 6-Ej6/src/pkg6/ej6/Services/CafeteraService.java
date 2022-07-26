/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg6.ej6.Services;

import java.util.Scanner;
import pkg6.ej6.Cafetera;

/**

 */
public class CafeteraService {
    
    public Cafetera crearCafetera(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese la capacidad de la cafetera");
        Cafetera c1 = new Cafetera(scan.nextDouble());
        return c1;
    }
    
}
