/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia6ej1;

import guia6ej1.identificador.Libro;

/**
 *
 * @author NiLe
 */
public class Guia6Ej1 {

    /**
     * @param args the command line arguments
     * Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Libro l1 = new Libro();
        l1.cargarLibro();
        
        System.out.println(l1);
        
        
    }
    
}
