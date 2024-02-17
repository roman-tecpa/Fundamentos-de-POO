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


public class Circulo extends Figura {
 private double radio = 1.0;

 // Constructores
 public Circulo() {
     super();
     this.radio = 1.0;
 }

 public Circulo(double radio) {
     super();
     this.radio = radio;
 }

 public Circulo(double radio, String color, boolean relleno) {
     super(color, relleno);
     this.radio = radio;
 }

 // Getter y setter para radio
 public double getRadio() {
     return radio;
 }

 public void setRadio(double radio) {
     this.radio = radio;
 }

 // Métodos adicionales de la subclase e
 public double getArea() {
     return Math.PI * (radio * radio);
 }

 public double getPerimetro() {
     return 2 * Math.PI * radio;
 }

 // sobrescritura del método toString
 @Override
 public String toString() {
     return "Soy un círculo con radio = " + radio + ", esta es mi superclase: " + super.toString();
 }
}
