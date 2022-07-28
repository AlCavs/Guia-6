/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia6ej8;

import guia6ej8.Entidades.Cadena;
import java.util.Scanner;

/**
 *
 * @author NiLe
 */
public class Guia6Ej8 {

    /**
     * @param args the command line arguments Realizar una clase llamada Cadena
     * que tenga como atributos una frase (de tipo de String) y su longitud. En
     * el main se creará el objeto y se le pedirá al usuario que ingrese una
     * frase que puede ser una palabra o varias palabras separadas por un
     * espacio en blanco y a través de los métodos set, se guardará la frase y
     * la longitud de manera automática según la longitud de la frase ingresada.
     * Deberá además implementar los siguientes métodos: a) Método
     * mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
     * frase ingresada. b) Método invertirFrase(), deberá invertir la frase
     * ingresada y mostrarla por pantalla. Por ejemplo: Entrada: "casa blanca",
     * Salida: "acnalb asac".
     *
     * c) Método vecesRepetido(String letra), recibirá un carácter ingresado por
     * el usuario y contabilizar cuántas veces se repite el carácter en la
     * frase, por ejemplo: Entrada: frase = "casa blanca". Salida: El carácter
     * 'a' se repite 4 veces.
     *
     * e) Método compararLongitud(String frase), deberá comparar la longitud de
     * la frase que compone la clase con otra nueva frase ingresada por el
     * usuario. f) Método unirFrases(String frase), deberá unir la frase
     * contenida en la clase Cadena con una nueva frase ingresada por el usuario
     * y mostrar la frase resultante. g) Método reemplazar(String letra), deberá
     * reemplazar todas las letras “a” que se encuentren en la frase, por algún
     * otro carácter seleccionado por el usuario y mostrar la frase resultante.
     * h) Método contiene(String letra), deberá comprobar si la frase contiene
     * una letra que ingresa el usuario y devuelve verdadero si la contiene y
     * falso si no.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        Cadena c1 = new Cadena();
        System.out.println("Ingrese una palabra o frase");
        c1.setFrase(scan.next());
        c1.setLongitudFrase(c1.getFrase().length());

        
        System.out.println("Las vocales son " + c1.mostarVocales());
        
        System.out.println(" ");
        c1.invetirFrase();
        System.out.println("");

        System.out.println("Ingrese el caracter a analizar");
        String letra = scan.next();
        c1.vecesRepetido(letra);

        System.out.println("Ingrese una nueva frase para comparar longitudes");
        String frase2 = scan.next();
        c1.compararLongitud(frase2);
        System.out.println("  ");
        c1.unirFrases(frase2);

        System.out.println("Ingrese el caracter para reemplazar todas las letras 'a'");
        char letra1 = scan.next().charAt(0);
        c1.reemplazar(letra1);

        System.out.println("Ingrese una letra para buscar. Si la letra está es TRUE, si no está es FALSE");
        letra = scan.next();
        System.out.println(c1.contiene(letra));

    }

}
