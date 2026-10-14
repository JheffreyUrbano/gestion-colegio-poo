/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Jurbano
 */
public class Colegio {

    private String nombre;
    private Estudiante[] estudiantes;
    private Profesor[] profesores;
    private int cantidadEstudiantes;
    private int cantidadProfesores;

    // Único constructor
    public Colegio(String nombre) {
        this.nombre = nombre;
        this.estudiantes = new Estudiante[100];
        this.profesores = new Profesor[50];
        this.cantidadEstudiantes = 0;
        this.cantidadProfesores = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Estudiante[] getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(Estudiante[] estudiantes) {
        this.estudiantes = estudiantes;
    }

    public Profesor[] getProfesores() {
        return profesores;
    }

    public void setProfesores(Profesor[] profesores) {
        this.profesores = profesores;
    }

    public int getCantidadEstudiantes() {
        return cantidadEstudiantes;
    }

    public void setCantidadEstudiantes(int cantidadEstudiantes) {
        this.cantidadEstudiantes = cantidadEstudiantes;
    }

    public int getCantidadProfesores() {
        return cantidadProfesores;
    }

    public void setCantidadProfesores(int cantidadProfesores) {
        this.cantidadProfesores = cantidadProfesores;
    }
    
    public boolean agregarEstudiante(Estudiante e) {
        if (e != null && cantidadEstudiantes < estudiantes.length) {
            estudiantes[cantidadEstudiantes] = e;
            cantidadEstudiantes++;
            return true;
        }
        return false;
    }

    public boolean agregarProfesor(Profesor p) {
        if (p != null && cantidadProfesores < profesores.length) {
            profesores[cantidadProfesores] = p;
            cantidadProfesores++;
            return true;
        }
        return false;
    }
    
    // reportes
    // reporte de lista de los estudiantes
    public String reporteEstudiantes() {
        StringBuilder sb = new StringBuilder();
        sb.append("=== REPORTE DE ESTUDIANTES - ").append(nombre.toUpperCase()).append(" ===\n");
        if (cantidadEstudiantes == 0) {
            sb.append("No hay estudiantes registrados.\n");
            return sb.toString();
        }
        for (int i = 0; i < cantidadEstudiantes; i++) {
            sb.append(i + 1).append(". ").append(estudiantes[i].toString()).append("\n");
        }
        sb.append("Total de estudiantes registrados: ").append(cantidadEstudiantes).append("\n");
        return sb.toString();
    }

    // reporte de profesores ordenados por salario total (de mayor a menor) + total prestaciones
    public String reporteProfesores() {
        StringBuilder sb = new StringBuilder();
        sb.append("=== REPORTE DE PROFESORES (ORDENADO DE MAYOR A MENOR SALARIO) ===\n");
        if (cantidadProfesores == 0) {
            sb.append("No hay profesores registrados.\n");
            return sb.toString();
        }

        // copia del arreglo activo para ordenar de mayor a menor sin alterar el original
        Profesor[] copia = new Profesor[cantidadProfesores];
        for (int i = 0; i < cantidadProfesores; i++) {
            copia[i] = profesores[i];
        }

        // bubble sort (mayor a menor segun calcularPago())
        for (int i = 0; i < cantidadProfesores - 1; i++) {
            for (int j = 0; j < cantidadProfesores - 1 - i; j++) {
                if (copia[j].calcularPago() < copia[j + 1].calcularPago()) {
                    Profesor temp = copia[j];
                    copia[j] = copia[j + 1];
                    copia[j + 1] = temp;
                }
            }
        }

        double totalPrestacionesColegio = 0;
        double totalNomina = 0;

        for (int i = 0; i < cantidadProfesores; i++) {
            sb.append(i + 1).append(". ").append(copia[i].toString()).append("\n");
            totalNomina += copia[i].calcularPago();
            totalPrestacionesColegio += copia[i].calcularPrestaciones();
        }

        sb.append("------------------------------------------------------------------\n");
        sb.append(String.format("TOTAL NÓMINA MENSUAL PROFESORES: $%,.2f\n", totalNomina));
        sb.append(String.format("TOTAL PRESTACIONES SOCIALES A CUBRIR (19%%): $%,.2f\n", totalPrestacionesColegio));
        return sb.toString();
    }
    
}
