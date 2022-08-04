/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author NiLe
 */
public class ServicioAhorcado {

    Scanner scan = new Scanner(System.in);

    public Ahorcado crearAhorcado() {
        Ahorcado a1 = new Ahorcado();

        System.out.println("Ingrese la palabra a buscar");

        String palabra = scan.nextLine();
        String[] vector = new String[palabra.length()];
        for (int i = 0; i < palabra.length(); i++) {
            vector[i] = palabra.substring(i, i + 1);
        }
        a1.setJuego(vector);
        System.out.println("Ingrese la cantidad de jugadas maximas");
        a1.setJugadas(scan.nextInt());
        a1.setLetras(0);
        return a1;
    }

    public void longitud(Ahorcado a) {
        System.out.println("La longitud es de " + a.getJuego().length);
    }

    public void buscar(Ahorcado a, String letra) {

        int cont = 0;
        boolean ban = false;
        
        for (int i = 0; i < a.getEncontrada().length(); i++) {
            if (letra.equalsIgnoreCase(a.getEncontrada().substring(i, i + 1))) {
                ban = true;
            }
        }

        if (!ban) {
            for (int i = 0; i < a.getJuego().length; i++) {
                if (letra.equals(a.getJuego()[i])) {
                    cont++;
                    a.setEncontrada(a.getEncontrada().concat(letra));
                }
            }
            
        } else {
            System.out.println("Ya utilizaste esta letra, tramposo de mierda");
        }

        if (cont == 0) {
            System.out.println("La letra no se encontró");
            a.setJugadas(a.getJugadas() - 1);
        } else if (cont > 1) {
            System.out.println("La letra se encontro " + cont + " veces");
            a.setLetras(a.getLetras() + cont);
        } else {
            System.out.println("La letra se encontro una vez");
            a.setLetras(a.getLetras() + 1);
        }
    }

    public boolean encontradas(Ahorcado a, String letra) {
        System.out.println("La cantidad de letras encontradas es: " + a.getLetras());
        System.out.println("La cantidad de letras faltantes es: " + (a.getJuego().length - a.getLetras()));
        boolean si = false;
        for (int i = 0; i < a.getJuego().length; i++) {
            if (letra.equals(a.getJuego()[i])) {
                si = true;
            }
        }

        return si;
    }

    public void intentos(Ahorcado a) {
        System.out.println("Te quedan " + a.getJugadas() + " intentos");
    }

    public void juego() {
        Ahorcado a1 = crearAhorcado();

        do {
            System.out.println("Ingrese una letra");
            String l = scan.next();
            longitud(a1);
            buscar(a1, l);
            encontradas(a1, l);
            intentos(a1);
        } while (a1.getLetras() < a1.getJuego().length && a1.getJugadas() > 0);
        if (a1.getLetras() == a1.getJuego().length) {
            System.out.println("Ganaste wachooo");
        } else {
            System.out.println("Perdiste, zapallo");
        }
    }
}
