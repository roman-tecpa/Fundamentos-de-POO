package Mantenimiento;

public class Main {
	
	public static void main(String[] args) {
		Carro Carro1 =  new Carro();
		
		Carro1.setAnio(2000);
		Carro1.setColor("Rosa");
		Carro1.setModelo("Nissan GTR");
		
		System.out.println(Carro1.getAnio());
		System.out.println(Carro1.getColor());
		System.out.println(Carro1.getModelo()+ "\n");
		
		Carro Carro2 = new Carro();
		Carro2.setAnio(2019);
		Carro2.setCilindros(4);
		Carro2.setModelo("Tsuru");
		System.out.println(Carro1.getAnio());
		System.out.println(Carro1.getCilindros());
		System.out.println(Carro1.getModelo()+ "\n");
		
		Carro Carro3 = new Carro();
		
		Carro3.setMarca("Chevrolet");
		Carro3.setPlacas("74-08-RA");
		Carro3.setPuertas(4);
		System.out.println(Carro3.getMarca());
		System.out.println(Carro3.getPlacas());
		System.out.println(Carro3.getPuertas());

		
		
		
		
		
		
		
	}

}
