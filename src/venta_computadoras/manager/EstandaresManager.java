/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package venta_computadoras.manager;

import venta_computadoras.database.Empleados;
import venta_computadoras.objetos.EstandaresModel;
import venta_computadoras.objetos.empleadosModel;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EstandaresManager extends Empleados {

    private Map<String, EstandaresModel> estandaresMap;

    // Constructor
    public EstandaresManager() {
        super(); // Inicializa empleados
        estandaresMap = new HashMap<>();
        inicializarEstandares();
    }

    // Método para inicializar los estándares de cada empleado
    private void inicializarEstandares() {
        for (empleadosModel empleado : listEmpleados) {
            estandaresMap.put(empleado.getCodigoEmpleado(), new EstandaresModel());
        }
    }

    // Método para gestionar los estándares de los empleados
    public void gestionarEstandares() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Gestión de Estándares ---");
            System.out.println("1. Ver estándares de los empleados");
            System.out.println("2. Asignar estándar pendiente");
            System.out.println("3. Marcar estándar como cumplido");
            System.out.println("4. Volver");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    mostrarEstandares();
                    break;
                case 2:
                    asignarEstandarPendiente(scanner);
                    break;
                case 3:
                    marcarEstandarCumplido(scanner);
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

    // Método para mostrar los estándares de los empleados
    private void mostrarEstandares() {
        System.out.println("\n--- Estándares de Empleados ---");
        for (Map.Entry<String, EstandaresModel> entry : estandaresMap.entrySet()) {
            System.out.println("Empleado: " + entry.getKey() + " - Cumplidos: " + entry.getValue().getEstandaresCumplidos() + " - Pendientes: " + entry.getValue().getEstandaresPendientes());
        }
    }

    // Método para asignar un estándar pendiente
    private void asignarEstandarPendiente(Scanner scanner) {
        System.out.print("Ingrese el código del empleado: ");
        String codigoEmpleado = scanner.nextLine();

        if (estandaresMap.containsKey(codigoEmpleado)) {
            System.out.print("Ingrese el estándar pendiente: ");
            String estandar = scanner.nextLine();

            estandaresMap.get(codigoEmpleado).agregarEstandarPendiente(estandar);
            System.out.println("Estándar pendiente asignado exitosamente.");
        } else {
            System.out.println("Código de empleado no válido.");
        }
    }

    // Método para marcar un estándar como cumplido
    private void marcarEstandarCumplido(Scanner scanner) {
        System.out.print("Ingrese el código del empleado: ");
        String codigoEmpleado = scanner.nextLine();

        if (estandaresMap.containsKey(codigoEmpleado)) {
            System.out.print("Ingrese el estándar cumplido: ");
            String estandar = scanner.nextLine();

            estandaresMap.get(codigoEmpleado).agregarEstandarCumplido(estandar);
            System.out.println("Estándar marcado como cumplido exitosamente.");
        } else {
            System.out.println("Código de empleado no válido.");
        }
    }
}
