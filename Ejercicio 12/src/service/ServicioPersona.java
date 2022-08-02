/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import entidad.Personas;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Chuky
 */
public class ServicioPersona {
    
    public Personas crearPersona(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String nom = sc.nextLine();
        System.out.println("Ingrese el año de nacimiento");
        int anio = sc.nextInt();
        
        System.out.println("Ingrese el mes de nacimiento");
        int mes = sc.nextInt();
        
        System.out.println("Ingrese el dia de nacimiento");
        int dia = sc.nextInt();
        
        Date d1 = new Date(anio,mes,dia);
        Personas p1 = new Personas(nom,d1);
        
        return p1;
    }
    /*Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
en cuenta que para conocer la edad de la persona también se debe conocer la fecha
actual.*/
   
}
