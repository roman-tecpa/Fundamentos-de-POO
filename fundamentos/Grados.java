package Temperatura;
import java.util.Scanner;

public class Grados {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("MENU");
            System.out.println("1.- Calcular de celsius a Fahrenheit");
            System.out.println("2.- Calcular de Fahrenheit a celsius");
            System.out.println("\nIngresa una opcion");
            opcion = scan.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Celsius a Fahrenheit");
                    System.out.println("Ingresa los grados Celsius: ");
                    double celsius = scan.nextDouble();
                    Temperatura temper = new Temperatura(celsius);
                    System.out.println("Temperatura en Fahrenheit: " + temper.celsiusToFahrenheit());
                    break;
                case 2:
                    System.out.println("Fahrenheit a Celsius");
                    System.out.println("Ingresa los grados Fahrenheit: ");
                    double fahrenheit = scan.nextDouble();
                    Temperatura temper1 = new Temperatura(fahrenheit);
                    System.out.println("Temperatura en Celsius: " + temper1.fahrenheitToCelsius());
                    break;
                default:
                    System.out.println("Opción no válida");
            }

            System.out.println("¿Deseas hacer otra conversión? (1: Sí / 0: No)");
        } while (scan.nextInt() == 1);

        scan.close();
    }
}
