/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package venta_computadoras.manager;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import venta_computadoras.database.Empleados;
import venta_computadoras.objetos.MotivacionModel;
import venta_computadoras.objetos.empleadosModel;





public class MotivacionManager extends Empleados {

    // Mapa para almacenar las motivaciones de cada empleado por su código
    private Map<String, MotivacionModel> motivacionesMap;

    // Constructor
    public MotivacionManager() {
        super(); // Inicializa empleados
        motivacionesMap = new HashMap<>();
        inicializarMotivaciones(); // Inicializa las motivaciones para cada empleado
    }

    // Método para inicializar las motivaciones de cada empleado
    private void inicializarMotivaciones() {
        for (empleadosModel empleado : listEmpleados) {
            motivacionesMap.put(empleado.getCodigoEmpleado(), new MotivacionModel()); // Asigna un objeto MotivacionModel por empleado
        }
    }

    // Método para gestionar las motivaciones de empleados
    public void gestionarMotivaciones() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Gestión de Motivación a Empleados ---");
            System.out.println("1. Ver motivaciones de los empleados");
            System.out.println("2. Asignar reconocimiento o premio");
            System.out.println("3. Ver puntaje de buen empleado");
            System.out.println("4. Volver");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    mostrarMotivaciones();
                    break;

                case 2:
                    asignarPremioReconocimiento(scanner);
                    break;

                case 3:
                    mostrarPuntajes();
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

    // Método para mostrar las motivaciones de los empleados
    private void mostrarMotivaciones() {
        System.out.println("\n--- Motivaciones y Premios de Empleados ---");
        for (Map.Entry<String, MotivacionModel> entry : motivacionesMap.entrySet()) {
            System.out.println("Empleado: " + entry.getKey() + " - Motivaciones: " + entry.getValue().getReconocimientos());
        }
    }

    // Método para asignar un premio o reconocimiento a un empleado
    private void asignarPremioReconocimiento(Scanner scanner) {
        System.out.print("Ingrese el código del empleado: ");
        String codigoEmpleado = scanner.nextLine();

        if (motivacionesMap.containsKey(codigoEmpleado)) {
            System.out.print("Ingrese la motivación o premio: ");
            String motivacion = scanner.nextLine();

            // Asigna el reconocimiento al empleado
            motivacionesMap.get(codigoEmpleado).agregarReconocimiento(motivacion);

            System.out.println("Premio o reconocimiento asignado exitosamente.");
        } else {
            System.out.println("Código de empleado no válido.");
        }
    }

    // Método para mostrar el puntaje de los empleados
    private void mostrarPuntajes() {
        System.out.println("\n--- Puntaje de Buen Empleado ---");
        for (Map.Entry<String, MotivacionModel> entry : motivacionesMap.entrySet()) {
            System.out.println("Empleado: " + entry.getKey() + " - Puntaje: " + entry.getValue().getPuntaje());
        }
    }
}