/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package venta_computadoras.database;
import java.util.ArrayList;
import java.util.List;
import venta_computadoras.objetos.gastosModel;




public class gastos {

    // Lista de gastos predefinidos como objetos de gastosModel
    public List<gastosModel> listGastos;

    public gastos() {
        listGastos = new ArrayList<>();
        inicializarGastos();
    }

    // Método para inicializar la lista de gastos con datos predefinidos
    private void inicializarGastos() {
        // Ejemplo de gastos fijos
        listGastos.add(new gastosModel("Fijo", "Alquiler de oficina", 1500.00, "GF001"));
        listGastos.add(new gastosModel("Fijo", "Salarios administrativos", 3000.00, "GF002"));
        listGastos.add(new gastosModel("Fijo", "Servicios públicos (luz, agua)", 800.00, "GF003"));

        // Ejemplo de gastos variables
        listGastos.add(new gastosModel("Variable", "Compras de mercancía", 5000.00, "GV001"));
        listGastos.add(new gastosModel("Variable", "Marketing y publicidad", 1200.00, "GV002"));
        listGastos.add(new gastosModel("Variable", "Comisiones de ventas", 700.00, "GV003"));
    }
}