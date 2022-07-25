/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia6ej1.identificador;

import java.util.Scanner;

/**
 * Crear una clase llamada Libro que contenga los siguientes atributos: ISBN,
 * Título, Autor, Número de páginas, y un constructor con todos los atributos
 * pasados por parámetro y un constructor vacío. Crear un método para cargar un
 * libro pidiendo los datos al usuario y luego informar mediante otro método el
 * número de ISBN, el título, el autor del libro y el numero de páginas.
 *
 * @author NiLe
 */
public class Libro {

    private int ISBN;
    private String titulo;
    private String autor;
    private int numeroPaginas;

    public Libro(int ISBN, String titulo, String autor, int numeroPaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    public Libro() {
    }

    public void cargarLibro() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese el ISBN del libro: ");
        this.ISBN = scan.nextInt();
        scan.skip("\n");
        System.out.println("Ingrese el Titulo del libro: ");
        this.titulo = scan.nextLine();
        System.out.println("Ingrese el Autor del libro: ");
        this.autor = scan.nextLine();
        System.out.println("Ingrese la cantidad de paginas del libro: ");
        this.numeroPaginas = scan.nextInt();

    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", numeroPaginas=" + numeroPaginas + '}';
    }

}
