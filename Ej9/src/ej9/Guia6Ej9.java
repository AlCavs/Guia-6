/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej9;

import Entidades.Matematica;

/**
 *
 * @author NiLe
 */
public class Guia6Ej9 {

    /**
Realizar una clase llamada Matemática que tenga como atributos dos números reales con
los cuales se realizarán diferentes operaciones matemáticas.La clase deber tener un
constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set. Deberá además implementar los siguientes métodos:
a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor 
* valor de la clase elevado al menor número. Previamente se deben
* redondear ambos valores.
* 
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor 
* de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto 
* del número.
     * @param args */
    public static void main(String[] args) {
        // TODO code application logic here
        Matematica m1 = new Matematica();
        m1.setNum1((double) (Math.random()*10));
        m1.setNum2((double) (Math.random()*10));
        System.out.println(m1);
        System.out.println("------------");
        System.out.println("El numero mayor es: " +m1.devolverMayor());
         System.out.println("------------");
        System.out.println("La potencia del mayor elevado al menor es: "+m1.calcularPotencia());
         System.out.println("------------");
        System.out.println("La raiz del menor valor es: "+m1.calcularRaiz());
    }
    
}
