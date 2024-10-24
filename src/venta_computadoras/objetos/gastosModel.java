/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package venta_computadoras.objetos;




public class gastosModel {

    private String tipoGasto; // "Fijo" o "Variable"
    private String descripcion;
    private double monto;
    private String codigoGasto;

    // Constructor vacío (opcional)
    public gastosModel() {
    }

    // Constructor con parámetros para inicializar los campos
    public gastosModel(String tipoGasto, String descripcion, double monto, String codigoGasto) {
        this.tipoGasto = tipoGasto;
        this.descripcion = descripcion;
        this.monto = monto;
        this.codigoGasto = codigoGasto;
    }

    @Override
    public String toString() {
        return "Gasto{" + "tipoGasto=" + tipoGasto + ", descripcion=" + descripcion + ", monto=" + monto + ", codigoGasto=" + codigoGasto + '}';
    }

    // Getters y Setters
    public String getTipoGasto() {
        return tipoGasto;
    }

    public void setTipoGasto(String tipoGasto) {
        this.tipoGasto = tipoGasto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getCodigoGasto() {
        return codigoGasto;
    }

    public void setCodigoGasto(String codigoGasto) {
        this.codigoGasto = codigoGasto;
    }
}