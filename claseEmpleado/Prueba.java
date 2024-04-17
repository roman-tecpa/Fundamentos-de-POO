package principal;

import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Empleado empleado1 = new Empleado();
        empleado1.mostrarInformacion();
        
        System.out.println("CREACIÓN DEL SEGUNDO EMPLEADO:");
        Empleado empleado2 = crearNuevoEmpleado(scan);
        empleado2.mostrarInformacion();
        
        boolean salir = false;
        while (!salir) {
            System.out.println("SELECCIONA AL EMPLEADO");
            System.out.println("1.- Empleado1");
            System.out.println("2.- Empleado2");
            System.out.println("3.- Salir del programa");
            int opcion = scan.nextInt();
            
            switch(opcion) {
                case 1:
                    mostrarSubMenu(scan, empleado1, empleado2);
                    break;
                case 2:
                    mostrarSubMenu(scan, empleado2, empleado1);
                    break;
                case 3:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elija una opción del 1 al 3.");
            }
        }
 
        scan.close();
    }

    private static void mostrarSubMenu(Scanner scan, Empleado empleado, Empleado otroEmpleado) {
        boolean regresarMenu = false;
        while (!regresarMenu) {
            System.out.println("_______________________________________________________");
            System.out.println("1.- Modificar salario del empleado");
            System.out.println("2.- Calcular la edad del empleado");
            System.out.println("3.- Calcular la antiguedad del empleado");
            System.out.println("4.- Calcular las prestaciones del empleado");
            System.out.println("5.- Calcular diferencia de salarios");
            System.out.println("6.- Calcular auxilio educativo");
            System.out.println("7.- Calcular auxilio educativo con porcentaje");
            System.out.println("8.- Cambiar empleado");
            System.out.println("9.- Informacion del empleado");
            System.out.println("_______________________________________________________");
            System.out.println("10.- Regresar al menú principal");
            System.out.println("11.- Salir del programa");
            System.out.println("_______________________________________________________");
            int opcionE = scan.nextInt();
            
            switch (opcionE) {
                case 1:
                    System.out.println("Ingrese el nuevo salario del empleado " + empleado.getNombre());
                    double nuevoSalario = scan.nextDouble();
                    empleado.setSalario(nuevoSalario);
                    break;
                case 2:
                    System.out.println("La edad del empleado " + empleado.getNombre() + " es de " + empleado.calcularEdad() + " años");
                    break;
                case 3:
                    System.out.println("La antiguedad del empleado " + empleado.getNombre() + " es de " + empleado.calcularAntiguedad() + " años");
                    break;
                case 4:
                    System.out.println("Las prestaciones del empleado " + empleado.getNombre() + " son: " + empleado.calcularPrestaciones());
                    break;
                case 5:
                    double diferenciaSalarios = empleado.DiferenciaSalarios(otroEmpleado);
                    System.out.println("La diferencia de salarios entre " + empleado.getNombre() + " y " + otroEmpleado.getNombre() + " es de: " + diferenciaSalarios);
                    break;
                case 6:
                    double auxilioEducativo = empleado.calcularAuxilioEducativo(empleado.getEmplenumhijos());
                    System.out.println("El auxilio educativo para " + empleado.getNombre() + " es de: " + auxilioEducativo);
                    break;
                case 7:
                    System.out.println("Ingresa el porcentaje del auxiliar educativo: ");
                    double porcentajeAux = scan.nextDouble();
                    double auxilioEducativoPorcent = empleado.calcularAuxilioEducativoPorcent(empleado.getEmplenumhijos(), porcentajeAux);
                    System.out.println("El auxilio educativo para " + empleado.getNombre() + " con un " + porcentajeAux + "% es de: " + auxilioEducativoPorcent);
                    break;
                case 8:
                    cambiarEmpleado(scan, empleado);
                    break;
                case 9:
                    empleado.mostrarInformacion();
                    break;
                case 10:
                    regresarMenu = true;
                    break;
                case 11:
                    System.out.println("¡Gracias por utilizar el programa!");
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Por favor, elija una opción del 1 al 11.");
            }
        }
    }

    private static void cambiarEmpleado(Scanner scan, Empleado empleado) {
        System.out.println("Ingrese los datos del empleado:");
        System.out.println("Nombre: ");
        String nombre = scan.next();
        System.out.println("Apellido: ");
        String apellido = scan.next();
        System.out.println("Género: ");
        String genero = scan.next();
        System.out.println("INGRESAR FECHA DE NACIMIENTO");
        System.out.println("Día de nacimiento: ");
        int diaN = scan.nextInt();
        System.out.println("Mes de nacimiento: ");
        int mesN = scan.nextInt();
        System.out.println("Año de nacimiento: ");
        int anho = scan.nextInt();
        System.out.println("Fecha de ingreso: ");
        System.out.println("Día de ingreso: ");
        int diaI = scan.nextInt();
        System.out.println("Mes de ingreso: ");
        int mesI = scan.nextInt();
        System.out.println("Año de ingreso: ");
        int anhoI = scan.nextInt();
        System.out.println("Salario: ");
        double salarioN = scan.nextDouble();
        System.out.println("Imagen: ");
        String imagen = scan.next();
        System.out.println("Numero de hijos del empleado: ");
        int emplehijos = scan.nextInt();

        Fecha fechaNacimiento = new Fecha(diaN, mesN, anho);
        Fecha fechaIngreso = new Fecha(diaI, mesI, anhoI);

        empleado.cambiarEmpleado(nombre, apellido, genero, fechaNacimiento, fechaIngreso, salarioN, imagen, emplehijos);
    }

    private static Empleado crearNuevoEmpleado(Scanner scan) {
        System.out.println("Ingrese los datos del nuevo empleado");
        System.out.println("Nombre: ");
        String nombre = scan.next();
        System.out.println("Apellido: ");
        String apellido = scan.next();
        System.out.println("Género: ");
        String genero = scan.next();
        System.out.println("Fecha de nacimiento");
        System.out.println("Día de nacimiento: ");
        int diaN = scan.nextInt();
        System.out.println("Mes de nacimiento: ");
        int mesN = scan.nextInt();
        System.out.println("Año de nacimiento: ");
        int anho = scan.nextInt();
        System.out.println("Fecha de ingreso: ");
        System.out.println("Día de ingreso: ");
        int diaI = scan.nextInt();
        System.out.println("Mes de ingreso: ");
        int mesI = scan.nextInt();
        System.out.println("Año de ingreso: ");
        int anhoI = scan.nextInt();
        System.out.println("Salario: ");
        double salarioN = scan.nextDouble();
        System.out.println("Imagen: ");
        String imagen = scan.next();
        System.out.println("Numero de hijos del empleado: ");
        int emplehijos = scan.nextInt();

        Fecha fechaNacimiento = new Fecha(diaN, mesN, anho);
        Fecha fechaIngreso = new Fecha(diaI, mesI, anhoI);

        return new Empleado(nombre, apellido, genero, fechaNacimiento, fechaIngreso, salarioN, imagen, emplehijos);
    }

}
