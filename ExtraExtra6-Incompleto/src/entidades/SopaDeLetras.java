/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *Crear una clase Sopa de letras que contenga un atributo matriz, y otro palabra a encontrar.
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
 * @author NiLe
 */
public class SopaDeLetras {
    String[][] sopa = new String[10][10];
    String palabra;

    public SopaDeLetras() {
    }

    public SopaDeLetras(String palabra) {
        this.palabra = palabra;
    }

    public String[][] getSopa() {
        return sopa;
    }

    public void setSopa(String[][] sopa) {
        this.sopa = sopa;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }
    
    public void llenarMatriz(){
        String palabra[] = {"perro","arbol","locos","bajan","letra","diosa","carta","lavar","etica","lider", "noche" , "silla", "unido", "picos","gorro","beber", "autor", "liceo","metal","bruja"};
        //String palabra= "perro";
        int x = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j=j+5) {
                for (int k = 0; k < 5; k++) {
                    sopa[i][j+k]= palabra[x].substring(k,k+1);
                }
                    x++;
            }        
        }
                
    }
    public void mostrar(){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(sopa[i][j] + " ");
            }
                   System.out.println("");
        
        }
        
    }
}
