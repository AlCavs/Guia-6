/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidad.Auto;
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
public class AutoService {
    
    public Auto cargarFicha(){
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        Auto a1 = new Auto();
        System.out.println("Ingrese el nombre del titular");
        a1.setDueño(scan.next());
        System.out.println("Ingrese el modelo del auto");
        a1.setModelo(scan.nextInt());
        System.out.println("Ingrese el color del auto");
        a1.setColor(scan.next());
        return a1;
    }

    
}
