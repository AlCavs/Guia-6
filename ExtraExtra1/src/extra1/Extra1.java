/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package extra1;


import servicios.ServicioFraccion;

/**
 *
 * @author NiLe
 */
public class Extra1 {

    /**
     * @param args the command line arguments
     * Crear una clase llamada fracción que contenga 4 atributos (denominador y numerador de cada
fracción). Crear la clase servicio que contenga métodos para sumar, restar, multiplicar y dividir
fracciones. Mostrar por pantalla un menú de opciones para que el usuario decida que ver
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ServicioFraccion sf = new ServicioFraccion();
        //sf.crearFraccion();
        
        sf.suma(sf.crearFraccion());
        
    }
    
}
