/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.Triangulo;
import java.util.Scanner;

/**
 *Definir una clase triangulo que modelara triángulos isósceles . Definir los atributos necesarios para
operar. Crear los métodos correspondientes a la clase Entidad.
Crear un arreglo con 4 objetos de la clase
Crear los siguientes métodos:
• Calcular área
• Calcular perímetro
• Mostrar los datos del triangulo que tenga el área de mayor superficie
 * @author NiLe
 */
public class ServicioTriangulo {
    Scanner sc = new Scanner(System.in);
    public Triangulo crearTriangulo(){
        Triangulo t1 = new Triangulo();
        System.out.println("Ingrese el valor de los lados opuestos");
        t1.setLado1(sc.nextInt());
        t1.setLado2(t1.getLado1());
        System.out.println("Ingrese el valor de la base");
        t1.setLado3B(sc.nextInt());    
        System.out.println("------------");
        return t1;
    }
    public void calcularArea(Triangulo t){
        double altura = (Math.sqrt(Math.pow(t.getLado1(), 2)-(Math.pow(t.getLado3B(), 2)/4)));
       t.setArea(((t.getLado3B()*altura)/2));

    }   
    
    public void calcularPerimetro(Triangulo t){
        System.out.println("El perimetro del triangulo es: " + ((t.getLado1()*2)+t.getLado3B()));
    }    
}
