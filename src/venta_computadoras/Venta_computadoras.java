package venta_computadoras;

import java.util.Scanner;
import venta_computadoras.controller.Estructura_empleados;

public class Venta_computadoras {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Seleccione el numero de modulo ---");
            System.out.println("1. Estructura organizaciones");
            System.out.println("2. Estrategia de contratación");
            System.out.println("3. Personal en las áreas, de compras, ventas, marketing, IT, recursos humanos, finanzas");

            System.out.println("20. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.println("\n \n Las opciones disponibles para Estructura organizaciones son:");
                    Estructura_empleados estructuraEmpleados = new Estructura_empleados();
                    estructuraEmpleados.opcion_empleados();
                    break;
            }
        } while (opcion != 20);

    }
}
