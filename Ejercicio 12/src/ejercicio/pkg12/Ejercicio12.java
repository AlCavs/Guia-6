/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg12;

import entidad.Personas;
import java.util.Scanner;
import service.ServicioPersona;

/**
 *
 * @author Chuky
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ServicioPersona sp1 = new ServicioPersona();
        Personas p1 = sp1.crearPersona();
        //System.out.println(p1);
        p1.calcularEdad();
        System.out.println("Ingrese la nueva edad");
        System.out.println(p1.menorQue(sc.nextInt()));
        p1.mostrarDato();
    }
    
}
