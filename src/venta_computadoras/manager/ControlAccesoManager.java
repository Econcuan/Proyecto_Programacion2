/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package venta_computadoras.manager;

import venta_computadoras.database.Empleados;
import venta_computadoras.objetos.ControlAccesoRRHH;
import java.util.Scanner;




public class ControlAccesoManager extends Empleados {

    // Método para gestionar el control de accesos
    public void gestionarAccesos() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        // Mostrar lista de empleados
        System.out.println("Lista de empleados:");
        for (int i = 0; i < listEmpleados.size(); i++) {
            System.out.println((i + 1) + ". " + listEmpleados.get(i).getNombre());
        }

        System.out.print("Seleccione el número del empleado para gestionar accesos: ");
        int numEmpleado = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        if (numEmpleado > 0 && numEmpleado <= listEmpleados.size()) {
            // Crear un objeto ControlAccesoRRHH para el empleado seleccionado
            ControlAccesoRRHH controlAcceso = new ControlAccesoRRHH(
                    listEmpleados.get(numEmpleado - 1).getPerfil(),
                    listEmpleados.get(numEmpleado - 1).getNombre(),
                    listEmpleados.get(numEmpleado - 1).getCodigoEmpleado()
            );

            int opcionAcceso;
            do {
                System.out.println("\n--- Control de Accesos ---");
                System.out.println("1. Registrar entrada");
                System.out.println("2. Registrar salida");
                System.out.println("3. Mostrar historial de accesos");
                System.out.println("4. Volver");
                System.out.print("Seleccione una opción: ");
                opcionAcceso = scanner.nextInt();
                scanner.nextLine(); // Limpiar el buffer

                switch (opcionAcceso) {
                    case 1:
                        controlAcceso.registrarEntrada();
                        break;
                    case 2:
                        controlAcceso.registrarSalida();
                        break;
                    case 3:
                        controlAcceso.mostrarHistorialAccesos();
                        break;
                    case 4:
                        System.out.println("Volviendo...");
                        break;
                    default:
                        System.out.println("Opción no válida.");
                        break;
                }
            } while (opcionAcceso != 4);

        } else {
            System.out.println("Número de empleado inválido.");
        }
    }
}
