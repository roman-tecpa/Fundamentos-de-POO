package CARRO1;

/*
 * Practica No.6     Grupo  5'I'
   Objetivo: Clase Carro con herencia 
   Fundamentos de programacion orientada a objetos 
   Integrantes: Roman Tecpa Perez, Alan Mendez Hernandez, Miguel Anguel Mata Tehozol
 */

public class Carro {
	
	
	
		private static int numCoche = 0;
		private String marca;
		private int VelActual;
		private String Modelo;
		private int anio;
		
		// Constructor de la clase Carro
				public Carro(String marca, String modelo, int anio, int velActual)
				{
				this.marca = marca;
				this.Modelo = modelo;
				this.anio = anio;
				this.VelActual = velActual;
				contarCoche();
				}
		
		// Metodos Getter y Setter de la Clase Carro
		public String getMarca() {
		return marca;
		}
		public void setMarca(String marca) {
		this.marca = marca;
		}
		public int getVelActual() {
		return VelActual;
		}
		public void setVelActual(int velActual) {
		VelActual = velActual;
		}
		public String getModelo() {
		return Modelo;
		}
		public void setModelo(String modelo) {
		Modelo = modelo;
		}
		public int getAnio() {
		return anio;
		}
		public void setAnio(int anio) {
		this.anio = anio;
		}
		public Carro() {
		contarCoche();
		}

		
		// Metodos de la clase 
		static void contarCoche() {
		numCoche++;
		}
		
		public static int getNumCoche() {
		return numCoche;
		}
		
		public void MostrarInformacion() {
			System.out.println("\n-----------------INFORMACION------------------");
	    	System.out.println("La marca del carro es: " + getMarca());
	    	System.out.println("El modelo del carro es: " + getModelo());
	    	System.out.println("El año del carro es: " + getAnio());
	    	System.out.println("----------------------------------------------");
	    }
		
		
} 
