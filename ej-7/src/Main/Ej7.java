/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import Entidades.Persona;
import Services.PersonaService;

/**
 *
 * @author Usuario
 */
public class Ej7 {

    /**
     * A continuación, en la clase main hacer lo siguiente: Crear 4 objetos de
     * tipo Persona con distintos valores, a continuación, llamaremos todos los
     * métodos para cada objeto, deberá comprobar si la persona está en su peso
     * ideal, tiene sobrepeso o está por debajo de su peso ideal e indicar para
     * cada objeto si la persona es mayor de edad.Por último, guardaremos los
 resultados de los métodos calcularIMC y esMayorDeEdad en distintas
 variables, para después en el main, calcular un porcentaje de esas 4
 personas cuantas están por debajo de su peso, cuantas en su peso ideal y
 cuantos, por encima, y también calcularemos un porcentaje de cuantos son
 mayores de edad y cuantos menores.
     * @param args
     */
    public static void main(String[] args) {
        PersonaService ps1 = new PersonaService();
        Persona p1 = ps1.crearPersona();
        Persona p2 = ps1.crearPersona();
        Persona p3 = ps1.crearPersona();
        Persona p4 = ps1.crearPersona();

        Persona[] personas = new Persona[4];
        personas[0] = p1;
        personas[1] = p2;
        personas[2] = p3;
        personas[3] = p4;
        
        int encima = 0, ideal = 0, debajo = 0, mayores = 0;

        for (Persona persona : personas) {
            System.out.println(persona + "\n");
            System.out.println("Es mayor de edad?" + persona.esMayorDeEdad());
            switch (persona.calcularIMC()) {
                case 0:
                    ideal++;
                    break;
                case 1:
                    encima++;
                    break;
                default:
                    debajo++;
                    break;
            }
            if (persona.esMayorDeEdad()) {
                mayores++;
            }
            System.out.println("---------------------------------------------");
        }
        System.out.println("Porcentaje de IMC \n Personas con IMC bajo= " + ((debajo * 100) / 4)
                + "%\n Personas con IMC ideal= " + ((ideal * 100) / 4) + "%\n Personas con IMC alto= " + ((encima * 100) / 4)+ "%");
        System.out.println("Porcentaje de personas mayores de edad= " + ((mayores*100)/4) + "% \n Porcentaje de personas menores de edad= " + (((4-mayores)*100)/4) + "%" );
    }

}
