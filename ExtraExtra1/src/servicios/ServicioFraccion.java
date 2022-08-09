/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.Fraccion;
import java.util.Scanner;

/**
 *
 * @author NiLe
 * Crear una clase llamada fracción que contenga 4 atributos (denominador y numerador de cada
fracción). Crear la clase servicio que contenga métodos para sumar, restar, multiplicar y dividir
fracciones. Mostrar por pantalla un menú de opciones para que el usuario decida que ver
 */
public class ServicioFraccion {
    Scanner sc = new Scanner(System.in);
    public Fraccion crearFraccion(){
        Fraccion f1 = new Fraccion();
        System.out.println("Ingrese el numerador 1:");
        f1.setN1(sc.nextInt());
        
        System.out.println("Ingrese el denominador 1:");
        f1.setD1(sc.nextInt());
        
        
        System.out.println("Ingrese el numerador 2:");
        f1.setN2(sc.nextInt());
        
        
        System.out.println("Ingrese el denominador 2:");
        f1.setD2(sc.nextInt());
       return f1; 
    }
    public int mcm(Fraccion f){
        int comun = 1;
        int i = 2;
        while (i<= f.getD1() || i<=f.getD2()){
                if (f.getD1()%i==0 || f.getD2()%i==0){
                comun = comun*i;
                if(f.getD1()%i==0){
                    f.setD1(f.getD1()/i);
                }
                if(f.getD2()%i==0) f.setD2(f.getD2()/i);
                
                }else{
                    i++;
                }
                }          
        return comun;                
    }
    
    public void suma(Fraccion f){
        
        if (f.getD1()==f.getD2()){
            System.out.println("El resultado de la suma es: " + (f.getN1()+f.getN2()) + "/" + f.getD1());
        }else{
           System.out.println("El resultado de la suma es: " + (((f.getN1()*mcm(f))/f.getD1()) + ((f.getN2()*mcm(f))/f.getD2())) + "/" + mcm(f));
        }
    }
    
}
