/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia6ej8.Entidades;

/**
 *
 * Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo
 * de String) y su longitud. En el main se creará el objeto y se le pedirá al
 * usuario que ingrese una frase que puede ser una palabra o varias palabras
 * separadas por un espacio en blanco y a través de los métodos set, se guardará
 * la frase y la longitud de manera automática según la longitud de la frase
 * ingresada. Deberá además implementar los siguientes métodos: a) Método
 * mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
 * frase ingresada.
 *
 * b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por
 * pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
 *
 * c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el
 * usuario y contabilizar cuántas veces se repite el carácter en la frase, por
 * ejemplo: Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4
 * veces.
 *
 * e) Método compararLongitud(String frase), deberá comparar la longitud de la
 * frase que compone la clase con otra nueva frase ingresada por el usuario.
 *
 * f) Método unirFrases(String frase), deberá unir la frase contenida en la
 * clase Cadena con una nueva frase ingresada por el usuario y mostrar la frase
 * resultante.
 *
 * g) Método reemplazar(String letra), deberá reemplazar todas las letras “a”
 * que se encuentren en la frase, por algún otro carácter seleccionado por el
 * usuario y mostrar la frase resultante.
 *
 * h) Método contiene(String letra), deberá comprobar si la frase contiene una
 * letra que ingresa el usuario y devuelve verdadero si la contiene y falso si
 * no.
 */
public class Cadena {

    private String frase;
    private int longitudFrase;

    public Cadena() {

    }

    public Cadena(String frase, int longitudFrase) {
        this.frase = frase;
        this.longitudFrase = longitudFrase;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitudFrase() {
        return longitudFrase;
    }

    public void setLongitudFrase(int longitudFrase) {
        this.longitudFrase = longitudFrase;
    }

    public int mostarVocales() {
        int vocal = 0;
        for (int i = 0; i < longitudFrase; i++) {
            
            if (this.frase.substring(i, i+1).equalsIgnoreCase("a") || this.frase.substring(i, i+1).equalsIgnoreCase("e") || this.frase.substring(i, i+1).equalsIgnoreCase("i") || this.frase.substring(i, i+1).equalsIgnoreCase("o") || this.frase.substring(i, i+1).equalsIgnoreCase("u")) {
                vocal++;
            }
        }
        return vocal;
    }

    public void invetirFrase() {

        for (int i = (longitudFrase-1); i >= 0; i--) {
            System.out.print(frase.charAt(i));       
        }
    }

    public void vecesRepetido(String letra) {
        int cont = 0;
        for (int i = 0; i < longitudFrase; i++) {
            if (frase.substring(i,i+1).equalsIgnoreCase(letra)) {
                cont++;
            }
        }
        System.out.println("La letra '" + letra + "' se repite " + cont + " veces.");
    }

    public void compararLongitud(String frase) {
        System.out.println("La longitud de la frase principal es: " + this.frase.length() + "\nLa longitud de la nueva frase es: " + frase.length());
    }

    public void unirFrases(String frase) {
        System.out.println(this.frase.concat(" "+frase));
    }

    public void reemplazar(char letra) {

        setFrase(frase.replace('a', letra));
        System.out.println(frase);
    }

    public boolean contiene(String letra) {
        boolean bandera = false;
        for (int i = 0; i < longitudFrase; i++) {
            if (frase.substring(i,i+1).equalsIgnoreCase(letra)) {
                return bandera = true;
            }
        }
        return bandera;
    }
}
