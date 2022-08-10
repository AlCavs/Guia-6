/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

import java.util.Scanner;

/**
Crea una clase Auto. Como atributos tendrá nombre del dueño, fecha vencimiento carnet, color
del vehículo, modelo y KM en motor (deberá ser inicializado por defecto en 7500km),
Crear métodos que permitan:
• Que un usuario cargue su ficha del auto.
• Que el usuario, modifique la titularidad del vehículo.
• Indicar un trayecto recorrido, modificando de este modo los KM del motor
• Crear un método que indique si es necesario realizar Service al vehículo, considerando que
al llegar a los 10.000km corresponde realizarlo.
 */
public class Auto {
    private String dueño;
    private int modelo;
    private int km = 7500;
    private String color;
    
    Scanner scan = new Scanner(System.in);

    public Auto(String dueño, int modelo, String color) {
        this.dueño = dueño;
        this.modelo = modelo;
        this.km = 7500;
        this.color = color;
    }

    public Auto(String dueño, int modelo, int km, String color) {
        this.dueño = dueño;
        this.modelo = modelo;
        this.km = km;
        this.color = color;
    }
    
    public Auto() {
    }

    public String getDueño() {
        return dueño;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public void modificarTitularidad(){
        System.out.println("El dueño del auto por ahora es " + dueño);
        System.out.println("Ingrese el nuevo dueño");
        dueño = scan.next();
    }
    
    public void agregarRecorrido(){
        System.out.println("Los km recorridos hasta ahora son :" + km);
        System.out.println("Ingrese los km del nuevo recorrido");
        km = km + scan.nextInt();
    }
    
    public void verificarService(){
        if(km>=10000){
            System.out.println("Vaya y haga el service");
        }else{
            System.out.println("Siga pisteando");
        }
    }

    @Override
    public String toString() {
        return "Auto{" + "duenio=" + dueño + ", modelo=" + modelo + ", km=" + km + ", color=" + color + '}';
    }
    
    
}
