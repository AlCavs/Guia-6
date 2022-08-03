/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.NIF;
import java.util.Scanner;

/**
 *
 * @author NiLe
 * Dígito Verificador. Crear una clase NIF que se usará para mantener DNIs con su
correspondiente letra (NIF). Los atributos serán el número de DNI (entero largo) y la letra
(String o char) que le corresponde. Dispondrá de los siguientes métodos:
• Métodos getters y setters para el número de DNI y la letra.
• Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le
corresponderá. Una vez calculado, le asigna la letra que le corresponde según el
resultado del calculo.
• Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra en
mayúscula; por ejemplo: 00395469-F).
* 
La letra correspondiente al dígito verificador se calculará a traves de un método que
funciona de la siguiente manera: Para calcular la letra se toma el resto de dividir el número
de DNI por 23 (el resultado debe ser un número entre 0 y 22). El método debe buscar en
un array (vector) de caracteres la posición que corresponda al resto de la división para
obtener la letra correspondiente. La tabla de caracteres es la siguiente:
 * 
 */
public class ServicioNIF {
    Scanner scan = new Scanner(System.in);
   public NIF crearNIF(){
    NIF n1 = new NIF();
    final String[] doc = new String[23];
    doc[0] = "T";
    doc[1] = "R";
    doc[2] = "W";
    doc[3] = "A";
    doc[4] = "G";
    doc[5] = "M";
    doc[6] = "Y";
    doc[7] = "F";
    doc[8] = "P";
    doc[9] = "D";
    doc[10] = "X";
    doc[11] = "B";
    doc[12] = "N";
    doc[13] = "J";
    doc[14] = "Z";
    doc[15] = "S";
    doc[16] = "Q";
    doc[17] = "V";
    doc[18] = "H";
    doc[19] = "L";
    doc[20] = "C";
    doc[21] = "K";
    doc[22] = "E";
    
       System.out.println("Ingrese su DNI");
       n1.setDni(scan.nextLong());
       int pos = (int) n1.getDni() % 23;
       System.out.println(pos);
    n1.setLetra(doc[pos]);
    
    return n1;
   }
   public void mostrar(NIF n){
       System.out.println(n.getDni() + "-" + n.getLetra());
   }
}
