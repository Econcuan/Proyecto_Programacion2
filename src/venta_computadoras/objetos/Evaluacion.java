/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package venta_computadoras.objetos;

/**
 *
 * @author agr12
 */
public class Evaluacion {

    private String nombreEmpleado;
    private int puntaje;

    // Constructor
    public Evaluacion(String nombreEmpleado, int puntaje) {
        this.nombreEmpleado = nombreEmpleado;
        this.puntaje = puntaje;
    }

    // Getters
    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public int getPuntaje() {
        return puntaje;
    }

    @Override
    public String toString() {
        return "Empleado: " + nombreEmpleado + ", Evaluación: " + puntaje + "/10";
    }
}
