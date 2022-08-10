/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 * Definir una clase triangulo que modelara triángulos isósceles . Definir los
 * atributos necesarios para operar. Crear los métodos correspondientes a la
 * clase Entidad. Crear un arreglo con 4 objetos de la clase Crear los
 * siguientes métodos: • Calcular área • Calcular perímetro • Mostrar los datos
 * del triangulo que tenga el área de mayor superficie
 *
 * @author NiLe
 */
public class Triangulo {

    private int lado1, lado2, lado3B;
    private double area;

    public Triangulo() {
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public Triangulo(int lado1, int lado2, int lado3B, double area) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3B = lado3B;
        this.area = area;
    }

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    public int getLado3B() {
        return lado3B;
    }

    public void setLado3B(int lado3B) {
        this.lado3B = lado3B;
    }

}
