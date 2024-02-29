package Animal;

/**
 * Clase que contiene el punto de entrada principal del programa.
 */
public class Main {
    /**
     * Punto de entrada principal del programa.
     * @param args Los argumentos de la línea de comandos (no se utilizan en este programa).
     */
    public static void main(String[] args) {

        // Crear instancias de Animales
        Animal animal1 = new Animal(); // Crear un animal sin especificar nombre ni edad
        Animal animal2 = new Animal("Mariposa", 5); // Crear un animal con nombre "Mariposa" y edad 5

        // Crear instancias de Perros
        Perro perro1 = new Perro(); // Crear un perro sin especificar nombre, edad ni raza
        Perro perro2 = new Perro("Tronquitos", 5, "San bernardo"); // Crear un perro con nombre "Tronquitos", edad 5 y raza "San bernardo"
        Perro perro3 = new Perro("Princesa", 5); // Crear un perro con nombre "Princesa" y edad 5

        // Crear instancias de Gatos
        Gato gato1 = new Gato(); // Crear un gato sin especificar nombre ni edad
        Gato gato2 = new Gato("Mandarino", 1); // Crear un gato con nombre "Mandarino" y edad 1
        Gato gato3 = new Gato("Kurt", 1 , 6); // Crear un gato con nombre "Kurt", edad 1 y 6 vidas

        // Imprimir información de los Animales
        System.out.println("------------ Información de Animales ------------");
        System.out.println("ANIMAL 1:");
        System.out.println(animal1);
        System.out.println("ANIMAL 2:");
        System.out.println(animal2);

        // Imprimir información de los Perros
        System.out.println("\n------------ Información de Perros ------------");
        System.out.println("PERRO 1:");
        System.out.println(perro1);
        System.out.println("\nPERRO 2:");
        System.out.println(perro2);
        System.out.println("\nPERRO 3:");
        System.out.println(perro3);

        // Imprimir información de los Gatos
        System.out.println("\n------------ Información de Gatos ------------");
        System.out.println("GATO 1:");
        System.out.println(gato1);
        System.out.println("\nGATO 2:");
        System.out.println(gato2);
        System.out.println("\nGATO 3:");
        System.out.println(gato3);

        // Reducción de una vida al GATO 2 y mostrar información actualizada
        gato2.Muelto();
        System.out.println("\nDespués de quitar una vida a GATO 2:");
        System.out.println(gato2);
    }
}
