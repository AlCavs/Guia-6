/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej11;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author NiLe
 */
public class Guia6Ej11 {

    /**
     * @param args the command line arguments
     * Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que se
puede conseguir instanciando un objeto Date con constructor vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dia=0, mes=0, anio=0;
        Date d1 = new Date(dia, mes , anio);
        System.out.println("Ingrese el dia");
        d1.setDate(dia=scan.nextInt());
        System.out.println("Ingrese el mes");
        d1.setMonth(mes=scan.nextInt());
        System.out.println("Ingrese el año");
        d1.setYear((anio=scan.nextInt())-1900);
        
        Date fechaActual = new Date();
        
        System.out.println("La fecha ingresada es: " + d1 +"\n");
        System.out.println("La fecha actual es: " + fechaActual+"\n");
        System.out.println("La diferencia es de "+(fechaActual.getYear() - d1.getYear())+" años");
        
    }
    
}
