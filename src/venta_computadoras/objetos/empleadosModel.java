/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package venta_computadoras.objetos;

import java.util.ArrayList;
import java.util.List;




public class empleadosModel {

    private String perfil;
    private String nombre;
    private String codigoEmpleado;
    private boolean activo; // Nuevo atributo para el estado de activo/inactivo
    private List<String> historialAccesos;

    // Constructor
    public empleadosModel(String perfil, String nombre, String codigoEmpleado) {
        this.perfil = perfil;
        this.nombre = nombre;
        this.codigoEmpleado = codigoEmpleado;
        this.activo = true; // Por defecto, un empleado se crea como activo
        this.historialAccesos = new ArrayList<>();
    }

    // Getters y setters
    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(String codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public List<String> getHistorialAccesos() {
        return historialAccesos;
    }

    public void setHistorialAccesos(List<String> historialAccesos) {
        this.historialAccesos = historialAccesos;
    }

    @Override
    public String toString() {
        return "Empleado{"
                + "perfil='" + perfil + '\''
                + ", nombre='" + nombre + '\''
                + ", codigoEmpleado='" + codigoEmpleado + '\''
                + ", activo=" + (activo ? "Activo" : "Inactivo")
                + '}';
    }
}
