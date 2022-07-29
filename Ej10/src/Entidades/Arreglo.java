/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.lang.reflect.Array;
import java.util.Arrays;

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
public class Arreglo {
    private int[] a1 = new int[50];
    private double[] a2 = new double[20];

    public Arreglo() {
    }
    public Arreglo(int[] a1,double[] a2) {
        this.a1=a1;
        this.a2=a2;
    }

    public int[] getA1() {
        return a1;
    }

    public void setA1(int[] a1) {
        this.a1 = a1;
    }

    public double[] getA2() {
        return a2;
    }

    public void setA2(double[] a2) {
        this.a2 = a2;
    }
    
    public void rellenarArreglo1(){
        for (int i = 0; i < 50; i++) {
            a1[i]= (int) (Math.random()*100);
        }
        /*  for (int i = 0; i < 20; i++) {
        a2[i]= (int) (Math.random()*10);
        }*/
    }
    public void mostarArreglo(){
        for (int i = 0; i < 50; i++) {
            System.out.print("[" + a1[i]+"]");
        }
        System.out.println("");
    }
    
    public void ordenarArreglo(){
        Arrays.sort(a1);        
    }
    public void rellenarArreglo2(){
        
        for (int i = 0; i < 10; i++) {
            int valor = a1[i];
            Arrays.fill(a2,i,i+1, valor);
        }    
  
            Arrays.fill(a2,10,20, 0.5);
        
    }
    public void mostrarArrOrdenados(){
        for (int i = 0; i < 50; i++) {
            System.out.print("[" + a1[i]+"]");
        }
        System.out.println("");
    
        for ( int i = 0; i < 20; i++) {
            System.out.print("["+a2[i]+"]");
        }
        System.out.println("");
    }
}
