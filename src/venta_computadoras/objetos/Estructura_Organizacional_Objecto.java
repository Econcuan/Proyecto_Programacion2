/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package venta_computadoras.objetos;

/**
 *
 * @author agr12
 */
public class Estructura_Organizacional_Objecto {

    private String nombreEstrategia;
    private String estrategia;
    private String fechaDeEjecucion;
    private String fechaCreacion;

    public Estructura_Organizacional_Objecto(String nombreEstrategia, String estrategia, String fechaDeEjecucion, String fechaCreacion) {
        this.nombreEstrategia = nombreEstrategia;
        this.estrategia = estrategia;
        this.fechaDeEjecucion = fechaDeEjecucion;
        this.fechaCreacion = fechaCreacion;
    }

    @Override
    public String toString() {
        return "Estructura_Organizacional_Objecto{" + "nombreEstrategia=" + nombreEstrategia + ", estrategia=" + estrategia + ", fechaDeEjecucion=" + fechaDeEjecucion + ", fechaCreacion=" + fechaCreacion + '}';
    }

    public String getNombreEstrategia() {
        return nombreEstrategia;
    }

    public void setNombreEstrategia(String nombreEstrategia) {
        this.nombreEstrategia = nombreEstrategia;
    }

    public String getEstrategia() {
        return estrategia;
    }

    public void setEstrategia(String estrategia) {
        this.estrategia = estrategia;
    }

    public String getFechaDeEjecucion() {
        return fechaDeEjecucion;
    }

    public void setFechaDeEjecucion(String fechaDeEjecucion) {
        this.fechaDeEjecucion = fechaDeEjecucion;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

}
