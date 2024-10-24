/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package venta_computadoras.manager;

import venta_computadoras.database.Empleados;
import venta_computadoras.objetos.empleadosModel;
import java.util.Scanner;





public class ControlEmpleadosManager extends Empleados {

    // Constructor
    public ControlEmpleadosManager() {
        super(); // Llama al constructor de Empleados para inicializar la lista de empleados
    }

    // Método para gestionar el control de empleados
    public void gestionarControlEmpleados() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Control de Empleados ---");
            System.out.println("1. Asignar/Modificar Rol");
            System.out.println("2. Cambiar Estado (Activo/Inactivo)");
            System.out.println("3. Editar Datos del Empleado");
            System.out.println("4. Volver");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    asignarRol(scanner);
                    break;

                case 2:
                    cambiarEstado(scanner);
                    break;

                case 3:
                    editarDatosEmpleado(scanner);
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

    // Método para asignar o modificar el rol de un empleado
    private void asignarRol(Scanner scanner) {
        System.out.println("Lista de empleados:");
        for (int i = 0; i < listEmpleados.size(); i++) {
            System.out.println((i + 1) + ". " + listEmpleados.get(i).getNombre() + " - " + listEmpleados.get(i).getPerfil());
        }

        System.out.print("Seleccione el número del empleado para asignar/modificar rol: ");
        int numEmpleado = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        if (numEmpleado > 0 && numEmpleado <= listEmpleados.size()) {
            System.out.print("Ingrese el nuevo rol para el empleado: ");
            String nuevoRol = scanner.nextLine();
            listEmpleados.get(numEmpleado - 1).setPerfil(nuevoRol);
            System.out.println("Rol actualizado correctamente.");
        } else {
            System.out.println("Número de empleado inválido.");
        }
    }

    // Método para cambiar el estado de un empleado (Activo/Inactivo)
    private void cambiarEstado(Scanner scanner) {
        System.out.println("Lista de empleados:");
        for (int i = 0; i < listEmpleados.size(); i++) {
            System.out.println((i + 1) + ". " + listEmpleados.get(i).getNombre() + " - Estado: " + (listEmpleados.get(i).isActivo() ? "Activo" : "Inactivo"));
        }

        System.out.print("Seleccione el número del empleado para cambiar estado: ");
        int numEmpleado = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        if (numEmpleado > 0 && numEmpleado <= listEmpleados.size()) {
            boolean estadoActual = listEmpleados.get(numEmpleado - 1).isActivo();
            listEmpleados.get(numEmpleado - 1).setActivo(!estadoActual); // Cambiar el estado
            System.out.println("El estado del empleado ha sido cambiado a: " + (listEmpleados.get(numEmpleado - 1).isActivo() ? "Activo" : "Inactivo"));
        } else {
            System.out.println("Número de empleado inválido.");
        }
    }

    // Método para editar los datos del empleado (nombre, código)
    private void editarDatosEmpleado(Scanner scanner) {
        System.out.println("Lista de empleados:");
        for (int i = 0; i < listEmpleados.size(); i++) {
            System.out.println((i + 1) + ". " + listEmpleados.get(i).getNombre());
        }

        System.out.print("Seleccione el número del empleado para editar datos: ");
        int numEmpleado = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        if (numEmpleado > 0 && numEmpleado <= listEmpleados.size()) {
            System.out.print("Ingrese el nuevo nombre del empleado: ");
            String nuevoNombre = scanner.nextLine();
            System.out.print("Ingrese el nuevo código del empleado: ");
            String nuevoCodigo = scanner.nextLine();

            listEmpleados.get(numEmpleado - 1).setNombre(nuevoNombre);
            listEmpleados.get(numEmpleado - 1).setCodigoEmpleado(nuevoCodigo);
            System.out.println("Datos del empleado actualizados correctamente.");
        } else {
            System.out.println("Número de empleado inválido.");
        }
    }
}
