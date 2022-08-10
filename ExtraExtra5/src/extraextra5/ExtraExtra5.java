/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package extraextra5;

import entidades.Triangulo;
import servicios.ServicioTriangulo;

/**
 *
 * @author NiLe
 */
public class ExtraExtra5 {

    /**
     * @param args the command line arguments Definir una clase triangulo que
     * modelara triángulos isósceles . Definir los atributos necesarios para
     * operar. Crear los métodos correspondientes a la clase Entidad. Crear un
     * arreglo con 4 objetos de la clase Crear los siguientes métodos: •
     * Calcular área • Calcular perímetro • Mostrar los datos del triangulo que
     * tenga el área de mayor superficie
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ServicioTriangulo st = new ServicioTriangulo();

        Triangulo[] t = new Triangulo[4];
        
        for (int i = 0; i < 4; i++) {
            t[i] = st.crearTriangulo();
            st.calcularArea(t[i]);
        }
        int cont = 0;
        int pos = 0;
        double max = 0;
        for (Triangulo i : t ) {
            
            if (i.getArea() > max){
            pos = cont; 
            max = i.getArea();
            }
            cont ++;
        }
        System.out.println("Los datos del triangulo de mayor superficie son:\nArea: " + t[pos].getArea());
        st.calcularPerimetro(t[pos]);
        System.out.println("Sus lados miden:\nLados opuestos: " + t[pos].getLado1() + " cada uno\nBase: " + t[pos].getLado3B());
        
                
    }

}
