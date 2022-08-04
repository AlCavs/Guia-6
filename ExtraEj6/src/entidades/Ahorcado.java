/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author NiLe
 */
public class Ahorcado {
    private String[] juego;
    private String encontrada;
    private int letras;
    private int jugadas;

    public Ahorcado() {
        encontrada = "";
    }

    public Ahorcado(String[] juego, int letras, int jugadas,String encontrada) {
        this.juego = juego;
        this.letras = letras;
        this.jugadas= jugadas;
        this.encontrada=encontrada;
    }

    public String getEncontrada() {
        return encontrada;
    }

    public void setEncontrada(String encontrada) {
        this.encontrada = encontrada;
    }

    public String[] getJuego() {
        return juego;
    }

    public void setJuego(String[] juego) {
        this.juego = juego;
    }

    public int getLetras() {
        return letras;
    }

    public void setLetras(int letras) {
        this.letras = letras;
    }

    public int getJugadas() {
        return jugadas;
    }

    public void setJugadas(int jugadas) {
        this.jugadas = jugadas;
    }
    
}
