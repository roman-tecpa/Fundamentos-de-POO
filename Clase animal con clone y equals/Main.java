package Animal;

/**
 * Esta clase contiene el punto de entrada principal del programa.
 */
public class Main {
    /**
     * Punto de entrada principal del programa.
     *
     * @param args Los argumentos de la línea de comandos (no se utilizan en este programa).
     * @throws CloneNotSupportedException Si la clonación no es compatible.
     */
    public static void main(String[] args) throws CloneNotSupportedException {
        // Crear instancias de animales
        Animal animal1 = new Animal(); // Crear un animal sin especificar nombre ni edad (predeterminado)
        Animal animal2 = new Animal("Mariposa", 5); // Crear un animal con nombre "Mariposa" y edad 5
        Animal animal3 = (Animal) animal2.clone(); // Clonar objeto animal2

        // Crear instancias de perros
        Perro perro1 = new Perro(); // Crear un perro sin especificar nombre, edad o raza (predeterminado)
        Perro perro2 = new Perro("Tronquitos", 5, "San bernardo"); // Crear un perro con nombre "Tronquitos", edad 5 y raza "San bernardo"
        Perro perro3 = new Perro("Princesa", 5); // Crear un perro con nombre "Princesa" y edad 5
        Perro perro4 = (Perro) perro2.clone(); // Clonar objeto perro2

        // Crear instancias de gatos
        Gato gato1 = new Gato(); // Crear un gato sin especificar nombre o edad (predeterminado)
        Gato gato2 = new Gato("Mandarino", 1); // Crear un gato con nombre "Mandarino" y edad 1
        Gato gato3 = new Gato("Kurt", 1, 6); // Crear un gato con nombre "Kurt", edad 1 y 6 vidas
        Gato gato4 = (Gato) gato3.clone(); // Clonar objeto gato3

        // Imprimir información sobre los animales
        System.out.println("------------ Información de Animales ------------");
        System.out.println("ANIMAL 1:");
        System.out.println(animal1);
        System.out.println("ANIMAL 2:");
        System.out.println(animal2);
        System.out.println("ANIMAL 3:");
        System.out.println(animal3);
        System.out.println("\n###########Uso de los métodos clone() y equals() en Animal###########");
        System.out.println("\nEL USO DEL METODO CLONE SE RALIZO DE EL ANIMAL 2 A ANIMAL 3");
        if (animal3.equals(animal1)) {
            System.out.println("Los animales son iguales");
        } else {
            System.out.println("Los animales son diferentes");
        }

        // Imprimir información sobre los perros
        System.out.println("\n------------ Información de Perros ------------");
        System.out.println("PERRO 1:");
        System.out.println(perro1);
        System.out.println("\nPERRO 2:");
        System.out.println(perro2);
        System.out.println("\nPERRO 3:");
        System.out.println(perro3);
        System.out.println("\nPERRO 4:");
        System.out.println(perro4);
        System.out.println("\n###########Uso de los métodos clone() y equals() en Perros###########");
        System.out.println("\nEL USO DEL METODO CLONE SE RALIZO DE EL PERRO 2 A PERRO 4");
        if (perro4.equals(perro2)) {
            System.out.println("Los perros son iguales");
        } else {
            System.out.println("Los perros son diferentes");
        }

        // Imprimir información sobre los gatos
        System.out.println("\n------------ Información de Gatos ------------");
        System.out.println("GATO 1:");
        System.out.println(gato1);
        System.out.println("\nGATO 2:");
        System.out.println(gato2);
        System.out.println("\nGATO 3:");
        System.out.println(gato3);
        System.out.println("\nGATO 4:");
        System.out.println(gato4);
        System.out.println("\n###########Uso de los métodos clone() y equals() en Gatos###########");
        System.out.println("\nEL USO DEL METODO CLONE SE RALIZO DE EL GATO 3 A GATO 4");
        if (gato4.equals(gato3)) {
            System.out.println("Los gatos son iguales");
        } else {
            System.out.println("Los gatos son diferentes");
        }

        // Reducción de una vida del GATO 2 y mostrar información actualizada
        gato2.perderVida();
        System.out.println("\nDespués de quitar una vida a GATO 2:");
        System.out.println(gato2);
    }
}
