/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia6ej2;

/**
 *
 * @author NiLe
 */
public class Guia6Ej2 {

    /**
     * @param args the command line arguments
     * Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (area = pi ∗ r2).
e) Método perimetro(): para calcular el perímetro (perimetro = 2 ∗ pi ∗ r).
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Circunferencia c1 = new Circunferencia();
        c1.crearCircunferencia();
        System.out.println(c1);
        
        System.out.println("El area de la circunferencia es: "+c1.area()+"\nEl perimetro de la circunferencia es: "+c1.perimetro());
        
    }
    
}
