/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.Mes;

/**
 *
 * @author NiLe
 * Crea una clase en Java donde declares una variable de tipo array de Strings que contenga
los doce meses del año, en minúsculas. A continuación, declara una variable mesSecreto
de tipo String, y hazla igual a un elemento del array (por ejemplo, mesSecreto = mes[9]. El
programa debe pedir al usuario que adivine el mes secreto. Si el usuario acierta mostrar
un mensaje, y si no lo hace, pedir que vuelva a intentar adivinar el mes secreto. Un
ejemplo de ejecución del programa podría ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
¡Ha acertado!
 */
public class ServicioMes {
      public Mes crearMes(){
        Mes m = new Mes();
    String[] me = new String[12];
    
    me[0]= "enero";
    me[1]= "febrero";
    me[2]= "marzo";
    me[3]= "abril";
    me[4]= "mayo";
    me[5]= "junio";
    me[6]= "julio";
    me[7]= "agosto";
    me[8]= "septiembre";
    me[9]= "octubre";
    me[10]= "noviembre";
    me[11]= "diciembre";
    
    return m;
}
}