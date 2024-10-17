/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package venta_computadoras.manager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import venta_computadoras.database.Empleados;
import venta_computadoras.objetos.MotivacionEmpleado;
import venta_computadoras.objetos.empleadosModel;

/**
 *
 * @author agr12
 */
public class MotivacionManager {

    private List<MotivacionEmpleado> listaMotivaciones;

    // Constructor que recibe la lista de empleados desde la clase Empleados
    public MotivacionManager(Empleados empleados) {
        this.listaMotivaciones = new ArrayList<>();

        // Inicializar la lista de empleados con motivaciones a partir de la lista predefinida de empleados
        for (empleadosModel empleado : empleados.listEmpleados) {
            listaMotivaciones.add(new MotivacionEmpleado(empleado.getPerfil(), empleado.getNombre(), empleado.getCodigoEmpleado()));
        }
    }

    // Método para gestionar el menú de motivaciones
    public void gestionarMotivaciones() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Gestión de Motivaciones ---");
            System.out.println("1. Mostrar motivaciones de todos los empleados");
            System.out.println("2. Mostrar empleados con premios o motivaciones");
            System.out.println("3. Agregar premio o motivación");
            System.out.println("4. Asignar puntaje de buen empleado");
            System.out.println("5. Ascender empleado");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    mostrarMotivacionesTodos();
                    break;

                case 2:
                    mostrarEmpleadosConPremios();
                    break;

                case 3:
                    agregarPremioOMotivacion(scanner);
                    break;

                case 4:
                    asignarPuntajeBuenEmpleado(scanner);
                    break;

                case 5:
                    ascenderEmpleado(scanner);
                    break;

                case 6:
                    System.out.println("Saliendo del módulo de motivaciones...");
                    break;

                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
                    break;
            }
        } while (opcion != 6);

        scanner.close();
    }

    // Método para mostrar motivaciones de todos los empleados
    private void mostrarMotivacionesTodos() {
        System.out.println("\n--- Motivaciones de Todos los Empleados ---");
        for (MotivacionEmpleado empleado : listaMotivaciones) {
            System.out.println(empleado);
        }
    }

    // Método para mostrar empleados que tienen premios o motivaciones
    private void mostrarEmpleadosConPremios() {
        System.out.println("\n--- Empleados con Premios o Motivaciones ---");
        for (MotivacionEmpleado empleado : listaMotivaciones) {
            if (!empleado.getReconocimientos().isEmpty()) {
                System.out.println(empleado);
            }
        }
    }

    // Método para agregar un premio o motivación
    private void agregarPremioOMotivacion(Scanner scanner) {
        System.out.print("Ingrese el código del empleado: ");
        String codigo = scanner.nextLine();

        MotivacionEmpleado empleado = buscarEmpleadoPorCodigo(codigo);
        if (empleado != null) {
            System.out.print("Ingrese el reconocimiento o motivación: ");
            String reconocimiento = scanner.nextLine();
            empleado.agregarReconocimiento(reconocimiento);
            System.out.println("Reconocimiento agregado exitosamente.");
        } else {
            System.out.println("Empleado no encontrado.");
        }
    }

    // Método para asignar puntaje de buen empleado
    private void asignarPuntajeBuenEmpleado(Scanner scanner) {
        System.out.print("Ingrese el código del empleado: ");
        String codigo = scanner.nextLine();

        MotivacionEmpleado empleado = buscarEmpleadoPorCodigo(codigo);
        if (empleado != null) {
            System.out.print("Ingrese el puntaje de buen empleado: ");
            double puntaje = scanner.nextDouble();
            scanner.nextLine(); // Limpiar el buffer
            empleado.setPuntajeBuenEmpleado(puntaje);
            System.out.println("Puntaje asignado exitosamente.");
        } else {
            System.out.println("Empleado no encontrado.");
        }
    }

    // Método para ascender un empleado
    private void ascenderEmpleado(Scanner scanner) {
        System.out.print("Ingrese el código del empleado: ");
        String codigo = scanner.nextLine();

        MotivacionEmpleado empleado = buscarEmpleadoPorCodigo(codigo);
        if (empleado != null) {
            empleado.setAscenso(true);
            System.out.println("Empleado ascendido exitosamente.");
        } else {
            System.out.println("Empleado no encontrado.");
        }
    }

    // Método para buscar un empleado por su código
    private MotivacionEmpleado buscarEmpleadoPorCodigo(String codigoEmpleado) {
        for (MotivacionEmpleado empleado : listaMotivaciones) {
            if (empleado.getCodigoEmpleado().equalsIgnoreCase(codigoEmpleado)) {
                return empleado;
            }
        }
        return null;
    }
}
