package Animal;

public class Animal {
    private String nombre;
    private int edad;
    private static int numAnimales = 0;

    public Animal() {
        this.nombre = "Desconocido";
        this.edad = 0;
        numAnimales++;
    }

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        numAnimales++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Hay " + numAnimales + " animales creados. Yo me llamo " + nombre + " y tengo " + edad + " años";
    }
}
