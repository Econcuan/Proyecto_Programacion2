package venta_computadoras.objetos;
import java.util.ArrayList;
import java.util.List;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */





public class EmpleadoEstrategico extends empleadosModel {

    private String objetivoAsignado;          // Objetivo estratégico asignado
    private String estadoObjetivo;            // Estado del objetivo (En progreso, Completado)
    private List<String> logros;              // Logros obtenidos relacionados con el objetivo

    // Constructor
    public EmpleadoEstrategico(String perfil, String nombre, String codigoEmpleado) {
        super(perfil, nombre, codigoEmpleado);
        this.objetivoAsignado = "";
        this.estadoObjetivo = "Pendiente";
        this.logros = new ArrayList<>();
    }

    // Métodos para asignar y gestionar el objetivo estratégico
    public void asignarObjetivo(String objetivo) {
        this.objetivoAsignado = objetivo;
        this.estadoObjetivo = "En progreso";
    }

    public String getObjetivoAsignado() {
        return objetivoAsignado;
    }

    public String getEstadoObjetivo() {
        return estadoObjetivo;
    }

    public void completarObjetivo() {
        this.estadoObjetivo = "Completado";
    }

    public void agregarLogro(String logro) {
        this.logros.add(logro);
    }

    public List<String> getLogros() {
        return logros;
    }

    @Override
    public String toString() {
        return "Empleado: " + getNombre() + " | Objetivo Estratégico: " + objetivoAsignado + 
               " | Estado: " + estadoObjetivo + " | Logros: " + String.join(", ", logros);
    }
}