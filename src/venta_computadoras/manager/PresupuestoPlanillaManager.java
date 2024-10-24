/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package venta_computadoras.manager;

import venta_computadoras.database.Empleados;
import venta_computadoras.objetos.PresupuestoPlanillaModel;
import venta_computadoras.objetos.empleadosModel;
import java.util.Scanner;

public class PresupuestoPlanillaManager extends Empleados {

    private PresupuestoPlanillaModel presupuestoPlanilla;

    // Constructor
    public PresupuestoPlanillaManager() {
        super(); // Inicializa empleados
        presupuestoPlanilla = new PresupuestoPlanillaModel(); // Inicializa el presupuesto de la planilla
        calcularPresupuesto(); // Calcula el presupuesto al inicializar
    }

    // Método para calcular el presupuesto basado en los sueldos, bonificaciones y deducciones
    private void calcularPresupuesto() {
        for (empleadosModel empleado : listEmpleados) {
            double sueldo = Math.random() * 5000 + 2000; // Sueldo aleatorio entre 2000 y 7000
            double bonificacion = 250.0; // Bonificación fija
            double deduccion = sueldo * 0.0483; // ISR e IGSS (4.83% aproximado)

            presupuestoPlanilla.agregarSueldo(sueldo);
            presupuestoPlanilla.agregarBonificacion(bonificacion);
            presupuestoPlanilla.agregarDeduccion(deduccion);
        }
    }

    // Método para gestionar el presupuesto de la planilla
    public void gestionarPresupuesto() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Gestión del Presupuesto de la Planilla ---");
            System.out.println("1. Ver presupuesto total de la planilla");
            System.out.println("2. Volver");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    mostrarPresupuesto();
                    break;
                case 2:
                    System.out.println("Volviendo al menú principal...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
                    break;
            }
        } while (opcion != 2);
    }

    // Método para mostrar el presupuesto total de la planilla
    private void mostrarPresupuesto() {
        System.out.println("\n--- Presupuesto Total de la Planilla ---");
        System.out.println(presupuestoPlanilla.toString());
    }
}
