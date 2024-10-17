package venta_computadoras.manager;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import venta_computadoras.objetos.EmpleadoConSueldo;
import venta_computadoras.objetos.empleadosModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author agr12
 */
public class SueldosManager {

    private List<EmpleadoConSueldo> listaSueldos;
    private List<empleadosModel> listaEmpleados;  // Lista de empleados base (sin sueldo)
    private DecimalFormat df = new DecimalFormat("#.00"); // Formato para mostrar dos decimales

    // Constructor que toma una lista de empleados ya existente
    public SueldosManager(List<empleadosModel> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
        this.listaSueldos = new ArrayList<>(); // Inicializamos listaSueldos para evitar NullPointerException
    }

    // Método para gestionar el menú de sueldos
    public void gestionarSueldos() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Gestión de Sueldos ---");
            System.out.println("1. Asignar sueldo a un empleado existente");
            System.out.println("2. Mostrar sueldos de empleados");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    asignarSueldo(scanner);
                    break;

                case 2:
                    mostrarSueldos();
                    break;

                case 3:
                    System.out.println("Saliendo del módulo de sueldos...");
                    break;

                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
                    break;
            }
        } while (opcion != 3);

        scanner.close();
    }

    // Método para mostrar la lista de sueldos
    private void mostrarSueldos() {
        System.out.println("\n--- Lista de Sueldos de Empleados ---");
        if (listaSueldos.isEmpty()) {
            System.out.println("No hay sueldos asignados todavía.");
        } else {
            for (EmpleadoConSueldo empleado : listaSueldos) {
                // Mostrar sueldo y otras cifras con dos decimales
                System.out.println("Empleado: " + empleado.getNombre() + " | Sueldo Base: Q" + df.format(empleado.getSueldoBase()) +
                        " | Bonificación: Q" + df.format(empleado.getBonificacion()) +
                        " | ISR: Q" + df.format(empleado.getDescuentoISR()) +
                        " | IGSS: Q" + df.format(empleado.getDescuentoIGSS()) +
                        " | Sueldo Final: Q" + df.format(empleado.getSueldoFinal()));
            }
        }
    }

    // Método para asignar sueldo a un empleado existente
    private void asignarSueldo(Scanner scanner) {
        System.out.print("Ingrese el código del empleado (por ejemplo, EMP001): ");
        String codigo = scanner.nextLine();

        // Buscar al empleado en la lista base por código
        empleadosModel empleadoBase = buscarEmpleadoBasePorCodigo(codigo);

        if (empleadoBase != null) {
            System.out.println("Empleado encontrado: " + empleadoBase.getNombre());

            // Verificar si ya tiene un sueldo asignado
            EmpleadoConSueldo empleadoConSueldo = buscarEmpleadoPorCodigo(codigo);

            if (empleadoConSueldo == null) {
                // Asignar un sueldo nuevo si no existe aún
                System.out.print("Ingrese el sueldo base del empleado: ");
                double sueldoBase = scanner.nextDouble();
                scanner.nextLine(); // Limpiar el buffer

                // Crear un nuevo empleado con sueldo y agregarlo a la lista de sueldos
                EmpleadoConSueldo nuevoEmpleadoConSueldo = new EmpleadoConSueldo(empleadoBase.getPerfil(), empleadoBase.getNombre(), codigo, sueldoBase);
                listaSueldos.add(nuevoEmpleadoConSueldo);

                System.out.println("Sueldo asignado exitosamente para el empleado con código " + codigo + 
                                   " con un sueldo de Q" + df.format(sueldoBase));
            } else {
                System.out.println("El empleado con el código " + codigo + " ya tiene un sueldo asignado.");
            }
        } else {
            System.out.println("Empleado no encontrado con el código proporcionado.");
        }
    }

    // Método para buscar un empleado en la lista de empleados base por su código
    private empleadosModel buscarEmpleadoBasePorCodigo(String codigoEmpleado) {
        for (empleadosModel empleado : listaEmpleados) {
            if (empleado.getCodigoEmpleado().equalsIgnoreCase(codigoEmpleado)) {
                return empleado;
            }
        }
        return null;
    }

    // Método para buscar un empleado con sueldo asignado por su código en la lista de sueldos
    private EmpleadoConSueldo buscarEmpleadoPorCodigo(String codigoEmpleado) {
        for (EmpleadoConSueldo empleado : listaSueldos) {
            if (empleado.getCodigoEmpleado().equalsIgnoreCase(codigoEmpleado)) {
                return empleado;
            }
        }
        return null;
    }
}