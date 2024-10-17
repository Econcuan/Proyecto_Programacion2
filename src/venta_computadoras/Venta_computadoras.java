package venta_computadoras;

import java.util.Scanner;
import venta_computadoras.manager.SueldosManager;
import venta_computadoras.database.Empleados;
import venta_computadoras.manager.MotivacionManager;

public class Venta_computadoras {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        // Instanciamos la clase Empleados para obtener la lista predefinida
        Empleados listaEmpleados = new Empleados(); // Cargamos la lista de empleados predefinidos

        do {
            System.out.println("\n--- Seleccione el número de módulo ---");
            System.out.println("1. Estructura organizaciones");
            System.out.println("2. Estrategia de contratación");
            System.out.println("3. Personal en las áreas, de compras, ventas, marketing, IT, recursos humanos, finanzas");
            System.out.println("4. Gestión de Gastos Fijos y Variables");
            System.out.println("5. Gestión de Sueldos"); // Uso de herencia, se hereda del objeto empleado para asignar y mostrar sueldos
            System.out.println("6. Gestión de Motivación a Empleados"); // Opción para motivación a empleados
            System.out.println("20. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    // Aquí estaría la lógica de estructura de organizaciones
                    break;

                case 4:
                    // Aquí estaría la lógica de gestión de gastos
                    break;

                case 5:
                    // Para gestionar sueldos, pasamos la lista de empleados predefinidos
                    SueldosManager gestorDeSueldos = new SueldosManager(listaEmpleados.listEmpleados); // Pasar la lista predefinida
                    gestorDeSueldos.gestionarSueldos(); // Llamar al método para gestionar sueldos
                    break;

                case 6:
                    // Para gestionar motivaciones, pasamos la lista de empleados
                    MotivacionManager gestorDeMotivacion = new MotivacionManager(listaEmpleados);
                    gestorDeMotivacion.gestionarMotivaciones(); // Llamar al método para gestionar motivaciones
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