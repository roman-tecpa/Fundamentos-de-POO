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


public class Rectangulo extends Figura {
private double ancho;
private double altura;

 // Constructores
//Constructor vacío de la clase Rectangulo
public Rectangulo() {
	super(); // Llama al constructor vacío de la superclase Figura
	this.ancho = 0.0;
	this.altura = 0.0;
 }

 public Rectangulo(double ancho ,double altura) {
     super();
     this.ancho = ancho;
     this.altura = altura;
 }
 public Rectangulo( double ancho, double altura,String color, boolean relleno) {
     super(color, relleno);
     this.ancho = ancho;
     this.altura = altura;

 }
 // Getters y setters para altura y ancho
 public double getAncho() {
	return ancho;
}
public double getAltura() {
	return altura;
}
public void setAncho(double ancho) {
	this.ancho = ancho;
}
public void setAltura(double altura) {
	this.altura = altura;
}

 // Método para calcular el área
 public double getArea() {
     return altura * ancho;
 }


// Método para calcular el perímetro
 public double getPerimetro() {
     return 2 * (altura + ancho);
 }

 // Sobrescritura del método toString
 @Override
 public String toString() {
     return "Soy un rectángulo con altura = " + altura + " y ancho = " + ancho + ", esta es mi superclase: " + super.toString();
 }
}

