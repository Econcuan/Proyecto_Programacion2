/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package venta_computadoras.objetos;

import java.util.ArrayList;
import java.util.List;

public class SupervisionModel {

    private List<String> actividadesSupervisadas;
    private String reporteRendimiento;
    private String evaluacionFinal;

    // Constructor
    public SupervisionModel() {
        this.actividadesSupervisadas = new ArrayList<>();
        this.reporteRendimiento = "";
        this.evaluacionFinal = "";
    }

    // Método para añadir una actividad supervisada
    public void agregarActividadSupervisada(String actividad) {
        actividadesSupervisadas.add(actividad);
    }

    // Método para asignar un reporte de rendimiento
    public void asignarReporteRendimiento(String reporte) {
        this.reporteRendimiento = reporte;
    }

    // Método para asignar una evaluación final
    public void asignarEvaluacionFinal(String evaluacion) {
        this.evaluacionFinal = evaluacion;
    }

    // Método para obtener la lista de actividades supervisadas
    public List<String> getActividadesSupervisadas() {
        return actividadesSupervisadas;
    }

    // Método para obtener el reporte de rendimiento
    public String getReporteRendimiento() {
        return reporteRendimiento;
    }

    // Método para obtener la evaluación final
    public String getEvaluacionFinal() {
        return evaluacionFinal;
    }

    @Override
    public String toString() {
        return "Supervisión{" + "actividadesSupervisadas=" + actividadesSupervisadas + ", reporteRendimiento=" + reporteRendimiento + ", evaluacionFinal=" + evaluacionFinal + '}';
    }
}
