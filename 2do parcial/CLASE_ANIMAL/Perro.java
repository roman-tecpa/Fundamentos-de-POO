package Animal;

public class Perro extends Animal {
	    private String raza;

	    public Perro() {
	        this.raza = "Desconocido";
	    }

	    public Perro(String nombre, int edad, String raza) {
	        super(nombre, edad);
	        this.raza = raza;
	    }

	    public Perro(String nombre, int edad) {
	        super(nombre, edad);
	        this.raza = "Desconocido";
	    }

	    public String getRaza() {
	        return raza;
	    }

	    public void setRaza(String raza) {
	        this.raza = raza;
	    }

	    @Override
	    public String toString() {
	        return "Hola, soy un PERRO, me llamo " + getNombre() + ", tengo " + getEdad() + " años y soy un " + raza;
	    }
}