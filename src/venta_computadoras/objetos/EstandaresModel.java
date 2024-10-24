/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package venta_computadoras.objetos;

import java.util.ArrayList;
import java.util.List;

public class EstandaresModel {

    private List<String> estandaresCumplidos;
    private List<String> estandaresPendientes;

    // Constructor
    public EstandaresModel() {
        this.estandaresCumplidos = new ArrayList<>();
        this.estandaresPendientes = new ArrayList<>();
    }

    // Método para agregar un estándar cumplido
    public void agregarEstandarCumplido(String estandar) {
        estandaresCumplidos.add(estandar);
        estandaresPendientes.remove(estandar);
    }

    // Método para agregar un estándar pendiente
    public void agregarEstandarPendiente(String estandar) {
        estandaresPendientes.add(estandar);
    }

    // Obtener lista de estándares cumplidos
    public List<String> getEstandaresCumplidos() {
        return estandaresCumplidos;
    }

    // Obtener lista de estándares pendientes
    public List<String> getEstandaresPendientes() {
        return estandaresPendientes;
    }

    @Override
    public String toString() {
        return "EstandaresModel{"
                + "estandaresCumplidos=" + estandaresCumplidos
                + ", estandaresPendientes=" + estandaresPendientes
                + '}';
    }
}
