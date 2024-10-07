/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package venta_computadoras.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import venta_computadoras.database.Empleados;
import venta_computadoras.objetos.empleadosModel;

/**
 *
 * @author agr12
 */
public class Estructura_empleados {

    public void opcion_empleados() {
        // Instanciar datos de la base de datos de empleados
        Empleados list = new Empleados(); // Instancia de la clase empleados
        List<empleadosModel> listaEmpleados = new ArrayList<>(list.listEmpleados); // Copia inicial de la lista de empleados

        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Estructura Organizacional: Empresa de Venta de Computadoras ---");
            System.out.println("1. Mostrar empleados");
            System.out.println("2. Agregar empleado");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    // Mostrar empleados
                    System.out.println("\n--- Lista de Empleados ---");
                    for (int i = 0; i < listaEmpleados.size(); i++) {
                        System.out.println("Perfil: " + listaEmpleados.get(i).getPerfil()
                                + ", Nombre: " + listaEmpleados.get(i).getNombre() + ", Código: " + listaEmpleados.get(i).getCodigoEmpleado());
                    }
                    break;

                case 2:
                    // Agregar empleado manualmente
                    System.out.print("Ingrese el perfil del empleado (por ejemplo, Gerente de Ventas, Auxiliar de IT): ");
                    String perfil = scanner.nextLine();

                    System.out.print("Ingrese el nombre del empleado: ");
                    String nombre = scanner.nextLine();

                    String codigo = "EMP" + String.format("%03d", listaEmpleados.size() + 1); // Generar un código único para el nuevo empleado

                    // Crear un nuevo empleado y agregarlo a la lista
                    empleadosModel nuevoEmpleado = new empleadosModel(perfil, nombre, codigo);
                    listaEmpleados.add(nuevoEmpleado);

                    System.out.println("Empleado agregado exitosamente con el código: " + codigo);
                    break;

                case 3:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
                    break;
            }
        } while (opcion != 3);

        scanner.close();

    }
}
