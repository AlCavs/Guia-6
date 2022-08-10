/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg07.extraextra;

import entidad.Auto;
import servicios.AutoService;

public class Ejercicio07ExtraExtra {

    public static void main(String[] args) {
      AutoService as1 = new AutoService();
      Auto a1 = as1.cargarFicha();
       System.out.println(a1);
       a1.modificarTitularidad();
       System.out.println(a1);
       a1.agregarRecorrido();
       a1.verificarService();
       a1.agregarRecorrido();
       a1.verificarService();
    }
}
