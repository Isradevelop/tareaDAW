package tarea6daw.clases;

/**
 * Esta clase permite instanciar objetos de tipo Triangulo.
 * Hereda de la clase Figura
 * 
 * 
 * @author Israel Durán
 */

public class Triangulo extends Figura{
    
    private double base;
    private double altura;
    
    /**
     * Este método permite calcular el área del triangulo
     * 
     * @return Devuelve el área del triangulo
     */

    public double CalcularArea() {        
        return this.area=(base*altura)/2;
     }

    
    /**
     * Este método getter permite acceder al valor de la variable base
     * 
     * @return Devuelve el valor de la variable base
     */
    public double getBase() {
        return base;
    }

    
    /**
     * Este método permite cambiar el valor de la variable base
     * 
     * @param base Define el nuevo valor que tendrá la variable base
     */
    public void setBase(double base) {
        this.base = base;
    }

    
    /**
     * Este método getter permite acceder al valor de la variable altura
     * 
     * @return Devuelve el valor de la variable altura
     */
    public double getAltura() {
        return altura;
    }

    
       /**
     * Este método permite cambiar el valor de la variable altura
     * 
     * @param altura Define el nuevo valor que tendrá la variable altura
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
}
