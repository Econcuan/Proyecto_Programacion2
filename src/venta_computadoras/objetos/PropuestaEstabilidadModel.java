/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package venta_computadoras.objetos;

import java.util.ArrayList;
import java.util.List;

public class PropuestaEstabilidadModel {

    private List<String> propuestas;
    private boolean contratoLargoPlazo;

    // Constructor
    public PropuestaEstabilidadModel() {
        this.propuestas = new ArrayList<>();
        this.contratoLargoPlazo = false;
    }

    // Método para añadir una propuesta de estabilidad
    public void agregarPropuesta(String propuesta) {
        propuestas.add(propuesta);
    }

    // Método para activar contrato a largo plazo
    public void activarContratoLargoPlazo() {
        this.contratoLargoPlazo = true;
    }

    // Método para obtener las propuestas del empleado
    public List<String> getPropuestas() {
        return propuestas;
    }

    // Método para verificar si tiene contrato a largo plazo
    public boolean tieneContratoLargoPlazo() {
        return contratoLargoPlazo;
    }

    @Override
    public String toString() {
        return "PropuestaEstabilidad{" + "propuestas=" + propuestas + ", contratoLargoPlazo=" + contratoLargoPlazo + '}';
    }
}
