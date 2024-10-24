/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package venta_computadoras.objetos;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;





public class ControlAccesoRRHH extends empleadosModel {

    private List<String> historialAccesos;

    // Constructor que hereda del empleadosModel
    public ControlAccesoRRHH(String perfil, String nombre, String codigoEmpleado) {
        super(perfil, nombre, codigoEmpleado);  // Herencia del modelo de empleados
        this.historialAccesos = new ArrayList<>();
    }

    // Método para registrar la entrada de un empleado
    public void registrarEntrada() {
        String registro = "Entrada: " + LocalDateTime.now();
        historialAccesos.add(registro);
        System.out.println("Entrada registrada para el empleado " + getNombre() + " a las " + LocalDateTime.now());
    }

    // Método para registrar la salida de un empleado
    public void registrarSalida() {
        String registro = "Salida: " + LocalDateTime.now();
        historialAccesos.add(registro);
        System.out.println("Salida registrada para el empleado " + getNombre() + " a las " + LocalDateTime.now());
    }

    // Método para mostrar el historial de accesos
    public void mostrarHistorialAccesos() {
        System.out.println("Historial de accesos para el empleado: " + getNombre());
        if (historialAccesos.isEmpty()) {
            System.out.println("No hay registros de accesos.");
        } else {
            for (String acceso : historialAccesos) {
                System.out.println(acceso);
            }
        }
    }
}
