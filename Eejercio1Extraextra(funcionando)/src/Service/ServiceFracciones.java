/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import entidad.Fraccion;
import java.util.Scanner;

/**
 *
 * @author Chuky
 */
public class ServiceFracciones {
Scanner sc = new Scanner(System.in);
    public Fraccion crearFraccion() {
        
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
        int a = Math.max(f.getD1(), f.getD2());
        int b = Math.min(f.getD1(), f.getD2());
        
       var resultado = (a / mcd(f.getD1(), f.getD2())) * b;
        return resultado;
    }
    
    public  int mcd(int num1, int num2) {
 
        int a = Math.max(num1, num2);
        int b = Math.min(num1, num2);
 
        int resultado = 0;
        do {
            resultado = b;
            b = a % b;
            a = resultado;
 
        } while (b != 0);
        return resultado;
 
    }
    
    public void sumar(Fraccion f){
        if (f.getD1()==f.getN2()) {
            System.out.println("El resultado de la suma es: "+(f.getN1()+f.getN2())+"/"+f.getD1());
        } else {
            System.out.println("El resultado de la suma es: "+ (((f.getN1()*mcm(f))/f.getD1())+((f.getN2()*mcm(f))/f.getD2()))+"/"+mcm(f));
        }
    }
    
    public void restar(Fraccion f){
        if (f.getD1()==f.getN2()) {
            System.out.println("El resultado de la resta es: "+(f.getN1()-f.getN2())+"/"+f.getD1());
        } else {
            System.out.println("El resultado de la resta es: "+ (((f.getN1()*mcm(f))/f.getD1())-((f.getN2()*mcm(f))/f.getD2()))+"/"+mcm(f));
        }
    }
    
    public void multiplicar(Fraccion f){
        System.out.println("La multiplicacion es: "+(f.getN1()*f.getN2())+"/"+(f.getD1()*f.getD2()));
    }
    
    public void dividir(Fraccion f){
        System.out.println("La divicion es: "+(f.getN1()*f.getD2())+"/"+(f.getN2()*f.getD1()));
    }
    
    public void menu(Fraccion f){
        int op;
        do {
            System.out.println("Ingrese una opcion\n1-Sumar\n2-Restar\n3-Multiplicar\n4-Dividir\n5-Salir");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    sumar(f);
                    break;
                case 2:
                    restar(f);
                    break;
                case 3:
                    multiplicar(f);
                    break;
                case 4:
                    dividir(f);
                    break;
                default:
                    System.out.println("opcion erronea intente de nuevo");
            }
        } while (op!=5);
    }
}
