/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package venta_computadoras.manager;

import venta_computadoras.database.Empleados;
import venta_computadoras.objetos.Capacitacion;
import venta_computadoras.objetos.Evaluacion;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;




public class TalentoHumanoManager extends Empleados { // Heredando de Empleados

    private List<Capacitacion> capacitaciones;
    private List<Evaluacion> evaluaciones;

    // Constructor
    public TalentoHumanoManager() {
        super(); // Llama al constructor de Empleados para inicializar la lista de empleados
        this.capacitaciones = new ArrayList<>();
        this.evaluaciones = new ArrayList<>();
    }

    // Método para gestionar las opciones de talento humano
    public void gestionarTalentoHumano() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Gestión de Talento Humano ---");
            System.out.println("1. Registrar Capacitación");
            System.out.println("2. Evaluar Desempeño");
            System.out.println("3. Mostrar Capacitaciones");
            System.out.println("4. Mostrar Evaluaciones");
            System.out.println("5. Volver");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    registrarCapacitacion(scanner);
                    break;

                case 2:
                    evaluarDesempeño(scanner);
                    break;

                case 3:
                    mostrarCapacitaciones();
                    break;

                case 4:
                    mostrarEvaluaciones();
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

    // Registrar una nueva capacitación
    private void registrarCapacitacion(Scanner scanner) {
        System.out.println("Lista de empleados:");
        for (int i = 0; i < listEmpleados.size(); i++) {
            System.out.println((i + 1) + ". " + listEmpleados.get(i).getNombre());
        }

        System.out.print("Seleccione el número del empleado para registrar capacitación: ");
        int numEmpleado = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        if (numEmpleado > 0 && numEmpleado <= listEmpleados.size()) {
            System.out.print("Ingrese el nombre de la capacitación: ");
            String nombreCapacitacion = scanner.nextLine();
            Capacitacion capacitacion = new Capacitacion(listEmpleados.get(numEmpleado - 1).getNombre(), nombreCapacitacion);
            capacitaciones.add(capacitacion);
            System.out.println("Capacitación registrada correctamente.");
        } else {
            System.out.println("Número de empleado inválido.");
        }
    }

    // Evaluar el desempeño de un empleado
    private void evaluarDesempeño(Scanner scanner) {
        System.out.println("Lista de empleados:");
        for (int i = 0; i < listEmpleados.size(); i++) {
            System.out.println((i + 1) + ". " + listEmpleados.get(i).getNombre());
        }

        System.out.print("Seleccione el número del empleado a evaluar: ");
        int numEmpleado = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        if (numEmpleado > 0 && numEmpleado <= listEmpleados.size()) {
            System.out.print("Ingrese la evaluación (1 a 10): ");
            int puntaje = scanner.nextInt();
            Evaluacion evaluacion = new Evaluacion(listEmpleados.get(numEmpleado - 1).getNombre(), puntaje);
            evaluaciones.add(evaluacion);
            System.out.println("Evaluación registrada correctamente.");
        } else {
            System.out.println("Número de empleado inválido.");
        }
    }

    // Mostrar las capacitaciones registradas
    private void mostrarCapacitaciones() {
        System.out.println("Capacitaciones registradas:");
        if (capacitaciones.isEmpty()) {
            System.out.println("No hay capacitaciones registradas.");
        } else {
            for (Capacitacion capacitacion : capacitaciones) {
                System.out.println(capacitacion);
            }
        }
    }

    // Mostrar las evaluaciones de desempeño registradas
    private void mostrarEvaluaciones() {
        System.out.println("Evaluaciones de desempeño:");
        if (evaluaciones.isEmpty()) {
            System.out.println("No hay evaluaciones registradas.");
        } else {
            for (Evaluacion evaluacion : evaluaciones) {
                System.out.println(evaluacion);
            }
        }
    }
}
