/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package venta_computadoras.manager;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import venta_computadoras.database.Empleados;
import venta_computadoras.objetos.EmpleadoEstrategico;
import venta_computadoras.objetos.empleadosModel;




public class EstrategiaManager {

    private String vision;
    private String mision;
    private List<String> fortalezas;
    private List<String> debilidades;
    private List<String> oportunidades;
    private List<String> amenazas;
    private List<EmpleadoEstrategico> empleadosEstrategicos;

    // Constructor que recibe la lista de empleados desde la clase Empleados
    public EstrategiaManager(Empleados empleados) {
        this.vision = "";
        this.mision = "";
        this.fortalezas = new ArrayList<>();
        this.debilidades = new ArrayList<>();
        this.oportunidades = new ArrayList<>();
        this.amenazas = new ArrayList<>();
        this.empleadosEstrategicos = new ArrayList<>();

        // Convertir los empleados en empleados estratégicos
        for (empleadosModel empleado : empleados.listEmpleados) {
            empleadosEstrategicos.add(new EmpleadoEstrategico(empleado.getPerfil(), empleado.getNombre(), empleado.getCodigoEmpleado()));
        }
    }

    // Método para gestionar el menú de la estrategia empresarial
    public void gestionarEstrategia() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Estrategia Empresarial ---");
            System.out.println("1. Definir Visión");
            System.out.println("2. Definir Misión");
            System.out.println("3. Realizar Análisis Interno y Externo (SWOT)");
            System.out.println("4. Asignar Objetivos Estratégicos a Empleados");
            System.out.println("5. Mostrar Empleados con Objetivos");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    definirVision(scanner);
                    break;

                case 2:
                    definirMision(scanner);
                    break;

                case 3:
                    realizarAnalisisSWOT(scanner);
                    break;

                case 4:
                    asignarObjetivosEstrategicos(scanner);
                    break;

                case 5:
                    mostrarEmpleadosConObjetivos();
                    break;

                case 6:
                    System.out.println("Saliendo del módulo de estrategia empresarial...");
                    break;

                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
                    break;
            }
        } while (opcion != 6);

        scanner.close();
    }

    // Métodos para definir visión y misión
    private void definirVision(Scanner scanner) {
        System.out.print("Ingrese la Visión de la empresa: ");
        this.vision = scanner.nextLine();
        System.out.println("Visión definida exitosamente.");
    }

    private void definirMision(Scanner scanner) {
        System.out.print("Ingrese la Misión de la empresa: ");
        this.mision = scanner.nextLine();
        System.out.println("Misión definida exitosamente.");
    }

    // Método para realizar el análisis SWOT
    private void realizarAnalisisSWOT(Scanner scanner) {
        System.out.println("\n--- Análisis Interno (Fortalezas y Debilidades) ---");
        System.out.print("Ingrese una fortaleza: ");
        this.fortalezas.add(scanner.nextLine());
        System.out.print("Ingrese una debilidad: ");
        this.debilidades.add(scanner.nextLine());

        System.out.println("\n--- Análisis Externo (Oportunidades y Amenazas) ---");
        System.out.print("Ingrese una oportunidad: ");
        this.oportunidades.add(scanner.nextLine());
        System.out.print("Ingrese una amenaza: ");
        this.amenazas.add(scanner.nextLine());

        System.out.println("Análisis SWOT realizado exitosamente.");
    }

    // Método para asignar objetivos estratégicos a los empleados
    private void asignarObjetivosEstrategicos(Scanner scanner) {
        System.out.print("Ingrese el código del empleado: ");
        String codigo = scanner.nextLine();

        EmpleadoEstrategico empleado = buscarEmpleadoPorCodigo(codigo);
        if (empleado != null) {
            System.out.print("Ingrese el objetivo estratégico a asignar: ");
            String objetivo = scanner.nextLine();
            empleado.asignarObjetivo(objetivo);
            System.out.println("Objetivo estratégico asignado exitosamente.");
        } else {
            System.out.println("Empleado no encontrado.");
        }
    }

    // Método para mostrar empleados con objetivos asignados
    private void mostrarEmpleadosConObjetivos() {
        System.out.println("\n--- Empleados con Objetivos Estratégicos ---");
        for (EmpleadoEstrategico empleado : empleadosEstrategicos) {
            if (!empleado.getObjetivoAsignado().isEmpty()) {
                System.out.println(empleado);
            }
        }
    }

    // Método para buscar un empleado por su código
    private EmpleadoEstrategico buscarEmpleadoPorCodigo(String codigoEmpleado) {
        for (EmpleadoEstrategico empleado : empleadosEstrategicos) {
            if (empleado.getCodigoEmpleado().equalsIgnoreCase(codigoEmpleado)) {
                return empleado;
            }
        }
        return null;
    }
}