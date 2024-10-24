/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package venta_computadoras.objetos;




public class Capacitacion {

    private String nombreEmpleado;
    private String nombreCapacitacion;

    // Constructor
    public Capacitacion(String nombreEmpleado, String nombreCapacitacion) {
        this.nombreEmpleado = nombreEmpleado;
        this.nombreCapacitacion = nombreCapacitacion;
    }

    // Getters
    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public String getNombreCapacitacion() {
        return nombreCapacitacion;
    }

    @Override
    public String toString() {
        return "Empleado: " + nombreEmpleado + ", Capacitacion: " + nombreCapacitacion;
    }
}