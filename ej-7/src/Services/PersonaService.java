/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class PersonaService {
    
    public Persona crearPersona(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la persona");
        String nombre = scan.next();
        scan.skip("\n");
        System.out.println("Ingrese la edad");
        int edad = scan.nextInt();
        System.out.println("Ingrese el peso");
        double peso = scan.nextDouble();
        String sexo;
        do{
        System.out.println("Ingrese el sexo");
        sexo = scan.next();
        if(!(sexo.toUpperCase().equals("M") || sexo.toUpperCase().equals("H") || sexo.toUpperCase().equals("O"))){
              System.out.println("Pusiste algo mal fijate que onda");
        }
        }while(!(sexo.toUpperCase().equals("M") || sexo.toUpperCase().equals("H") || sexo.toUpperCase().equals("O")));
        System.out.println("Ingrese la altura");
        double altura = scan.nextDouble();
        Persona p1 = new Persona(nombre, edad, sexo, peso,altura);
        return p1;
}
}
