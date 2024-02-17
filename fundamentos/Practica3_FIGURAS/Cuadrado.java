package Figura;
/*
 *  PRECTICA DE CLASE #3 CLASE FIGURA
 *	Universidad Politécnica de Tlaxcala
	Ingeniería en Tecnologías de la información
	Alumnos:
	1. Roman Tecpa Perez (2231123458)
	2. Alan Méndez Hernández (2231123444),
	3. Miguel Ángel Mata Tehozol (2231123443).
	Grupo: 5I
	Turno: Vespertino
	Profesor: Catedrático Saúl Olaf Loaiza Meléndez

 */
public class Cuadrado extends Rectangulo {
    // Constructor vacío de la clase Cuadrado
    public Cuadrado() {
        super(); // Llama al constructor vacío de la superclase Rectangulo
    }

    // Constructor que recibe el lado
    public Cuadrado(double lado) {
        super(lado, lado); // Llama al constructor de la superclase Rectangulo con el mismo lado para altura y ancho
    }

    // Constructor que recibe el lado, color y si está relleno o no
    public Cuadrado(double lado, String color, boolean relleno) {
        super(lado, lado, color, relleno); // Llama al constructor de la superclase Rectangulo
    }
        
    // Getter y setter para el lado
    public double getLado() {
        return getAltura(); // El lado es igual a la altura o al ancho (son iguales)
    }

    public void setLado(double lado) {
        setAltura(lado); // Seteamos tanto la altura como el ancho al valor del lado
        setAncho(lado);
    }

    // Método para calcular el área (sobrescrito de la clase Rectangulo)
    @Override
    public double getArea() {
        double lado = getLado();
        return lado * lado; // Área de un cuadrado: lado * lado
    }

    // Método para calcular el perímetro (sobrescrito de la clase Rectangulo)
    @Override
    public double getPerimetro() {
        double lado = getLado();
        return 4 * lado; // Perímetro de un cuadrado: 4 * lado
    }

    // Sobrescritura del método toString para incluir la información del cuadrado
    @Override
    public String toString() {
        return "Soy un cuadrado con lado = " + getLado() + ", esta es mi superclase: " + super.toString();
    }
}
