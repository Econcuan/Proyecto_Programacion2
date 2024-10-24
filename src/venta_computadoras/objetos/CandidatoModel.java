/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package venta_computadoras.objetos;




public class CandidatoModel {

    private String nombre;
    private String perfil;
    private String estado; // Estado del candidato (En proceso, Contratado, Rechazado)

    // Constructor
    public CandidatoModel(String nombre, String perfil, String estado) {
        this.nombre = nombre;
        this.perfil = perfil;
        this.estado = estado;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Candidato{"
                + "nombre='" + nombre + '\''
                + ", perfil='" + perfil + '\''
                + ", estado='" + estado + '\''
                + '}';
    }
}
