/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package venta_computadoras.objetos;

import java.util.ArrayList;
import java.util.List;

public class PrestacionModel {

    private List<String> beneficios;
    private double bono;

    // Constructor
    public PrestacionModel() {
        this.beneficios = new ArrayList<>();
        this.bono = 0.0; // El bono empieza en 0
    }

    // Método para añadir un beneficio o prestación
    public void agregarBeneficio(String beneficio) {
        beneficios.add(beneficio);
    }

    // Método para asignar un bono al empleado
    public void asignarBono(double monto) {
        bono = monto;
    }

    // Método para obtener la lista de beneficios
    public List<String> getBeneficios() {
        return beneficios;
    }

    // Método para obtener el bono del empleado
    public double getBono() {
        return bono;
    }

    @Override
    public String toString() {
        return "Prestaciones{" + "beneficios=" + beneficios + ", bono=" + bono + '}';
    }
}
