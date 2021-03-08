package tarea6daw.clases;

/**
 * 
 * @author Israel Durán
 * 
 * De esta clase heredarán las clases Triangulo, Rectangulo y Circulo.
 * 
 * Indica que dichas clases deberán implementar el método CalcularArea de manera obligatoria
 * 
 */

public abstract class Figura {    
    
	double area;
    
    /**
     *
     * @return
     */
    abstract public double CalcularArea();
    
}
