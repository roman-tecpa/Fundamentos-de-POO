package Animal;

public class Gato extends Animal {
    private int numVidas;

    /**
     * Constructor por defecto de la clase Gato.
     */
    public Gato() {
        this("Desconocido", 0, 7);
    }

    /**
     * Constructor de la clase Gato con parámetros.
     *
     * @param nombre   El nombre del gato.
     * @param edad     La edad del gato.
     * @param numVidas El número de vidas del gato.
     */
    public Gato(String nombre , int edad) {
    	super();
    }
    public Gato(String nombre, int edad, int numVidas) {
        super(nombre, edad);
        this.numVidas = numVidas;
    }

    /**
     * Método getter para obtener el número de vidas del gato.
     *
     * @return El número de vidas del gato.
     */
    public int getNumVidas() {
        return numVidas;
    }

    /**
     * Método que decrementa una vida al gato.
     */
    public void perderVida() {
        if (numVidas > 0) {
            numVidas--;
        } else {
            System.out.println("\n\nEl gato " + getNombre() + " se quedó sin vidas y falleció.");
        }
    }

    /**
     * Método que retorna una representación en forma de cadena del objeto Gato.
     *
     * @return Una cadena que representa el objeto Gato.
     */
    @Override
    public String toString() {
        return "Hola, soy un GATO, me llamo " + getNombre() + ", tengo " + getEdad() + " años y me quedan " + numVidas + " vidas";
    }
}
