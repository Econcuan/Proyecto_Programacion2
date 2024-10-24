package venta_computadoras;

import java.util.Scanner;
import venta_computadoras.manager.SueldosManager;
import venta_computadoras.database.Empleados;
import venta_computadoras.manager.ControlAccesoManager;
import venta_computadoras.manager.ControlEmpleadosManager;
import venta_computadoras.manager.DisenoDepartamentalManager;
import venta_computadoras.manager.EstandaresManager;
import venta_computadoras.manager.EstrategiaManager;
import venta_computadoras.manager.MotivacionManager;
import venta_computadoras.manager.PerfilContratacionesManager;
import venta_computadoras.manager.PrestacionesManager;
import venta_computadoras.manager.PresupuestoPlanillaManager;
import venta_computadoras.manager.PropuestaEstabilidadManager;
import venta_computadoras.manager.SupervisionManager;

public class Venta_computadoras {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        // Instanciamos la clase Empleados para obtener la lista predefinida
        Empleados listaEmpleados = new Empleados(); // Cargamos la lista de empleados predefinidos

        do {
            System.out.println("\n--- Seleccione el número de módulo ---");
            System.out.println("1. Estructura organizaciones");
            System.out.println("2. Estrategia de contratación");
            System.out.println("3. Personal en las áreas, de compras, ventas, marketing, IT, recursos humanos, finanzas");
            System.out.println("4. Gestión de Gastos Fijos y Variables");
            System.out.println("5. Gestión de Sueldos");
            System.out.println("6. Gestión de Motivación a Empleados");
            System.out.println("7. Gestión de Estrategia Empresarial");
            System.out.println("8. Gestión de Diseño Departamental");
            System.out.println("9. Control de Empleados");
            System.out.println("10. Control de Accesos de RRHH");
            System.out.println("11. Perfil de las Contrataciones");
            System.out.println("12. Gestión de Prestaciones");
            System.out.println("13. Propuesta de Estabilidad Laboral");
            System.out.println("14. Supervisión de Empleados");
            System.out.println("15. Estándares de Empleados");
            System.out.println("16. Presupuesto de la Planilla");
            System.out.println("20. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    // Aquí estaría la lógica de estructura de organizaciones
                    break;

                case 4:
                    // Aquí estaría la lógica de gestión de gastos
                    break;

                case 5:
                    // Gestión de sueldos
                    SueldosManager gestorDeSueldos = new SueldosManager(listaEmpleados.listEmpleados);
                    gestorDeSueldos.gestionarSueldos();
                    break;
                case 6:
                    // Gestión de motivaciones
                    MotivacionManager gestorDeMotivacion = new MotivacionManager(); // Inicializamos el gestor
                    gestorDeMotivacion.gestionarMotivaciones(); // Ejecutamos la lógica de motivaciones
                    break;
                case 7:
                    // Gestión de estrategia empresarial
                    EstrategiaManager gestorDeEstrategia = new EstrategiaManager(listaEmpleados);
                    gestorDeEstrategia.gestionarEstrategia();
                    break;

                case 8:
                    // Gestión de diseño departamental
                    DisenoDepartamentalManager gestorDeDiseno = new DisenoDepartamentalManager(listaEmpleados);
                    gestorDeDiseno.gestionarDisenoDepartamental();
                    break;

                case 9:
                    // Gestión del control de accesos de RRHH
                    ControlAccesoManager gestorAcceso = new ControlAccesoManager();
                    gestorAcceso.gestionarAccesos();
                    break;

                case 10:
                    // Gestión del control de empleados
                    ControlEmpleadosManager gestorControlEmpleados = new ControlEmpleadosManager();
                    gestorControlEmpleados.gestionarControlEmpleados();
                    break;

                case 11:
                    // Gestión del perfil de las contrataciones
                    PerfilContratacionesManager gestorPerfilContrataciones = new PerfilContratacionesManager();
                    gestorPerfilContrataciones.gestionarPerfilesContrataciones();
                    break;

                case 12:
                    // Gestión de prestaciones
                    PrestacionesManager gestorPrestaciones = new PrestacionesManager();
                    gestorPrestaciones.gestionarPrestaciones();
                    break;
                case 13:
                    // Gestión de propuestas de estabilidad laboral
                    PropuestaEstabilidadManager gestorPropuestas = new PropuestaEstabilidadManager();
                    gestorPropuestas.gestionarPropuestasEstabilidad();
                    break;
                case 14:
                    // Gestión de supervisión de empleados
                    SupervisionManager gestorSupervision = new SupervisionManager();
                    gestorSupervision.gestionarSupervision();
                    break;
                case 15:
                    // Gestión de estándares de empleados
                    EstandaresManager gestorEstandares = new EstandaresManager();
                    gestorEstandares.gestionarEstandares();
                    break;
                case 16:
                    // Gestión del presupuesto de la planilla
                    PresupuestoPlanillaManager gestorPresupuesto = new PresupuestoPlanillaManager();
                    gestorPresupuesto.gestionarPresupuesto();
                    break;
                case 20:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
                    break;
            }
        } while (opcion != 20);

        scanner.close();
    }
}
