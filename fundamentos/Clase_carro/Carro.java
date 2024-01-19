package Mantenimiento;

public class Carro {
    private String marca;
    private String modelo;
    private String color;
    private int puertas;
    private int cilindros;
    private int anio;
    private String placas;
    private Double kmRecorridos;
    private Double litGas;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public int getCilindros() {
        return cilindros;
    }

    public void setCilindros(int cilindros) {
        this.cilindros = cilindros;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getPlacas() {
        return placas;
    }

    public void setPlacas(String placas) {
        this.placas = placas;
    }

    public Double getKmRecorridos() {
        return kmRecorridos;
    }

    public void setKmRecorridos(Double kmRecorridos) {
        this.kmRecorridos = kmRecorridos;
    }

    public Double getLitGas() {
        return litGas;
    }

    public void setLitGas(Double litGas) {
        this.litGas = litGas;
    }

    public static void main(String[] args) {
        Carro Carro1 =  new Carro();
		System.out.println("ESTE ES EL CARRO 1");
		Carro1.setAnio(2000);
		Carro1.setColor("Rosa");
		Carro1.setModelo("Nissan GTR");
		
		System.out.println("AÑO DEL CARRO" + Carro1.getAnio());
		System.out.println("COLOR DEL CARRO: "+Carro1.getColor());
		System.out.println("MODELO DE CARRO: "+Carro1.getModelo()+ "\n");
		
		
		Carro Carro2 = new Carro();

		System.out.println("ESTE ES EL CARRO 2");
		Carro2.setAnio(2019);
		Carro2.setCilindros(4);
		Carro2.setModelo("Tsuru");
		System.out.println("AÑO DEL CARRO: "+Carro1.getAnio());
		System.out.println("NUMERO DE CILINDROS DEL CARRO: "+Carro1.getCilindros());
		System.out.println("MODELO DE CARRO: "+Carro1.getModelo()+ "\n");
		
		Carro Carro3 = new Carro();
		System.out.println("ESTE ES EL CARRO 3");
		Carro3.setMarca("Chevrolet");
		Carro3.setPlacas("74-08-RA");
		Carro3.setPuertas(4);
		System.out.println("MARCA DEL CARRO: "+Carro3.getMarca());
		System.out.println("PLACAS DEL CARRO: "+Carro3.getPlacas());
		System.out.println("NUMERO DE PUERTAS DEL CARRO: "+Carro3.getPuertas());
    }
}
