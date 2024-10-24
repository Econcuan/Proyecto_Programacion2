/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package venta_computadoras.objetos;





public class EmpleadoConSueldo extends empleadosModel {

    private double sueldoBase;
    private double bonificacion = 250.00; // Bonificación fija de 250
    private double descuentoISR;
    private double descuentoIGSS;
    private double sueldoFinal;

    // Constructor que toma todos los datos del empleado y el sueldo
    public EmpleadoConSueldo(String perfil, String nombre, String codigoEmpleado, double sueldoBase) {
        super(perfil, nombre, codigoEmpleado);
        this.sueldoBase = sueldoBase;
        calcularDescuentos();
        calcularSueldoFinal();
    }

    // Método para calcular los descuentos
    private void calcularDescuentos() {
        this.descuentoISR = sueldoBase * 0.05; // ISR (5% del sueldo base)
        this.descuentoIGSS = sueldoBase * 0.0483; // IGSS (4.83% del sueldo base)
    }

    // Método para calcular el sueldo final después de descuentos
    private void calcularSueldoFinal() {
        this.sueldoFinal = sueldoBase + bonificacion - descuentoISR - descuentoIGSS;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSueldo Base: Q" + sueldoBase + ", Bonificación: Q" + bonificacion + ", Descuento ISR: Q" + descuentoISR + ", Descuento IGSS: Q" + descuentoIGSS + ", Sueldo Final: Q" + sueldoFinal;
    }

    // Getters y Setters
    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
        calcularDescuentos();
        calcularSueldoFinal();
    }

    public double getBonificacion() {
        return bonificacion;
    }

    public double getDescuentoISR() {
        return descuentoISR;
    }

    public double getDescuentoIGSS() {
        return descuentoIGSS;
    }

    public double getSueldoFinal() {
        return sueldoFinal;
    }
}
