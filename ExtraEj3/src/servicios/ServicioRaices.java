/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.Raices;
import java.util.Scanner;

/**
 *
 * @author NiLe Vamos a realizar una clase llamada Raices, donde representaremos
 * los valores de una ecuación de 2o grado. Tendremos los 3 coeficientes como
 * atributos, llamémosles a, b y c. Hay que insertar estos 3 valores para
 * construir el objeto a través de un método constructor. Luego, las operaciones
 * que se podrán realizar son las siguientes:
 *
 * • Método getDiscriminante(): devuelve el valor del discriminante (double). El
 * discriminante tiene la siguiente formula: (b^2)-4*a*c
 *
 * • Método tieneRaices(): devuelve un booleano indicando si tiene dos
 * soluciones, para que esto ocurra, el discriminante debe ser mayor o igual que
 * 0.
 *
 * • Método tieneRaiz(): devuelve un booleano indicando si tiene una única
 * solución, para que esto ocurra, el discriminante debe ser igual que 0.
 *
 * • Método obtenerRaices(): llama a tieneRaíces() y si devolvió́true, imprime
 * las 2 posibles soluciones.
 *
 * • Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́true imprime una
 * única raíz. Es en el caso en que se tenga una única solución posible.
 *
 * • Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y
 * mostrará por pantalla las posibles soluciones que tiene nuestra ecuación con
 * los métodos obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros
 * métodos y en caso de no existir solución, se mostrará un mensaje. Nota:
 * Formula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varia el signo
 * delante de -b
 */
public class ServicioRaices {

    Scanner scan = new Scanner(System.in);

    public Raices crearRaiz() {
        Raices r1 = new Raices();
        System.out.println("Ingrese el valor de a");
        r1.setA(scan.nextInt());
        System.out.println("Ingrese el valor de b");
        r1.setB(scan.nextInt());
        System.out.println("Ingrese el valor de c");
        r1.setC(scan.nextInt());
        return r1;
    }

    public double getDiscriminante(Raices r) {
        return (Math.pow(r.getB(), 2) - 4 * r.getA() * r.getC());
    }

    public boolean tieneRaices(Raices r) {

        return getDiscriminante(r) > 0;
    }

    public boolean tieneRaiz(Raices r) {

        return getDiscriminante(r) == 0;
    }

    public void obtenerRaices(Raices r) {
        if (tieneRaices(r)) {
            System.out.println((-r.getB() - (Math.sqrt((Math.pow(r.getB(), 2) - (4 * r.getA() * r.getC()))))) / 2 * r.getA() + "\n");
            System.out.println((-r.getB() + (Math.sqrt((Math.pow(r.getB(), 2) - (4 * r.getA() * r.getC()))))) / 2 * r.getA());
        }

    }

    public void obtenerRaiz(Raices r) {
        if (tieneRaiz(r)) {
            System.out.println(getDiscriminante(r));
        }
    }

    public void calcular(Raices r) {
        if (tieneRaiz(r)) {
            obtenerRaiz(r);
            System.out.println("Tiene 1");

        } else if (tieneRaices(r)) {
            obtenerRaices(r);
            System.out.println("Tiene 2");
        } else {
            System.out.println("No se obtuvo solucion");
        }
    }

}
