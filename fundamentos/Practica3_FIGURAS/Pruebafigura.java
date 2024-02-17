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

class PruebaFigura {
    public static void main(String[] args) {
        // Creación de figuras
        
        // Prueba de la clase figura
        System.out.println("_________________________________________________________");
        System.out.println("\nPRUEBA DE LA CLASE FIGURA");
        System.out.println("_________________________________________________________");
        Figura figura1 = new Figura();
        Figura figura2 = new Figura("azul", false);

        System.out.println("Figura 1: " + figura1); // Imprime: Soy una figura de color rojo y rellena
        System.out.println("Figura 2: " + figura2); // Imprime: Soy una figura de color azul y no rellena

        // Prueba de la subclase Rectángulo
        System.out.println("_________________________________________________________");
        System.out.println("\nPRUEBA DE LA SUBCLASE RECTANGULO");
        System.out.println("_________________________________________________________");
        // Crear un rectángulo con valores predeterminados
        Rectangulo rectangulo1 = new Rectangulo();
        System.out.println("*Rectángulo 1:\n" + rectangulo1.toString() + "\nÁrea: " + rectangulo1.getArea() + "\nPerímetro: " + rectangulo1.getPerimetro());

        // Crear un rectángulo con valores especificados
        Rectangulo rectangulo2 = new Rectangulo(3.0, 4.0);
        System.out.println("\n*Rectángulo 2:\n" + rectangulo2.toString() + "\nÁrea: " + rectangulo2.getArea() + "\nPerímetro: " + rectangulo2.getPerimetro());

        // Crear un rectángulo con valores especificados y color
        Rectangulo rectangulo3 = new Rectangulo(5.0,6.0,"verde",true);
        System.out.println("\n*Rectángulo 3:\n" + rectangulo3.toString() + "\nÁrea: " + rectangulo3.getArea() + "\nPerímetro: " + rectangulo3.getPerimetro());

        // Prueba de la subclase Cuadrado
        System.out.println("_________________________________________________________");
        System.out.println("\nPRUEBA DE LA SUBCLASE CUADRADO");
        System.out.println("_________________________________________________________");
        Cuadrado cuadrado1 = new Cuadrado(); // Cuadrado con lado por defecto
        Cuadrado cuadrado2 = new Cuadrado(6.0); // Cuadrado con lado especificado
        Cuadrado cuadrado3 = new Cuadrado(8.0, "azul", true); // Cuadrado con lado, color y si está relleno

        // Imprimir información de los cuadrados
        System.out.println("Información de los cuadrados:");
        System.out.println(cuadrado1);
        System.out.println(cuadrado2);
        System.out.println(cuadrado3);

        // Cambiar el lado de cuadrado1
        cuadrado1.setLado(10.0);

        // Imprimir información actualizada de cuadrado1
        System.out.println("\nCuadrado 1 después de cambiar el lado:");
        System.out.println(cuadrado1);

        // Calcular y mostrar el área y el perímetro de cada cuadrado
        System.out.println("\nÁrea y perímetro de los cuadrados:");
        System.out.println("Área de cuadrado1: " + cuadrado1.getArea());
        System.out.println("Perímetro de cuadrado1: " + cuadrado1.getPerimetro());
        System.out.println("Área de cuadrado2: " + cuadrado2.getArea());
        System.out.println("Perímetro de cuadrado2: " + cuadrado2.getPerimetro());
        System.out.println("Área de cuadrado3: " + cuadrado3.getArea());
        System.out.println("Perímetro de cuadrado3: " + cuadrado3.getPerimetro());
        System.out.println("_________________________________________________________");
        System.out.println("PRUEBA DE LA SUBCLASE CIRCULO");
        System.out.println("_________________________________________________________");
        Circulo circulo1 = new Circulo(); // Círculo con radio por defecto
        Circulo circulo2 = new Circulo(5.0); // Círculo con radio especificado
        Circulo circulo3 = new Circulo(8.0, "rojo", false); // Círculo con radio, color y si está relleno

        // Imprimir información de los círculos
        System.out.println("Información de los círculos:");
        System.out.println(circulo1);
        System.out.println(circulo2);
        System.out.println(circulo3);

        // Cambiar el radio de circulo1
        circulo1.setRadio(10.0);

        // Imprimir información actualizada de circulo1
        System.out.println("\nCírculo 1 después de cambiar el radio:");
        System.out.println(circulo1);

        // Calcular y mostrar el área y la circunferencia de cada círculo
        System.out.println("\nÁrea y circunferencia de los círculos:");
        System.out.println("Área de circulo1: " + circulo1.getArea());
        System.out.println("Circunferencia de circulo1: " + circulo1.getPerimetro());
        System.out.println("Área de circulo2: " + circulo2.getArea());
        System.out.println("Circunferencia de circulo2: " + circulo2.getPerimetro());
        System.out.println("Área de circulo3: " + circulo3.getArea());
        System.out.println("Circunferencia de circulo3: " + circulo3.getPerimetro());
   
   }
}