/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eejercio1extraextra;


import Service.ServiceFracciones;
import entidad.Fraccion;

/**
 *
 * @author Chuky
 */
public class Eejercio1Extraextra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServiceFracciones  sf1 = new ServiceFracciones();
        Fraccion s1 = sf1.crearFraccion();
        sf1.menu(s1);
        
    }
    
}
