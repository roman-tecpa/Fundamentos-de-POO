package Animal;

public class Perro extends Animal {
    private String raza;

    /**
     * Constructor por defecto de la clase Perro.
     */
    public Perro() {
        this("Desconocido", 0, "Desconocida");
    }
    
    public Perro(String nombre , int edad) {
    	super();
    }

    /**
     * Constructor de la clase Perro con parámetros.
     *
     * @param nombre El nombre del perro.
     * @param edad   La edad del perro.
     * @param raza   La raza del perro.
     */
    public Perro(String nombre, int edad, String raza) {
        super(nombre, edad);
        this.raza = raza;
    }

    /**
     * Método getter para obtener la raza del perro.
     *
     * @return La raza del perro.
     */
    public String getRaza() {
        return raza;
    }

    /**
     * Método setter para establecer la raza del perro.
     *
     * @param raza La nueva raza del perro.
     */
    public void setRaza(String raza) {
        this.raza = raza;
    }

    /**
     * Método que retorna una representación en forma de cadena del objeto Perro.
     *
     * @return Una cadena que representa el objeto Perro.
     */
    @Override
    public String toString() {
        return "Hola, soy un PERRO, me llamo " + getNombre() + ", tengo " + getEdad() + " años y soy un " + raza;
    }
}
