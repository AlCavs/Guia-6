/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package extraextra6;

import entidades.SopaDeLetras;
import servicios.ServicioSopaDeLetras;

/**
 *
 * @author NiLe
 */
public class ExtraExtra6 {

    /**
     * @param args the command line arguments
     * Crear una clase Sopa de letras que contenga un atributo matriz, y otro palabra a encontrar.
Llenar una matriz de 10x10 con palabras de 5 caracteres (todas de forma horizontal, en orden)
inicializándola por defecto con “palabras preestablecidas”.
Crear métodos:
• Que el usuario ingrese una palabra y la busque en la matriz. Deberá retornar en que posición
de la matriz inicia la palabra.
• Imprimir la sopa de letras en pantalla
• Que el usuario pueda reemplazar una palabra especifica de la matriz ya pre -cargada (Es
decir, por ejemplo, que si en posición 0.0 estaba perro, cambiarla a polo). Para realizar esta
gestión, el método recibirá la palabra a buscar y a reemplazar sus datos
• Imprimir la sopa de letras, invertida (es decir, filas por columnas)
     */
    public static void main(String[] args) {
        ServicioSopaDeLetras sp = new ServicioSopaDeLetras();
        SopaDeLetras s1 = new SopaDeLetras();
                
        s1.llenarMatriz();
        sp.buscarPalabra(s1);
        s1.mostrar();

    }
    
}
