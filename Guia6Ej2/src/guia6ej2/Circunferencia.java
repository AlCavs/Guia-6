/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia6ej2;

import java.util.Scanner;

/**
 *
 * @author NiLe
 *  Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (area = pi ∗ r2).
e) Método perimetro(): para calcular el perímetro (perimetro = 2 ∗ pi ∗ r).
 */
public class Circunferencia {
    Scanner scan = new Scanner(System.in);
    
    private double radio;

    public Circunferencia() {
    }
    

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    public void crearCircunferencia(){
        System.out.println("Ingrese el radio de la circunferencia");
        this.radio = scan.nextDouble();
        
}
    public double area(){
        
        double area = ((Math.PI) * (getRadio()*getRadio()));
        return area;
    }
    public double perimetro(){
        
        double perimetro = (2 * Math.PI * getRadio());
        return perimetro;
    }

    @Override
    public String toString() {
        return "Circunferencia{ radio = " + radio + '}';
        
    }
    
    
    
}
