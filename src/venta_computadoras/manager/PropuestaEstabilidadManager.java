/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package venta_computadoras.manager;

import venta_computadoras.database.Empleados;
import venta_computadoras.objetos.PropuestaEstabilidadModel;
import venta_computadoras.objetos.empleadosModel;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PropuestaEstabilidadManager extends Empleados {

    // Mapa para almacenar las propuestas de estabilidad de cada empleado por su código
    private Map<String, PropuestaEstabilidadModel> propuestasMap;

    // Constructor
    public PropuestaEstabilidadManager() {
        super(); // Inicializa empleados
        propuestasMap = new HashMap<>();
        inicializarPropuestas(); // Inicializa las propuestas de estabilidad para cada empleado
    }

    // Método para inicializar las propuestas de cada empleado
    private void inicializarPropuestas() {
        for (empleadosModel empleado : listEmpleados) {
            propuestasMap.put(empleado.getCodigoEmpleado(), new PropuestaEstabilidadModel()); // Asigna un objeto PropuestaEstabilidadModel por empleado
        }
    }

    // Método para gestionar las propuestas de estabilidad de empleados
    public void gestionarPropuestasEstabilidad() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Gestión de Propuestas de Estabilidad Laboral ---");
            System.out.println("1. Ver propuestas de los empleados");
            System.out.println("2. Asignar propuesta de estabilidad");
            System.out.println("3. Activar contrato a largo plazo");
            System.out.println("4. Volver");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    mostrarPropuestas();
                    break;

                case 2:
                    asignarPropuesta(scanner);
                    break;

                case 3:
                    activarContratoLargoPlazo(scanner);
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

    // Método para mostrar las propuestas de estabilidad de los empleados
    private void mostrarPropuestas() {
        System.out.println("\n--- Propuestas de Estabilidad de Empleados ---");
        for (Map.Entry<String, PropuestaEstabilidadModel> entry : propuestasMap.entrySet()) {
            System.out.println("Empleado: " + entry.getKey() + " - Propuestas: " + entry.getValue().getPropuestas() + " - Contrato Largo Plazo: " + (entry.getValue().tieneContratoLargoPlazo() ? "Sí" : "No"));
        }
    }

    // Método para asignar una propuesta de estabilidad a un empleado
    private void asignarPropuesta(Scanner scanner) {
        System.out.print("Ingrese el código del empleado: ");
        String codigoEmpleado = scanner.nextLine();

        if (propuestasMap.containsKey(codigoEmpleado)) {
            System.out.print("Ingrese la propuesta de estabilidad: ");
            String propuesta = scanner.nextLine();

            // Asigna la propuesta de estabilidad al empleado
            propuestasMap.get(codigoEmpleado).agregarPropuesta(propuesta);

            System.out.println("Propuesta asignada exitosamente.");
        } else {
            System.out.println("Código de empleado no válido.");
        }
    }

    // Método para activar contrato a largo plazo
    private void activarContratoLargoPlazo(Scanner scanner) {
        System.out.print("Ingrese el código del empleado: ");
        String codigoEmpleado = scanner.nextLine();

        if (propuestasMap.containsKey(codigoEmpleado)) {
            // Activa el contrato a largo plazo para el empleado
            propuestasMap.get(codigoEmpleado).activarContratoLargoPlazo();
            System.out.println("Contrato a largo plazo activado exitosamente.");
        } else {
            System.out.println("Código de empleado no válido.");
        }
    }
}