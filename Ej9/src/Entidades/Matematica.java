/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author NiLe
 * Realizar una clase llamada Matemática que tenga como atributos dos números reales con
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set. Deberá además implementar los siguientes métodos:
a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado
al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
public class Matematica {
    private double num1;
    private double num2;

    public Matematica() {
    }

    public Matematica(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
    
    public double devolverMayor(){
      return Math.max(num1, num2);
        
    }
    public double calcularPotencia(){
        long n1 = Math.round(num1);
        long n2 = Math.round(num2);
        
        return (Math.pow((Math.max(n1, n2)),(Math.min(n1, n2))));       
    }
    public double calcularRaiz(){
        return Math.abs(Math.sqrt(Math.min(num1, num2)));
    }

    @Override
    public String toString() {
        return "Matematica{" + "num1=" + num1 + ", num2=" + num2 + '}';
    }
    
}
