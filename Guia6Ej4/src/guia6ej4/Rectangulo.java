/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia6ej4;

import java.util.Scanner;

/**
 *
 * @author NiLe
 * Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. La clase incluirá un método para crear el rectángulo con
los datos del Rectángulo dados por el usuario. También incluirá un método para calcular la
superficie del rectángulo y un método para calcular el perímetro del rectángulo. Por último,
tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la
altura. Se deberán además definir los métodos getters, setters y constructores
correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
public class Rectangulo {
    private double base;
    private double altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
public void crearRectangulo(){
    Scanner scan = new Scanner(System.in);
    System.out.println("Ingrese la longitud de las bases");
    this.base = scan.nextDouble();
    System.out.println("Ingrese la longitud de los lados");
    this.altura = scan.nextDouble();
    
}
public double superficie(){
    
    return (base*altura);
}
public double perimetro(){
    
    return ((base+altura)*2);
}

    @Override
    public String toString() {
        
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base ; j++) {
                System.out.print("*");
                System.out.print("");
            }
            System.out.println(" ");
        }
        
        System.out.println();
     return "La base es de "+ base + "cm y la altura es de " + altura + "cm\nLa superficie del rectangulo es: "+superficie()+ "cm2\nEl perimetro del rectangulo es: "+perimetro()+"cm";  
     
    }

}
