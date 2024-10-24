/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package venta_computadoras.objetos;

import java.util.ArrayList;
import java.util.List;




public class MotivacionModel {

    private List<String> reconocimientos;
    private int puntaje;

    // Constructor
    public MotivacionModel() {
        this.reconocimientos = new ArrayList<>();
        this.puntaje = 0; // El puntaje empieza en 0
    }

    // Método para añadir un reconocimiento o premio
    public void agregarReconocimiento(String reconocimiento) {
        reconocimientos.add(reconocimiento);
        puntaje += 10; // Ejemplo: cada premio suma 10 puntos
    }

    // Método para obtener el puntaje del empleado
    public int getPuntaje() {
        return puntaje;
    }

    // Método para mostrar reconocimientos
    public List<String> getReconocimientos() {
        return reconocimientos;
    }

    @Override
    public String toString() {
        return "Motivaciones{" + "reconocimientos=" + reconocimientos + ", puntaje=" + puntaje + '}';
    }
}
