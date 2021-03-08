
/*
*
*Clase main de la aplicación
*
*@autor: Israel Duran
*@version: 09/02/2021
*
*/
package tarea6daw.clases;

import tarea6daw.clases.Circulo;
import tarea6daw.clases.Figura;
import tarea6daw.clases.Rectangulo;
import tarea6daw.clases.Triangulo;

/**
 *
 * @author PC
 */
public class Main {
    /**
     * Esta clase permite instanciar objetos de tipo Circulo, Rectangulo y Rectangulo
     * 
     * @param args recibe un parámetro de tipo string
     * 
     * Muestra por consola el área de los objetos instanciados
     * 
     * 
     */
    public static void main(String[] args) {
        
        Circulo circulo = new Circulo();
        Rectangulo rectangulo = new Rectangulo();
        Triangulo triangulo = new Triangulo();
        
        circulo.setRadio(44.55);
        rectangulo.setBase(30);
        rectangulo.setAltura(40);
        triangulo.setBase(50);
        triangulo.setAltura(60);
        
        System.out.println("Area del circulo "+calcularArea(circulo));
        System.out.println("Area del rectangulo "+calcularArea(rectangulo));
        System.out.println("Area del Triangulo "+calcularArea(triangulo));
       }
    /**
     * Permite calcular el área de un objeto de tipo Figura
     * 
     * @param f Recibe un objeto de tipo figura
     * @return Devuelve el área del objeto pasado como parámetro
     */
    public static double calcularArea(Figura f){ // Ejemplo de uso de polimorfismo
        
        return f.CalcularArea();
    }
}
