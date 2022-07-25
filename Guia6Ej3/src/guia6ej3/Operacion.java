/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia6ej3;

import java.util.Scanner;

/**
 *
 * @author NiLe
 * Crear una clase llamada Operacion que tenga como atributos privados numero1 y
numero2. A continuación, se deben crear los siguientes métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Metodo constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda en
los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
f) Método restar(): calcular la resta de los números y devolver el resultado al main
g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error. Si
no, se hace la multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
una división por cero, el método devuelve 0 y se le informa al usuario el error se le
informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
 */
public class Operacion {
    private double numero1;
    private double numero2;

    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Operacion() {
    }

    public double getNumero1() {
        return numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    
    public void crearOperacion(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        this.numero1 = scan.nextInt();
        System.out.println("Ingrese el segundo numero");
        this.numero2 = scan.nextInt();
                        
    }
    public double sumar(){
        return (getNumero1() + getNumero2());
    }
    public double restar(){
        return (getNumero1() - getNumero2());
        
    }
    public double multiplicar(){
        
         if (getNumero2() != 0){
        return (getNumero1() * getNumero2());
                }else{
            System.out.println("La multilpicacion te va a dar 0, la puta que te pario");
            return 0;         
        }
    }
    public double dividir(){
        
        if (getNumero2() != 0){
        return (getNumero1() / getNumero2());
                }else{
            System.out.println("No se puede dividir por 0, la puta que te pario");
            return 0;         
        }
    }

    @Override
    public String toString() {
        return "Operacion{" + "numero1=" + numero1 + ", numero2=" + numero2 + '}';
        
    }
    
    
}
