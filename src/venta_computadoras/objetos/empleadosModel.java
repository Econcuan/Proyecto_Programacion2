/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package venta_computadoras.objetos;

/**
 *
 * @author agr12
 */
public class empleadosModel {

    private String perfil;
    private String nombre;
    private String codigoEmpleado;

    // Constructor que recibe perfil, nombre y codigoEmpleado
    public empleadosModel(String perfil, String nombre, String codigoEmpleado) {
        this.perfil = perfil;
        this.nombre = nombre;
        this.codigoEmpleado = codigoEmpleado;
    }

    @Override
    public String toString() {
        return "empleadosModel{" + "perfil=" + perfil + ", nombre=" + nombre + ", codigoEmpleado=" + codigoEmpleado + '}';
    }

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

}
