package Mantenimiento;

public class Carro{
	
	private static int numCoche = 0;
	
	private String marca;
	private int VelActual;
	private String Modelo;
	private int anio;
	
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
	
	public Carro(String marca, String modelo, int anio, int velActual) {
		this.marca = marca;
		this.Modelo = modelo;
		this.anio = anio;
		this.VelActual = velActual;
		contarCoche();
	}
	
	static void contarCoche() {
		numCoche++;
	}
	
	public static int getNumCoche() {
		return numCoche;
	}
	
	public static void main(String[] args) {
	    Carro carro1 = new Carro();
	    carro1.setMarca("Tesla");
	    carro1.setModelo("X1");
	    carro1.setVelActual(300);
	    System.out.println("Este es el carro: " + Carro.getNumCoche());
	    System.out.println("La marca del carro1 es: " + carro1.getMarca());
	    System.out.println("El modelo del carro1 es: " + carro1.getModelo());
	    System.out.println("La velocidad del carro1 es: " + carro1.getVelActual());

	    Carro carro2 = new Carro("nissan", "Gtr", 2001, 400);
	    System.out.println("\nEste es el carro: " + Carro.getNumCoche());
	    System.out.println("La marca del carro2 es: " + carro2.getMarca());
	    System.out.println("El modelo del carro2 es: " + carro2.getModelo());
	    System.out.println("La velocidad del carro2 es: " + carro2.getVelActual());

	    Carro carro3 = new Carro("Chevrolet", "Chevy", 2002, 180);
	    System.out.println("\nEste es el carro: " + Carro.getNumCoche());
	    System.out.println("La marca del carro3 es: " + carro3.getMarca());
	    System.out.println("El modelo del carro3 es: " + carro3.getModelo());
	    System.out.println("La velocidad del carro es: " + carro3.getVelActual());
	}

}
