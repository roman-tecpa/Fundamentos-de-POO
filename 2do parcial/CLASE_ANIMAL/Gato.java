package Animal;

public class Gato extends Animal {
	    private int numVidas;

	    public Gato() {
	        this.numVidas = 7;
	    }

	    public Gato(String nombre, int edad, int numVidas) {
	        super(nombre, edad);
	        this.numVidas = numVidas;
	    }

	    public Gato(String nombre, int edad) {
	        super(nombre, edad);
	        this.numVidas = 7;
	    }

	    public int getVida() {
	        return numVidas;
	    }

	    public void Muelto() {
	        if (numVidas > 0) {
	            numVidas--;
	        } else {
	            System.out.println("El gato se quedo sin vidas, quedo tieso");
	        }
	    }

	    @Override
	    public String toString() {
	        return "Hola, soy un GATO, me llamo " + getNombre() + ", tengo " + getEdad() + " años y me quedan " + numVidas + " vidas";
	    }
	}
