/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package venta_computadoras.database;

import java.util.ArrayList;
import java.util.List;
import venta_computadoras.objetos.empleadosModel;

/**
 *
 * @author agr12
 */
public class Empleados {

    // Lista de empleados predefinidos como objetos de empleadosModel
    public List<empleadosModel> listEmpleados;

    public Empleados() {
        listEmpleados = new ArrayList<>();
        inicializarEmpleados();
    }

    // Método para inicializar la lista de empleados con datos predefinidos
    private void inicializarEmpleados() {
        listEmpleados.add(new empleadosModel("Gerente de Ventas", "Carlos López", "EMP001"));
        listEmpleados.add(new empleadosModel("Gerente de IT", "María González", "EMP002"));
        listEmpleados.add(new empleadosModel("Gerente de Recursos Humanos", "José Pérez", "EMP003"));
        listEmpleados.add(new empleadosModel("Gerente de Finanzas", "Juana Díaz", "EMP004"));
        listEmpleados.add(new empleadosModel("Gerente de Logística", "Roberto Méndez", "EMP005"));
        listEmpleados.add(new empleadosModel("Subgerente de Ventas", "Ana Torres", "EMP006"));
        listEmpleados.add(new empleadosModel("Subgerente de IT", "Luis Herrera", "EMP007"));
        listEmpleados.add(new empleadosModel("Subgerente de Recursos Humanos", "Pedro Jiménez", "EMP008"));
        listEmpleados.add(new empleadosModel("Subgerente de Finanzas", "Carmen Salazar", "EMP009"));
        listEmpleados.add(new empleadosModel("Subgerente de Logística", "Andrés Navarro", "EMP010"));
        listEmpleados.add(new empleadosModel("Recepcionista de Ventas", "Elena Romero", "EMP011"));
        listEmpleados.add(new empleadosModel("Recepcionista de IT", "Juan García", "EMP012"));
        listEmpleados.add(new empleadosModel("Recepcionista de Recursos Humanos", "Laura Ruiz", "EMP013"));
        listEmpleados.add(new empleadosModel("Recepcionista de Finanzas", "Verónica Figueroa", "EMP014"));
        listEmpleados.add(new empleadosModel("Recepcionista de Logística", "Silvia Martínez", "EMP015"));
        listEmpleados.add(new empleadosModel("Auxiliar de Ventas", "Fernanda Díaz", "EMP016"));
        listEmpleados.add(new empleadosModel("Auxiliar de IT", "Pablo Gómez", "EMP017"));
        listEmpleados.add(new empleadosModel("Auxiliar de Recursos Humanos", "Andrea Suárez", "EMP018"));
        listEmpleados.add(new empleadosModel("Auxiliar de Finanzas", "Julio Castillo", "EMP019"));
        listEmpleados.add(new empleadosModel("Auxiliar de Logística", "Diana Morales", "EMP020"));
        listEmpleados.add(new empleadosModel("Bodega de Ventas", "César Rodríguez", "EMP021"));
        listEmpleados.add(new empleadosModel("Bodega de IT", "Alberto Martínez", "EMP022"));
        listEmpleados.add(new empleadosModel("Bodega de Recursos Humanos", "Miguel Salazar", "EMP023"));
        listEmpleados.add(new empleadosModel("Bodega de Finanzas", "Ricardo Fernández", "EMP024"));
        listEmpleados.add(new empleadosModel("Bodega de Logística", "Esteban Sánchez", "EMP025"));
        listEmpleados.add(new empleadosModel("Coordinador de Ventas", "Carla Reyes", "EMP026"));
        listEmpleados.add(new empleadosModel("Coordinador de IT", "Santiago Ríos", "EMP027"));
        listEmpleados.add(new empleadosModel("Coordinador de Recursos Humanos", "Lucía Jiménez", "EMP028"));
        listEmpleados.add(new empleadosModel("Coordinador de Finanzas", "Manuel Ortega", "EMP029"));
        listEmpleados.add(new empleadosModel("Coordinador de Logística", "Nicolás Herrera", "EMP030"));
        listEmpleados.add(new empleadosModel("Asistente Administrativo de Ventas", "Mónica Vega", "EMP031"));
        listEmpleados.add(new empleadosModel("Asistente Administrativo de IT", "Gustavo Correa", "EMP032"));
        listEmpleados.add(new empleadosModel("Asistente Administrativo de Recursos Humanos", "Isabel Mora", "EMP033"));
        listEmpleados.add(new empleadosModel("Asistente Administrativo de Finanzas", "Rafael Morales", "EMP034"));
        listEmpleados.add(new empleadosModel("Asistente Administrativo de Logística", "Paola Rivera", "EMP035"));
    }
}