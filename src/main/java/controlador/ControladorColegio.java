/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author Jurbano
 */
import modelo.Colegio;
import modelo.Estudiante;
import modelo.Fecha;
import modelo.Profesor;

public class ControladorColegio {

    private Colegio colegio;
    
    public ControladorColegio(Colegio colegio) {
        this.colegio = colegio;
    }

    public Colegio getColegio() {
        return colegio;
    }

    public void setColegio(Colegio colegio) {
        this.colegio = colegio;
    }

    public String registrarEstudiante(String nombre, String direccion, String telefono,
            int dia, int mes, int anio, String codigo, String grado, double promedio) {

        if (nombre.isEmpty() || codigo.isEmpty() || grado.isEmpty()) {
            return "Error: Nombre, código y grado son obligatorios.";
        }
        if (!Fecha.esValida(dia, mes, anio)) {
            return "Error: La fecha de nacimiento ingresada no es válida.";
        }
        if (promedio < 0.0 || promedio > 5.0) {
            return "Error: El promedio debe estar entre 0.0 y 5.0.";
        }

        Fecha fechaNac = new Fecha(dia, mes, anio);

        // se asignan los datos con los setters
        Estudiante est = new Estudiante();
        est.setNombre(nombre);
        est.setDireccion(direccion);
        est.setTelefono(telefono);
        est.setFechaNacimiento(fechaNac);
        est.setCodigo(codigo);
        est.setGrado(grado);
        est.setPromedio(promedio);

        if (colegio.agregarEstudiante(est)) {
            return "Estudiante registrado exitosamente.";
        } else {
            return "Error: Cupo de estudiantes lleno.";
        }
    }
    
    public String registrarProfesor(String nombre, String direccion, String telefono,
            int dia, int mes, int anio, String cedula, String area,
            double salarioHora, int horasDictadas) {

        if (nombre.isEmpty() || cedula.isEmpty() || area.isEmpty()) {
            return "Error: Nombre, cédula y área son obligatorios.";
        }
        if (!Fecha.esValida(dia, mes, anio)) {
            return "Error: La fecha de nacimiento ingresada no es válida.";
        }
        if (salarioHora <= 0 || horasDictadas <= 0) {
            return "Error: El salario por hora y las horas dictadas deben ser mayores a cero.";
        }

        Fecha fechaNac = new Fecha(dia, mes, anio);

        // constructor de profesor (unica subclase que lo tiene)
        Profesor prof = new Profesor(nombre, direccion, telefono, fechaNac,
                cedula, area, salarioHora, horasDictadas);

        // validacion si los profesores son mayores de edad
        if (prof.calcularEdad() < 18) {
            return "Error: El profesor debe ser mayor de edad (tiene " + prof.calcularEdad() + " años).";
        }

        if (colegio.agregarProfesor(prof)) {
            return "Profesor registrado exitosamente.";
        } else {
            return "Error: Cupo de profesores lleno.";
        }
    }

    public String obtenerReporteEstudiantes() {
        return colegio.reporteEstudiantes();
    }

    public String obtenerReporteProfesores() {
        return colegio.reporteProfesores();
    }    
}
