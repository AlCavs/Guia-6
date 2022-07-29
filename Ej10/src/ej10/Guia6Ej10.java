/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej10;

import Entidades.Arreglo;

/**
 *
 * @author NiLe
 * Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
20.
 */
public class Guia6Ej10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Arreglo a1 = new Arreglo();
       
      a1.rellenarArreglo1();
      a1.mostarArreglo();
        System.out.println("------------");
        a1.ordenarArreglo();
        a1.mostarArreglo();
        a1.rellenarArreglo2();
        System.out.println("------------");
        a1.mostrarArrOrdenados();
       
    }
    
}
