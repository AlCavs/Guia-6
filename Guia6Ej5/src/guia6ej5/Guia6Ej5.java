/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia6ej5;

import java.util.Scanner;

/**
 *
 * @author NiLe
 */
public class Guia6Ej5 {

    /**
     * @param args the command line arguments Realizar una clase llamada Cuenta
     * (bancaria) que debe tener como mínimo los atributos: numeroCuenta
     * (entero), el DNI del cliente (entero largo) y el saldo actual (entero).
     * Las operaciones asociadas a dicha clase son: a) Constructor por defecto y
     * constructor con DNI, saldo, número de cuenta e interés. b) Agregar los
     * métodos getters y setters correspondientes c) Metodo para crear un objeto
     * Cuenta, pidiéndole los datos al usuario. d) Método ingresar(double
     * ingreso): el método recibe una cantidad de dinero a ingresar y se la
     * sumara a saldo actual. e) Método retirar(double retiro): el método recibe
     * una cantidad de dinero a retirar y se la restará al saldo actual. Si la
     * cuenta no tiene la cantidad de dinero a retirar, se pondrá el saldo
     * actual en 0. f) Método extraccionRapida(): le permitirá sacar solo un 20%
     * de su saldo. Validar que el usuario no saque más del 20%. g) Método
     * consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
     * h) Método consultarDatos(): permitirá mostrar todos los datos de la
     * cuenta
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int menu = 0;
        CuentaBancaria c1 = new CuentaBancaria();
        c1.crearCuenta();
        boolean bandera = true;
        do {
            System.out.println("Seleccione una opcion del menu: \n1 - Ingresar saldo\n2 - Retirar efectivo\n3 - Extraccion Express\n4 - Consultar Saldo\n5 - Consultar Datos\n6 - Salir");
            switch (menu = scan.nextInt()) {
                case 1:
                    System.out.println("Indique el monto a ingresar:");
                    c1.ingresar(scan.nextDouble());
                    break;

                case 2:
                    System.out.println("Indique el monto a retirar:");
                    c1.retirar(scan.nextDouble());
                    break;
                case 3:
                    System.out.println("Retirado!");
                    c1.retiroExpress();
                    break;
                case 4:
                    c1.consultaSaldo();
                    break;
                case 5:
                    System.out.println(c1);
                    break; 
                case 6:
                    System.out.println("Muchas gracias por utilizar nuestro servicio");
                    bandera = false;
                    break;
                default:
                    System.out.println("Ingreso una opcion incorrecta");
            }
        } while (bandera);

    }

}
