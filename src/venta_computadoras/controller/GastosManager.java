/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package venta_computadoras.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import venta_computadoras.database.gastos;
import venta_computadoras.objetos.gastosModel;

/**
 *
 * @author agr12
 */
public class GastosManager {

    private List<gastosModel> listaGastos;

    // Constructor que inicializa la lista de gastos
    public GastosManager() {
        gastos listaGastosBase = new gastos(); // Instancia de la clase gastos
        listaGastos = new ArrayList<>(listaGastosBase.listGastos); // Copia inicial de la lista de gastos
    }

    // Método para gestionar el menú de gastos
    public void gestionarGastos() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Gestión de Gastos Fijos y Variables ---");
            System.out.println("1. Mostrar gastos");
            System.out.println("2. Agregar gasto");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    // Mostrar gastos
                    mostrarGastos();
                    break;

                case 2:
                    // Agregar gasto manualmente
                    agregarGasto(scanner);
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

    // Método para mostrar la lista de gastos
    private void mostrarGastos() {
        System.out.println("\n--- Lista de Gastos ---");
        for (gastosModel gasto : listaGastos) {
            System.out.println("Tipo: " + gasto.getTipoGasto() + ", Descripción: " + gasto.getDescripcion() + ", Monto: Q" + gasto.getMonto() + ", Código: " + gasto.getCodigoGasto());
        }
    }

    // Método para agregar un nuevo gasto
    private void agregarGasto(Scanner scanner) {
        System.out.print("Ingrese el tipo de gasto (Fijo o Variable): ");
        String tipoGasto = scanner.nextLine();

        System.out.print("Ingrese la descripción del gasto: ");
        String descripcion = scanner.nextLine();

        System.out.print("Ingrese el monto del gasto: ");
        double monto = scanner.nextDouble();
        scanner.nextLine(); // Limpiar el buffer

        String codigoGasto = "G" + (tipoGasto.equalsIgnoreCase("Fijo") ? "F" : "V") + String.format("%03d", listaGastos.size() + 1); // Generar un código único para el nuevo gasto

        // Crear un nuevo gasto y agregarlo a la lista
        gastosModel nuevoGasto = new gastosModel(tipoGasto, descripcion, monto, codigoGasto);
        listaGastos.add(nuevoGasto);

        System.out.println("Gasto agregado exitosamente con el código: " + codigoGasto);
    }
}