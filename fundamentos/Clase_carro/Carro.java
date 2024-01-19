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
        Carro Carro1 = new Carro();

        Carro1.setAnio(2000);
        Carro1.setColor("Rosa");
        Carro1.setModelo("Nissan GTR");

        System.out.println(Carro1.getAnio());
        System.out.println(Carro1.getColor());
        System.out.println(Carro1.getModelo() + "\n");

        Carro Carro2 = new Carro();
        Carro2.setAnio(2019);
        Carro2.setCilindros(4);
        Carro2.setModelo("Tsuru");
        System.out.println(Carro2.getAnio());
        System.out.println(Carro2.getCilindros());
        System.out.println(Carro2.getModelo() + "\n");

        Carro Carro3 = new Carro();

        Carro3.setMarca("Chevrolet");
        Carro3.setPlacas("74-08-RA");
        Carro3.setPuertas(4);
        System.out.println(Carro3.getMarca());
        System.out.println(Carro3.getPlacas());
        System.out.println(Carro3.getPuertas());
    }
}
