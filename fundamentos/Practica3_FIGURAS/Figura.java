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

public class Figura {
 // Atributos
 private String color;
 private boolean relleno;

 // Constructores
 public Figura() {
     this.color = "rojo";
     this.relleno = true;
 }

 public Figura(String color, boolean relleno) {
     this.color = color;
     this.relleno = relleno;
 }

 // Getters y setters
 public String getColor() {
     return color;
 }

 public void setColor(String color) {
     this.color = color;
 }

 public boolean estaRelleno() {
     return relleno;
 }

 public void setRelleno(boolean relleno) {
     this.relleno = relleno;
 }

 // Método toString
 @Override
 public String toString() {
     String estadoRelleno = relleno ? "rellena" : "no rellena";
     return "Soy una figura de color " + color + " y " + estadoRelleno;
 }
}

 

