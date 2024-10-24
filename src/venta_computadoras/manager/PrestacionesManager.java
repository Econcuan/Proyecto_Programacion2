/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package venta_computadoras.manager;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import venta_computadoras.database.Empleados;
import venta_computadoras.objetos.PrestacionModel;
import venta_computadoras.objetos.empleadosModel;





public class PrestacionesManager extends Empleados {

    // Mapa para almacenar las prestaciones de cada empleado por su código
    private Map<String, PrestacionModel> prestacionesMap;

    // Constructor
    public PrestacionesManager() {
        super(); // Inicializa empleados
        prestacionesMap = new HashMap<>();
        inicializarPrestaciones(); // Inicializa las prestaciones para cada empleado
    }

    // Método para inicializar las prestaciones de cada empleado
    private void inicializarPrestaciones() {
        for (empleadosModel empleado : listEmpleados) {
            prestacionesMap.put(empleado.getCodigoEmpleado(), new PrestacionModel()); // Asigna un objeto PrestacionModel por empleado
        }
    }

    // Método para gestionar las prestaciones de empleados
    public void gestionarPrestaciones() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Gestión de Prestaciones ---");
            System.out.println("1. Ver prestaciones de los empleados");
            System.out.println("2. Asignar bono");
            System.out.println("3. Asignar beneficio");
            System.out.println("4. Volver");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    mostrarPrestaciones();
                    break;

                case 2:
                    asignarBono(scanner);
                    break;

                case 3:
                    asignarBeneficio(scanner);
                    break;

                case 4:
                    System.out.println("Volviendo al menú principal...");
                    break;

                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
                    break;
            }
        } while (opcion != 4);
    }

    // Método para mostrar las prestaciones de los empleados
    private void mostrarPrestaciones() {
        System.out.println("\n--- Prestaciones de Empleados ---");
        for (Map.Entry<String, PrestacionModel> entry : prestacionesMap.entrySet()) {
            System.out.println("Empleado: " + entry.getKey() + " - Beneficios: " + entry.getValue().getBeneficios() + " - Bono: Q" + entry.getValue().getBono());
        }
    }

    // Método para asignar un bono a un empleado
    private void asignarBono(Scanner scanner) {
        System.out.print("Ingrese el código del empleado: ");
        String codigoEmpleado = scanner.nextLine();

        if (prestacionesMap.containsKey(codigoEmpleado)) {
            System.out.print("Ingrese el monto del bono: ");
            double bono = scanner.nextDouble();
            scanner.nextLine(); // Limpiar el buffer

            // Asigna el bono al empleado
            prestacionesMap.get(codigoEmpleado).asignarBono(bono);

            System.out.println("Bono asignado exitosamente.");
        } else {
            System.out.println("Código de empleado no válido.");
        }
    }

    // Método para asignar un beneficio o prestación a un empleado
    private void asignarBeneficio(Scanner scanner) {
        System.out.print("Ingrese el código del empleado: ");
        String codigoEmpleado = scanner.nextLine();

        if (prestacionesMap.containsKey(codigoEmpleado)) {
            System.out.print("Ingrese el beneficio o prestación: ");
            String beneficio = scanner.nextLine();

            // Asigna el beneficio al empleado
            prestacionesMap.get(codigoEmpleado).agregarBeneficio(beneficio);

            System.out.println("Beneficio asignado exitosamente.");
        } else {
            System.out.println("Código de empleado no válido.");
        }
    }
}
