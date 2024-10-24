/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package venta_computadoras.objetos;
import java.util.ArrayList;
import java.util.List;




public class MotivacionEmpleado extends empleadosModel {

    private List<String> reconocimientos;  // Lista de reconocimientos o premios
    private boolean ascenso;               // Si el empleado ha sido ascendido
    private double puntajeBuenEmpleado;    // Puntaje asignado por su buen desempeño

    // Constructor
    public MotivacionEmpleado(String perfil, String nombre, String codigoEmpleado) {
        super(perfil, nombre, codigoEmpleado);
        this.reconocimientos = new ArrayList<>();
        this.ascenso = false;               // Por defecto no ha sido ascendido
        this.puntajeBuenEmpleado = 0.0;     // Puntaje inicial
    }

    // Métodos para agregar reconocimientos y ascensos
    public void agregarReconocimiento(String reconocimiento) {
        this.reconocimientos.add(reconocimiento);
    }

    public List<String> getReconocimientos() {
        return reconocimientos;
    }

    public boolean isAscenso() {
        return ascenso;
    }

    public void setAscenso(boolean ascenso) {
        this.ascenso = ascenso;
    }

    public double getPuntajeBuenEmpleado() {
        return puntajeBuenEmpleado;
    }

    public void setPuntajeBuenEmpleado(double puntajeBuenEmpleado) {
        this.puntajeBuenEmpleado = puntajeBuenEmpleado;
    }

    @Override
    public String toString() {
        return "Empleado: " + getNombre() + " | Perfil: " + getPerfil() + " | Código: " + getCodigoEmpleado() + 
               " | Puntaje de Buen Empleado: " + puntajeBuenEmpleado + 
               " | Ascenso: " + (ascenso ? "Sí" : "No") + 
               " | Reconocimientos: " + String.join(", ", reconocimientos);
    }
}