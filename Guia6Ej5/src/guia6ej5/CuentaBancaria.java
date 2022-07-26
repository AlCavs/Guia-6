/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia6ej5;

import java.util.Scanner;

/**
 *
 * @author NiLe
 * Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero). Las
operaciones asociadas a dicha clase son:
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
b) Agregar los métodos getters y setters correspondientes
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se la
restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se pondrá el
saldo actual en 0.
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
public class CuentaBancaria {
    private int numeroCuenta;
    private long dni;
    private int saldo;
    

    public CuentaBancaria() {
    }

    public CuentaBancaria(int numeroCuenta, long dni, int saldo) {
        this.numeroCuenta = numeroCuenta;
        this.dni = dni;
        this.saldo = saldo;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public long getDni() {
        return dni;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
    public void crearCuenta(){
        Scanner scan =new Scanner(System.in);
        System.out.println("Ingrese su numero de cuenta");
        this.numeroCuenta = scan.nextInt();
        
        System.out.println("Ingrese su numero de DNI");
        this.dni = scan.nextLong();
              
        System.out.println("Ingrese su saldo actual");
        this.saldo = scan.nextInt();
    }
    
    public void ingresar(double ingreso){
        this.saldo += ingreso;
    }
    public void retirar(double retiro){
        if (retiro>0 && retiro<=this.saldo){
        this.saldo -= retiro;
        }else{
            if(retiro>this.saldo){
                System.out.println("Mijito, usted no tiene tanto");
            }else{
                if(this.saldo==0){
                    System.out.println("No tenes un mango, rata coluda");
                }
                    
                }
        }
        }
    public void retiroExpress(){
        this.saldo -= saldo*.2;
    }
    public void consultaSaldo(){
        System.out.println("Su saldo es de $"+ this.saldo);
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "numeroCuenta=" + numeroCuenta + ", dni=" + dni + ", saldo=" + saldo + '}';
    }
    
}
