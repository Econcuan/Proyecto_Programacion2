package venta_computadoras;

import java.util.Scanner;
import venta_computadoras.controller.Estructura_empleados;
import venta_computadoras.controller.GastosManager;

public class Venta_computadoras {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Seleccione el numero de modulo ---");
            System.out.println("1. Estructura organizaciones");
            System.out.println("2. Estrategia de contratación");
            System.out.println("3. Personal en las áreas, de compras, ventas, marketing, IT, recursos humanos, finanzas");
            System.out.println("4. Gestión de Gastos Fijos y Variables");
            System.out.println("20. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.println("\n \n Las opciones disponibles para Estructura organizaciones son:");
                    Estructura_empleados estructuraEmpleados = new Estructura_empleados();
                    estructuraEmpleados.opcion_empleados();
                    break;

                case 4:
                    System.out.println("\n \n Las opciones disponibles para Gestión de Gastos Fijos y Variables son:");
                    GastosManager gestorDeGastos = new GastosManager(); // Instanciar GastosManager
                    gestorDeGastos.gestionarGastos(); // Llamar al método para gestionar gastos
                    break;

                case 20:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
                    break;
            }
        } while (opcion != 20);

        scanner.close();
    }
}
