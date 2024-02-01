package CARRO1;

/*
 * Practica No.6     Grupo  5'I'
   Objetivo: Clase Carro con herencia 
   Fundamentos de programacion orientada a objetos 
   Integrantes: Roman Tecpa Perez, Alan Mendez Hernandez, Miguel Anguel Mata Tehozol
 */

public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("HERENCIA");
		
		// Carro(String marca, String modelo, int anio, int velActual)
		
		Carro car = new Carro("Chevrolet","Chevy",2004 , 180);
		Camioneta camioneta1 = new Camioneta("Toyota","Hilux",2022,200,5);
		Turismo turist = new Turismo("AUO","FX-517",2015,160,40);
		
		
		car.MostrarInformacion();
		camioneta1.MostrarInformacion();
		turist.MostrarInformacion();
		
	}

}
