package venta_computadoras;

import java.util.Scanner;
import venta_computadoras.manager.SueldosManager;
import venta_computadoras.database.Empleados;
import venta_computadoras.manager.ControlAccesoManager;
import venta_computadoras.manager.ControlEmpleadosManager;
import venta_computadoras.manager.DisenoDepartamentalManager;
import venta_computadoras.manager.EstrategiaManager;
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
            System.out.println("5. Gestión de Sueldos");
            System.out.println("6. Gestión de Motivación a Empleados");
            System.out.println("7. Gestión de Estrategia Empresarial");
            System.out.println("8. Gestión de Diseño Departamental");
            System.out.println("9. Control de Empleados");
            System.out.println("10. Control de Accesos de RRHH"); // NUEVO MÓDULO
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
                    // Gestión de sueldos
                    SueldosManager gestorDeSueldos = new SueldosManager(listaEmpleados.listEmpleados);
                    gestorDeSueldos.gestionarSueldos();
                    break;

                case 6:
                    // Gestión de motivaciones
                    MotivacionManager gestorDeMotivacion = new MotivacionManager(listaEmpleados);
                    gestorDeMotivacion.gestionarMotivaciones();
                    break;

                case 7:
                    // Gestión de estrategia empresarial
                    EstrategiaManager gestorDeEstrategia = new EstrategiaManager(listaEmpleados);
                    gestorDeEstrategia.gestionarEstrategia();
                    break;

                case 8:
                    // Gestión de diseño departamental
                    DisenoDepartamentalManager gestorDeDiseno = new DisenoDepartamentalManager(listaEmpleados);
                    gestorDeDiseno.gestionarDisenoDepartamental();
                    break;

                case 9:
                    // Gestión del control de accesos de RRHH
                    ControlAccesoManager gestorAcceso = new ControlAccesoManager();
                    gestorAcceso.gestionarAccesos();
                    break;

                case 10:
                    // Gestión del control de empleados
                    ControlEmpleadosManager gestorControlEmpleados = new ControlEmpleadosManager();
                    gestorControlEmpleados.gestionarControlEmpleados();

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
