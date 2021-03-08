



package tarea6daw.clases;

import tarea6daw.clases.Figura;

/**
 * Esta clase permite instanciar objetos de tipo Rectangulo.
 * Hereda de la clase Figura
 * 
 * 
 * @author Israel Durán
 */

public class Circulo extends Figura{
    
    final double pi=3.1416;
    private double radio;

    
    /**
     * Este método permite calcular el área del circulo
     * 
     * @return Devuelve el área del circulo
     */
    public double CalcularArea() {        
        return this.area=pi*radio*radio;
     }

    
    /**
     * Este método permite acceder al valor de la variable radio
     * 
     * @return Devuelve el valor de la variable radio
     */
    public double getRadio() {
        return radio;
    }

    
    /**
     * Este método permite cambiar el valor de la variable radio
     * 
     * @param radio Define el nuevo valor que tendrá la variable radio
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }
    
}
