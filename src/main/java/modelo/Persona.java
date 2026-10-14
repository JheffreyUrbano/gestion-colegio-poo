/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Jurbano
 */
public class Persona {

    private String nombre;
    private String direccion;
    private String telefono;
    private Fecha fechaNacimiento;

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Fecha getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Fecha fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    // Sobrecarga que calcula la edad respecto a la fecha actual
    public int calcularEdad() {
        return calcularEdad(Fecha.hoy());
    }

    // Sobrecarga que calcula la edad respecto a una fecha de referencia
    public int calcularEdad(Fecha referencia) {
        if (fechaNacimiento == null || referencia == null) {
            return 0;
        }
        int edad = referencia.getAnio() - fechaNacimiento.getAnio();
        if (referencia.getMes() < fechaNacimiento.getMes()
                || (referencia.getMes() == fechaNacimiento.getMes()
                && referencia.getDia() < fechaNacimiento.getDia())) {
            edad--;
        }
        return edad;
    }
    
    @Override
    public String toString() {
        return "Nombre: " + nombre
                + " | Dir: " + direccion
                + " | Tel: " + telefono
                + " | F. Nac: " + (fechaNacimiento != null ? fechaNacimiento.toString() : "N/A")
                + " (" + calcularEdad() + " años)";
    }
    
}
