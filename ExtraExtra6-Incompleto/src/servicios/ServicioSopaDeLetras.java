/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.SopaDeLetras;
import java.util.Scanner;

/**
 * Crear una clase Sopa de letras que contenga un atributo matriz, y otro
 * palabra a encontrar. Llenar una matriz de 10x10 con palabras de 5 caracteres
 * (todas de forma horizontal, en orden) inicializándola por defecto con
 * “palabras preestablecidas”. Crear métodos: • Que el usuario ingrese una
 * palabra y la busque en la matriz. Deberá retornar en que posición de la
 * matriz inicia la palabra.
 *
 * • Imprimir la sopa de letras en pantalla
 *
 * • Que el usuario pueda reemplazar una palabra especifica de la matriz ya pre
 * -cargada (Es decir, por ejemplo, que si en posición 0.0 estaba perro,
 * cambiarla a polos). Para realizar esta gestión, el método recibirá la palabra
 * a buscar y a reemplazar sus datos
 *
 * • Imprimir la sopa de letras, invertida (es decir, filas por columnas)
 *
 * @author NiLe
 */
public class ServicioSopaDeLetras {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public void buscarPalabra(SopaDeLetras s1) {

        System.out.println("Ingrese la palabra a buscar");
        s1.setPalabra(sc.nextLine());
        boolean si = false;
        int x = 0;
        for (int i = 0; i < 10; i++) {
          
            for (int j = 0; j < 10; j++) {
                if (s1.getPalabra().substring(x, x + 1).equalsIgnoreCase(s1.getSopa()[i][j])) 
                         {
                    if (s1.getPalabra().substring(x + 1, x + 2).equalsIgnoreCase(s1.getSopa()[i][j + 1])) 
                                 {
                        if (s1.getPalabra().substring(x + 2, x + 3).equalsIgnoreCase(s1.getSopa()[i][j + 2])) 
                                         {
                            if (s1.getPalabra().substring(x + 3, x + 4).equalsIgnoreCase(s1.getSopa()[i][j + 3]))
                                                 {
                                if (s1.getPalabra().substring(x + 4, x + 5).equalsIgnoreCase(s1.getSopa()[i][j + 4])) {
                                    System.out.println("La posicion inicia en las coordenada: [" + (i + 1) + "]" + "[" + (j + 1) + "]");
                                    si = true;

//break;          
                                }
                            }
                        }
                    }
                }
            }
        }

    if (!si){
    System.out.println ("La palabra no se encontro");
}               
    }
        }
