/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package venta_computadoras.manager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import venta_computadoras.database.Empleados;
import venta_computadoras.objetos.Departamento;
import venta_computadoras.objetos.empleadosModel;





public class DisenoDepartamentalManager {

    private Empleados empleados; // La lista de empleados
    private List<Departamento> listaDepartamentos; // Lista de departamentos

    // Constructor que recibe la lista de empleados
    public DisenoDepartamentalManager(Empleados empleados) {
        this.empleados = empleados;
        this.listaDepartamentos = new ArrayList<>(); // Inicializar la lista de departamentos
    }

    // Método para gestionar el diseño departamental
    public void gestionarDisenoDepartamental() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Menú de Diseño Departamental ---");
            System.out.println("1. Crear nuevo departamento");
            System.out.println("2. Asignar empleados a un departamento");
            System.out.println("3. Mostrar departamentos y empleados asignados");
            System.out.println("4. Volver al menú principal");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    crearDepartamento(scanner);
                    break;

                case 2:
                    asignarEmpleadosADepartamento(scanner);
                    break;

                case 3:
                    mostrarDepartamentos();
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

    // Método para crear un nuevo departamento
    private void crearDepartamento(Scanner scanner) {
        System.out.print("Ingrese el nombre del nuevo departamento: ");
        String nombreDepartamento = scanner.nextLine();
        Departamento nuevoDepartamento = new Departamento(nombreDepartamento);
        listaDepartamentos.add(nuevoDepartamento); // Agregar el nuevo departamento a la lista
        System.out.println("Departamento '" + nombreDepartamento + "' creado exitosamente.");
    }

    // Método para asignar empleados a un departamento
    private void asignarEmpleadosADepartamento(Scanner scanner) {
        System.out.println("Lista de empleados:");
        for (int i = 0; i < empleados.listEmpleados.size(); i++) {
            System.out.println((i + 1) + ". " + empleados.listEmpleados.get(i).getNombre());
        }

        System.out.print("Seleccione el número del empleado que desea asignar a un departamento: ");
        int numEmpleado = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        if (numEmpleado > 0 && numEmpleado <= empleados.listEmpleados.size()) {
            empleadosModel empleadoSeleccionado = empleados.listEmpleados.get(numEmpleado - 1);

            System.out.print("Ingrese el nombre del departamento al que desea asignar al empleado: ");
            String nombreDepartamento = scanner.nextLine();

            // Buscar el departamento
            Departamento departamentoSeleccionado = null;
            for (Departamento dpto : listaDepartamentos) {
                if (dpto.getNombre().equalsIgnoreCase(nombreDepartamento)) {
                    departamentoSeleccionado = dpto;
                    break;
                }
            }

            if (departamentoSeleccionado != null) {
                departamentoSeleccionado.asignarEmpleado(empleadoSeleccionado);
                System.out.println("Empleado asignado al departamento '" + nombreDepartamento + "'.");
            } else {
                System.out.println("Departamento no encontrado.");
            }
        } else {
            System.out.println("Número de empleado inválido.");
        }
    }

    // Método para mostrar departamentos y empleados asignados
    private void mostrarDepartamentos() {
        if (listaDepartamentos.isEmpty()) {
            System.out.println("No hay departamentos creados.");
            return;
        }

        System.out.println("Mostrando departamentos y empleados asignados:");
        for (Departamento departamento : listaDepartamentos) {
            System.out.println("Departamento: " + departamento.getNombre());
            if (departamento.getListaEmpleados().isEmpty()) {
                System.out.println("  No hay empleados asignados.");
            } else {
                for (empleadosModel empleado : departamento.getListaEmpleados()) {
                    System.out.println("  - " + empleado.getNombre());
                }
            }
        }
    }
}
