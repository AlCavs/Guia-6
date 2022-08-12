/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package extraextra4;

import entidades.Fecha;
import servicios.ServicioFecha;

/**
 *
 * @author NiLe
 */
public class ExtraExtra4 {

    /**
     * @param args the command line arguments
     * Definir la clase Fecha. La Clase entidad tendrá solo 3 atributos (día, mes, año). No se podrá utilizar
ningún tipo de objeto de “clase fechas”. Inicializando desde la entidad los valores en 1, 1, 1900
respectivamente.
Se deberá en métodos independientes:
• Verificar que el año ingresado por el usuario este entre 1900 y 2021, caso contrario, el año
tomara el valor por defecto.
• Conocer la cantidad de días totales que tiene el mes elegido por el usuario. EJ: USTED
INGRESO MES 10 (OCTUBRE), QUE TIENE 31 días
• Mostrar día anterior a la fecha ingresada (Hay que considerar que sucede con inicio de cada
mes)
* • Mostrar día posterior a la fecha ingresada (Hay que considerar que sucede con fin de cada
mes)
• Crear un método para verificar si el año ingresado es bisiesto
     */
    public static void main(String[] args) {
        long time_start, time_end;
time_start = System.currentTimeMillis();

        // TODO code application logic here
        ServicioFecha sf = new ServicioFecha();
        Fecha f = sf.crearFecha();
        sf.mesElegido(f);
        sf.diaAntPos(f);
        if(sf.bisiesto(f)){
            System.out.println("El año es bisiesto");
        }else{
            System.out.println("El año no es bisiesto");
        }
        sf.test(f);

time_end = System.currentTimeMillis();
System.out.println("the task has taken "+ ( time_end - time_start ) +" milliseconds");
        
    }
    
}
