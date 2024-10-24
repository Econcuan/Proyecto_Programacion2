/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package venta_computadoras.objetos;




public class PresupuestoPlanillaModel {

    private double totalSueldos;
    private double totalBonificaciones;
    private double totalDeducciones;

    // Constructor
    public PresupuestoPlanillaModel() {
        this.totalSueldos = 0.0;
        this.totalBonificaciones = 0.0;
        this.totalDeducciones = 0.0;
    }

    // Métodos para sumar sueldos, bonificaciones y deducciones
    public void agregarSueldo(double sueldo) {
        this.totalSueldos += sueldo;
    }

    public void agregarBonificacion(double bonificacion) {
        this.totalBonificaciones += bonificacion;
    }

    public void agregarDeduccion(double deduccion) {
        this.totalDeducciones += deduccion;
    }

    // Métodos para obtener los totales
    public double getTotalSueldos() {
        return totalSueldos;
    }

    public double getTotalBonificaciones() {
        return totalBonificaciones;
    }

    public double getTotalDeducciones() {
        return totalDeducciones;
    }

    // Método para obtener el total del presupuesto
    public double calcularPresupuestoTotal() {
        return totalSueldos + totalBonificaciones - totalDeducciones;
    }

    @Override
    public String toString() {
        return "Presupuesto de Planilla: "
                + "Total Sueldos: Q" + totalSueldos
                + ", Total Bonificaciones: Q" + totalBonificaciones
                + ", Total Deducciones: Q" + totalDeducciones
                + ", Presupuesto Total: Q" + calcularPresupuestoTotal();
    }
}
