package CARRO1;

/*
 * Practica No.6     Grupo  5'I'
   Objetivo: Clase Carro con herencia 
   Fundamentos de programacion orientada a objetos 
   Integrantes: Roman Tecpa Perez, Alan Mendez Hernandez, Miguel Anguel Mata Tehozol
 */

public class Camioneta extends Carro{
    private int asientos;

    // Constructor de la subclase Camioneta
    public Camioneta(String marca, String modelo, int anio, int asientos, int velActual) {
        super(marca, modelo, anio,  velActual);
        this.asientos = asientos;
        contarCoche();
    }
    //Metodos de la Subclase
    public int getAsientos() {
		return asientos;
	}
	public void MostrarInformacion() {
		System.out.println("\n-----------------INFORMACION------------------");
    	System.out.println("La marca de la camioneta es: " + getMarca());
    	System.out.println("El modelo de la camioneta es: " + getModelo());
    	System.out.println("El año de la camioneta es: " + getAnio());
    	System.out.println("El numero de asientos es de: " + getAsientos());
    	System.out.println("----------------------------------------------");
    }
	


}
