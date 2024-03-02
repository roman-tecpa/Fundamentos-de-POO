package Animal;

import java.util.Objects;

public class Animal implements Cloneable {
    private String nombre;
    private int edad;
    private static int numAnimales = 0;

    /**
     * Constructor por defecto de la clase Animal.
     */
    public Animal() {
        this("Desconocido", 0);
    }

    /**
     * Constructor de la clase Animal con parámetros.
     *
     * @param nombre El nombre del animal.
     * @param edad   La edad del animal.
     */
    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        numAnimales++;
    }

    /**
     * Método getter para obtener el nombre del animal.
     *
     * @return El nombre del animal.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método setter para establecer el nombre del animal.
     *
     * @param nombre El nuevo nombre del animal.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método getter para obtener la edad del animal.
     *
     * @return La edad del animal.
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Método setter para establecer la edad del animal.
     *
     * @param edad La nueva edad del animal.
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Método que compara este objeto Animal con otro objeto para igualdad.
     *
     * @param obj El objeto con el que se compara.
     * @return true si los objetos son iguales, false en caso contrario.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Animal other = (Animal) obj;
        return edad == other.edad && Objects.equals(nombre, other.nombre);
    }

    /**
     * Método para realizar la clonación del objeto.
     *
     * @return Una copia del objeto.
     * @throws CloneNotSupportedException Si la clonación no es compatible.
     */
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    /**
     * Método que retorna una representación en forma de cadena del objeto Animal.
     *
     * @return Una cadena que representa el objeto Animal.
     */
    @Override
    public String toString() {
        return "Hay " + numAnimales + " animales creados. Yo me llamo " + nombre + " y tengo " + edad + " años";
    }
}
