/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package venta_computadoras.objetos;

import java.util.ArrayList;
import java.util.List;

public class Departamento {

    private String nombre;
    private List<empleadosModel> listaEmpleados;

    public Departamento(String nombre) {
        this.nombre = nombre;
        this.listaEmpleados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public List<empleadosModel> getListaEmpleados() {
        return listaEmpleados;
    }

    public void asignarEmpleado(empleadosModel empleado) {
        this.listaEmpleados.add(empleado);
    }
}
