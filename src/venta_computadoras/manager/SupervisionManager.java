/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package venta_computadoras.manager;

import venta_computadoras.database.Empleados;
import venta_computadoras.objetos.SupervisionModel;
import venta_computadoras.objetos.empleadosModel;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SupervisionManager extends Empleados {

    // Mapa para almacenar la supervisión de cada empleado por su código
    private Map<String, SupervisionModel> supervisionMap;

    // Constructor
    public SupervisionManager() {
        super(); // Inicializa empleados
        supervisionMap = new HashMap<>();
        inicializarSupervision(); // Inicializa la supervisión para cada empleado
    }

    // Método para inicializar la supervisión de cada empleado
    private void inicializarSupervision() {
        for (empleadosModel empleado : listEmpleados) {
            supervisionMap.put(empleado.getCodigoEmpleado(), new SupervisionModel()); // Asigna un objeto SupervisionModel por empleado
        }
    }

    // Método para gestionar la supervisión de empleados
    public void gestionarSupervision() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Gestión de Supervisión ---");
            System.out.println("1. Ver supervisión de los empleados");
            System.out.println("2. Asignar actividad supervisada");
            System.out.println("3. Asignar reporte de rendimiento");
            System.out.println("4. Asignar evaluación final");
            System.out.println("5. Volver");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    mostrarSupervision();
                    break;
                case 2:
                    asignarActividadSupervisada(scanner);
                    break;
                case 3:
                    asignarReporteRendimiento(scanner);
                    break;
                case 4:
                    asignarEvaluacionFinal(scanner);
                    break;
                case 5:
                    System.out.println("Volviendo al menú principal...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
                    break;
            }
        } while (opcion != 5);
    }

    // Método para mostrar la supervisión de los empleados
    private void mostrarSupervision() {
        System.out.println("\n--- Supervisión de Empleados ---");
        for (Map.Entry<String, SupervisionModel> entry : supervisionMap.entrySet()) {
            System.out.println("Empleado: " + entry.getKey() + " - Actividades: " + entry.getValue().getActividadesSupervisadas() + " - Reporte: " + entry.getValue().getReporteRendimiento() + " - Evaluación Final: " + entry.getValue().getEvaluacionFinal());
        }
    }

    // Método para asignar una actividad supervisada a un empleado
    private void asignarActividadSupervisada(Scanner scanner) {
        System.out.print("Ingrese el código del empleado: ");
        String codigoEmpleado = scanner.nextLine();

        if (supervisionMap.containsKey(codigoEmpleado)) {
            System.out.print("Ingrese la actividad supervisada: ");
            String actividad = scanner.nextLine();

            supervisionMap.get(codigoEmpleado).agregarActividadSupervisada(actividad);
            System.out.println("Actividad supervisada asignada exitosamente.");
        } else {
            System.out.println("Código de empleado no válido.");
        }
    }

    // Método para asignar un reporte de rendimiento a un empleado
    private void asignarReporteRendimiento(Scanner scanner) {
        System.out.print("Ingrese el código del empleado: ");
        String codigoEmpleado = scanner.nextLine();

        if (supervisionMap.containsKey(codigoEmpleado)) {
            System.out.print("Ingrese el reporte de rendimiento: ");
            String reporte = scanner.nextLine();

            supervisionMap.get(codigoEmpleado).asignarReporteRendimiento(reporte);
            System.out.println("Reporte de rendimiento asignado exitosamente.");
        } else {
            System.out.println("Código de empleado no válido.");
        }
    }

    // Método para asignar una evaluación final a un empleado
    private void asignarEvaluacionFinal(Scanner scanner) {
        System.out.print("Ingrese el código del empleado: ");
        String codigoEmpleado = scanner.nextLine();

        if (supervisionMap.containsKey(codigoEmpleado)) {
            System.out.print("Ingrese la evaluación final: ");
            String evaluacion = scanner.nextLine();

            supervisionMap.get(codigoEmpleado).asignarEvaluacionFinal(evaluacion);
            System.out.println("Evaluación final asignada exitosamente.");
        } else {
            System.out.println("Código de empleado no válido.");
        }
    }
}
