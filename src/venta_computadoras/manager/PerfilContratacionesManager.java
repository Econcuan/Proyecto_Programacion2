/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package venta_computadoras.manager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import venta_computadoras.objetos.CandidatoModel;



public class PerfilContratacionesManager {

    // Lista de candidatos
    private List<CandidatoModel> listCandidatos;

    // Constructor
    public PerfilContratacionesManager() {
        this.listCandidatos = new ArrayList<>();
        inicializarCandidatos(); // Método para agregar algunos candidatos de prueba
    }

    // Método para inicializar la lista de candidatos (solo de ejemplo)
    private void inicializarCandidatos() {
        listCandidatos.add(new CandidatoModel("Juan Pérez", "Gerente de Ventas", "En proceso"));
        listCandidatos.add(new CandidatoModel("Ana López", "Auxiliar de Logística", "En proceso"));
        listCandidatos.add(new CandidatoModel("Pedro Martínez", "Recepcionista", "En proceso"));
    }

    // Método para gestionar el perfil de contrataciones
    public void gestionarPerfilesContrataciones() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Gestión de Perfiles de Contrataciones ---");
            System.out.println("1. Asignar/Modificar Perfil");
            System.out.println("2. Cambiar Estado de Contratación");
            System.out.println("3. Editar Datos del Candidato");
            System.out.println("4. Mostrar Candidatos");
            System.out.println("5. Volver");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    asignarPerfil(scanner);
                    break;

                case 2:
                    cambiarEstadoContratacion(scanner);
                    break;

                case 3:
                    editarDatosCandidato(scanner);
                    break;

                case 4:
                    mostrarCandidatos();
                    break;

                case 5:
                    System.out.println("Volviendo al menú principal...");
                    break;

                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
                    break;
            }
        } while (opcion != 5);
    }

    // Método para asignar o modificar el perfil de un candidato
    private void asignarPerfil(Scanner scanner) {
        mostrarCandidatos();
        System.out.print("Seleccione el número del candidato para asignar/modificar perfil: ");
        int numCandidato = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        if (numCandidato > 0 && numCandidato <= listCandidatos.size()) {
            System.out.print("Ingrese el nuevo perfil para el candidato: ");
            String nuevoPerfil = scanner.nextLine();
            listCandidatos.get(numCandidato - 1).setPerfil(nuevoPerfil);
            System.out.println("Perfil actualizado correctamente.");
        } else {
            System.out.println("Número de candidato inválido.");
        }
    }

    // Método para cambiar el estado de contratación (En proceso, Contratado, Rechazado)
    private void cambiarEstadoContratacion(Scanner scanner) {
        mostrarCandidatos();
        System.out.print("Seleccione el número del candidato para cambiar el estado de contratación: ");
        int numCandidato = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        if (numCandidato > 0 && numCandidato <= listCandidatos.size()) {
            System.out.print("Ingrese el nuevo estado del candidato (En proceso, Contratado, Rechazado): ");
            String nuevoEstado = scanner.nextLine();
            listCandidatos.get(numCandidato - 1).setEstado(nuevoEstado);
            System.out.println("Estado de contratación actualizado correctamente.");
        } else {
            System.out.println("Número de candidato inválido.");
        }
    }

    // Método para editar los datos del candidato (nombre, perfil, estado)
    private void editarDatosCandidato(Scanner scanner) {
        mostrarCandidatos();
        System.out.print("Seleccione el número del candidato para editar datos: ");
        int numCandidato = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        if (numCandidato > 0 && numCandidato <= listCandidatos.size()) {
            System.out.print("Ingrese el nuevo nombre del candidato: ");
            String nuevoNombre = scanner.nextLine();
            System.out.print("Ingrese el nuevo perfil del candidato: ");
            String nuevoPerfil = scanner.nextLine();
            System.out.print("Ingrese el nuevo estado del candidato (En proceso, Contratado, Rechazado): ");
            String nuevoEstado = scanner.nextLine();

            listCandidatos.get(numCandidato - 1).setNombre(nuevoNombre);
            listCandidatos.get(numCandidato - 1).setPerfil(nuevoPerfil);
            listCandidatos.get(numCandidato - 1).setEstado(nuevoEstado);
            System.out.println("Datos del candidato actualizados correctamente.");
        } else {
            System.out.println("Número de candidato inválido.");
        }
    }

    // Método para mostrar la lista de candidatos
    private void mostrarCandidatos() {
        System.out.println("\n--- Lista de Candidatos ---");
        for (int i = 0; i < listCandidatos.size(); i++) {
            System.out.println((i + 1) + ". " + listCandidatos.get(i).getNombre() + " - " + listCandidatos.get(i).getPerfil() + " - " + listCandidatos.get(i).getEstado());
        }
    }
}