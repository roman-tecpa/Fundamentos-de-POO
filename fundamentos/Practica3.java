package fundamentos;

import java.util.Scanner;

public class Practica3 {
	
    public static void main(String[] args) {
    	
    	// Practica No. 3
    	// Objetivo: Documentar y analizar los tipos de datos en JAVA 
    	// Alumnos: Roman Tecpa Perez, Miguel Angel Mata Tehozol, Alan Mendez Herndandez
        int numint;
        double numdbl, res1, res2, res3, res4, res5, res6;
        
        // Mensaje de bienvenida
        System.out.println("Bienvenidos, Por favor seguir las instrucciones\n");
        
        // Solicitar y almacenar un número entero
        System.out.println("\nDigite un numero entero");
        
        // Inicializar el objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        numint = scanner.nextInt();
        
        // Solicitar y almacenar un número decimal
        System.out.println("\nDigite un numero decimal");
        numdbl = scanner.nextDouble();
        
        // Realizar operaciones aritmeticas con los datos pedidos
        res1 = numdbl + numint; // en la suma predomina el double; lo convierte en double
        res2 = numint / (int) numdbl; // Se hace la conversión con int para poder dividir en entero
        res3 = numint / numdbl; // domina el double
        res4 = numdbl / numint; // seguirá dominando el double
        res5 = (int) numdbl / numint; // si la variable es de tipo entero y se cambia la de tipo double a entero nos dará un resultado de tipo entero
        res6 = (int) numdbl + numint; // nos dará un resultado de número entero
        
        // Mostrar los resultados de las operaciones anteriores con su respectiva variable donde alamaceno la respuesta
        System.out.println("El resultado será: " + res1);
        System.out.println("El resultado será: " + res2);
        System.out.println("El resultado será: " + res3);
        System.out.println("El resultado será: " + res4);
        System.out.println("El resultado será: " + res5);
        System.out.println("El resultado será: " + res6);
        
        // Cerrar el Scanner al finalizar para liberar recursos
        scanner.close();
    }
}
